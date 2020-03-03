import java.awt.Frame;
import java.awt.MenuBar;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.CheckboxMenuItem;

public class MenuBarLearn extends Frame {
    public MenuBarLearn(String str){
        super(str);

        MenuBar mb= new MenuBar();
        Menu file = new Menu("flie");

        MenuItem file_new=new MenuItem("new flie");
        MenuItem file_open=new MenuItem("open file");
        MenuItem file_save=new MenuItem("save file");
        MenuItem file_newname=new MenuItem("new name");

        file.add(file_new);
        file.add(file_open);
        file.add(file_save);
        file.add(file_newname);

        Menu edit=new Menu("edit");

        MenuItem edit_undo=new MenuItem("undo");
        MenuItem edit_cut=new MenuItem("cut");
        MenuItem edit_copy=new MenuItem("copy");
        MenuItem edit_paste=new MenuItem("paste");

        edit.add(edit_undo);
        edit.add(edit_cut);
        edit.add(edit_copy);
        edit.add(edit_paste);

        Menu view = new Menu("view");
        CheckboxMenuItem view_status = new CheckboxMenuItem("status");
        view.add(view_status);

        mb.add(file);
        mb.add(edit);
        mb.add(view);

        setMenuBar(mb);
        setSize(200,200);
        setVisible(true);
    }
}
