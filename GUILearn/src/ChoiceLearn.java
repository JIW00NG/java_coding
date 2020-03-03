import java.awt.Frame;
import java.awt.Choice;

public class ChoiceLearn extends Frame {
    Choice ch;

    public ChoiceLearn(String str){
        super(str);

        ch=new Choice();

        ch.addItem("chicken");
        ch.addItem("pizza");
        ch.addItem("hamburger");

        add(ch);
        setSize(300,100);
        setVisible(true);
    }
}
