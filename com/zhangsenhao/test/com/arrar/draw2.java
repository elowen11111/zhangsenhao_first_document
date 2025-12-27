package com.zhangsenhao.test.com.arrar;

import java.util.Random;

public class draw2 {
    public static void main(String args[]) {
        int[] bonus = new int[]{2, 588, 888, 1000, 10000};
        Random r = new Random();
        for(int i=0;i<bonus.length;i++){
            int index=r.nextInt(5);
            int tmp=bonus[i];
            bonus[i]=bonus[index];
            bonus[index]=tmp;
        }
        for(int i=0;i<bonus.length;i++){
            System.out.println(bonus[i]);
        }
    }
}
