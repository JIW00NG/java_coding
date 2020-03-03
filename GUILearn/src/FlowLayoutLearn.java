import java.awt.Frame;
import java.awt.FlowLayout;
import java.awt.Button;

public class FlowLayoutLearn extends Frame {
    Button[] btn= new Button[10];

    public FlowLayoutLearn(String str){
        super(str);
        setLayout(new FlowLayout());

        for(int i=0;i<10;i++){
            btn[i]=new Button("no"+(i+1)+" button");
            add(btn[i]);
        }
        setBounds(100,100,200,200);
        setVisible(true);
    }
}
