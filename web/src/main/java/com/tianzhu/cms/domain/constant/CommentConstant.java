/*
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *	http://www.shishuo.com
 */

package com.tianzhu.cms.domain.constant;

/**
 * 评论表的常量
 * 
 * @author Administrator
 * 
 */
public class CommentConstant {
	/**
	 * @author Herbert
	 * 
	 */
	public static class Status {
		/**
		 * 隐藏
		 */
		public final static int hidden =0;
		/**
		 * 显示
		 */
		public final static int display =1;
		/**
		 * 垃圾
		 */
		public final static int trash = 2;
	};

	public static class kind {
		/**
		 * 隐藏
		 */
		public final static int article =1;
		/**
		 * 显示
		 */
		public final static int folder =2;
	};
}
