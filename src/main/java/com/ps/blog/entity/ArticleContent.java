package com.ps.blog.entity;

import java.util.Date;

public class ArticleContent {
    private Long id;

    private Long articleId;

    private Date createDt;

    private Date modifieldBy;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Date getCreateDt() {
        return createDt;
    }

    public void setCreateDt(Date createDt) {
        this.createDt = createDt;
    }

    public Date getModifieldBy() {
        return modifieldBy;
    }

    public void setModifieldBy(Date modifieldBy) {
        this.modifieldBy = modifieldBy;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}