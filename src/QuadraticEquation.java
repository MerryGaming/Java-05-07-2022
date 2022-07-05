import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.printf("Nhập giá trị a: ");
        float a = Float.parseFloat(scan.nextLine());
        System.out.printf("Nhập giá trị b: ");
        float b = Float.parseFloat(scan.nextLine());
        System.out.printf("Nhập giá trị c: ");
        float c = Float.parseFloat(scan.nextLine());

        System.out.println("Phương trình bậc 2 có dạng: " + a + " x^2 + " + b + " x + " + c);

        check(a,b,c);
    }

    public static void check(float a, float b, float c)
    {
        float denta = 0;
        if(a == 0)
        {
            if(b == 0)
            {
                System.out.println("Phương trình vồ nghiệm!!!");
            }
            else
            {
                System.out.println("Phương trình có nghiệm: x = " + ((-c) / b));
            }
        }

        float x1;
        float x2;
        denta = b*b - 4*a*c;
        if(denta < 0)
        {
            x1 = x2 = 0;
            System.out.println("Phương trình vô nghiệm có x1 và x2 là: " + x1);
        }

        else if(denta == 0)
        {
            x1 = x2 = (-b/(2*a));
            System.out.println("Phương trình có nghiệm kép x1 và x2 là: " + x1);
        }

        else
        {
            x1 =(float) ((-b - Math.sqrt(denta)) / (2*a));
            x2 =(float) ((-b + Math.sqrt(denta)) / (2*a));
            System.out.println("Phương trình có nghiệm x1 là: " + x1);
            System.out.println("Phương trình vô nghiệm x2 là: " + x2);
        }


    }
}
