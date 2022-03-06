public class Triangle extends Shape {
  public double base;
  public double height;

  public Triangle(double base, double height){
    this.base = base;
    this.height = height;
  }

  public double area(){
    return (base * height)/2.0;
  }
}