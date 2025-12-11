package lecture15;

class MyThread extends Thread{   // Creating new thread 
    public void run(){
        System.out.println(Thread.currentThread().getName());   // Name of the thread
        for(int i=0;i<5;i++){
            System.out.println(i + " t1");
        }
    }
}

public class threading {
    public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        MyThread t1=new MyThread();  // Creating object for the new thread
        t1.start();    // Calling the new thread

        try{
             t1.join();      // firstly t1 (new thread or my thread) will Execute and after that main will execute
        }
        catch(Exception e){

        }

         for(int i=0;i<5;i++){
            System.out.println(i + " main");
        }

    }
}
