package com.jk.entity.User;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.Date;

@Entity
@Table(name = "AOA_USER")
public class User {
    @Id
    @GeneratedValue
    private Long userId;
    @Column(nullable = true, unique = true)
    @NotEmpty(message="地址不能为空")
    private String address;
    @Column(nullable = true, unique = true)
    @NotEmpty(message="卡号不能为空")
    @Length(min=16, max=19,message="银行卡号长度必须在16到19之间!")
    private String bank;
    @Column(nullable = true, unique = true)
    private Date birth;
    @Column(nullable = true, unique = true)
    @NotEmpty(message="邮箱不能为空")
    @Pattern(regexp="^([a-zA-Z0-9_-])+@([a-zA-Z0-9_-])+((\\.[a-zA-Z0-9_-]{2,3}){1,2})$",message="请填写正确邮箱号")
    private String eamil;
    @Column(nullable = true, unique = true)
    private Long fatherId;
    @Column(nullable = true, unique = true)
    private Date hireTime;
    @Column(nullable = true, unique = true)
    @Pattern(regexp="^(\\d{6})(19|20)(\\d{2})(1[0-2]|0[1-9])(0[1-9]|[1-2][0-9]|3[0-1])(\\d{3})(\\d|X|x)?$",message="请填写正确身份证号")
    private String userIdcard;
    @Column(nullable = true, unique = true)
    private String imgPath;
    @Column(nullable = true, unique = true)
    private Integer isLock;
    @Column(nullable = true, unique = true)
    private String lastLoginIp;
    @Column(nullable = true, unique = true)
    private Date lastLoginTime;
    @Column(nullable = true, unique = true)
    private Date modifyTime;
    @Column(nullable = true, unique = true)
    private Long modifyUserId;
    @Column(nullable = true, unique = true)
    private String password;
    @Column(nullable = true, unique = true)
    @NotEmpty(message="真实姓名不能为空")
    private String realName;
    @Column(nullable = true, unique = true)
    private Float salary;
    @Column(nullable = true, unique = true)
    @NotEmpty(message="毕业院校不能为空")
    private String userSchool;
    @Column(nullable = true, unique = true)
    private String sex;
    @Column(nullable = true, unique = true)
    private String themeSkin;
    @Column(nullable = true, unique = true)
    @NotEmpty(message="学历不能为空")
    private String userEdu;
    @Column(nullable = true, unique = true)
    @NotEmpty(message="用户名不能为空")
    private String userName;
    @Column(nullable = true, unique = true)
    private String userSign;
    @Column(nullable = true, unique = true)
    @NotEmpty(message="电话不能为空")
    private String userTel;
    @Column(nullable = true, unique = true)
    private Long deptId;
    @Column(nullable = true, unique = true)
    private Long positionId;
    @Column(nullable = true, unique = true)
    private Long roleId;
    @Column(nullable = true, unique = true)
    private Integer superman;
    @Column(nullable = true, unique = true)
    private Integer holiday;
    @Column(nullable = true, unique = true)
    private String pinyin;

    @Override
    public String toString() {
        return "AoaUser{" +
                "userId=" + userId +
                ", address='" + address + '\'' +
                ", bank='" + bank + '\'' +
                ", birth=" + birth +
                ", eamil='" + eamil + '\'' +
                ", fatherId=" + fatherId +
                ", hireTime=" + hireTime +
                ", userIdcard='" + userIdcard + '\'' +
                ", imgPath='" + imgPath + '\'' +
                ", isLock=" + isLock +
                ", lastLoginIp='" + lastLoginIp + '\'' +
                ", lastLoginTime=" + lastLoginTime +
                ", modifyTime=" + modifyTime +
                ", modifyUserId=" + modifyUserId +
                ", password='" + password + '\'' +
                ", realName='" + realName + '\'' +
                ", salary=" + salary +
                ", userSchool='" + userSchool + '\'' +
                ", sex='" + sex + '\'' +
                ", themeSkin='" + themeSkin + '\'' +
                ", userEdu='" + userEdu + '\'' +
                ", userName='" + userName + '\'' +
                ", userSign='" + userSign + '\'' +
                ", userTel='" + userTel + '\'' +
                ", deptId=" + deptId +
                ", positionId=" + positionId +
                ", roleId=" + roleId +
                ", superman=" + superman +
                ", holiday=" + holiday +
                ", pinyin='" + pinyin + '\'' +
                '}';
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getEamil() {
        return eamil;
    }

    public void setEamil(String eamil) {
        this.eamil = eamil;
    }

    public Long getFatherId() {
        return fatherId;
    }

    public void setFatherId(Long fatherId) {
        this.fatherId = fatherId;
    }

    public Date getHireTime() {
        return hireTime;
    }

    public void setHireTime(Date hireTime) {
        this.hireTime = hireTime;
    }

    public String getUserIdcard() {
        return userIdcard;
    }

    public void setUserIdcard(String userIdcard) {
        this.userIdcard = userIdcard;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath;
    }

    public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Long getModifyUserId() {
        return modifyUserId;
    }

    public void setModifyUserId(Long modifyUserId) {
        this.modifyUserId = modifyUserId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public String getUserSchool() {
        return userSchool;
    }

    public void setUserSchool(String userSchool) {
        this.userSchool = userSchool;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getThemeSkin() {
        return themeSkin;
    }

    public void setThemeSkin(String themeSkin) {
        this.themeSkin = themeSkin;
    }

    public String getUserEdu() {
        return userEdu;
    }

    public void setUserEdu(String userEdu) {
        this.userEdu = userEdu;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSign() {
        return userSign;
    }

    public void setUserSign(String userSign) {
        this.userSign = userSign;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getPositionId() {
        return positionId;
    }

    public void setPositionId(Long positionId) {
        this.positionId = positionId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Integer getSuperman() {
        return superman;
    }

    public void setSuperman(Integer superman) {
        this.superman = superman;
    }

    public Integer getHoliday() {
        return holiday;
    }

    public void setHoliday(Integer holiday) {
        this.holiday = holiday;
    }

    public String getPinyin() {
        return pinyin;
    }

    public void setPinyin(String pinyin) {
        this.pinyin = pinyin;
    }
}