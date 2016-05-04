/*
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *	http://www.shishuo.com
 */

package com.tianzhu.cms.domain.constant;

/**
 * 附件
 * 
 * @author Herbert
 * 
 */
public class MediaConstant {

	/**
	 * 类型<br>
	 * photo：照片<br>
	 * file：文件<br>
	 * 
	 * @author Herbert
	 * 
	 */
	public static class Type {
		/**
		 * 相册
		 */
		public final static int photo =1; /**
		 * 文件
		 */
		public final static int file =2 ;
		
		public final static int video =3;
	}

	/**
	 * 种类
	 * 
	 * @author Herbert
	 * 
	 */
	public static class Kind {
		/**
		 * 目录
		 */
		public final static int folder=1; /**
		 * 文章
		 */
		public final static int article =2;/**
		 * 编辑器
		 */
		public final static int editor =3;
	}
}
