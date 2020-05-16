import javax.swing.*;
import java.awt.*;


public class Background extends JPanel {


    Color[] myColor = new Color[]{Color.RED, Color.GREEN, Color.BLUE, Color.YELLOW, Color.CYAN, Color.MAGENTA, Color.WHITE, Color.BLACK}; // масив цветов.

    int a = (int) (Math.random() * myColor.length); // случайный выбор цвета.

    Color color = myColor[a]; // случайный цвет для передачи в setBackground

    /* @Override
    public void setBackground(Color bg) {
        super.setBackground(color);
    } */

    @Override
    public void repaint() {
        a = (int) (Math.random() * myColor.length);
        setBackground(color);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.repaint();
    }
}
