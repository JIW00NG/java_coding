import java.awt.BorderLayout;
import javax.swing.*;

public class JTableLearn extends JFrame {
    public JTableLearn(){
        super("JTable test");
        String title[]={"number","name","age"};
        String data[][]={
                {"1","RTA","26"},
                {"2","pig","25"},
                {"3","weasal","24"}
        };

        JTable table= new JTable(data,title);
        JScrollPane sp= new JScrollPane(table);
        getContentPane().add(sp,BorderLayout.CENTER);
        setSize(300,150);
        setVisible(true);

    }

    public static void main(String[] args) {
        JTableLearn jtable=new JTableLearn();
        jtable.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
