package com.jjcbs.blog.home.dao.entity;

import javax.persistence.*;

/**
 * Created by Administrator on 2017/6/17 0017.
 */
@Entity
@Table(name = "shopnc_member_common", schema = "shopnc", catalog = "")
public class ShopncMemberCommonEntity {
    private int memberId;
    private String authCode;
    private int sendAcodeTime;
    private Integer sendMbTime;
    private Integer sendEmailTime;
    private byte sendMbTimes;
    private byte sendAcodeTimes;
    private byte authCodeCheckTimes;
    private int authModifyPwdTime;

    @Id
    @Column(name = "member_id")
    public int getMemberId() {
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Basic
    @Column(name = "auth_code")
    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    @Basic
    @Column(name = "send_acode_time")
    public int getSendAcodeTime() {
        return sendAcodeTime;
    }

    public void setSendAcodeTime(int sendAcodeTime) {
        this.sendAcodeTime = sendAcodeTime;
    }

    @Basic
    @Column(name = "send_mb_time")
    public Integer getSendMbTime() {
        return sendMbTime;
    }

    public void setSendMbTime(Integer sendMbTime) {
        this.sendMbTime = sendMbTime;
    }

    @Basic
    @Column(name = "send_email_time")
    public Integer getSendEmailTime() {
        return sendEmailTime;
    }

    public void setSendEmailTime(Integer sendEmailTime) {
        this.sendEmailTime = sendEmailTime;
    }

    @Basic
    @Column(name = "send_mb_times")
    public byte getSendMbTimes() {
        return sendMbTimes;
    }

    public void setSendMbTimes(byte sendMbTimes) {
        this.sendMbTimes = sendMbTimes;
    }

    @Basic
    @Column(name = "send_acode_times")
    public byte getSendAcodeTimes() {
        return sendAcodeTimes;
    }

    public void setSendAcodeTimes(byte sendAcodeTimes) {
        this.sendAcodeTimes = sendAcodeTimes;
    }

    @Basic
    @Column(name = "auth_code_check_times")
    public byte getAuthCodeCheckTimes() {
        return authCodeCheckTimes;
    }

    public void setAuthCodeCheckTimes(byte authCodeCheckTimes) {
        this.authCodeCheckTimes = authCodeCheckTimes;
    }

    @Basic
    @Column(name = "auth_modify_pwd_time")
    public int getAuthModifyPwdTime() {
        return authModifyPwdTime;
    }

    public void setAuthModifyPwdTime(int authModifyPwdTime) {
        this.authModifyPwdTime = authModifyPwdTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopncMemberCommonEntity that = (ShopncMemberCommonEntity) o;

        if (memberId != that.memberId) return false;
        if (sendAcodeTime != that.sendAcodeTime) return false;
        if (sendMbTimes != that.sendMbTimes) return false;
        if (sendAcodeTimes != that.sendAcodeTimes) return false;
        if (authCodeCheckTimes != that.authCodeCheckTimes) return false;
        if (authModifyPwdTime != that.authModifyPwdTime) return false;
        if (authCode != null ? !authCode.equals(that.authCode) : that.authCode != null) return false;
        if (sendMbTime != null ? !sendMbTime.equals(that.sendMbTime) : that.sendMbTime != null) return false;
        if (sendEmailTime != null ? !sendEmailTime.equals(that.sendEmailTime) : that.sendEmailTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = memberId;
        result = 31 * result + (authCode != null ? authCode.hashCode() : 0);
        result = 31 * result + sendAcodeTime;
        result = 31 * result + (sendMbTime != null ? sendMbTime.hashCode() : 0);
        result = 31 * result + (sendEmailTime != null ? sendEmailTime.hashCode() : 0);
        result = 31 * result + (int) sendMbTimes;
        result = 31 * result + (int) sendAcodeTimes;
        result = 31 * result + (int) authCodeCheckTimes;
        result = 31 * result + authModifyPwdTime;
        return result;
    }
}
