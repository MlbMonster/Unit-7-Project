import org.code.theater.*;
import org.code.media.*;

public class CelebrationScene extends Scene {

  public void drawScene() {
    clear("yellow");
    drawText("Safe! The crowd goes wild!", 80, 50);
    drawImage("Vandy-wins-1.jpg", 50, 200, 150);
    pause(2);
  }
}