import org.code.theater.*;
import org.code.media.*;

public class SwingScene extends Scene {

  public void drawScene() {
    clear("green");
    drawText("Swing and a hit!", 80, 50);
    drawImage("Marcus_Thames_Tigers_2007.jpg", 50, 200, 150);
    pause(2);
  }
}