/*
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *	http://www.shishuo.com
 */
package com.tianzhu.cms.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import com.tianzhu.cms.domain.service.ArticleService;
import com.tianzhu.cms.domain.service.FolderService;
import com.tianzhu.cms.domain.service.HeadlineService;
import com.tianzhu.cms.domain.service.TemplateService;

/**
 * 
 * @author Herbert
 * 
 */
public class BaseAction {

	@Autowired
	protected FolderService folderService;

	@Autowired
	protected ArticleService fileService;

	@Autowired
	protected TemplateService themeService;

	@Autowired
	protected HeadlineService headlineService;

	protected final Logger logger = Logger.getLogger(this.getClass());
}
