/*
 *	Copyright © 2013 Changsha Shishuo Network Technology Co., Ltd. All rights reserved.
 *	长沙市师说网络科技有限公司 版权所有
 *	http://www.shishuo.com
 */

package com.tianzhu.cms.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.tianzhu.cms.domain.model.entity.Config;
import com.tianzhu.cms.domain.repository.ConfigDao;

/**
 * 网站配置
 * 
 * @author Zhangjiale
 * 
 */
@Service
public class ConfigService {

	@Autowired
	private ConfigDao configDao;

	// ///////////////////////////////
	// ///// 增加 ////////
	// ///////////////////////////////

	/**
	 * 增加配置
	 * 
	 * @param key
	 * @param value
	 * @return Config
	 */
	public Config addConfig(String key, String value) {
		/*Config config = new Config();
		config.setKey(key);
		config.setValue(value);
		config.setCreateTime(new Date());
		configDao.addConfig(config);
		return config;*/
		return null;
	}

	// ///////////////////////////////
	// ///// 刪除 ////////
	// ///////////////////////////////

	/**
	 * 删除配置
	 * 
	 * @param key
	 * @return Integer
	 */
	@CacheEvict(value = "config")
	public int deleteConfigByKey(String key) {
		//return configDao.deleteConfig(key);
		return 0;
	}

	// ///////////////////////////////
	// ///// 修改 ////////
	// ///////////////////////////////

	/**
	 * 更新配置
	 * 
	 * @param key
	 * @param value
	 */
	@CacheEvict(value = "config")
	public Config updagteConfigByKey(String key, String value) {
		/*Config config = configDao.getConfigByKey(key);
		config.setValue(value);
		configDao.updateConfig(config);
		this.getStringByKey(key);
		return config;*/
		return null;
	}

	/**
	 * @param key
	 * @return
	 */
	@Cacheable(value = "config")
	public String getStringByKey(String key) {
		Config config = configDao.getConfigByKey(key);
		if (config == null) {
			return "";
		} else {
			return config.getValue();
		}
		//return null;
	}

	/**
	 * @param key
	 * @return
	 */
	@Cacheable(value = "config")
	public int getIntKey(String key) {
		/*Config config = configDao.getConfigByKey(key);
		if (config == null) {
			return 0;
		} else {
			return Integer.parseInt(config.getValue());
		}*/
		return 0;
	}
}
