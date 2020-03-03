import java.awt.Frame;

/* 상속 이용 x
public class FrameLearn {
    public static void main(String[] args) {
        Frame f= new Frame();
        f.setTitle("first frame");
        f.setBounds(100,100,300,300);
        f.setVisible(true);
    }
}*/

/*상속 이용 o*/
class FrameLearn extends Frame{
    public FrameLearn(){
        super("second frame");
        setBounds(100,100,300,300);
        setVisible(true);
    }
}

