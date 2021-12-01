import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class MouseEvent1 {
    public static void main(String[] args) {
        JFrame fr = new JFrame("마우스 이벤트");
        JPanel pn = new JPanel();
        JButton[] bt = new JButton[4];

        GridLayout gl = new GridLayout(2, 2);
        pn.setLayout(gl);

        for (int i = 0; i < bt.length; i++) {
            bt[i] = new JButton("버튼" + i);
            if (i % 2 == 0) {

            }
        }
    }
}
