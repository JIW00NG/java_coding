import java.awt.Frame;
import java.awt.List;
import java.awt.Panel;

public class ListLearn extends Frame {
    Panel p;
    List list;

    public ListLearn(String str){
        super(str);
        p=new Panel();
        list=new List(2,true);

        list.add("chicken");
        list.add("hamburger");
        list.add("pizza");
        list.add("pig hocks");

        p.add(list);
        add(p);
        setSize(300,100);
        setVisible(true);

    }
}
