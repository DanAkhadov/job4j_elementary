package Lesson4;

public class Student {
    int numberOfTicket;
    String name;
    String surname;
    int yearOfStudies;
    double averageGradeInMath;
    double averageGradeInEconomic;
    double averageGradeInForeignLanguage;
}

class StudentTest {
    public static void main(String[] args) {
        Student firstStudent = new Student();
        Student secondStudent = new Student();
        Student thirdStudent = new Student();

        firstStudent.name = "Daniyal";
        secondStudent.name = "Shamil";
        thirdStudent.name = "Nikita";

        firstStudent.surname = "Akhadov";
        secondStudent.surname = "Mamedov";
        thirdStudent.surname = "Podgorny";

        firstStudent.numberOfTicket = 1;
        secondStudent.numberOfTicket = 2;
        thirdStudent.numberOfTicket = 3;

        firstStudent.averageGradeInMath = 4.4;
        secondStudent.averageGradeInMath = 3.9;
        thirdStudent.averageGradeInMath = 2.1;

        firstStudent.averageGradeInEconomic = 2.3;
        secondStudent.averageGradeInEconomic = 1.5;
        thirdStudent.averageGradeInEconomic = 4.2;

        firstStudent.averageGradeInForeignLanguage = 4.9;
        secondStudent.averageGradeInForeignLanguage = 3.1;
        thirdStudent.averageGradeInForeignLanguage = 4.3;
        System.out.print("Средняя арифметическая студента " + firstStudent.name + " " + firstStudent.surname + " по трём предметам: ");
        System.out.println((firstStudent.averageGradeInEconomic + firstStudent.averageGradeInForeignLanguage + firstStudent.averageGradeInMath) / 3);

        System.out.print("Средняя арифметическая студента " + secondStudent.name + " " + secondStudent.surname + " по трём предметам: ");
        System.out.println((secondStudent.averageGradeInEconomic + secondStudent.averageGradeInForeignLanguage + secondStudent.averageGradeInMath) / 3);

        System.out.print("Средняя арифметическая студента " + thirdStudent.name + " " + thirdStudent.surname + " по трём предметам: ");
        System.out.println((thirdStudent.averageGradeInEconomic + thirdStudent.averageGradeInForeignLanguage + thirdStudent.averageGradeInMath) / 3);
    }
}