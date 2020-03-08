import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class JTabbedPaneTest2 extends JPanel {
    public JTabbedPaneTest2(){
        String title[]={"number","job","affiliation"};
        String data[][]={
                {"1","programer","nvr"},
                {"2","jobless","home"},
                {"3","designer","NCsft"}
        };

        JTable table=new JTable(data,title);
        JScrollPane sp=new JScrollPane(table);
        add(sp);
    }
}
