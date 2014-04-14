public class Rectangle extends Shape {
  private double l;
  private double w;

  public Rectangle(double length, double width) {
    l = length;
    w = width;
  }

  public double getArea() {
    return l * w
  }

  public double getDiagonal() {
    return Math.sqrt(Math.pow(l, 2) + Math.pow(w, 2));
  }

  public String toString() {
    return ("Rectangle of dimensions " + l + "x" + w);
  }

}
