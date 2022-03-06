class Main {
  public static void main(String[] args) {
    Circle aCircle = new Circle(1.0);
    Triangle aTriangle = new Triangle(5.0,3.0);

    System.out.println("Circle with radius " + aCircle.radius + " has an area of " + aCircle.area());
    System.out.println("Triangle with a base of " + aTriangle.base + " and a height of " + aTriangle.height +" has an area of " + aTriangle.area());
  }
}