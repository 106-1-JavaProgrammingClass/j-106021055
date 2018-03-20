public class Main {
    public static void main(String[] args){}

    private String title, address, postcode;


    public Main() {
        title = "亞大資工站";
        address = "柳豐路500號";
        postcode = "41354";
    }

    public Main(String name, String add1, String code) {
        title = name;
        address = add1;
        postcode = code;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getTitle() {
        return this.title;
    }

    public void showInfo() {
        System.out.println(getTitle());
    }

    public class Product {
        private String name;
        private float price;
        private int num;

        public Product(String name1, float price1, int num1) {
            name = name1;
            price = price1;
            num = num1;



        }
    }
}
