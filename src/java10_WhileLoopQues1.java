import java.util.Scanner;

public class java10_WhileLoopQues1 {
    //print n natural numbers using users input
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Give a number: ");
            int n = sc.nextInt();

            System.out.print("Surprise: ");
            int num = 1;
            while(num <= n){
                System.out.print(num + " ");
                num++;
            }

        }
}
