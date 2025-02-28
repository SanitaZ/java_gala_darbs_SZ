import java.util.Scanner;

public class Main {
    //static - lai nav Main jānorāda objektu
    public static void main(String[] args) {
        // Izveidots objekts no klases Person
        Person personalInformation = new Person("Jānis", "Bērziņš", 30, 1.80, 75, "Latvija", 3000.00, true);

        //Izveidots objekts no klases Student

        Student student = new Student("Jānis", "Bērziņš", 30, 1.80, 75, "Latvija", 3000, true, "Tiesību zinātnes");

        //Izvada informāciju par personu:
        personalInformation.printInfo();


        // Izvadām informāciju par studiju programmu
        student.studyInfo();
        System.out.println("---------------------------------------"); //šo ieliku, lai atdala pirmo konstruktoru no otrā


        // Lietotāja ievade
        Scanner scan = new Scanner(System.in);

        //Vārda validācija
        //Tiek izmantot do -while cikls, lai validētu vai ir ievadīts vārds un nepaliek tukša ievade un cikls atkārtosies, kamēr tiks ievadīts vārds
        //Papildus izmantota .trim() metode, lai noņemtu liekās atstarpes un ievade nepārlektu
        //if norādīs, ka dati ievadīti nepareizi

        System.out.print("Enter  your name: ");//Parāda lietotājam ziņojumu, lai ievadītu vārdu

        String firstName; // Deklarē mainīgo (tiks saglabāts lietotāja ievadītais vārds)

        do {//Do -while cikls – programma atkārtoti prasa ievadi, ja tā ir tukša.
            firstName = scan.nextLine().trim(); // trim metode - Noņem liekās atstarpes sākumā un beigās
            if (firstName.isEmpty()) {// Pārbaudām, vai lietotājs nav ievadījis tukšu tekstu
                System.out.print("Error. Name cannot be empty. Please enter your name: ");// Brīdina lietotāju un lūdz atkārtotu ievadi
            }
        } while (firstName.isEmpty());// Ja ievade ir tukša, cilpa atkārtojas, līdz tiek ievadīts derīgs teksts

        //Uzvārda validācija
        //Tiek izmantot do -while cikls, lai validētu vai ir ievadīts uzvārds un nepaliek tukša ievade un cikls atkārtosies, kamēr tiks ievadīts uzvārds
        //Papildus izmantota .trim() metode, lai noņemtu liekās atstarpes un ievade nepārlektu
        //if norādīs, ka dati ievadīti nepareizi
        System.out.println("Enter yor last name: ");
        String lastName;
        do {
            lastName = scan.nextLine().trim();
            if (lastName.isEmpty()) {
                System.out.print("Error. Last name cannot be empty. Please enter your  last name: ");
            }
        } while (lastName.isEmpty());


        //Vecuma validācija
        //Tiek izmantot do -while cikls, lai validētu vai ir ievadīts skaitlis un nepaliek tukša ievade, negatīvs skaitlis vai 0. Cikls atkārtosies, kamēr tiks ievadīts skaitlis
        //Papildus izmantota scan.hasNextInt -Atgriež true, ja nākamais ir skaitlis. Izlec paziņojums
        //if validēs vai skaitlis nav 0, vai negatīvs
        //scan.nextInt() - Ja neatbilst - pieprasa ievadīt atkārtoti

        int age;
        do {
            System.out.print("Enter your age: ");
            while (!scan.hasNextInt()) { //scan.hasNextInt -Atgriež true, ja nākamais ir skaitlis. Izlec paziņojums
                System.out.print("Error. Enter valid number: ");
                scan.next();
            }
            age = scan.nextInt();//Ja neatbilst - pieprasa ievadīt atkārtoti
            if (age <= 0) {
                System.out.println("Age cannot be negative number or zero! Please try again. ");
            }
        } while (age <= 0);

        //Auguma validācija
        //Tiek izmantot do -while cikls, lai validētu vai ir ievadīts skaitlis un nepaliek tukša ievade, negatīvs skaitlis vai 0. Cikls atkārtosies, kamēr tiks ievadīts skaitlis
        //Papildus izmantota scan.hasNextInt -Atgriež true, ja nākamais ir skaitlis. Izlec paziņojums
        //if validēs vai skaitlis nav 0, vai negatīvs
        //scan.nextDouble(), ja neatbilst - pieprasa ievadīt atkārtoti

        double height;

        do {
            System.out.print("Enter your height (in metres): ");
            while (!scan.hasNextDouble()) {
                    System.out.println("Error. Input cannot be empty. Enter your height: ");
                    scan.next();
            }
                height = scan.nextDouble();
                if (height <= 0) {
                    System.out.println("Height cannot be negative number or zero! Please try again.");

                }

        } while (height <= 0);


        //Svara validācija
        //Tiek izmantot do -while cikls, lai validētu vai ir ievadīts skaitlis un nepaliek tukša ievade, negatīvs skaitlis vai 0. Cikls atkārtosies, kamēr tiks ievadīts skaitlis
        //Papildus izmantota scan.hasNextInt -Atgriež true, ja nākamais ir skaitlis. Izlec paziņojums
        //if validēs vai skaitlis nav 0, vai negatīvs
        //scan.nextDouble(), ja neatbilst - pieprasa ievadīt atkārtoti

        double weight;
        do {
            System.out.print("Enter your weight (kg): ");

            while (!scan.hasNextDouble()) {
                System.out.print("Error. Enter valid number: ");
                scan.next();
            }
            weight = scan.nextDouble();//Ja neatbilst - pieprasa ievadīt atkārtoti
            if (weight <= 0) {
                System.out.println("Weight cannot be negative number or zero! Please try again.");
            }
        } while (weight <= 0);


        //Dzīve vietas valsts validācija
        //Tiek izmantot do -while cikls, lai validētu vai ir ievadīta dzīves vieta un nepaliek tukša ievade. Cikls atkārtosies, kamēr tiks ievadīta valsts
        //Papildus izmantota .trim() metode, lai noņemtu liekās atstarpes un ievade nepārlektu
        //if norādīs, ka ievades lauks nevar būt tukšs

        String country;
        do {
            System.out.println("Enter your country: ");
            country = scan.next().trim();
            if (country.isEmpty()) {
                System.out.print("Error. Input cannot be empty. Please enter your  country: ");
            }
        } while (country.isEmpty());


        // ja lietotājs ievada Latvija - tad parādās ziņojums. Tiek pārbaudīts, vai cilvēks dzīvo Latvijā
        if ("Latvija".equals(country)) {
            System.out.println("You live in Latvia. The average income here is around 1500 EUR");
            scan.nextLine();
        }

        //Ienākumu validācija
        //Tiek izmantot do -while cikls, lai validētu vai ir ievadīti cipari un nepaliek tukša ievade un cikls atkārtosies, kamēr tiks ievadīti cipari
        // while pārbaudīs vai ievadīt skaitļi iun ievade nav palikusi tukša
        //Papildus izmantota scan.hasNextInt -Atgriež true, ja nākamais ir skaitlis. Izlec paziņojums
        //if pārbaudīs vai nav ievadīts negatīvs skaitlis

        double income;

        do {
            System.out.print("Enter your monthly income: ");
            while (!scan.hasNextDouble()) {
                System.out.print("Error. Enter valid number: ");
                scan.next();
            }
            income = scan.nextDouble();
            if (income < 0) {
                System.out.println("Income cannot be indicated with a negative number. Please try again.");
            }
        } while (income < 0);

        //if pārbaudīs vai atalgojums nav mazāks par 1000, ja tā, tad izvedīs paziņojumu
        if (income < 1000) {
            System.out.println("Your income is below average.");
        }


        //lai nepārlec uz nākamo ievadi un spēj izpildīt nepieciešamo
        scan.nextLine();

        //boolean validācija
        //izmantoju toLowerCase - lai lietotāja ievadi pārvērš mazajos burtos, ja tiek ievadīts ar lielajiem
        //if - else cikls pārbauda lietotāja ievadi - ja Yes, tad ir true, ja No, tad false, visam pārējam kas tiek ievadīts - izvada, ka jāizvēlas yes vai no

        boolean likesProgramming = true;
        System.out.print("Do you like programming? (yes/no): ");
        String likesProgrammingInput = scan.nextLine().toLowerCase();
        if (likesProgrammingInput.equals("yes")) {
            likesProgramming = true;
        } else if (likesProgrammingInput.equals("no")) {
            likesProgramming = false;
        } else {
            System.out.println("Error! Please indicate 'yes' or 'no'.");
        }


        //Mainīgie papildus aprēķiniem

        int ageInDays = age * 365;
        double heightInCm = height * 100;
        double yearIncome = income * 12;
        double bmi = weight / (height * height);

        //metode klasificē BMI. "?" nozīmē, ka jebkas kas tiks norādīts bmiInterpretation, pēc pielietojuma arī parādīsies
        //if - else cikls norāda konkrētas pazīmes, kurām izpildoties parādās bmiInterpretation

        String bmiInterpretation = " ? ";

        if (bmi < 18) {
            bmiInterpretation = "Underweight";
        } else if (bmi >= 23 && bmi < 29) {
            bmiInterpretation = "Normal weight";
        } else if (bmi >= 29 && bmi < 30) {
            bmiInterpretation = "Overweight";
        }


        //Izvada ievadītos datus
        System.out.println();

        // Izvada tekstu
        System.out.println("User data");

        //Vārda ievade
        System.out.println("Name: " + firstName);

        //Uzvārda ievade
        System.out.println("Last name: " + lastName);

        //vecuma ievade + papildu vecuma aprēķināšana dienās
        System.out.println("Age: " + age + " years (" + ageInDays + " (age in days))");

        //auguma ievade + papildus auguma aprēķins cm
        System.out.println("Height: " + height + " m (" + heightInCm + " (height in cm))");

        //svara ievade
        System.out.println("Weight: " + weight);

        // Ķermeņa masas indeksa ievade + papildus BMI aprēķins un interpretācija
        System.out.println("Body Mass Index (BMI): " + bmi + " (" + bmiInterpretation + ")");

        //Valsts izvade
        System.out.println("Country: " + country);

        //Ienākumi + papildus aprēķins - gada ienākumu aprēķins
        System.out.println("Income: " + income + " EUR per month (" + yearIncome + " EUR (year income))");

        //patīk vai nepatīk programmēt
        System.out.println("Like or not program: " + likesProgramming);

        //Apstādina datu ievadi
        scan.close();

    }

}