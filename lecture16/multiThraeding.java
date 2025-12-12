package lecture16;

class MyThread implements Runnable{
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }
            catch(Exception e){

            }
        }
    }
}

public class multiThraeding {
    public static void main(String[] args){
        MyThread task = new MyThread();
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start(); 
    }
       

}
