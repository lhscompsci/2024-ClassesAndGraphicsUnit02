import javax.swing.JFrame;

public class GfxNotes extends JFrame {
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;

    public GfxNotes(){
        super("My Graphics Window");
        setSize(WIDTH,HEIGHT);
        //swap out Circles for whatever your artwork class is named
        getContentPane().add(new Circles());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[]args){
        GfxNotes run = new GfxNotes();
    }

}
