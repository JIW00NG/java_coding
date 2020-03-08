import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;
import java.awt.BorderLayout;

public class JFileChooserTest extends JFrame implements ActionListener {

    JFileChooser fc;

    public JFileChooserTest(){
        fc=new JFileChooser();
        fc.setMultiSelectionEnabled(true);

        BorderLayout bl=new BorderLayout();
        JButton btn=new JButton("select file");
        btn.addActionListener(this);
        add(bl.NORTH,btn);

        setBounds(0,0,200,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        FileNameExtensionFilter filter = new FileNameExtensionFilter("text","txt");

        fc.setFileFilter(filter);
        int result = fc.showOpenDialog(this);

        if(result==JFileChooser.APPROVE_OPTION){
            File[] f=fc.getSelectedFiles();
            int i=0;
            for(File n:f)
                System.out.println(++i+"selected file: "+n.getName());
        }
    }

    public static void main(String[] args) {
        new JFileChooserTest();
    }
}
