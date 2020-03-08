import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JPanel;

public class Event1 extends JFrame implements ActionListener{

    JLabel lbl;
    JButton btn1,btn2;

    public Event1(String str){
        super(str);
        lbl=new JLabel("Press the Button");
        btn1=new JButton("1st button");
        btn2=new JButton("2st button");

        btn1.addActionListener(this);
        btn2.addActionListener(this);
        JPanel panel = new JPanel();
        panel.add(btn1);
        panel.add(btn2);

        add("Center",panel);
        add("South",lbl);

        setSize(300,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj =e.getSource();
        if((JButton)obj==btn1){
            lbl.setText("you pressed 1st button");
        }else{
            lbl.setText("you pressed 2st button");
        }

    }
}
