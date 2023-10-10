public class Main {
    public static void main(String[] args) {
        String firstName = "Ivanov";
        String middleName = "Ivanovich";
        String lastName = "Ivan";
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Ф.И.О. сотрудника - " + fullName);

        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());

        String newFullName = "Иванов Семён Семёнович";
        String replaced = newFullName.replace('ё', 'е');
        System.out.println("Данные Ф. И. О. сотрудника — " + replaced);
    }
}