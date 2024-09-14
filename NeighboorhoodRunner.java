import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {
//instantiates a new mural paiinter named briana
    MuralPainter briana = new MuralPainter(); 
//allows briana to paint the background/grass green
    briana.paintBackground("green" , 16);
//instantiates a new ladybug painter named anthony
    LadybugPainter anthony = new LadybugPainter();
//allows anthony to start in the correct position to paint the ladybug in the middle of the canvas
    anthony.startPosition();
//allows anthony to paint the body of the ladybug red
    anthony.paintBody("red");
//anthony paints the ears and dots of the ladybug black
    anthony.paintEars("black");
//instantiates a new ladybug painter named ginger
    LadybugPainter ginger = new LadybugPainter();
//allows ginger to paint the legs of the ladybug black 
    ginger.paintLegs("black");
  }
}