
package Interface;

interface Animal{
    void eat();
    void eating();
}
class Dog implements Animal{
    public void eat(){
        System.out.println("Eat trees");
    }
    public void eating(){
        System.out.println("Eat rice");
    }
}

public class Interface01 {
    public static void main(String[] args){
        Dog ob = new Dog();
        ob.eating();
    }
}
