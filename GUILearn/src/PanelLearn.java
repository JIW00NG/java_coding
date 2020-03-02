import java.awt.*;

public class PanelLearn extends Frame{
    public PanelLearn(String str){
        super(str);
        Panel panel1 = new Panel();
        panel1.setBackground(Color.DARK_GRAY);
        add(panel1);
        setSize(300,300);
        setVisible(true);
    }
}
