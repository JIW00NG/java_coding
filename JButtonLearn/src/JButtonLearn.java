import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class JButtonLearn extends JFrame {
    public JButtonLearn(){
        super("Button test");
        JPanel buttonPanel= new JPanel();
        JButton btn = new JButton("Button");

        buttonPanel.add(btn);

        ImageIcon icon1 = new ImageIcon("JButtonLearn\\src\\potato.jpg");//상대경로
        ImageIcon icon2 = new ImageIcon("C:\\Users\\ipkjw\\Desktop\\java_coding\\JButtonLearn\\src\\carrot.jpg");//절대경로
        JToggleButton tgbutton = new JToggleButton(icon1);//토글버튼에 이미지 넣기
        buttonPanel.add(tgbutton);

        JLabel lblHobby=new JLabel("hobby");

        JCheckBox check1 = new JCheckBox("excercising");
        JCheckBox check2 = new JCheckBox("reading");
        JCheckBox check3 = new JCheckBox("watching movie");

        buttonPanel.add(lblHobby);
        buttonPanel.add(check1);
        buttonPanel.add(check2);
        buttonPanel.add(check3);

        JLabel lblMale=new JLabel("gender");

        JRadioButton rb1= new JRadioButton("male");
        JRadioButton rb2 = new JRadioButton("female");
        ButtonGroup bg = new ButtonGroup();
        bg.add(check1);
        bg.add(check2);
        bg.add(check3);

        buttonPanel.add(lblMale);
        buttonPanel.add(rb1);
        buttonPanel.add(rb2);

        add(buttonPanel);

        setLocation(150,200);
        setSize(242,150);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JButtonLearn();
    }

}
