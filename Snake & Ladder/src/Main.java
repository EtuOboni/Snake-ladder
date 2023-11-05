
import javax.swing.JFrame;


public class Main 
{
    public static void main(String[] args) {
        Main_project frame1 = new Main_project();
        frame1.setVisible(true);
        frame1.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame1.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame1.iterate();
        Game_Board_Snake_Ladder frame = new Game_Board_Snake_Ladder();
    }
 
}
