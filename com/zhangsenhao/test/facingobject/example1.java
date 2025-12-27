package com.zhangsenhao.test.facingobject;

public class example1 {

    private String username;
    private String password;
    private String email;
    private String gender;
    private int age;

    //空参
    public example1(){}
    public example1(String username,String password,String email,String gender,int age ){
        this.username=username;
        this.password=password;
        this.email=email;
        this.gender=gender;
        this.age=age;
    }

    //get和set方法
    public void setUsername(String username){
        this.username=username;
    }
    public String getusername(){
        return username;
    }
    public void setpassword(String password){
        this.password=password;
    }
    public String getuserpassword(){
       return password;
    }
    public void setmail(String mail){
        this.username=mail;
    }
    public String getuseremail(){
        return email;
    }
    public void setgender(String gender){
        this.gender=gender;
    }
    public String getgender(){
        return gender;
    }
    public void setage(int age){
        this.age=age;
    }
    public int setage(){
        return age;
    }
}
