import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class GridLayoutLearn extends Frame {
    Button btn[]=new Button[6];

    public GridLayoutLearn(String str){
        super(str);

        setLayout(new GridLayout(3,2));

        for(int i=0;i<6;i++){
            btn[i]=new Button("button No "+(i+1));
            add(btn[i]);
        }
        setSize(200,200);
        setVisible(true);
    }
}
