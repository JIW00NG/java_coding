public class ObjectTest {
    int data;
    public ObjectTest(int x){
        data=x;
    }

    public ObjectTest clone() throws CloneNotSupportedException{
        ObjectTest Temp = new ObjectTest(this.data);
        return Temp;
    }

    public static void main(String[] args) {
        ObjectTest obj1 = new ObjectTest(10);
        ObjectTest obj2 = obj1;
        ObjectTest obj3 = new ObjectTest(10);
        ObjectTest obj4 = obj1;

        try{
            obj4=obj3.clone();
        }catch(CloneNotSupportedException e){
            obj4=null;
            System.out.println("복제할 Object가 없음");
        }

        int i=10;
        int j=10;
        if(i==j){
            System.out.println("i와 j의 값은 같음");
        }
        if(obj1==obj2){
            System.out.println("obj1과 obj2의 위치는 같음");
        }
        else{
            System.out.println("obj1과 obj2의 위치는 다름");
        }

        if(obj1==obj3){
            System.out.println("obj1과 obj3의 위치는 같음");
        }
        else{
            System.out.println("obj1과 obj3의 위치는 다름");
        }

        if(obj1.equals(obj2)){
            System.out.println("obj1과 obj2의 내용은 같음");
        }
        else{
            System.out.println("obj1과 obj2의 내용은 다름");
        }
    }
}
