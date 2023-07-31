import java.util.Arrays;
import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        bai tap Product
        System.out.println("Moi ban nhap ten san pham: ");
        String name = scanner.nextLine();
        System.out.println("Moi ban nhap ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Gia san pham: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id, name,price);
        System.out.println(product);

        double vatPrice = product.VAT();
        System.out.println("Thue gia tri gia tang cua san pham la: "+vatPrice);

//        Bai tap Person - Employee
        System.out.println("Mời bạn nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời bạn nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Mời bạn nhập tuổi:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn nhập số năm kinh nghiệm:");
        double exp = Double.parseDouble(scanner.nextLine());
        System.out.println("Nơi làm việc:");
        String placeWork = scanner.nextLine();

        Employee employee = new Employee(id, name, address, age, exp, placeWork);
        System.out.println(employee);


    }
}
