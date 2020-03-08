import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class JTabbedPaneTest1 extends JPanel {
    public JTabbedPaneTest1(){
        String title[]={"number","name","age"};
        String data[][]={
                {"1","RTA","26"},
                {"2","pig","25"},
                {"3","weasal","24"}
        };

        JTable table = new JTable(data,title);
        JScrollPane sp=new JScrollPane(table);
        add(sp);
    }
}
