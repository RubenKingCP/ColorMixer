import java.awt.Color;
import java.awt.Graphics;

class Circle {
    private int x;
    private int y;
    private int diameter;
    private Color color;

    public Circle(int diameter, Color color) {
        this.diameter = diameter;
        this.color = color;
    }

    public void draw(Graphics g, int x, int y) {
        g.setColor(color);
        g.fillOval(x, y, diameter, diameter);
    }

    public int getDiameter() {
        return diameter;
    }
}