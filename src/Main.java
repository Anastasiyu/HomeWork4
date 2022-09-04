public class Main {


    public static void main(String[] args) { task5(); }
    public static void task1() {
        {
            int i = 0;
            while (i < 10) {
                System.out.print(++i + " ");

            }
            System.out.println(" ");
            for (; i > 0; i--) {
                System.out.print(i + " ");
            }
        }}

         public static void task2() {

         {
        int firstFriday = 1;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница" + currentFriday + "-е число необходимо подготовить отчет.");
        }
    }}

    public static void task3() {
    {
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int i = start; i <= end; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }}}
    public static void task4() {
        {
            int deliveryDistance = 95;
            int deliveriDays = 1;
            if (deliveryDistance > 20) {
                deliveriDays++;
            }
            if (deliveryDistance > 60) {
                deliveriDays++;
            }
            {
                System.out.println("Потребуется дней: " + deliveriDays);
            }

        }
    }


           public static void task5() {
               int monthNomber = 12;
               switch (monthNomber) {
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
                       System.out.println("Некоррекный месяц" + monthNomber);
               }
    }
}

