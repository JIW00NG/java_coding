import java.awt.Frame;
import java.awt.Panel;
import java.awt.Button;

public class ButtonLearn extends Frame {
    Button btn1,btn2,btn3;

    public ButtonLearn(String str){
        super(str);

        Panel p = new Panel();
        btn1=new Button("가위");
        btn2= new Button("바위");
        btn3=new Button("보");

        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        add(p);

        btn3.setEnabled(false);

        setSize(200,200);
        setVisible(true);
    }
}
