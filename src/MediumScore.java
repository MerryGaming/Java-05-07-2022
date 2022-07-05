import java.util.Scanner;

public class MediumScore {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] arr= new int[5];

        for(int i = 0; i < 5; i++)
        {
            System.out.printf("So nguyen thu " + (i+1) + " la: ");
            arr[i] = scan.nextInt();
        }

        System.out.printf("Điểm của sinh viên đó là: ");
        for(int i = 0; i < 5; i++)
        {
            System.out.printf(arr[i] + " ");
        }
        System.out.printf("\n");
        check(arr);
    }
    public static void check(int[] arr)
    {
        int sum = 0;
        for(int i = 0; i < 5; i++)
        {
            sum += arr[i];
        }

        float avg = (float) sum/5;
        System.out.printf("Sinh viên đạt loại: ");
        if(0 >= avg && avg <= 4)
        {
            System.out.printf("Yếu");
        }
        else if(5 >= avg && avg <= 6)
        {
            System.out.printf("Trung bình");
        }
        else if(7 >= avg && avg <= 8)
        {
            System.out.printf("Khá");
        }
        else if(9 >= avg && avg <= 10)
        {
            System.out.printf("Giỏi");
        }
        else
        {
            System.out.printf("Lỗi!!!");
        }
    }
}
