package com.zhangsenhao.test.facingobject;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role(){
    }
    public Role(String name,int blood){
        this.name=name;
        this.blood=blood;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getBlood(){
        return blood;
    }
    public void setBlood(int blood){
        this.blood=blood;
    }
    public void attack(Role role){
        Random r=new Random();
        int hurt=r.nextInt(20)+1;
        int remainBoold=role.getBlood()-hurt;
        remainBoold=remainBoold<0?0:remainBoold;
        role.setBlood(remainBoold);
        System.out.println(this.getName()+"打了"+role.getName()
                +"一下，造成了点"+hurt+"伤害，"+role.getName()+"还剩下了"+remainBoold+"点血量");
    }
}
