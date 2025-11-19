package lecture9;

class Animal{
      void eat(){
        System.out.println("dog eats good day biscuit");
      }
}

class Dog extends Animal{
    void eat(){
        System.out.println("Dog eats parle-G biscuit");
    }

    void data(){
        System.out.println("coding is done by dog ");
    }
}

public class method_overwrite {
    public static void main(String[] args){
     Dog s1 = new Dog();      // overwite
     s1.eat();
     s1.data();

    // Animal s1 =new Dog();     // upcasting
    // s1.eat();

    Dog s2 = (Dog)s1;
    s2.data();              // downCasting
    }
}
