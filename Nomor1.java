import java.util.Scanner;

public class Nomor1 {
    public static void fizzBuzz(int n) {
        for (int i = 0; i <= n; i++) { // Start loop from 0 to include 0
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukan nilai N: ");
        int N = input.nextInt();
         /* Pekerjaan anda mulai dari sini */
        fizzBuzz(N);
        /* Pekerjaan anda berakhir sini */
        System.out.println(Nomor1.class.getDeclaredMethods().length);
    }
}
