import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Event2 extends JFrame {
    JTextField text;
    JCheckBox bold;

    public Event2(){
        super("Item processing in CheckBox");
        Container c= getContentPane();
        c.setLayout(new FlowLayout());

        text=new JTextField("java coding",10);
        text.setFont(new Font("plain",Font.PLAIN,14));
        c.add(text);

        bold=new JCheckBox("bold");
        c.add(bold);

        CheckBoxHandler handler=new CheckBoxHandler();

        bold.addItemListener(handler);

        setSize(300,100);
        setVisible(true);

    }

    public class CheckBoxHandler implements ItemListener{
        int valBold=Font.PLAIN;

        public void itemStateChanged(ItemEvent e){
            if(e.getSource()==bold){
                if(e.getStateChange()==ItemEvent.SELECTED){
                    valBold=Font.BOLD;
                }else{
                    valBold=Font.PLAIN;
                }
            }
            text.setFont(new Font("PLAIN",valBold,14));
        }
    }
}
