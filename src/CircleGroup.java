import java.awt.Color;
import java.awt.Graphics;

public class CircleGroup {
    private Circle bigCircle;
    private Circle smallCircle;

    public CircleGroup(int radiusBig, Color bigColor, int radiusSmall, Color smallColor) {
        this.bigCircle = new Circle(radiusBig, bigColor);
        this.smallCircle = new Circle(radiusSmall, smallColor);
    }

    public void draw(Graphics g, int x, int y) {
        bigCircle.draw(g, x, y);
        smallCircle.draw(g, x + bigCircle.getDiameter() / 4, y + bigCircle.getDiameter());
    }

    public int getHeight() {
        return bigCircle.getDiameter() + smallCircle.getDiameter();
    }

    public Circle getBigCircle(){
        return this.bigCircle;
    }
}