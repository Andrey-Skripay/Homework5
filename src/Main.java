public class Main {
    public static void main(String[] args) {
        // Задача 1

        int clientOS = 3;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Нет приложения для такой системы.");



                // Задача 2

            int clientOS1 = 1;
            int clientDeviceYear = 2014;

            if (clientDeviceYear < 2015 && clientOS1 != 0 ) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (clientOS1 == 1) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            }
            if (clientDeviceYear < 2015 &&  clientOS1 != 1 ) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else if (clientOS1 == 0) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            }

                // Задача 3

                int year = 2020;
                if ((year > 1584) && (year % 4 == 0 && year % 100 != 0)|| year % 400 == 0) {
                    System.out.println( year + " год является високосным.");

                } else {
                    System.out.println( year +" год не является високосным.");
                }

                // Задача 4

                int deliveryDistance =615;
                int day = 1;

                if (deliveryDistance <= 20  ) {
                    day = 1;
                    System.out.println("Потребуется деней:" + day);
                }
                if (deliveryDistance > 20 && deliveryDistance <= 60){
                    day = 2;
                    System.out.println("Потребуется деней:" + day);
                }
                if (deliveryDistance > 60 && deliveryDistance <= 100 ) {
                     day = 3;
                    System.out.println("Потребуется деней:" + day);

                } else if (deliveryDistance >= 100) {
                    System.out.println(" Доставки нет.");
                }

                // Задача 5

               int monthNumber = 13;
               switch (monthNumber) {

                   case 12:
                   case 1:
                   case 2:
                       System.out.println("Зима");
                       break;
                   case 3:
                   case 4:
                   case 5:
                       System.out.println("Весна");
                       break;
                   case 6:
                   case 7:
                   case 8:
                       System.out.println("Лето");
                       break;
                   case 9:
                   case 10:
                   case 11:
                       System.out.println("Осень");
                       break;
                   default:
                       System.out.println("Условие не выполняется");
               }
        }
    }
}