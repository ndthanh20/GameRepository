import javafx.scene.image.Image;

import javax.swing.text.html.ImageView;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Map {

    private int[][] map;
    private ImageView mapView;

    public int[][] getMap(){
        return map;
    }
    public Map() throws FileNotFoundException {
        map = new int[][]{
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
                {0, 2, 2, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0},
                {0, 2, 1, 1, 1, 1, 1, 1, 2, 0, 0, 0, 0},
                {2, 2, 1, 2, 2, 2, 2, 1, 2, 0, 0, 0, 0},
                {1, 1, 1, 2, 0, 0, 2, 1, 2, 0, 0, 0, 0},
                {2, 2, 2, 2, 0, 0, 2, 1, 2, 2, 2, 2, 0},
                {0, 0, 0, 0, 0, 0, 2, 1, 1, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
        };
    }


}
