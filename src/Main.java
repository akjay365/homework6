public class Main {
    public static void main(String[] args) {


        int age =19;
        if (age>18) {
            System.out.println("Ты должен праздновать");
            if (age<21){
                System.out.println("Выпей сливочного пива");
            }else {
                System.out.println("Иди куда хочешь и пей что хочешь");
            }
        }else if (age>7){
                System.out.println("иди в школу");
            }else{
                System.out.println("Иди в детский сад");
            }


        int age1=6;
        if (age1 == 18){
            System.out.println("С окончанием школы");
        }else if (age1 ==21){
            System.out.println("Теперь тебе можно пить алкашку");
        }else if (age1 ==7){
            System.out.println("Иди в школу");
        }else{
            System.out.println("Пока сказать нечего");
        }





        int clientOS = 0;
        int clientDeviceYear = 2013;
        if(clientOS ==1 && clientDeviceYear>=2015){
        System.out.println("Установите версию приложения для iOS по ссылке");}
        if (clientOS ==1 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientOS ==0&&clientDeviceYear>=2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }if(clientOS ==0 && clientDeviceYear<2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }



        int year = 2024;
        boolean year2 = ((year % 400 == 0) || (year %4 == 0 && year % 100 != 0));

        if (year2){
            System.out.println("Год " + year + " високосный");}
        else{
            System.out.println("Год " + year + " не високосный");}


        int deliveryDistance = 95;
        if (deliveryDistance<=20){
            System.out.println("Потребуется 1 день");
        }else if(deliveryDistance>20&&deliveryDistance<=60){
            System.out.println("Потребуется 2 дня");
        }else if (deliveryDistance>60&&deliveryDistance<=100){
            System.out.println("Потребуется 3 дня");}




        int monthNumber = 12;

        switch (monthNumber) {
            case 1:
                System.out.println("январь");
                System.out.println("зима");
                break;
                case 2:
                System.out.println("февраль");
                    System.out.println("зима");
                    break;
                    case 3:
                System.out.println("март");
                        System.out.println("весна");
                break;
            case 4:
                System.out.println("апрель");
                System.out.println("весна");
                break;
            case 5:
                System.out.println("май");
                System.out.println("весна");
                break;
            case 6:
                System.out.println("июнь");
                System.out.println("лето");
                break;
            case 7:
                System.out.println("июль");
                System.out.println("лето");
                break;
            case 8:
                System.out.println("август");
                System.out.println("лето");
                break;
            case 9:
                System.out.println("сентябрь");
                System.out.println("осень");
                break;
            case 10:
                System.out.println("октябрь");
                System.out.println("осень");
                break;
            case 11:
                System.out.println("ноябрь");
                System.out.println("осень");
                break;
            case 12:
                System.out.println("декабрь");
                System.out.println("зима");
                break;

            default:
                System.out.println("Такого месяца нет");
        }

    }
}












