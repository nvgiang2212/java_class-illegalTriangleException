import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao do dai canh a: ");
        int a = scanner.nextInt();
        System.out.println("Nhap vao do dai canh b: ");
        int b = scanner.nextInt();
        System.out.println("Nhap vao do dai canh c: ");
        int c = scanner.nextInt();

        try {
            if (a < 0 || b < 0 || c < 0) {
                throw new Exception("Gia tri nhap vao la so am");
            }
            if (a + b < c || a + c < b || b + c < a) {
                throw new Exception("Tong 2 canh khong lon hon canh con lai");
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}