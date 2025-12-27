package StudentSystem;

import java.util.Scanner;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args){
        ArrayList<Student> list=new ArrayList<>();
        loop:while(true){
            System.out.println("----------------欢迎来到广东技术师范大学学生管理系统-----------------------");
            System.out.println("1.添加学生");
            System.out.println("2.删除学生");
            System.out.println("3.修改学生");
            System.out.println("4.查询学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择：");
            Scanner sc=new Scanner(System.in);
            int selection=sc.nextInt();
            switch(selection){
                case 1->addStudent( list);
                case 2->deleteStudent( list);
                case 3->updateStudent(list);
                case 4->queryStudent(list);
                case 5->{
                    System.out.println("退出");
                    break loop;
                }
                default->System.out.println("输入错误");
            }

        }
    }
    //添加学生
    public static void addStudent(ArrayList<Student> list){


        Scanner sc=new Scanner(System.in);
        Student stu=new Student();
        while(true){
            System.out.println("请输入学生id：");
            String id=sc.next();
            boolean flag=contains(list,id);
            if(flag){
                System.out.println("该ID已经存在，请重新输入");
                continue;
            }else{
                stu.setId(id);
                break;
            }
        }
        System.out.println("请输入学生姓名：");
        String name=sc.next();
        stu.setName(name);
        System.out.println("请输入学生年龄:");
        int age=sc.nextInt();
        stu.setAge(age);
        System.out.println("请输入学生的家庭地址");
        String address=sc.next();
        stu.setAddress(address);
        list.add(stu);
        System.out.println("添加成功");
    }
    //删除学生
    public static void deleteStudent(ArrayList<Student> list){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入删除学生的ID");
        String id=sc.next();
        boolean flag=contains(list,id);
        if(!flag){
            System.out.println("该学生id不存在");
        }else{
           for(int i=0;i<list.size();i++){
               Student stu=list.get(i);
               if(stu.getId().equals(id)){
                   list.remove(stu);
                   System.out.println("删除成功");
               }
           }
        }
    }
    //修改学生
    public static void updateStudent(ArrayList<Student> list){
        System.out.println("请输入要修改学生的ID");
        Scanner sc=new Scanner(System.in);
        String id=sc.next();
        int index=findStudent(list,id);
        boolean flag=contains(list,id);
        if(flag){
            Student stu=list.get(index);
            System.out.println("请输入要修改的内容");
            String content=sc.next();
            if(content.equals("ID")){
                System.out.println("请输入新的ID：");
                String newId=sc.next();
                stu.setId(newId);
            }
            if(content.equals("姓名")){
                System.out.println("请输入新的姓名");
                String newName=sc.next();
                stu.setName(newName);
            }if(content.equals("年龄")){
                System.out.println("请输入新的年龄");
                String newAge=sc.next();
                stu.setName(newAge);
            }if(content.equals("家庭地址")){
                System.out.println("请输入新的家庭地址");
                String newAddress=sc.next();
                stu.setName(newAddress);
            }
        }else{
            System.out.println("没有该学生的信息");
        }
    }
    //查询
    public static void queryStudent(ArrayList<Student> list){
        if(list.size()==0){
            System.out.println("当前无学生信息，请添加后再查询");
            return;
        }
        for(int i=0;i<list.size();i++){
            Student stu=list.get(i);
            System.out.println(stu.getId()+"\t"+stu.getName()+"\t"+stu.getAge()+"\t"+stu.getAddress());
        }
    }
    public static boolean contains(ArrayList<Student> list,String id){
        for(int i=0;i<list.size();i++){
            Student stu=list.get(i);
            String ID=stu.getId();
            if(id.equals(ID)){
                return true;
            }
        }
        return false;
    }
    public static int findStudent(ArrayList<Student> list,String id){
        for(int i=0;i<list.size();i++){
            Student stu=list.get(i);
            String ID=stu.getId();
            if(id.equals(ID)){
                return i;
            }
        }
        return -1;
    }
}
