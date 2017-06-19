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
@Table(name = "blog_user", schema = "myblog", catalog = "")
public class BlogUser {
    private int id;
    private String userName;
    private String userPasswd;
    @Temporal(TemporalType.DATE)
    private Date createTime;
    @Temporal(TemporalType.DATE)
    private Date updateTime;
    private String userNick;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_passwd")
    public String getUserPasswd() {
        return userPasswd;
    }

    public void setUserPasswd(String userPasswd) {
        this.userPasswd = userPasswd;
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
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "user_nick")
    public String getUserNick() {
        return userNick;
    }

    public void setUserNick(String userNick) {
        this.userNick = userNick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogUser blogUser = (BlogUser) o;

        if (id != blogUser.id) return false;
        if (userName != null ? !userName.equals(blogUser.userName) : blogUser.userName != null) return false;
        if (userPasswd != null ? !userPasswd.equals(blogUser.userPasswd) : blogUser.userPasswd != null) return false;
        if (createTime != null ? !createTime.equals(blogUser.createTime) : blogUser.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(blogUser.updateTime) : blogUser.updateTime != null) return false;
        if (userNick != null ? !userNick.equals(blogUser.userNick) : blogUser.userNick != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userPasswd != null ? userPasswd.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        result = 31 * result + (userNick != null ? userNick.hashCode() : 0);
        return result;
    }
}
