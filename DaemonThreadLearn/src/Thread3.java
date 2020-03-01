public class Thread3 extends Thread {
    public void run(){
        try{
            System.out.println("Daemon Thread Start");
            sleep(1000);
            System.out.println("Daemon Thread End");
        }catch(Exception e){}
    }

    public static void main(String[] args) {
        Thread3 t = new Thread3();

        t.setDaemon(true);
        t.start();
        System.out.println("Main Method End");
    }
}
