package lecture15;



class MyThread extends Thread{   // Creating new thread 
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println("Downloading file........" + (i*20)+"%");
            try{
                Thread.sleep(2000);   // after every 2 seconds thread will sleep(run after every 2 seconds)
            }
            catch(Exception e){

            }
        }
    }
}

public class timer2_threading {
    public static void main(String[] args){
         
        MyThread t1=new MyThread();  // Creating object for the new thread
        t1.start();    // Calling the new thread

        for(int i=0;i<5;i++){
            System.out.println( "Timer" + i);

              try{
                Thread.sleep(4000);   // after every 2 seconds thread will sleep(run after every 2 seconds)
            }
            catch(Exception e){

            }
            
        }

    }
}
