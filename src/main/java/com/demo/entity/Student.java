package com.demo.entity;
//学生类
public class Student {
    //学生id
    private Integer id;
    //学生姓名
    private String name;
    //学生性别
    private String gender;
    //学生学号
    private Integer studentId;
    //任务id
    private Integer taid;
    //教师id
    private Integer tid;
    //团队id
    private Integer teid;
    //班级id
    private Integer cid;
    //账号id
    private Integer uid;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getTaid() {
        return taid;
    }

    public void setTaid(Integer taid) {
        this.taid = taid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getTeid() {
        return teid;
    }

    public void setTeid(Integer teid) {
        this.teid = teid;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}