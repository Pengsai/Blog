package com.ps.blog.dao;

import com.ps.blog.entity.ArticleMessage;
import com.ps.blog.entity.ArticleMessageExample;
import java.util.List;

public interface ArticleMessageMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ArticleMessage record);

    int insertSelective(ArticleMessage record);

    List<ArticleMessage> selectByExample(ArticleMessageExample example);

    ArticleMessage selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ArticleMessage record);

    int updateByPrimaryKey(ArticleMessage record);
}