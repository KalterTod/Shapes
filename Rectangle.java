public class Rectangle extends Shape {
  private double length;
  private double width;

  public Rectangle(String name, double l, double w) {
    super(name);
    length = l;
    width = w;
  }

  public double getArea() {
    return length * width;
  }

  public double getDiagonal() {
    return Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
  }

  public String toString() {
    return ("Rectangle of dimensions " + length + "x" + width);
  }

}
