import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Ваш вес в кг (если не целое число, то введите число в формате 00,0 :");
        double weight = scanner.nextDouble();
        System.out.println("Введите Ваш рост в см:");
        double height = scanner.nextDouble();
        height = height / 100;

        double bmi = service.calculete(weight, height);

        System.out.printf("Ваш ИМТ %.2f %n", bmi);
    }
}
