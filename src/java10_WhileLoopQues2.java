import java.util.Scanner;

public class java10_WhileLoopQues2 {
    //print sum of n natural numbers using users input
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Give a number: ");
            int n = sc.nextInt();

            System.out.print("Sum of all numbers till n: ");
            int sum = 0;
            int num = 1;
            while(num <= n){
                sum = sum + num;
                num++;
            }
            System.out.print(sum);
        }
}
