package com.tianzhu.web.controller;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefaults;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.InternalResourceView;

import com.tianzhu.web.domain.model.TUser;
import com.tianzhu.web.domain.service.user.UserService;

@Controller
@RequestMapping("user")
public class UserSearchController {
    @Inject
    protected UserService userService;

    @ModelAttribute
    public UserSearchForm setUpForm() {
        return new UserSearchForm();
    }

    @RequestMapping("list")
    public String list(@PageableDefaults Pageable pageable, Model model) {
    	//Pageable pageable = new PageRequest(0,20);
        Page<TUser> page = userService.findAll(pageable);
        model.addAttribute("page", page);
        //ModelAndView modelandview = new ModelAndView(new InternalResourceView("/WEB-INF/jsps/user/list.jsp"));
        return "user/list.jsp";
        //return modelandview;
    }

    @RequestMapping("search")
    public String search(@Valid UserSearchForm form, BindingResult result,
            @PageableDefaults Pageable pageable, Model model) {
        if (result.hasErrors()) {
            return "user/list.jsp";
        }

        String name = form.getName();
        String query = (StringUtils.hasText(name) ? name : "") + "%";
        Page<TUser> page = userService.findByNameLike(query, pageable);
        model.addAttribute("page", page);
        return "user/list.jsp";
    }

    @RequestMapping(params = "redirectToUpdate")
    public String redirectToUpdateForm(@RequestParam("id") Integer id,
            RedirectAttributes attr) {
        attr.addAttribute("id", id);
        return "redirect:/user/update?form";
    }

    @RequestMapping(params = "redirectToDelete")
    public String redirectToDeleteForm(@RequestParam("id") Integer id,
            RedirectAttributes attr) {
        attr.addAttribute("id", id);
        return "redirect:/user/delete?form";
    }
}