package mysliwy;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
public class Game extends JPanel implements ActionListener {

    private Dimension m;


    MapConfig tmp=MapParsing.LevelRead("Config1");



    public void actionPerformed(ActionEvent e) {
    //code that reacts to the action...
    }

}
