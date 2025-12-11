package lecture15;


class MyThread extends Thread{   // Creating new thread 
    public void run(){
        System.out.println(Thread.currentThread().getName());   // Name of the thread
        for(int i=0;i<5;i++){
            System.out.println(i + " t1");
            try{
                Thread.sleep(2000);   // after every 2 seconds thread will sleep(run after every 2 seconds)
            }
            catch(Exception e){

            }
        }
    }
}


public class timer_threading {
     public static void main(String[] args){
        System.out.println(Thread.currentThread().getName());
        MyThread t1=new MyThread();  // Creating object for the new thread
        t1.start();    // Calling the new thread


         for(int i=0;i<5;i++){
            System.out.println(i + " main");
        }

    }
}
