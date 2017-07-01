package com.jjcbs.blog.dao.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/6/28 0028.
 *
 * @author jjc
 */
@Entity
@Table(name = "blog_class", schema = "myblog", catalog = "")
public class BlogClass {
    private int id;
    private String name;
    private String descontent;
    private Integer updateTime;
    private Integer createTime;

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
