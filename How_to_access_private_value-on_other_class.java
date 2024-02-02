package Interface;

class Person{
    private String name;
    private int age;

    public String getName(){          // Note: / Call getData and setData then access privet variable on the other class ///
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    
}
class Teacher extends Person{
    private String qualification;

    public String getQualification() {
        return qualification;
    }
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
    void Display(){
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
    }
}
public class Interface01 {
    public static void main(String[] args){
        Teacher ob = new Teacher();
        ob.setName("Rabbi Hasan");
        ob.setAge(22);
        ob.setQualification("Bsc in CSE");
        ob.Display();
    }
}
