package lecture9;

abstract class Animal{
    abstract void eat();
}

class Dog extends Animal{
    void eat(){
        System.out.println("dog eats food");
    }
}
public  class abstraction{
    public static void main(String[] args) {
         Animal s1 = new Dog();
         s1.eat();
    }
   
    
}
