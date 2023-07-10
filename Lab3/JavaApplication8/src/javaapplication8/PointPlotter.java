import edu.princeton.cs.introcs.StdDraw;

/*************************************************************************

* Dependencies: Point.java, StdDraw.java
*
* Takes the name of a file as a command-line argument.
* Reads in an integer N followed by N pairs of points (x, y)
* with coordinates between 0 and 32,767, and plots them using
* standard drawing.
*
*************************************************************************/

public class PointPlotter {
public static void main(String[] args) {

// rescale coordinates and turn on animation mode
StdDraw.setXscale(0, 32768);
StdDraw.setYscale(0, 32768);
StdDraw.show(0);
StdDraw.setPenRadius(0.01); // make the points a bit larger

Point p1 = new Point(0,0);
Point p2 = new Point(10000,10000);
Point p3 = new Point(0,10000);
Point p4 = new Point(10000,0);

p1.draw();
p2.draw();
p3.draw();
p4.draw();

p4.drawTo(p3);
p1.drawTo(p3);
p1.drawTo(p4);
p3.drawTo(p2);
p4.drawTo(p2);
// display to screen all at once
StdDraw.show(0);

// reset the pen radius
StdDraw.setPenRadius();
}
}