public class NewThread implements Runnable{
    Thread t;
    NewThread(){
        t=new Thread(this, "Demo Thread");
        System.out.println("Child Thread: "+t);
    }
    public void run(){
        for(int i=5;i>0;i--){

        }
    }
}
