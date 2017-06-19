package com.jjcbs.blog.dao.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/19 0019.
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
    @Temporal(TemporalType.DATE)
    private Date updateTime;
    @Temporal(TemporalType.DATE)
    private Date createTime;
    private int userId;
    @OneToOne
    @JoinColumn(name = "id")
    private BlogClass blogClass;

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
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogArticle that = (BlogArticle) o;

        if (id != that.id) return false;
        if (userId != that.userId) return false;
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
        return result;
    }



}
