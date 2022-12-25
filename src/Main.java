import java.time.LocalDate;
public class Main {
    public static boolean checkLeapYear(int year) {
        boolean value = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        return value;
    }
    public static String findOS(int clientOS) {
        String nameOS = " ";
        if (clientOS == 0) {
            nameOS = "IOS";
        } else if (clientOS == 1) {
            nameOS = "Андроид";
        }
        return nameOS;
    }
    public static String findYear(int clientDeviceYear) {
        String applicationVersion = " ";
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear == currentYear) {
            applicationVersion = "полную";
        }
        else if (clientDeviceYear < currentYear) {
            applicationVersion = "облегченную";
        }
        return applicationVersion;
    }

    public static int calculateNumberDeliveryDays (int deliveryDistance) {
        int deliveryDay;
        if (deliveryDistance < 20) {
            deliveryDay = 1;
        } else if ((deliveryDistance - 20) % 40 == 0) {
            deliveryDay = 1 + (deliveryDistance - 20) / 40;
        } else {
            deliveryDay = 2 + (deliveryDistance - 20) / 40;
        }
        return deliveryDay;
    }

    public static void main(String[] args) {
        int year = 2020;
        checkLeapYear(year);
        if (checkLeapYear(year)) {
            System.out.println (year + " год является високосным");
        } else {
            System.out.println (year + " год не является високосным");
        }
        System.out.println("_________________________________________");

        System.out.println("          Задание 2");

        int clientOS;
        int clientDeviceYear;
        clientOS = 0;
        clientDeviceYear = 2022;

        findOS(clientOS);
        findYear(clientDeviceYear);
       System.out.println("Установите "+findYear(clientDeviceYear)+" версию приложения для "+findOS(clientOS)+" по ссылке");

        System.out.println("_________________________________________");

        System.out.println("          Задание 3");

        int deliveryDistance = 21;
        System.out.println("Доставка займет дней всего: " + calculateNumberDeliveryDays(deliveryDistance));

        System.out.println("_________________________________________");
    }
}