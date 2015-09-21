public class TestCircleWithInvalidRadiusException {
	public static void main(String[] args) {
    try {
     	CircleWithException2 c1 = new CircleWithException2(5);
     	c1.setRadius(-5);
     	CircleWithException2 c3 = new CircleWithException2(0);
    }
    catch (InvalidRadiusException ex) {
     	System.out.println(ex.toString());
    }
    System.out.println("Number of objects created: " + CircleWithException2.getNumberOfObjects());
  }
}