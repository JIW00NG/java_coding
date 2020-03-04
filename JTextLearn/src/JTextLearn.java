import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;

public class JTextLearn extends JFrame {
    JLabel basicLabel,idLabel,passwordLabel;
    JTextField idField;
    JPasswordField passwordField;
    JPanel idPanel,passwordPanel,loginPanel;
    JButton loginButton,registButton;
    JTextArea content;

    public JTextLearn(){
        super("JText test");

        setLayout(new FlowLayout());

        EtchedBorder etcheder = new EtchedBorder();
        basicLabel= new JLabel("Enter ID and Password");
        basicLabel.setBorder(etcheder);

        add(basicLabel);

        idPanel=new JPanel();
        passwordPanel=new JPanel();

        idLabel=new JLabel("ID");
        passwordLabel=new JLabel("Password");

        idField=new JTextField(10);
        passwordField=new JPasswordField(10);

        idPanel.add(idLabel);
        idPanel.add(idField);
        passwordPanel.add(passwordLabel);
        passwordPanel.add(passwordField);

        loginPanel=new JPanel();
        loginButton=new JButton("login");
        registButton=new JButton("regist");

        loginPanel.add(loginButton);
        loginPanel.add(registButton);

        add(idPanel);
        add(passwordPanel);
        add(loginPanel);

        content=new JTextArea(3,20);
        JScrollPane contentScroll=new JScrollPane(content);
        add(contentScroll);
        setSize(250,350);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JTextLearn();
    }
}
