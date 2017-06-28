package com.jjcbs.blog.dao.entity;


import javax.persistence.*;
import java.util.Date;

/**
 * Created by Administrator on 2017/6/28 0028.
 *
 * @author jjc
 */
@Entity
@Table(name = "blog_config", schema = "myblog", catalog = "")
public class BlogConfig {
    private int id;
    private String configKey;
    private String configVal;

    @Temporal(TemporalType.DATE)
    private Date createTime;
    @Temporal(TemporalType.DATE)
    private Date updateTime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "config_key")
    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    @Basic
    @Column(name = "config_val")
    public String getConfigVal() {
        return configVal;
    }

    public void setConfigVal(String configVal) {
        this.configVal = configVal;
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
    @Column(name = "update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BlogConfig that = (BlogConfig) o;

        if (id != that.id) return false;
        if (configKey != null ? !configKey.equals(that.configKey) : that.configKey != null) return false;
        if (configVal != null ? !configVal.equals(that.configVal) : that.configVal != null) return false;
        if (createTime != null ? !createTime.equals(that.createTime) : that.createTime != null) return false;
        if (updateTime != null ? !updateTime.equals(that.updateTime) : that.updateTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (configKey != null ? configKey.hashCode() : 0);
        result = 31 * result + (configVal != null ? configVal.hashCode() : 0);
        result = 31 * result + (createTime != null ? createTime.hashCode() : 0);
        result = 31 * result + (updateTime != null ? updateTime.hashCode() : 0);
        return result;
    }
}
