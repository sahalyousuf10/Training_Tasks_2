import com.sun.org.apache.bcel.internal.generic.NEW;

public class Main {
    public static void main(String[] args) {
        Area_of_Circle area1,area2,area3;
        area1= new Area_of_Circle();
        area2= new Area_of_Triangle();
        area3= new Area_of_Rectangle();
        System.out.println("Area of Circle is: "+area1.calculateArea((float)3.14,(float)3.5));
        System.out.println("Area of Triangle is: "+area2.calculateArea((float)3.8,(float)4.8));
        System.out.println("Area of Rectangle is: "+area3.calculateArea((float)5.2,(float)3.9));
    }
}
