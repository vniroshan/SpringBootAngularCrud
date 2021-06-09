package com.niroshan.demo.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "stdtab")
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "sid")
    private Integer stdId;

    public Integer getStdId() {
        return stdId;
    }

    public void setStdId(Integer stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public Double getStdFee() {
        return stdFee;
    }

    public void setStdFee(Double stdFee) {
        this.stdFee = stdFee;
    }

    public String getStdCourse() {
        return stdCourse;
    }

    public void setStdCourse(String stdCourse) {
        this.stdCourse = stdCourse;
    }

    public Double getStdFeeDisc() {
        return stdFeeDisc;
    }

    public void setStdFeeDisc(Double stdFeeDisc) {
        this.stdFeeDisc = stdFeeDisc;
    }

    public Double getStdFeeGst() {
        return stdFeeGst;
    }

    public void setStdFeeGst(Double stdFeeGst) {
        this.stdFeeGst = stdFeeGst;
    }

    @Column(name = "sname")
    private  String stdName;
    @Column(name = "sfee")
    private Double stdFee;
    @Column(name = "scourse")
    private String stdCourse;
    @Column(name = "sfeedisc")
    private Double stdFeeDisc;
    @Column(name = "sfeegst")
    private Double stdFeeGst;
}
