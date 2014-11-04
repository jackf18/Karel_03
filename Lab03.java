/**
*
* Description of the program goes here  // provide a brief description
*
* @author <Jack Flaherty>  // replace <...> with your name
* @version <11/1/14> // replace <...> with the date
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {

     public static void main(String[] args) {
     Display.openWorld("maps/mountain.map");
     Display.setSize(16, 16);
     Display.setSpeed(8);
     Climber jack = new Climber(8);
     Climber michael = new Climber(8);
     jack.climbUpRight();
     michael.climbUpRight();
     jack.climbUpRight();
     michael.climbUpRight();
     jack.move();
     michael.move();
     jack.climbUpRight();
     michael.climbUpRight();   
     jack.move();
     michael.move();
     jack.climbUpRight();
     michael.climbUpRight();
     jack.climbDownRight();
     michael.climbDownRight();
     jack.turnAround();
     michael.turnAround();
     jack.move();
     michael.move();
     jack.turnAround();
     michael.turnAround();
     jack.climbDownRight();
     michael.climbDownRight();
     jack.turnAround();
     michael.turnAround();
     jack.move();
     michael.move();
     jack.pickBeeper();
     jack.turnAround();
     michael.turnAround();
     jack.move();
     michael.move();
     jack.climbUpLeft();
     michael.climbUpLeft();
     jack.move();
     michael.move();
     jack.climbUpLeft();
     michael.climbUpLeft();
     jack.climbDownLeft();
     michael.climbDownLeft();
     jack.climbDownLeft();
     michael.climbDownLeft();
     jack.climbDownLeft();
     michael.climbDownLeft();
     jack.climbDownLeft();
     michael.climbDownLeft();
     jack.turnAround();
     michael.turnAround();
     jack.move();
     michael.move();
     jack.move();
     michael.move();
     jack.turnRight();
     michael.turnRight();  
     }
}