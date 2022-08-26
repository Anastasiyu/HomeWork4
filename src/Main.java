public class Main {
    public static void main(String[] args) {
        task3();
    }

    public static void task1() {
        int i = 0;
        while (i < 10) {
            System.out.print(++i + " ");

        }
        System.out.println(" ");
        for (; i > 0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task2() {
        int firstFriday = 1;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница" + currentFriday + "-е число необходимо подготовить отчет.");
        }
    }

    public static void task3() {
        int currentYear = 2022;
        int start = currentYear - 200;
        int end = currentYear + 100;
        for (int i = start; i <= end; i++) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }}