/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    // Put your own methods here    
    
    public void hopPlant(){
      hop();
      plant();
    }

    public void hopHopPlant(){
      hop();
      hopPlant();
    }
    
    public void turnAround(){
      turn(LEFT);
      turn(LEFT);
    }
    
    public void newLineRight1(){
      hop();
      turn(RIGHT);
      hopPlant();
    }

    public void newLineRight2(){
      turn(LEFT);
      hopHopPlant();
    }

    public void newLineRight(){
      newLineRight1();
      newLineRight2();
    }

    public void newLineLeft(){
      hop();
      turn(LEFT);
      hopPlant();
      turn(RIGHT);
    }

    public void endLine(){
      hopHopPlant();
      hopHopPlant();
      turnAround();
    }

    public void setupBowling(){
      newLineRight();
      endLine();
      newLineLeft();
      endLine();
      newLineRight();
      turnAround();
      newLineLeft();
      hop();
    }


    
    // Do NOT touch the code below here

    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int y, int x) { super(y, x); }

    public Jeroo(int y, int x, CompassDirection direction) { super (y, x, direction);}

    public Jeroo(int y, int x, int flowers) { super (y, x, flowers);}

    public Jeroo(int y, int x, CompassDirection direction, int flowers) { super(y, x, direction, flowers);}

}
