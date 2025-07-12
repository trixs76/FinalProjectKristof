import insured.controller.InsuredPersonController;
import insured.service.PersonService;
import insured.view.ConsoleView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PersonService personService=new PersonService(scanner);
        ConsoleView view = new ConsoleView(personService,scanner);

        InsuredPersonController controller = new InsuredPersonController(view,scanner, personService);
        controller.run();
    }
}
