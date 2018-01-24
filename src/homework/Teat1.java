package homework;

import java.util.Scanner;

public class Teat1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TestAge x = new TestAge();
        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Year" + i + " : ");
            int y = scanner.nextInt();
            System.out.println("Age" + i + " : " + x.calculate(y));
        }
        System.out.println("Thank you.");
    }
    public int calculate(int x) {
        int Year;
        return Year = 2561-x;

    }//main
}//class
