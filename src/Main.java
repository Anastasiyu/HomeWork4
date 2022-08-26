public class Main {
    public static void main(String[] args) {
        task2();
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
}