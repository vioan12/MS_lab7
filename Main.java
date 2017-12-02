import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            WorkeriMutex CM = new WorkeriMutex(5);
            Scanner scanner = new Scanner(System.in);
            String input;
            System.out.println("");
            System.out.println("Introduceti optiunea dorita:");
            input = scanner.next();
            while (!input.equals("$")) {
                CM.exec(input);
                CM.afisare_taglocatiejeton();
                System.out.println("");
                System.out.println("Introduceti optiunea dorita:");
                input = scanner.next();
            }
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
