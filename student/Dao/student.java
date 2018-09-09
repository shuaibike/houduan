package com.Dao;

public class student {
    private String Sname;
    private String Ssex;
    private Integer Sage;
    private String Sno;
    private String Smajor;
    public student() {
        super();
    }
    public student(String no){
        this.Sno=no;
    }
    public student(String name, String no) {

        this.Sname = name;
        this.Sno = no;
    }

    public student(String name, String sex, Integer age, String no, String major) {
        super();
        this.Sname = name;
        this.Ssex = sex;
        this.Sage=age;
        this.Sno = no;
        this.Smajor=major;
    }

    public String getName() {
        return Sname;
    }
    public void setName(String name) {
        this.Sname = name;
    }
    public String getSsex() {
        return Ssex;
    }
    public void setSsex(String sex)
    {
        this.Ssex = sex;
    }
    public int getSage()
    {
        return Sage;
    }
    public void setSage(Integer age) {
        this.Sage = age;
    }
    public String getSno()
    {
        return Sno;
    }
    public void setSno(String no) {
        this.Sno = no;
    }
    public String getSmajor() {
        return Smajor;
    }
    public void setSmajor(String major) {
        this.Smajor = major;
    }

}
