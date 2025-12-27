package com.zhangsenhao.test.facingobject;

public class GirlFriend {
        private String name;
        private int age;
        private double height;

        public void setName(String name){
            this.name=name;
        }
        public String getName(){
            return name;
        }
        public void setAge(int age){
            if(age>=18&&age<=30){
                this.age=age;
            }else{
                System.out.println("输入错误");
            }
        }
        public int getAge(){
            return age;
        }
        public void setHeight(double height){
            if(height>=1.5&&height<2.0){
                this.height=height;
            }else{
                System.out.println("输入错误");
            }
        }
        public double getHeight(){
            return height;
        }
//        public static eat(){
//            System.out.println("吃饭");
//        }
//        public static sleep(){
//            System.out.println("睡觉");
//        }
}
