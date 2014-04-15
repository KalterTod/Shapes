public abstract class Shape {

  public String name;

  public Shape(String n) {
    this.name = n;
  }

  public abstract double getArea();

  public abstract String toString();

}
