import java.util.*;

public class Circle extends Shape {

  private double radius;

  public Circle(String name, double r) {
    super(name);
    radius = r;
  }

  public double getArea() {
    return (Math.PI * Math.pow(radius, 2));
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double r) {
    radius = r;
  }

  public String toString() {
    return ("Circle of Radius " + radius);
  }

  public Point findPoint(double radians) {
    double x = radius * Math.cos(radians);
    double y = radius * Math.sin(radians);

    Point p = new Point(x, y);

    return p;
    }

  public double getArcLength(double rads1, double rads2) {
    return Math.abs(rads1 - rads2) * radius;
  }


}
