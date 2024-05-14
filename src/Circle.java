public class Circle {
    static     final  double PI=3.14;
     static   int radius;

    public Circle() {
    }

    public double getPI() {
        return PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius = radius;

    }
    public  static void area(){
        System.out.println(PI*(radius*radius));
    }
    public  static  void circumference(){
        System.out.println(PI*2*radius);
    }

    @Override
    public String toString() {
        return "Circle{}";
    }
}
