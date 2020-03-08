import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class JOptionPaneTest extends JFrame implements ActionListener {
    JButton btn[]=new JButton[4];
    String[] str={"login","resister"};

    public JOptionPaneTest(){
        super("JOptionPane test");
        setLayout(new FlowLayout());

        btn[0]=new JButton("message");
        btn[1]=new JButton("confirm");
        btn[2]=new JButton("input");
        btn[3]=new JButton("option");

        for(JButton n:btn){
            add(n);
            n.addActionListener(this);
        }
        pack();
        setLocation(300,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getActionCommand() == "message") {
            JOptionPane.showMessageDialog(this,"message dialog box","message",JOptionPane.INFORMATION_MESSAGE);
        }else if(e.getActionCommand()=="confirm"){
            JOptionPane.showConfirmDialog(this,"confirm dialog box","confirm",JOptionPane.YES_NO_OPTION);
        }else if(e.getActionCommand()=="input"){
            JOptionPane.showInputDialog(this,"input dialog box","input",JOptionPane.YES_NO_OPTION);
        }else if(e.getActionCommand()=="option"){
            JOptionPane.showOptionDialog(this,"option dialog box","option",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE,null,str,str[1]);
        }
    }

    public static void main(String[] args) {
        new JOptionPaneTest();
    }
}
