import javax.swing.JFrame;

public class JFrameTest extends JFrame {

    public JFrameTest(){
        super("JFrame test");

        setSize(350,100);
        setVisible(true);

    }

    public static void main(String[] args) {
        JFrameTest f= new JFrameTest();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
