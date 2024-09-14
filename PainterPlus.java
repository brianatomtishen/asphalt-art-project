import org.code.neighborhood.*;
public class PainterPlus extends Painter {
// Painter Plus is an extension of Painter that holds special methods to turn right
// take all the paint, move fast, paint to empty, and paint donut
  public void turnRight() {
      turnLeft();
      turnLeft();
      turnLeft();
// allows the painter to turn right by turning left three times
    }
   
  public void takeAllPaint() {
    while (isOnBucket()) {
      takePaint();
// allows the painter to take paint while it is on a bucket
      }
  }
  public void moveFast() {
     while (canMove()) {
       move();
// allows the painter to move while it can move
     }
  }
  public void paintToEmpty(String color) {
    while (hasPaint()) {
      paint(color);
      move();
// allows the painter to paint a certain color and move while it has paint
    }
  }
  public void paintDonut(String color) {
    while (hasPaint()) {
      move();
      turnRight();
      paint(color);
      move();
      paint(color);
// allows the painter to paint a donut using a certain color
    }
  }
}