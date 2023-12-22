import java.util.Scanner;

public class java9_ForLoopQues2 {
    //Print sum of n natural numbers input given by user
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Give a number: ");
            int n = sc.nextInt();

            System.out.print("Sum of all numbers till n: ");
            int sum = 0;
            for(int num = 1; num <= n; num++){
                sum = sum + num;
            }
            System.out.println(sum);

        }
}
