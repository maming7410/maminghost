package com.bjpowernode.crm.settings.domain;

/**
 * 作者：马明
 * 2019/8/13
 */
public class User {
    private String id;      //主键
    private String loginAct;//登录账号
    private String name;    //用户真实姓名
    private String loginPwd;//登录密码
    private String email;
    private String expireTime;//失效时间
    private String lockState;//锁定状态
    private String deptno;//部门编号
    private String allowIps;//允许访问的ip地址
    private String createTime;//创建时间
    private String createBy;//创建人
    private String editTime;//修改时间
    private String editBy;//修改人
    //日期

    //yyyy-MM-dd  yyyy-MM-dd HH:mm:ss
    public String getId() {
        return id;
    }

    public User setId(String id) {
        this.id = id;
        return this;
    }

    public String getLoginAct() {
        return loginAct;
    }

    public User setLoginAct(String loginAct) {
        this.loginAct = loginAct;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public User setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public User setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getLockState() {
        return lockState;
    }

    public User setLockState(String lockState) {
        this.lockState = lockState;
        return this;
    }

    public String getDeptno() {
        return deptno;
    }

    public User setDeptno(String deptno) {
        this.deptno = deptno;
        return this;
    }

    public String getAllowIps() {
        return allowIps;
    }

    public User setAllowIps(String allowIps) {
        this.allowIps = allowIps;
        return this;
    }

    public String getCreateTime() {
        return createTime;
    }

    public User setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    public String getCreateBy() {
        return createBy;
    }

    public User setCreateBy(String createBy) {
        this.createBy = createBy;
        return this;
    }

    public String getEditTime() {
        return editTime;
    }

    public User setEditTime(String editTime) {
        this.editTime = editTime;
        return this;
    }

    public String getEditBy() {
        return editBy;
    }

    public User setEditBy(String editBy) {
        this.editBy = editBy;
        return this;
    }

}
