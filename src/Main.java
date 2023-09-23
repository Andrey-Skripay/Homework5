public class Main {
    public static void main(String[] args) {
        // Задача 1

        int clientOS = 3;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.");
                break;
            default:
                System.out.println("Нет приложения для такой системы.");

                // Задача 2

                int clientOS2 = 1;
                int clientDeviceYear = 2016;
                boolean liteVersion = clientDeviceYear < 2015;

                if (clientOS2 == 1) {
                    if (liteVersion) {
                        System.out.println("Установите облегченную версию приложения для Android по ссылке.");
                    } else {
                        System.out.println("Установите версию приложения для Android по ссылке. ");
                    }

                } else if (clientOS2 == 0) {
                    if (liteVersion) {
                        System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
                    } else {
                        System.out.println("Установите версию приложения для iOS по ссылке. ");
                    }
                } else {
                    System.out.println("Нет приложения для такой системы.");
                }

                // Задача 3

                int year = 2020;
                if ((year > 1584) && (year % 4 == 0 && year % 100 != 0)|| year % 400 == 0) {
                    System.out.println( year + " год является високосным.");

                } else {
                    System.out.println( year +" год не является високосным.");
                }

                // Задача 4

                int deliveryDistance = 95;
                int day = 1;
                if (deliveryDistance > 20  ) {
                    day++;
                }
                if (deliveryDistance > 60 && deliveryDistance <= 100 ) {
                     day++;
                } else {
                    System.out.println(" Доставки нет.");
                }
                System.out.println("Потребуется дней:" + day);


        }
    }
}