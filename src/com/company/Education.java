package com.company;

import java.util.ArrayList;

public class Education {
    private String degree;
    private String major;
    private String university;//University Name
    private String gradYear;//Graduation Year

    public Education() {
    }

    public Education(String degree, String major, String university, String gradYear) {
        this.degree = degree;
        this.major = major;
        this.university = university;
        this.gradYear = gradYear;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGradYear() {
        return gradYear;
    }

    public void setGradYear(String gradYear) {
        this.gradYear = gradYear;
    }
    public void listEducation(){
        System.out.println(getDegree()+ " in "+getMajor());
        System.out.println(getUniversity()+" , "+getGradYear());
    }
}
//