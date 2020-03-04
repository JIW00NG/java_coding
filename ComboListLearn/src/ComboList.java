import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ComboList extends JFrame {
    JPanel basicPanel, panel1, panel2;
    JList<String> countList;
    JComboBox<String> animalComboBox;
    String name[]={"RTA","pig","weasal","dog","horse"};
    String count[]={"1","2","3","4","5"};

    public ComboList(){
        super("JComponent practice");
        Container comtainer = getContentPane();
        comtainer.setLayout(new FlowLayout());

        basicPanel =new JPanel(new GridLayout(1,2));

        animalComboBox =new JComboBox<String>(name);
        JScrollPane animalComboxScroll = new JScrollPane(animalComboBox);
        comtainer.add(animalComboxScroll);

        countList =new JList<String>(count);
        JScrollPane countLIstScroll =new JScrollPane(countList);
        countList.setVisibleRowCount(4);
        comtainer.add(countLIstScroll);
        setSize(250,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        ComboList Obj=new ComboList();
        Obj.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

}
