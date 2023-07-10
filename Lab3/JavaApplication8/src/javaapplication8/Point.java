import edu.princeton.cs.introcs.StdDraw;

/**
*
* @author manyi
*/
public class Point {
private final int x; // x coordinate
private final int y; // y coordinate

// create the point (x, y)
public Point(int x, int y) {
/* DO NOT MODIFY */
this.x = x;
this.y = y;
}

// plot this point to standard drawing
public void draw() {
/* DO NOT MODIFY */
StdDraw.point(x, y);
}

// draw line between this point and that point to standard drawing
public void drawTo(Point that) {
/* DO NOT MODIFY */
StdDraw.line(this.x, this.y, that.x, that.y);
}


// return string representation of this point
public String toString() {
/* DO NOT MODIFY */
return "(" + x + ", " + y + ")";
}
}