import org.code.neighborhood.*;

public class LadybugPainter extends MuralPainter {
// Ladybug Painter is a Mural Painter that has the methods to 
// startPosition, paints the legs, body, and ears of the ladybug

    public void startPosition() {
// allows the painter to start at a proper
// position to paint the body by moving it down 
// to the center of the canvas 
      turnRight();
      move();
      move();
      move();
      move();
      move();
      turnLeft();
      move();
      move();
      move();
      move();
      move();
      move();
// moves the painter to the coordinate (6,6)   
    } // end of startPosition

    public void paintBody(String bodyColor) {
// moves the painter to paint all red body parts of the 
// ladybug in form of lines going down the canvas
      paintLine(bodyColor, 4);
      move();
      move();
      turnRight();
      move();
      turnRight();
      move();
      move();
      paintLine(bodyColor, 6);
      move();
      move();
      turnLeft();
      move();
      turnLeft();
      move();
      move();
      paintLine(bodyColor, 8);
      turnRight();
      move();
      turnRight();
      move();
      paintLine(bodyColor, 8);
      turnLeft();
      move();
      turnLeft();
      move();
      paintLine(bodyColor, 8);
      turnRight();
      move();
      turnRight();
      move();
      paintLine(bodyColor, 8);
      turnLeft();
      move();
      turnLeft();
      move();
      paintLine(bodyColor, 8);
      turnRight();
      move();
      turnRight();
      move();
      paintLine(bodyColor, 8);
      turnLeft();
      move();
      turnLeft();
      move();
      move();
      paintLine(bodyColor, 6);
// finished painting the body of the ladybug in the shape of a circle
    } // end of paintBody

  public void paintEars(String earColor) {
// countrols the painter while painting the 
// dots and ears in black
      turnLeft();
      move();
      turnLeft();
      move();
      paintLine(earColor, 1);
      move();
      paintLine(earColor, 1);
      move();
      paintLine(earColor, 1);
      move();
      move();
      turnRight();
      move();
      move();
      turnRight();
      move();
      move();
      paintLine(earColor, 1);
      move();
      paintLine(earColor, 1);
      move();
      paintLine(earColor, 1);
      move();
      paintLine(earColor, 1);
      turnLeft();
      move();
      move();
      turnLeft();
      move();
      move();
      paintLine(earColor, 1);
      move();
      paintLine(earColor, 1);
      move();
      paintLine(earColor, 1);
      move();
      paintLine(earColor, 1);
      turnRight();
      move();
      move();
      turnRight();
      move();
      move();
      move();
      move();
      paintLine(earColor, 1);
      move();
      paintLine(earColor, 1);
      move();
      move();
// finishes painting the dots on the red back of the ladybug
      turnLeft();
      move();
      turnLeft();
      move();
      move();
      move();
      turnRight();
      move();
      paintLine(earColor, 2);
      turnRight();
      move();
      paintLine(earColor, 1);
      turnLeft();
      move();
      paintLine(earColor, 1);
      turnLeft();
      move();
      move();
      move();
      move();
      move();
      move();
      move();
      turnLeft();
      move();
      paintLine(earColor, 1);
      turnLeft();
      move();
      paintLine(earColor, 1);
      turnRight();
      move();
      paintLine(earColor, 2);
      turnLeft();
      move();
      turnLeft();
      move();
      paintLine(earColor, 1);
      turnRight();
      move();
      turnRight();
      move();
      paintLine(earColor, 1);
      moveFast();
      turnLeft();
      moveFast();
// finishes painting the two ears of the ladybug
  } // end of paintEars

  public void paintLegs(String legColor) {
// paints the legs of the ladybug from left to 
// right and from top to bottom
      turnRight();
      move();
      move();
      move();
      move();
      move();
      turnLeft();
      move();
      move();
      paintLine(legColor, 2);
      turnRight();
      move();
      paintLine(legColor, 1);
      turnLeft();
      move();
      move();
      move();
      move();
      move();
      move();
      move();
      turnLeft();
      move();
      paintLine(legColor, 1);
      turnRight();
      move();
      paintLine(legColor, 2);
      turnRight();
      move();
      move();
      move();
      turnRight();
      paintLine(legColor, 2);
      turnLeft();
      move();
      paintLine(legColor, 1);
      turnRight();
      move();
      move();
      move();
      move();
      move();
      move();
      move();
      move();
      move();
      turnRight();
      move();
      paintLine(legColor, 1);
      turnLeft();
      move();
      paintLine(legColor, 2);
      turnLeft();
      move();
      move();
      move();
      move();
      turnLeft();
      move();
      move();
      paintLine(legColor, 2);
      turnRight();
      move();
      paintLine(legColor, 1);
      turnLeft();
      move();
      move();
      move();
      move();
      move();
      move();
      move();
      turnLeft();
      move();
      paintLine(legColor, 1);
      turnRight();
      move();
      paintLine(legColor, 2);
// finishes painting all six legs of the ladybug
} // end of paintLegs
      
  
}