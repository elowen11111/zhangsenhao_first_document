package Inheritance;

public class ShaPigou extends Dog{
    @Override
    public void eat(){
        super.eat();
        System.out.println("狗在啃骨头");
    }
}
