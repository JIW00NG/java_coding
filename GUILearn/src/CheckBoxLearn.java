import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Frame;
import java.awt.Panel;

public class CheckBoxLearn extends Frame {
    public CheckBoxLearn(String str){
        super(str);
        Panel p = new Panel();
        CheckboxGroup group = new CheckboxGroup();
        Checkbox cbx1 =new Checkbox("chicken",true);
        Checkbox cbx2 =new Checkbox("pizza");
        Checkbox cbx3 =new Checkbox("hamburger");
        Checkbox cbx4 = new Checkbox("chicken",group,true);
        Checkbox cbx5 = new Checkbox("pizza",group,false);
        Checkbox cbx6 = new Checkbox("hamburger",group,false);

        p.add(cbx1);
        p.add(cbx2);
        p.add(cbx3);


        p.add(cbx4);
        p.add(cbx5);
        p.add(cbx6);

        add(p);

        setSize(180,300);

        setVisible(true);
    }
}
