public class Main {
    public static void main(String[] args) {
        // ������� �1
        String middleName = "������ ";
        String firstName = "���� ";
        String lastName = "�������� ";
        String fullName = middleName + firstName + lastName;
        System.out.println("��� ���������� - " + fullName);

        // ������� �2
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("������ ��� ���������� ��� ���������� ������ - "+fullNameUpper);

        // ������� �3
        fullName = fullName.replace("�", "�");
        fullName = fullName.replace("�", "�");
        System.out.println("������ ��� ���������� � " + fullName);

    }
}