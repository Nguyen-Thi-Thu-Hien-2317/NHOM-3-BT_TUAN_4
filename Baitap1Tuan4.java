import java.util.Scanner;

public class Baitap1Tuan4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int n = scanner.nextInt();

        if (n > 0)
            System.out.println(n + " la so duong.");
        else if (n < 0)
            System.out.println(n + " la so am.");
        else
            System.out.println("So vua nhap bang 0.");

        scanner.close();
    }
}