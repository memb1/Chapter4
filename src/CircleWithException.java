public class CircleWithException {
  private double radius;
  private static int numberOfObjects = 0;

  public CircleWithException() {
    this(1.0);
  }

  public CircleWithException(double radius) {
    setRadius(radius);
    numberOfObjects++;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    if (radius > 0)
      this.radius =  radius;
    else
      throw new IllegalArgumentException("Radius cannot be negative. Value entered is "+ radius);
  }

  public static int getNumberOfObjects() {
    return numberOfObjects;
  }

  public double findArea() {
    return radius * radius * 3.14159;
  }
}
