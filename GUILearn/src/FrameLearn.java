import java.awt.Frame;

/* 상속 이용 x
public class FrameLearn {
    public static void main(String[] args) {
        Frame f= new Frame();
        f.setTitle("첫 번째 프레임");
        f.setBounds(100,100,300,300);
        f.setVisible(true);
    }
}*/

/*상속 이용 o*/
class FrameLearn extends Frame{
    public FrameLearn(){
        super("두번째 프레임");
        setBounds(100,100,300,300);
        setVisible(true);
    }
}

