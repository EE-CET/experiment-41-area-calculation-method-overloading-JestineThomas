import java.util.Scanner;

public class AreaCalculator {
    
    static float calculateArea(float radius){
        return (3.14159f*radius*radius);
    }
    
    static float calcluateArea(float length,float breadth){
        return (length * breadth);
    }
    
    static double calculateArea(double base,double height){
        return (0.5 * base * height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter radius of circle:" );
        float r =sc.nextFloat();
        System.out.println("enter length and Breadth of circle:" );
        float l =sc.nextFloat();
        float b =sc.nextFloat();
        System.out.println("enter base and height of circle:" );
        double base =sc.nextDouble();
        double height =sc.nextDouble();
        
        System.out.printf("%.2f\n", calculateArea(r));
        System.out.printf("%.2f\n", calculateArea(l,b));
        System.out.printf("%.2f\n", calculateArea(base,height));
    }
}
