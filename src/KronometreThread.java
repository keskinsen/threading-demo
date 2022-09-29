public class KronometreThread implements Runnable{

    private Thread thread;
    public String threadName;

    public KronometreThread(String threadName){
        this.threadName=threadName;
        System.out.println("olusturuluyor "+ threadName);

    }
    @Override
    public void run() {
        System.out.println("calıstırılıyor "+threadName);
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + ":" + i);
                Thread.sleep(1000);
            }
        }
        catch (InterruptedException exception){
            System.out.println("kesildi "+threadName);
        }
        System.out.println("Thread bitti "+threadName);

    }
    public void start(){
        System.out.println("thread nesnesi olusturuluyor ");
        if (thread==null){
            thread=new Thread(this,threadName);
            thread.start();
        }
    }
}
