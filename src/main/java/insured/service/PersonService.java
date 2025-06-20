package insured.service;


import insured.model.InsuredPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonService {
    String name,surname,ageString,phone;
    int age;

    private static Scanner scanner;

    public PersonService(Scanner scanner){
        this.scanner=scanner;
    }

    //validate input formulars for name, surname, age, phone

    public String inputValidateName(){
        do {
            System.out.print("Zadajte meno poisteného: ");
            name = scanner.nextLine().trim();
            if (name.isEmpty())
                System.out.println("Meno nesmie byť prázdne.");
        } while (name.isEmpty());
        return name;
    }

    public String inputValidateSurname(){
        do {
            System.out.print("Zadajte priezvisko poisteného: ");
            surname = scanner.nextLine().trim();
            if (surname.isEmpty())
                System.out.println("Priezvisko nesmie byť prázdne.");
        } while (surname.isEmpty());
        return surname;
    }

    public int inputValidateAge(){
        do{
            do {
                System.out.print("Zadajte vek poisteného: ");
                ageString = scanner.nextLine().trim();
                if (ageString.isEmpty())
                    System.out.println("Vek nesmie byť prázdný.");
            } while (ageString.isEmpty());
            age=Integer.parseInt(ageString);
            if (age<=0)
                System.out.println("Vek nesmie byť 0.");
        } while (age<=0);


        return age;
    }

    public String inputValidatePhone(){
        do {
            System.out.print("Zadajte telefónne číslo poisteného: ");
            phone = scanner.nextLine().trim();
            if (phone.isEmpty())
                System.out.println("Telefonné číslo nesmie byť prázdne.");
        } while (phone.isEmpty());
        return phone;
    }

    /**
     * Find insured people by Name and Surname
     * @param name
     * @param surname
     * @return List collection foundPeople
     */
    public List<InsuredPerson> findInsuredPersonByNameAndSurname(String name, String surname, List<InsuredPerson> insuredPeople) {
        List<InsuredPerson> foundPeople = new ArrayList<>();

        for (InsuredPerson person : insuredPeople) {
            if (person.getName().equalsIgnoreCase(name) && person.getSurname().equalsIgnoreCase(surname)) {
                foundPeople.add(person);
            }
        }
        return foundPeople;
    }
}
