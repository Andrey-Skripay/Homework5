public class Main {
    public static void main(String[] args) {
        // Задача 1

        int clientOS = 2;
        switch (clientOS) {
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке.");
                break;
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке.");
                break;
            default:
                System.out.println("Нет приложения для такой системы.");
        }
    }
}