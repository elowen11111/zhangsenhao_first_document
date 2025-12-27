package com.zhangsenhao.test.facingobject;
import java.util.Scanner;
public class CarTest {
    public static void main(String[] args){
        Car[] arr=new Car[3];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            Car c=new Car();
            System.out.println("请输入汽车的品牌");
            String brand=sc.next();
            c.setBrand(brand);
            System.out.println("请输入汽车的价格");
            int price=sc.nextInt();
            c.setPrice(price);
            System.out.println("请输入汽车的颜色");
            String color=sc.next();
            c.setColor(color);
            arr[i]=c;
        }
        for(int i=0;i<arr.length;i++){
            Car c=arr[i];
            System.out.println("该车的品牌是"+c.getBrand()+" 价格是"+c.getPrice()+" 颜色是"+c.getColor());
        }
        int sumPrice=0;
        for(int i=0;i<arr.length;i++){
            Car c=arr[i];
            sumPrice+=c.getPrice();
        }
        double averagePrice=(double)sumPrice/arr.length;
        System.out.println(averagePrice);
    }
}
