package com.zmy.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zmy.pojo.Tag;

import java.util.List;

public interface TagService {

	Tag saveTag(Tag tag);
	
	Tag getTagByName(String name);
	
	Tag getTag(Long id);
	
	Page<Tag> listTag(Pageable pageable);

	List<Tag> listTag();

	List<Tag> listTagTop(Integer size);

	List<Tag> listTag(String ids);
	
	Tag updateTag(Long id, Tag tag);
	
	void deleteTag(Long id);
	
}
