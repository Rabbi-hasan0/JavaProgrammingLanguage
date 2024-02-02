package Interface;

interface Animal1{
    void eat();
}
interface Animal2{
    void eat();
}
class Dog implements Animal1, Animal2{
    public void eat(){
        System.out.println("Eat trees");
    }
}

public class Interface01 {
    public static void main(String[] args){
        Dog ob = new Dog();
        ob.eat();
    }
}
