import java.util.Scanner;

public class java9_ForLoopQues3 {
    // Print natural number in reverse from n
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Give a number: ");
            int n = sc.nextInt();

            System.out.print("Reverse series from n to 1: ");
            for(int num = n; num >=1; num--){
                System.out.print(num + " ");
            }

        }
}
