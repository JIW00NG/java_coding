public class InterTest implements Inter {

    @Override
    public void method1() {
        System.out.println("추상메소드");
    }

    @Override
    public void method2() {
        System.out.println("추상메소드");
    }

    public static void main(String[] args) {
        InterTest obj = new InterTest();

        obj.method1();
        System.out.println("Inter의 a: "+obj.a);
        System.out.println("Inter의 b: "+obj.b);

    }
}
