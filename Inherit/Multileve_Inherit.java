package inherit;

class Father{
 String F_name;
 int F_age;
 void F_married(String F_name){
     System.out.println("Father Married to " + F_name);
 }
}
class Mother extends Father{
 String M_name;
 int M_age;
 void Name_print(String x, String y){
     M_name = x;
     this.F_name = y;
     System.out.println("Father_Name: "+ F_name);
     System.out.println("Mother_Name: "+ M_name); 
 }
 void M_married(String s){
     System.out.println("Mother Married to " + s);
 }
}
class Daughter extends Mother{
 String D_name;
 int D_age;
   void Age_print(int x, int y){
     M_age = x;
     F_age = y;
     System.out.println("Father_Age: "+ F_age);
     System.out.println("Mother_Age: "+ M_age); 
   }
 int Sborn_on(int date){
     return date;
 }
}
class Son extends Daughter{
 String S_name;
 int S_age;
 int Dborn_on(int date){
     return date;
 }
 Son(){
     D_name = "Liza";
     D_age = 13;
     S_name = "Rabbi Hasan";
     S_age = 22;
 }
}

class set_data extends Son{
    set_data(){
        Name_print("Rita", "Khalilur Rahman");
        Age_print(35, 45);
    }
}

public class Multileve_Inherit{  
 public static void main(String args[]){  
   set_data ob = new set_data();  
   ob.F_married("Rita");
   ob.M_married("Khalilur Rahman");
   Son s = new Son();
   System.out.println("Son Name: "+ s.S_name);
   System.out.println("Son Age: "+ s.S_age);
   System.out.println("Son DOB: "+ s.Sborn_on(02));
   System.out.println("Daughter Name: "+ s.D_name);
   System.out.println("Daughter age: "+ s.D_age);
   System.out.println("Daughter DOB: "+ s.Dborn_on(02));
  }
}

//class Animal{  
//    void eat(){
//        System.out.println("eating !!!");
//    }  
//}  
//class Dog extends Animal{  
//    void bark(){
//        System.out.println("barking !!!");
//    }  
//}  
//class BabyDog extends Dog{  
//  void weep(){
//      System.out.println("weeping !!!");
//  }  
//}  
//public class Multileve_Inherit{  
// public static void main(String args[]){  
//   Dog d = new Dog();  
//   //d.weep();  
//   d.bark();  
//   d.eat();  
//  }
//}