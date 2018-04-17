public class Main {

    public static void main(String[] args) {
        CCircle circle = new CCircle(5,"black");
        circle.show();
    }
}

class CShape {
    protected String color;
    protected void setColor(String color){
        this.color = color;
    }

}

class CCircle extends CShape {
    public double radius;

    public CCircle(double r,String color) {
        radius = r;
        this.color = color;
    }

    public void show() {
        System.out.print("color="+color+", ");
        System.out.println("area="+3.14*radius*radius);
    }
}