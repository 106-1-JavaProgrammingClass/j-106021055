public class Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Circle circle5 = new Circle(5);
        Circle circle9 = new Circle(8);
        circle.show();
    }
}
class Circle extends Shape{
    public double r;
    Circle(double r1){
        r = r1;
    }
    {

    }

    public void show(){
        System.out.println(r);
    }
}

class Rectangle extends Shape{

}

class Triangle extends Shape{

}