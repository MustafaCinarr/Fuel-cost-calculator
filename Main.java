import java.util.Scanner;

//Calculates the cost of fuel based on the length of a Vehicle's trip

public class Main {
    public static void main(String[] args) {

        // variables
        double averagefuel,triplenght,fuelprice=0;

        // entering information( averagefuel,triplenght,fuelprice )

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your car's average fuel (for 100km)...");
        averagefuel = scanner.nextDouble();

        System.out.println(" Enter trip lenght (km)... ");
        triplenght = scanner.nextDouble();

        scanner.nextLine();
        /*After reading a numeric value scanner.nextLine();
         appending is a common practice to prevent
         unexpected behavior when reading the next line. */

        System.out.println("Enter fuel type (Dizel,Benzin or LPG ");
        String fueltype = scanner.nextLine();

        // Based on Germany 2024 fuel prices ( SHELL )

        if (fueltype.equals("Dizel")){

            fuelprice = 1.74 ;

        }
        else if (fueltype.equals("Benzin")){

            fuelprice = 1.83 ;

        }
        else if (fueltype.equals("LPG")) {

            fuelprice = 0.99 ;

        }

        //Cost calculation according to the specified fuel type

        double cost = (averagefuel/100) * triplenght * fuelprice;

        System.out.println("Total road cost : " + cost);

        // Cost per 1 km

        double costper1km = (averagefuel/100) * fuelprice;
        System.out.println("Cost per 1 km " + costper1km );

    }
}