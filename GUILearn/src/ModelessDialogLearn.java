import java.awt.Dialog;
import java.awt.Frame;

public class ModelessDialogLearn extends Frame {
    public ModelessDialogLearn(){
        super("dialog test");

        Dialog d = new Dialog(this,"modeless dialog");
        setBounds(0,0,400,400);
        setVisible(true);
        d.setBounds(100,100,200,200);
        d.setVisible(true);
    }
}
