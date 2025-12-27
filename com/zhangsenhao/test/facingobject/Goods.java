package com.zhangsenhao.test.facingobject;

public class Goods {
    private String id;
    private String name;
    private double price;
    private int count;

    public Goods(){
    }
    public Goods(String id,String name,double price,int count){
        this.id=id;
        this.name=name;
        this.price=price;
        this.count=count;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getname(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public int getCount(){
        return count;
    }
    public void setCount(int cout){
        this.count=count;
    }
}
