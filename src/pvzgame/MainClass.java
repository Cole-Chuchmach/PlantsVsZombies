
/** required package class namespace */
package pvzgame;

import java.io.IOException;
import stats.GameCharacter;

 
public class MainClass 
{

    /**
     * Main method for the project
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Globals.player = new GameCharacter();
        new StartScreen().setVisible(true);
    }

}
