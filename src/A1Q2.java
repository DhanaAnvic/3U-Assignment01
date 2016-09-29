

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fabed2976
 */
public class A1Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //A1Q2
        City SK = new City();
        Robot Chen = new Robot (SK, 7,7, Direction. WEST);
        
        //create Walls
        new Wall (SK, 7,7, Direction. NORTH);
        new Wall (SK, 7,6, Direction. NORTH);
        new Wall (SK, 7,6, Direction. WEST);
        new Wall (SK, 8,6, Direction. WEST);
        new Wall (SK, 8,6, Direction. SOUTH);
        new Wall (SK, 7,7, Direction. SOUTH);
        new Wall (SK, 7,7, Direction. EAST);
        new Thing (SK, 8,7);
        
        //Get Chen to move
        Chen. move ();
        Chen. turnLeft ();
        Chen. move ();
        Chen. turnLeft ();
        Chen. move ();
        Chen. pickThing ();
        Chen. turnLeft();
        Chen. turnLeft();
        Chen. move ();
        Chen. turnLeft ();
        Chen. turnLeft ();
        Chen. turnLeft();
        Chen. move ();
        Chen. turnLeft ();
        Chen. turnLeft ();
        Chen. turnLeft ();
        Chen. move ();
        Chen. turnLeft ();
        Chen. turnLeft ();
        
        
    }
}
