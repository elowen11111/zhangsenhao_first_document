package collection;

import java.util.ArrayList;

public class test1 {
        public static void main(String[] args){
            ArrayList<String> list=new ArrayList<>();
            list.add("凯迪拉克ct5");
            list.add("保时捷帕拉梅拉");
            list.add("宝马325");
            list.add("奥迪A5L");
            System.out.print("[");
            for(int i=0;i<list.size();i++){
                if(i==list.size()-1){
                    System.out.print(list.get(i));
                }else{
                    System.out.print(list.get(i)+",");
                }
            }
            System.out.println("]");
        }
    }


