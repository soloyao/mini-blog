package com.zmy.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.zmy.pojo.Type;

import java.util.List;

public interface TypeService {

	Type saveType(Type type);
	
	Type getTypeByName(String name);
	
	Type getType(Long id);
	
	Page<Type> listType(Pageable pageable);

	List<Type> listType();

	List<Type> listTypeTop(Integer size);
	
	Type updateType(Long id, Type type);
	
	void deleteType(Long id);
	
}
