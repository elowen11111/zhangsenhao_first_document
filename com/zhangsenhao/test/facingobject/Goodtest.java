package com.zhangsenhao.test.facingobject;

public class Goodtest {
    public static void main(String[]args){
        Goods[] arr=new Goods[3];
        Goods g1=new Goods("001","华硕天选5 4060显卡",7100,100);
        Goods g2=new Goods("002","大疆御4pro",10000,200);
        Goods g3=new Goods("003","华为matex6",12000,300);

        arr[0]=g1;
        arr[1]=g2;
        arr[2]=g3;
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].getId()+arr[i].getname()+" "+arr[i].getPrice()+" "+arr[i].getCount());
        }
    }
}
