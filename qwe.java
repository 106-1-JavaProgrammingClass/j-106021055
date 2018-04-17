package FUCK;

public abstract class qwe implements Measure{
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circle1 = new Circle(6);
        Circle circle2 = new Circle(8);
        Rectangle rectangle = new Rectangle(2,4);
        Rectangle rectangle1 = new Rectangle(8,4);
        Rectangle rectangle2 = new Rectangle(2,5);
        Triangle triangle = new Triangle(4,8);
        Triangle triangle1 = new Triangle(5,8);
        Triangle triangle2 = new Triangle(4,9);

        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        System.out.println(circle1.area());
        System.out.println(circle1.perimeter());
        System.out.println(circle2.area());
        System.out.println(circle2.perimeter());
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle1.area());
        System.out.println(rectangle1.perimeter());
        System.out.println(rectangle2.area());
        System.out.println(rectangle2.perimeter());
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());
        System.out.println(triangle1.area());
        System.out.println(triangle1.perimeter());
        System.out.println(triangle2.area());
        System.out.println(triangle2.perimeter());
    }
//    public abstract double area();
//    public abstract double perimeter();
}
class Circle extends qwe{
    public double r;

    Circle(double r1){
        r = r1;
    }

    public double getR() {
        return r;
    }

    public void setR(double r){
        this.r = r;
    }

    public double area(){
        return Math.PI*r*r;
    }

    public double perimeter(){
        return Math.PI*2*r;
    }

//    public void show(){
//        System.out.println(r);
//    }

}
class Rectangle extends qwe{
    public int l;
    public int k;

    Rectangle(int l,int k){
        this.l = l;
        this.k = k;
    }
    public int getL() {
        return l;
    }
    public int getK() {
        return k;
    }
    public void setL(int l){
        this.l=l;
    }
    public void setK(int k){
        this.k=k;
    }

    public double area(){
        return l*k;
    }
    public double perimeter(){
        return 2*(l+k);
    }
}

class Triangle extends qwe{
    public int n;
    public int h;

    Triangle(int n,int h){
        this.n=n;
        this.h=h;
    }

    public int getN() {
        return n;
    }
    public int getH() {
        return h;
    }
    public void setN(int l){
        this.n=l;
    }
    public void setH(int k){
        this.h=k;
    }
    public double area(){
        return (n*h)/2;
    }
    public double perimeter(){
        return 3*n;
    }
}

interface Measure{
    double area();
    double perimeter();
}
