package com.jjcbs.blog.dao.entity;

import org.hibernate.annotations.*;

import javax.persistence.*;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/28 0028.
 *
 * @author jjc
 */
@Entity
@Table(name = "blog_article", schema = "myblog", catalog = "")
@org.hibernate.annotations.Cache(usage = CacheConcurrencyStrategy.READ_WRITE)

public class BlogArticle {
    private int id;
    private String title;
    private String subhead;
    private String contentFile;
    private Integer clsId;
    @Temporal(TemporalType.DATE)
    private Date updateTime;
    @Temporal(TemporalType.DATE)
    private Date createTime;
    private int userId;
    private int browseTime;
    private byte hotOrder;
    private byte isHot;
    private String img;
    private String author;
    private BlogClass blogClass;
    private String keyword;

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "subhead")
    public String getSubhead() {
        return subhead;
    }

    public void setSubhead(String subhead) {
        this.subhead = subhead;
    }

    @Basic
    @Column(name = "content_file")
    public String getContentFile() {
        return contentFile;
    }

    public void setContentFile(String contentFile) {
        this.contentFile = contentFile;
    }

    @Basic
    @Column(name = "cls_id")
    public Integer getClsId() {
        return clsId;
    }

    public void setClsId(Integer clsId) {
        this.clsId = clsId;
    }

    @Basic
    @Column(name = "update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "browse_time")
    public int getBrowseTime() {
        return browseTime;
    }

    public void setBrowseTime(int browseTime) {
        this.browseTime = browseTime;
    }

    @Basic
    @Column(name = "hot_order")
    public byte getHotOrder() {
        return hotOrder;
    }

    public void setHotOrder(byte hotOrder) {
        this.hotOrder = hotOrder;
    }

    @Basic
    @Column(name = "is_hot")
    public byte getIsHot() {
        return isHot;
    }

    public void setIsHot(byte isHot) {
        this.isHot = isHot;
    }

    @Basic
    @Column(name = "img")
    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    @Basic
    @Column(name = "keyword")
    public String getKeyword() {
        return keyword;
    }

    @Basic
    @Column(name = "keyword")
    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogArticle that = (BlogArticle) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
        if (browseTime != that.browseTime) return false;
        if (hotOrder != that.hotOrder) return false;
        if (isHot != that.isHot) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        if (subhead != null ? !subhead.equals(that.subhead) : that.subhead != null) return false;
        if (contentFile != null ? !contentFile.equals(that.contentFile) : that.contentFile != null) return false;
        if (clsId != null ? !clsId.equals(that.clsId) : that.clsId != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (img != null ? !img.equals(that.img) : that.img != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (subhead != null ? subhead.hashCode() : 0);
        result = 31 * result + (contentFile != null ? contentFile.hashCode() : 0);
        result = 31 * result + (clsId != null ? clsId.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + userId;
        result = 31 * result + browseTime;
        result = 31 * result + (int) hotOrder;
        result = 31 * result + (int) isHot;
        result = 31 * result + (img != null ? img.hashCode() : 0);
        return result;
    }

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CLS_ID")
    public BlogClass getBlogClass() {
        return blogClass;
    }

    public void setBlogClass(BlogClass blogClass) {
        this.blogClass = blogClass;
    }
}
