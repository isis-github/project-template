/*
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *	http://www.shishuo.com
 */

package com.tianzhu.cms.domain.constant;

/**
 * 文件常量
 * 
 * @author Zhang jiale
 * 
 */
public class ArticleConstant {

	/**
	 * 文件状态
	 * 
	 * @author Herbert
	 * 
	 */
	public static class Status {
		/**
		 * 隐藏
		 */
		public final static int hidden = 0;
		
		/** 公开的
		 */
		public final static int display = 1;
	};

	/**
	 * 审核
	 * 
	 * @author Herbert
	 * 
	 */
	public static class check {
		/**
		 * 已审核
		 */
		public final static int yes =1; /**
		 * /** 审核失败
		 */
		public final static int no =2; /**
		 * /** 未审核
		 */
		public final static int init =0;
	};
}
