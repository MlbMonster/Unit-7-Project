import org.code.theater.*;
import org.code.media.*;

public class CatcherScene extends Scene {

  public void drawScene() {
    clear("blue");
    drawText("The catcher dives for the tag!", 80, 50);
    drawImage("Sliding_Into_Home.jpg", 50, 200, 150);
    pause(2);
  }
}