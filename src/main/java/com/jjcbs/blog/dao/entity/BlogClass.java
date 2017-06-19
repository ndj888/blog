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
@Table(name = "blog_class", schema = "myblog", catalog = "")
public class BlogClass {
    private int id;
    private String name;
    private String descontent;
    @Temporal(TemporalType.DATE)
    private Date updateTime;
    @Temporal(TemporalType.DATE)
    private Date createTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "descontent")
    public String getDescontent() {
        return descontent;
    }

    public void setDescontent(String descontent) {
        this.descontent = descontent;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogClass blogClass = (BlogClass) o;

        if (id != blogClass.id) return false;
        if (name != null ? !name.equals(blogClass.name) : blogClass.name != null) return false;
        if (descontent != null ? !descontent.equals(blogClass.descontent) : blogClass.descontent != null) return false;
        if (updateTime != null ? !updateTime.equals(blogClass.updateTime) : blogClass.updateTime != null) return false;
        if (createTime != null ? !createTime.equals(blogClass.createTime) : blogClass.createTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (descontent != null ? descontent.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        return result;
    }
}
