import org.code.theater.*;
import org.code.media.*;

public class RunningScene extends Scene {

  public void drawScene() {
    clear("pink");
    drawText("The player sprints to first base!", 80, 50);
    drawImage("Doug-Bernier-1846-800.jpg", 50, 200, 150);
    pause(2);
  }
}