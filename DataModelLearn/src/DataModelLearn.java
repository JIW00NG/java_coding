import javax.swing.table.TableCellEditor;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.BorderLayout;

public class DataModelLearn{
    public static void main(String[] args) {
        String rows[][]={{"RTA","chicken"},{"pig","pizza"},{"weasal","pig hocks"}};
        String headers[]={"name","food"};
        String sports[]={"chicken","pizza","pig hocks","etc"};

        JComboBox<String> comboBox = new JComboBox<String>(sports);
        comboBox.setMaximumRowCount(4);

        TableCellEditor editor = new DefaultCellEditor(comboBox);

        JFrame frame=new JFrame("JTable test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable table=new JTable(new DefaultTableModel(rows,headers));
        table.getColumnModel().getColumn(1).setCellEditor(editor);

        JScrollPane scrollPane=new JScrollPane(table);
        frame.add(scrollPane,BorderLayout.CENTER);
        frame.setSize(300,150);
        frame.setVisible(true);

    }
}
