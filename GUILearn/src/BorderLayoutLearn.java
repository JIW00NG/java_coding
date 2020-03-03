import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Button;

public class BorderLayoutLearn extends Frame {
    public BorderLayoutLearn(String str){
        super(str);

        setLayout(new BorderLayout());

        add("West",new Button("West"));
        add("East",new Button("East"));
        add("North",new Button("North"));
        add("South",new Button("South"));
        add("Center",new Button("Center"));

        setSize(200,200);
        setVisible(true);
    }
}
