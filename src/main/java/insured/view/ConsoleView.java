package insured.view;

import insured.model.InsuredPerson;
import insured.service.PersonService;

import java.util.List;
import java.util.Scanner;

public class ConsoleView {
    Scanner scanner;
    PersonService personService;

    String name, surname, phone;
    int age;

    public ConsoleView(PersonService personService, Scanner scanner){
        this.scanner=scanner;
        this.personService=personService;
    }

    //Show main menu
    public void printMenu() {
        System.out.println("\nEvidencia poistených");
        System.out.println("1. Pridať nového poisteného");
        System.out.println("2. Zobraziť všetlých poistených");
        System.out.println("3. Vyhľadať poisteného podľa mena a priezviska");
        System.out.println("4. Ukončiť");
        System.out.print("Zadajte číslo príkazu: ");
    }

    /**
     * Show insured person formular with name, surname, age and phone in console .
     * @return new InsuredPerson
     */
    public InsuredPerson getInsuredPersonInput(){
        name = personService.inputValidateName();
        surname = personService.inputValidateSurname();
        age = personService.inputValidateAge();
        phone = personService.inputValidatePhone();
        return new InsuredPerson(name, surname, age, phone);
    }

    /**
     * Displays a list of all insured persons.
     *
     * @param insuredPeople list of insured persons to display
     */

    public void displayInsuredPeople(List<InsuredPerson> insuredPeople){
        if (insuredPeople.isEmpty()){
            System.out.println("Zoznam je prázdny.");
        } else {
            for (InsuredPerson person:insuredPeople){
                System.out.println(person);
            }
        }
    }

    /**
     * Input name and surname.
     * @return string array with name and surname
     */
    public String[] getNameAndSurnameInput() {
        name = personService.inputValidateName();
        surname = personService.inputValidateSurname();
        return new String[] { name, surname };
    }

    /**
     * Displays insured persons matching a given name and surname.
     *
     * @param insuredPeople list of matching insured persons
     */

    public void displayFoundInsuredByNameAndSurname(List<InsuredPerson> insuredPeople) {
        if (insuredPeople.isEmpty()) {
            System.out.println("Žiadny poistený s týmto menom a priezviskom neexistuje.");
        } else {
            for (InsuredPerson person : insuredPeople) {
                System.out.println(person);
            }
        }
    }
}
