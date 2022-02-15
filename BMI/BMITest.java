package BMI;

import java.util.Scanner;

public class BMITest {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        int myWeight = sc.nextInt();
        System.out.print("Enter height in inches: ");
        int myHeight = sc.nextInt();
        sc.close();
        BMI myBMI = new BMI(myWeight, myHeight);
        System.out.println("BMI is " + myBMI.calculateBMI());
        System.out.println(myBMI.getInterpretation());
    }

}
