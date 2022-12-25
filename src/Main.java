public class Main {
    public static boolean checkLeapYear(int year) {
        boolean value = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
        return value;
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
    }
}