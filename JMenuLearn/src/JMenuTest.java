import javax.swing.JFrame;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class JMenuTest extends JFrame {
    private JRadioButtonMenuItem colorItems[],fonts[];
    private JCheckBoxMenuItem styleItems[];
    private ButtonGroup fontGroup,colorGroup;

    public JMenuTest(){
        super("JMenu test");

        JMenuBar bar=new JMenuBar();
        setJMenuBar(bar);

        JMenu fileMenu = new JMenu("file(F)");
        fileMenu.setToolTipText("it is filemenu");
        fileMenu.setMnemonic('F');

        JMenuItem newItem = new JMenuItem("new file(N)");
        newItem.setMnemonic('N');
        fileMenu.add(newItem);

        JMenuItem openItem=new JMenuItem("open(O)");
        openItem.setMnemonic('O');
        fileMenu.add(openItem);

        JMenuItem saveItem = new JMenuItem("save(S)");
        saveItem.setMnemonic('S');
        fileMenu.add(saveItem);

        JMenuItem exitItem = new JMenuItem("exit(X)");
        exitItem.setMnemonic('X');
        fileMenu.add(exitItem);

        bar.add(fileMenu);

        JMenu formatMenu=new JMenu("edit(E");
        formatMenu.setToolTipText("it is edit menu");
        formatMenu.setMnemonic('E');

        String colors[] = {"black","blue","red","green"};
        JMenu colorMenu = new JMenu("color(C)");
        colorMenu.setMnemonic('C');
        colorItems= new JRadioButtonMenuItem[colors.length];
        colorGroup = new ButtonGroup();

        for(int i=0;i<colors.length;i++){
            colorItems[i]=new JRadioButtonMenuItem(colors[i]);
            colorMenu.add(colorItems[i]);
            colorGroup.add(colorItems[i]);
        }

        colorItems[0].setSelected(true);
        formatMenu.add(colorMenu);
        formatMenu.addSeparator();

        String fontNames[]={"Gulim","Batang","Dotum"};
        JMenu fontMenu = new JMenu("fonts(T)");
        fontMenu.setMnemonic('T');
        fonts=new JRadioButtonMenuItem[fontNames.length];
        fontGroup=new ButtonGroup();

        for(int i=0;i<fonts.length;i++){
            fonts[i]=new JRadioButtonMenuItem(fontNames[i]);
            fontMenu.add(fonts[i]);
            fontGroup.add(fonts[i]);
        }

        fonts[0].setSelected(true);
        fontMenu.addSeparator();

        String styleNames[]={"bold","Italic"};
        styleItems=new JCheckBoxMenuItem[styleNames.length];

        for(int i=0;i<styleNames.length;i++){
            styleItems[i]=new JCheckBoxMenuItem(styleNames[i]);
            fontMenu.add(styleItems[i]);
        }
        formatMenu.add(fontMenu);
        bar.add(formatMenu);

        JMenu helpMenu=new JMenu("help(H)");
        helpMenu.setToolTipText("it is help");
        helpMenu.setMnemonic('H');
        JMenuItem helpItem=new JMenuItem("help topics(L)");
        helpItem.setMnemonic('L');
        helpMenu.add(helpItem);
        bar.add(helpMenu);
        setSize(400,200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {
        new JMenuTest();
    }
}
