package insured.controller;

import insured.model.InsuredPerson;
import insured.service.PersonService;
import insured.view.ConsoleView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class InsuredPersonController {
    private List<InsuredPerson> insuredPeople;
    private ConsoleView view;
    private final Scanner scanner;
    PersonService personService;

    public InsuredPersonController(ConsoleView view,Scanner scanner,PersonService personService){
        this.view=view;
        this.insuredPeople=new ArrayList<>();
        this.scanner=scanner;
        this.personService=personService;
    }

    public void run(){
        boolean running=true;
        while (running) {
            view.printMenu();
            String command = scanner.nextLine();
            switch (command) {
                case "1":
                    InsuredPerson newPerson = view.getInsuredPersonInput();
                    insuredPeople.add(newPerson);
                    System.out.println("Poistený bol pridaný.");
                    break;
                case "2":
                    view.displayInsuredPeople(insuredPeople);
                    break;
                case "3":
                    String[] nameAndSurname = view.getNameAndSurnameInput();
                    List<InsuredPerson> foundPeople = personService.findInsuredPersonByNameAndSurname(nameAndSurname[0], nameAndSurname[1],insuredPeople);
                    view.displayFoundInsuredByNameAndSurname(foundPeople);
                    break;
                case "4":
                    System.out.println("Aplikácia sa ukončuje...");
                    running = false;
                    break;
                default:
                    System.out.println("Neplatná voľba. Skúste to znova.");
                    break;
            }
        }

    }


}
