public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 и 2");
        byte clientOS = 1; //0 — iOS, 1 — Android
        int clientDeviceYear = 2015;
        if (clientOS == 0) {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }

        System.out.println("Задача 3");
        //високосным является каждый четвертый год, но не является каждый сотый.
        //Также високосным является каждый четырехсотый год.
        int year = 9081;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year +  " является високосным");
        } else{
            System.out.println("Год " + year +  " не является високосным");
        }

        System.out.println("Задача 4");
        //Доставка в пределах 20 км занимает сутки.
        //Доставка в пределах от 20 км до 60 км добавляет еще один день доставки.
        //Доставка в пределах 60 км до 100 км добавляет еще одни сутки.
        //Свыше 100 км доставки нет.
        byte deliveryDistance = 120, days=1;
        if (deliveryDistance>100) {
            System.out.println("Для расстояния " + deliveryDistance +  " км доставки нет");
        } else {
            if (deliveryDistance>20) {days+= 1;}
            if (deliveryDistance>60) {days+= 1;}
            System.out.println("Для расстояния " + deliveryDistance + " км потребуется дней: " + days);
        }

        System.out.println("Задача 5");
        byte monthNumber = 11;
        switch (monthNumber) {
            case 1: case 2:  case 12: System.out.println("Месяцу "+ monthNumber  +" соответстует сезон Зима");  break;
            case 3: case 4:  case 5:  System.out.println("Месяцу "+ monthNumber  +" соответстует сезон Весна"); break;
            case 6: case 7:  case 8:  System.out.println("Месяцу "+ monthNumber  +" соответстует сезон Лето");  break;
            case 9: case 10: case 11: System.out.println("Месяцу "+ monthNumber  +" соответстует сезон Осень"); break;
            default: System.out.println("Неправильный номер месяца "+ monthNumber);
        }
    }
}