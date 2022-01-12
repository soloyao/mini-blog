package com.zmy.dao;

import com.zmy.pojo.Comment;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Author: MengyaoZeng
 * @Telephone: 18573903136
 * @Email: 343722243@qq.com
 * @Description:
 * @Date: Created in 20:42 2022/1/12
 */
public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByBlogId(Long blogId, Sort sort);

}
