import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Opskrift banankage = new Opskrift();
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m";

        //Brugergrænseflade
        System.out.println(ANSI_RED + "Hvor mange folk spiser med?" + ANSI_RESET);
        int x = sc.nextInt();
        banankage.setAntal(x);
        System.out.println(" ");

        //User output
        System.out.println(banankage);

    }

}