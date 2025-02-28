//Child class // Student klase, kas manto Person īpašības
public class Student extends Person {

    private String studyProgram;

    // Student konstruktors (izsauc Person konstruktoru)
    public Student(String firstName, String lastName, int age, double height, double weight, String country, double income, boolean likesToProgram, String studyProgram) {
        //izsauc parent konstruktoru
        super(firstName, lastName, age, height, weight, country, income, likesToProgram);
        this.studyProgram = studyProgram;
    }

    // Metode, kas izvada informāciju par studiju programmu

    public void studyInfo() {
        System.out.println("Study Program: " + studyProgram);
    }


}
