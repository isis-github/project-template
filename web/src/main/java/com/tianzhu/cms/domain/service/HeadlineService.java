package com.tianzhu.cms.domain.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.tianzhu.cms.domain.exception.UploadException;
import com.tianzhu.cms.domain.model.entity.Headline;
import com.tianzhu.cms.domain.repository.HeadlineDao;

@Service
public class HeadlineService {

	@Autowired
	private HeadlineDao headlineDao;

	@Autowired
	private ConfigService configService;

	public Headline addHeadline(MultipartFile multipartFile, String name,
			String url) throws UploadException, IOException {
		/*Headline headline = new Headline();
		String picture = MediaUtils.saveImage(multipartFile,
				configService.getIntKey("shishuo_headline_image_width"),
				configService.getIntKey("shishuo_headline_image_height"));
		headline.setName(name);
		headline.setPicture(picture);
		headline.setUrl(url);
		headline.setSort(0);
		headline.setCreateTime(new Date());
		headlineDao.addHeadline(headline);
		return headline;*/
		return null;
	}

	public List<Headline> getHeadlineList() {
		//return headlineDao.getHeadlineList();
		return null;
	}

	public int updateHeadlineById(long headlineId, String name,
			MultipartFile file, String url) throws UploadException, IOException {
		/*String picture = this.getHeadlineById(headlineId).getPicture();
		if (file != null && !file.isEmpty()) {
			picture = MediaUtils.saveImage(file,
					configService.getIntKey("shishuo_headline_image_width"),
					configService.getIntKey("shishuo_headline_image_height"));
		}
		return headlineDao.updateHeadlineById(headlineId, name, picture, url);*/
		return 0;
	}

	public Headline getHeadlineById(long headlineId) {
		//return headlineDao.getHeadlineById(headlineId);
		return null;
	}

	public void deleteHeadline(long headlineId, String pictureUrl) {
		/*headlineDao.deleteHeadline(headlineId);
		MediaUtils.deleteFile(pictureUrl);*/
	}

	public void updateSortById(long headlineId, int sort) {
		//headlineDao.updateSortById(headlineId, sort);
	}
}
