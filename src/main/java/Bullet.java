import javafx.scene.Node;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Shape;

public class Bullet extends Circle  {
    private Enemy target;     // The target of the attack
    private final int startX;   // Starting location of the projectile
    private final int startY;
    private Line line;
    private Circle circle;


    public Bullet(Enemy target , int towerX , int towerY , Color color){
        circle = new Circle(towerX,towerY,12,color);
        this.target = target;
        startX = towerX;
        startY = towerY;

    }

    public Bullet(Enemy target, int towerX, int towerY){
        line = new Line();
        this.target = target;
        startX = towerX;
        startY = towerY;
        line.setStartX(startX);
        line.setStartY(startY);
        line.setEndX(target.getCenterX());
        line.setEndY(target.getCenterY());

    }

    public Line getLine() {
        return line;
    }

    public Enemy getTarget(){
        return target;
    }

    public int getEndX(){
        return (int) target.getCenterX();
    }

    public int getEndY(){
        return (int) target.getCenterY();
    }

    public int getStartX(){
        return startX;
    }

    public int getStartY(){
        return startY;
    }



}

