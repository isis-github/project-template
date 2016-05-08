package com.tianzhu.cms.domain.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.tianzhu.cms.domain.constant.GuestbookConstant;
import com.tianzhu.cms.domain.model.entity.Guestbook;
import com.tianzhu.cms.domain.pojo.PageVo;
import com.tianzhu.cms.domain.repository.GuestbookDao;

@Service
public class GuestbookService {

	@Autowired
	private GuestbookDao guestbookDao;

	public Guestbook addGuestbook(String name, String email, String title,
			String content) {
		Guestbook guestbook = new Guestbook();
		guestbook.setName(name);
		guestbook.setEmail(email);
		guestbook.setTitle(title);
		guestbook.setContent(content);
		guestbook.setReply("");
		guestbook.setStatus(GuestbookConstant.status.init);
		guestbook.setCreateTime(new Date());
		guestbook.setReplyTime(guestbook.getCreateTime());
		return guestbookDao.save(guestbook);
	}

	public int updateReplyByMessageId(String reply, long messageId,
			GuestbookConstant.status status) {
		/*return guestbookDao.updateReplyById(reply, messageId, status,
				new Date());*/
		return 0;
	}

	public int updateStatusByMessageId(GuestbookConstant.status status,
			long messageId) {
		//return guestbookDao.updateStatusById(status, messageId);
		return 0;
	}

	public Guestbook getGuestbookById(long messageId) {
		//return guestbookDao.getGuestbookById(messageId);
		return null;
	}

	public List<Guestbook> getGuestbookList(GuestbookConstant.status status,
			long offset, long rows) {
		/*List<GuestbookVo> list = guestbookDao.getGuestbookList(status, offset,
				rows);
		return list;*/
		return null;
	}

	public int getGuestbookCountList(GuestbookConstant.status status) {
		//return guestbookDao.getGuestbookCountList(status);
		return 0;
	}

	public PageVo<Guestbook> getMessageBoardPage(int pageNum,
			GuestbookConstant.status status, String number) {
		/*PageVo<GuestbookVo> pageVo = new PageVo<GuestbookVo>(pageNum);
		pageVo.setRows(10);
		List<GuestbookVo> list = this.getGuestbookList(status,
				pageVo.getOffset(), pageVo.getRows());
		if (StringUtils.isBlank(number)) {
			for (GuestbookVo message : list) {
				if (message.getContent().length() > 25) {
					message.setContent(message.getContent().substring(0, 23)
							+ "...");
				}
			}
		}
		pageVo.setList(list);
		pageVo.setCount(this.getGuestbookCountList(status));
		return pageVo;*/
		return null;
	}

}
