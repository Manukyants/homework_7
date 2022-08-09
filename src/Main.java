public class Main {
    public static void main(String[] args) {
        // Задание №1
        String middleName = "Иванов ";
        String firstName = "Семён ";
        String lastName = "Семёнович ";
        String fullName = middleName + firstName + lastName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Задание №2
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета - "+fullNameUpper);

        // Задание №3
        fullName = fullName.replace("ё", "е");
        fullName = fullName.replace("Ё", "Е");
        System.out.println("Данные ФИО сотрудника — " + fullName);

    }
}