package com.zhangsenhao.test.com.arrar;

import java.util.Random;

public class yanzhengma {
    public static void main(String args[]){
        Random r=new Random();
        String result="";
        char[] letter=new char[52];
        //添加小写字母
        for(int i=0;i<26;i++){
            letter[i]=(char)('a'+i);
        }
        //添加大写字母
        for(int i=0;i<26;i++){
            letter[i+26]=(char)('A'+i);
        }
        //获取索引，从而得到字母
        for(int i=0;i<4;i++){
            int index=r.nextInt(52);
            result+=letter[index];
        }
        //加上数字
        int num=r.nextInt(10);
        result+=num;
        //打印结果
        System.out.println(result);
    }
}
