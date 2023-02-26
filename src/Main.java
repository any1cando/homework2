import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name, color, model;
        double tubeWireLength;
        int year, ram, memory;
        System.out.println("Куманцов Максим Александрович");
        System.out.println("Группа РИБО-01-21");
        System.out.println();
        System.out.println("Выберите какой телефон хотите создать (введите число):");
        System.out.println("1 - Смартфон");
        System.out.println("2 - Стационарный телефон");
        int a = Integer.parseInt(scan());
        switch (a) {
            case 1:
                System.out.println();
                System.out.println("Введите брэнд вашего смартфона:");
                name = scan();
                System.out.println("Введите модель смартфона:");
                model = scan();
                System.out.println("Укажите год производства:");
                year = Integer.parseInt(scan());
                if (year < 0) {
                    System.out.println("Ошибка! Год не может быть отрицательным.");
                    return;
                }
                System.out.println("Введите цвет:");
                color = scan();
                System.out.println("Введите количество оперативной памяти в гигабайтах:");
                ram = Integer.parseInt(scan());
                if (ram <= 0) {
                    System.out.println("Ошибка! Оперативная память должна быть больше нуля.");
                    return;
                }
                System.out.println("Введите количество памяти в гигабайтах:");
                memory = Integer.parseInt(scan());
                if (memory <= 0) {
                    System.out.println("Ошибка! Память должна быть больше нуля.");
                    return;
                }
                System.out.println("Смартфон создан.");
                SmartPhone smartPhone = new SmartPhone(name, year, color, model, ram, memory);
                System.out.println(smartPhone);
                break;
            case 2:
                System.out.println();
                System.out.println("Введите брэнд вашего стационарного телефона:");
                name = scan();
                System.out.println("Укажите год производства:");
                year = Integer.parseInt(scan());
                if (year < 0) {
                    System.out.println("Ошибка! Год не может быть отрицательным.");
                    return;
                }
                System.out.println("Введите цвет:");
                color = scan();
                System.out.println("Укажите длину провода:");
                tubeWireLength = Double.parseDouble(scan());
                if (tubeWireLength <= 0) {
                    System.out.println("Ошибка! Длина провода должна быть больше нуля.");
                    return;
                }
                System.out.println("Стационарный телефон создан.");
                LandlinePhone landlinePhone = new LandlinePhone(name, year, color, tubeWireLength);
                System.out.println(landlinePhone);
                break;
            default:
                System.out.println("Необходимо ввести число от 1 до 2");
        }
    }

    public static String scan() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}