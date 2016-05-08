package com.tianzhu.cms.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.tianzhu.cms.domain.model.entity.Headline;

public interface HeadlineDao extends JpaRepository<Headline, Long> {
	
	/*public int addHeadline(Headline headline);

	public List<Headline> getHeadlineList();

	public Headline getHeadlineById(@Param("headlineId") long headlineId);

	public int deleteHeadline(@Param("headlineId") long headlineId);
	*/
	
	
	@Modifying
	@Query(value="update cms_headline set name=:name,picture=:picture,url=:url} where headlineId=#{headlineId}",nativeQuery=true)
	public int updateHeadlineById(@Param("headlineId") long headlineId,
			@Param("name") String name, @Param("picture") String picture,
			@Param("url") String url);
	
	@Modifying
	@Query(value="update cms_headline set sort=:sort where headline_id=:headlineId",nativeQuery=true)
	public void updateSortById(@Param("headlineId") long headlineId,
			@Param("sort") int sort);

}
