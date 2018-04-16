public class zzz {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Rectangle rectangle = new Rectangle(4,5);
        Triangle triangle = new Triangle(10,10,60);
        Isosceles_Trapezoid trapezoid = new Isosceles_Trapezoid(8,5,2,60);

        circle.show();
        System.out.println("==============");
        rectangle.show();
        System.out.println("==============");
        triangle.show();
        System.out.println("==============");
        trapezoid.show();

        Shape.allCount();
    }
}
//形狀
abstract class Shape{
    protected double perimeter;
    protected double area;

    Shape(){}

    public static void allCount(){
        System.out.println("目前有" + (Circle.count + Triangle.count + Rectangle.count + Isosceles_Trapezoid.count) + "個物件");
    }

    public abstract void area();

    public abstract void perimeter();

    public abstract void show();

}
//圓形
class Circle extends Shape{
    public static int count = 0;
    public int r;

    private Circle (){
        count++;
    }
    public Circle (int r){
        this();
        setR(r);
        area();
        perimeter();
    }
    public int getR() {
        return r;
    }
    public void setR(int r) {
        if(r < 0){
            this.r = 0;
        }else {
            this.r = r;
        }
    }
    @Override
    public void area() {
        area = Math.PI * r * r ;
    }
    @Override
    public void perimeter() {
        perimeter = r * 2 * Math.PI;
    }
    @Override
    public void show(){
        System.out.println("圓半徑 = " + r);
        System.out.println("圓周長 = " + perimeter);
        System.out.println("圓面積 = " + area);
    }
}
//矩形
class Rectangle extends Shape{
    public static int count = 0;
    int s;
    int h;

    Rectangle(){
        count++;
    }

    Rectangle(int s, int h){
        this();
        setS(s);
        setH(h);
        area();
        perimeter();
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        if (s < 0){
            this.s = 0;
        }else {
            this.s = s;
        }
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        if (h < 0){
            this.h = 0;
        }else {
            this.h = h;
        }
    }

    @Override
    public void area() {
        area = s * h;
    }

    @Override
    public void perimeter() {
        perimeter = 2 * (s + h);
    }

    @Override
    public void show() {
        System.out.println("矩形長 = " + s);
        System.out.println("矩形高 = " + h);
        System.out.println("矩形周長 = " + perimeter);
        System.out.println("矩形面積 = " + area);
    }
}
//三角形
class Triangle extends Shape{
    public static int count = 0;
    public int a;
    public int b;
    public int angle;

    private Triangle(){
        count++;
    }

    Triangle(int a,int b,int angle){
        this();
        setA(a);
        setB(b);
        setAngle(angle);
        area();
        perimeter();
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        if (a < 0){
            a = 0;
        }else {
            this.a = a;
        }
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        if (b < 0){
            this.b = 0;
        }else {
            this.b = b;
        }
    }
    public int getAngle() {
        return angle;
    }
    public void setAngle(int angle) {
        if (angle < 0 || angle >= 180){
            this.angle = 0;
        }else {
            this.angle = angle;
        }
    }
    @Override
    public void area() {
        area = a * b * Math.sin(Math.toRadians(angle)) / 2;
    }
    @Override
    public void perimeter() {
        perimeter = a + b * 2;
    }
    @Override
    public void show() {
        System.out.println("三角形底 = " + a);
        System.out.println("三角形高 = " + b * Math.sin(Math.toRadians(angle)));
        System.out.println("三角形周長 = " + perimeter);
        System.out.println("三角形面積 = " + area);
    }
}
//等腰梯形
class Isosceles_Trapezoid extends Shape{
    public static int count = 0;
    public int upside;
    public int downside;
    public int h;
    public int angle;

    private Isosceles_Trapezoid(){
        count++;
    }

    public Isosceles_Trapezoid(int upside,int downside,int h,int angle){
        this();
        setUpside(upside);
        setDownside(downside);
        setH(h);
        setAngle(angle);
        area();
        perimeter();
    }

    public int getUpside() {
        return upside;
    }

    public void setUpside(int upside) {
        if (upside < 0){
            this.upside = 0;
        }else {
            this.upside = upside;
        }
    }

    public int getDownside() {
        return downside;
    }

    public void setDownside(int downside) {
        if (downside < 0){
            this.downside = 0;
        }else {
            this.downside = downside;
        }
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        if (h < 0){
            this.h = 0;
        }else {
            this.h = h;
        }
    }

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        if (angle < 0 || angle >= 180){
            this.angle = 0;
        }else {
            this.angle = angle;
        }
    }

    @Override
    public void area() {
        area = (upside + downside) * h / 2;
    }

    @Override
    public void perimeter() {
        perimeter = upside + downside + (Math.sin(Math.toRadians(angle)) / h) * 2;
    }

    @Override
    public void show() {
        System.out.println("等腰梯型上底 = " + upside);
        System.out.println("等腰梯型下底 = " + downside);
        System.out.println("等腰梯型高 = " + h);
        System.out.println("等腰梯型周長 = " + perimeter);
        System.out.println("等腰梯型面積 = " + area);
    }
}