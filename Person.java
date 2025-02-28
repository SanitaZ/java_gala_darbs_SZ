import java.util.Scanner;
//Parent class
public class Person {
    //Mainīgie
    protected String firstName;
    protected String lastName;
    protected int age;
    protected double height;
    protected double weight;
    protected String country;
    protected double income;
    protected boolean likesToProgram;

    //Konstruktors
    public Person(String firstName, String lastName, int age, double height, double weight, String country, double income, boolean likesToProgram) {
        this.firstName = firstName;
        this.lastName =  lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.country = country;
        this.income = income;
        this.likesToProgram = likesToProgram;

    }
    //Metode, kas izvada informāciju par lietotāju
        public void printInfo() {
            System.out.println("Information about person: ");
            System.out.println("Name: " + firstName);
            System.out.println("Last name: " + lastName);
            System.out.println("Age: " + age);
            System.out.println("Height (in metres): " + height);
            System.out.println("Weight (in kg): " + weight);
            System.out.println("Country of residence: " + country);
            System.out.println("Income: " + income);
            System.out.println("Do you like to program: " + (likesToProgram ? "Yes" : "No"));

        }







}
