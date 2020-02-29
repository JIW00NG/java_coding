public class Thread1 {
    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();

//        t1.start();
//        t2.start();

        t1.run();
        t2.run();
    }
}
