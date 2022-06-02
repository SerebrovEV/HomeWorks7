public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);
    }

    private static void task2() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        String fullNameUpCase = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullNameUpCase);
    }

    private static void task3() {
        String fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")) {
            String[] chadge = fullName.split("ё");
            System.out.println("Данные ФИО сотрудника - ");
            for (int i = 0; i < chadge.length; i++) {
                if (i == chadge.length - 1) {
                    System.out.print(chadge[i]);
                } else {
                    System.out.print(chadge[i] + "е");
                }
            }
        } else {
            System.out.println("Данные ФИО сотрудника - " + fullName);
        }
    }
}