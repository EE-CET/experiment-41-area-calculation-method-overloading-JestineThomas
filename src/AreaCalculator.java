import java.util.Scanner;

public class AreaCalculator {
    
    static float calculateArea(float radius){
        return 3.14159f * radius * radius;
    }
    
    static float calculateArea(float length, float breadth){
        return length * breadth;
    }
    
    static double calculateArea(double base, double height){
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle:");
        float r = sc.nextFloat();

        System.out.println("Enter length and breadth of rectangle:");
        float l = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("Enter base and height of triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        
        System.out.printf("%.2f\n", calculateArea(r));
        System.out.printf("%.2f\n", calculateArea(l, b));
        System.out.printf("%.2f\n", calculateArea(base, height));
    }
}
