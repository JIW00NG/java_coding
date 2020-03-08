import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class JTabbedPaneTestEmpty extends JFrame {
    JTabbedPane tab;
    JTabbedPaneTest1 test1;
    JTabbedPaneTest2 test2;

    public JTabbedPaneTestEmpty(){
        super("JTabbedPane practice example");
        tab=new JTabbedPane(JTabbedPane.TOP);

        JPanel one =new JPanel();
        test1=new JTabbedPaneTest1();

        JPanel two=new JPanel();
        test2=new JTabbedPaneTest2();

        one.add(test1);
        two.add(test2);

        tab.addTab("basic data",one);
        tab.addTab("other data",two);

        getContentPane().add(tab,BorderLayout.CENTER);
        setSize(500,200);
        setVisible(true);
    }

}
