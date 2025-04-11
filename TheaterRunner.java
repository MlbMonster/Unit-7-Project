import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

    RunningScene scene1 = new RunningScene();
    SwingScene scene2 = new SwingScene();
    CatcherScene scene3 = new CatcherScene();
    CelebrationScene scene4 = new CelebrationScene();

    scene1.drawScene();
    scene2.drawScene();
    scene3.drawScene();
    scene4.drawScene();

    Theater.playScenes(scene1, scene2, scene3, scene4);
  }
}