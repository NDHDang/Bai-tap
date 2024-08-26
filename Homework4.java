
package homework4;
import java.util.Random;
import java.util.Scanner;
public class Homework4 {

    public static void main(String[] args) {
    Random random = new Random();
        int lotteryNumber = random.nextInt(100) + 1; // Sinh số ngẫu nhiên từ 1 đến 100
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0;

        System.out.println("Chao mung den voi chuong trinh xo so!");
        System.out.println("Hay doan so tu 1 den 100:");

        while (userGuess != lotteryNumber) {
            System.out.print("Nhap so cua ban: ");
            userGuess = scanner.nextInt();

            if (userGuess < lotteryNumber) {
                System.out.println("So ban doan thap hon so xo so.");
            } else if (userGuess > lotteryNumber) {
                System.out.println("So ban doan cao hon so xo so.");
            } else {
                System.out.println("Chuc mung! Ban da doan dung so: " + lotteryNumber);
            }
        }

        scanner.close();
    }
    
}
