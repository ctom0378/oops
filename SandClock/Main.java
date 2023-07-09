
import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.*;
import java.applet.*;

public class Main extends JFrame {
  public static void main(String[] args) {
    new Main();
  }

  public Main() {
    EventQueue.invokeLater(() -> {
      Canvas c = new Canvas(0, 3);
      setContentPane(c);
      pack();
      setSize(400, 400);
      setBackground(Color.WHITE);
      setLocationRelativeTo(null);
      setVisible(true);
    });
  }
}

/* <applet code = "Main.class weidth =300 height=300>
</applet>*/

