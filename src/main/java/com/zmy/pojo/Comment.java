package com.zmy.pojo;

import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "t_comment")
public class Comment {
	
	@Id
	@GeneratedValue
	private Long id;//ID
	private String nickName;//昵称
	private String email;//邮箱
	private String content;//评论内容
	private String avatar;//头像
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;//创建时间
	
	@ManyToOne
	private Blog blog;
	
	@OneToMany(mappedBy = "parentComment")
	private List<Comment> replyComments = new ArrayList<Comment>();
	
	@ManyToOne
	private Comment parentComment;

	public List<Comment> getReplyComments() {
		return replyComments;
	}

	public void setReplyComments(List<Comment> replyComments) {
		this.replyComments = replyComments;
	}

	public Comment getParentComment() {
		return parentComment;
	}

	public void setParentComment(Comment parentComment) {
		this.parentComment = parentComment;
	}

	public Comment() {

	}
	
	public Blog getBlog() {
		return blog;
	}

	public void setBlog(Blog blog) {
		this.blog = blog;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	@Override
	public String toString() {
		return "Comment{" +
				"id=" + id +
				", nickName='" + nickName + '\'' +
				", email='" + email + '\'' +
				", content=" + content + '\'' +
				", avatar=" + avatar + '\'' +
				", createTime=" + createTime +
				'}';
	}
}
