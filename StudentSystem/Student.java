package StudentSystem;

public class Student {
    private String name;
    private String id;
    private String address;
    private int age;
    public Student(){
    }
    public Student(String name,String id,String address,int age){
        this.id=id;
        this.name=name;
        this.address=address;
        this.age=age;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
}
