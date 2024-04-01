import java.awt.Graphics;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JPanel;

class CirclePanel extends JPanel {
    private ArrayList<CircleGroup> circleGroups;
    private int padding;

    public CirclePanel(int padding) {
        this.circleGroups = new ArrayList<>();
        this.padding = padding;
    }

    public void addCircleGroup(CircleGroup circleGroup) {
        circleGroups.add(circleGroup);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int x = padding;
        int y = padding;
        for (CircleGroup group : circleGroups) {
            group.draw(g, x, y);
            y += group.getHeight() + padding; // Adjusting y position for the next group
        }
    }

    @Override
    public Dimension getPreferredSize() {
        int maxWidth = 0;
        int totalHeight = 0;
        for (CircleGroup group : circleGroups) {
            maxWidth = Math.max(maxWidth, group.getBigCircle().getDiameter());
            totalHeight += group.getHeight();
        }
        int panelWidth = maxWidth + 2 * padding;
        int panelHeight = totalHeight + (circleGroups.size() - 1) * padding + 2 * padding;
        return new Dimension(panelWidth, panelHeight);
    }

    public JPanel getPanel(){
        return this;
    }
}
