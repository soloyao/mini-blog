package com.zmy.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "t_tag")
public class Tag {
	
	@Id
	@GeneratedValue
	private Long id;//ID
	private String name;//名称
	
	@ManyToMany(mappedBy = "tags")
	private List<Blog> blogs = new ArrayList<Blog>();
	
	public List<Blog> getBlogs() {
		return blogs;
	}
	public void setBlogs(List<Blog> blogs) {
		this.blogs = blogs;
	}
	public Tag() {
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Tag{" +
				"id=" + id +
				", name='" + name + '\'' +
				'}';
	}
}
