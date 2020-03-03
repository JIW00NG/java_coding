import java.awt.*;

public class TextAreaLearn extends Frame {
    public TextAreaLearn(String str){
        super(str);
        Panel p = new Panel();
        TextArea txta1 = new TextArea(10,30);
        TextField txtf1= new TextField("Hello Java",20);

        txta1.setText(" Java World");

        txta1.setBackground(Color.yellow);
        txta1.setFont(new Font("BOLD", Font.BOLD,10));
        txta1.setForeground(Color.blue);
        txtf1.setEchoChar('*');
        txtf1.setForeground(Color.red);
        p.add(txta1);
        p.add(txtf1);
        add(p);

        setSize(200,200);
        setVisible(true);
    }
}
