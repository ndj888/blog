package com.jjcbs.blog.dao.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/6/28 0028.
 *
 * @author jjc
 */
@Entity
@Table(name = "blog_article", schema = "myblog", catalog = "")
public class BlogArticle {
    private int id;
    private String title;
    private String subhead;
    private String contentFile;
    private Integer clsId;
    private Integer updateTime;
    private Integer createTime;
    private int userId;
    private int browseTime;
    private byte hotOrder;
    private byte isHot;

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
    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "create_time")
    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
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
        return result;
    }
}
