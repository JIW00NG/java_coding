import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class BoxLayoutLearn extends JFrame {
    public BoxLayoutLearn(){
        super("BoxLayout test");
        JRadioButton r1,r2;
        setLayout(new BorderLayout());
        Box left = Box.createVerticalBox();
        left.add(Box.createVerticalStrut(30));
        ButtonGroup radioGroup=new ButtonGroup();
        radioGroup.add(r1=new JRadioButton("chicken"));
        left.add(r1);
        left.add(Box.createVerticalStrut(30));
        radioGroup.add(r2=new JRadioButton("pizza"));
        left.add(r2);

        JPanel leftPanel=new JPanel(new BorderLayout());
        leftPanel.setBorder(new TitledBorder(new EtchedBorder(),"food"));

        leftPanel.add(left,BorderLayout.NORTH);

        Box right =Box.createVerticalBox();
        right.add(Box.createVerticalStrut(30));
        right.add(new JCheckBox("RTA"));
        right.add(Box.createVerticalStrut(30));
        right.add(new JCheckBox("Pig"));
//        right.add(Box.createVerticalStrut(30));
        right.add(new JCheckBox("Dog"));
        right.add(Box.createVerticalStrut(30));
        right.add(new JCheckBox("weasal"));
        right.add(Box.createVerticalStrut(30));

        JPanel rightPanel=new JPanel(new BorderLayout());
        rightPanel.setBorder(new TitledBorder(new EtchedBorder(),"animal"));
        rightPanel.add(right,BorderLayout.CENTER);
        Box center=Box.createHorizontalBox();
        center.add(leftPanel);
        center.add(rightPanel);
        add(center,BorderLayout.CENTER);
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        BoxLayoutLearn box= new BoxLayoutLearn();
        box.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
