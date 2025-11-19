package lecture9;

class Animal{
     static void eat(){
        System.out.println("dog eats good day biscuit");
      }
        void instanceData(){
        System.out.println("coding is done by cat ");
    }
}
class Dog extends Animal{
   static void eat(){
        System.out.println("Dog eats parle-G biscuit");
    }

    void instanceData(){
        System.out.println("coding is done by dog ");
    }
}

public class staticMethod {
    public static void main (String[] args){
     Animal s1 =new Dog();     // upcasting
    s1.instanceData();

    // Dog s2 = (Dog)s1;
    // s2.instaceData();              // downCasting
     }
    }

