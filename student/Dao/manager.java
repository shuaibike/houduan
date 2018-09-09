package com.Dao;

public class manager {
    private  String uname;
    private  String upassword;

    public manager(){

    }

    public manager(String uname, String pwd) {
        this.uname=uname;
        this.upassword=pwd;
    }


    public void setuname(String uname){
        this.uname=uname;
    }

    public String getuname(){
        return  uname;
    }

    public void setupassword(String upassword){
        this.upassword=upassword;
    }

    public String getupassword(){
        return  upassword;
    }
}
