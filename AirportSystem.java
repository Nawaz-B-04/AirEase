import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class AirportSystem {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static void displayDirection() {
        int option;
        do {
            System.out.println("Enter any of the destination:");
            System.out.println("1. Boarding Gate\n2. Gate 1\n3. Gate 2\n4. Gate 3\n5. Toilets\n6. Baggage Collection\n7. Security Check\n8. Check-In Counter\n9. Exit");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("The boarding Gate is located at the second floor.");
                    System.out.println("Take escalator or elevator up to the second floor.");
                    System.out.println("Turn right and follow the sign to the gate");
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 2:
                    System.out.println("Gate 1 is located at the first floor.");
                    System.out.println("Take the escalator or elevator down to the first floor and follow the sign to the gate");
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 3:
                    System.out.println("Gate 2 is located at the first floor.");
                    System.out.println("Take the escalator or elevator down to the first floor and follow the sign to the gate.");
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 4:
                    System.out.println("Gate 3 is located at the first floor.");
                    System.out.println("Take the escalator or elevator down to the first floor and follow the sign to the gate.");
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 5:
                    System.out.println("Toilets are located at the all floors.");
                    System.out.println("Look for the signs to the nearest toilet.");
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 6:
                    System.out.println("The baggage collection area is located at the first floor.");
                    System.out.println("Take the escalator or elevator down to the first floor and follow the sign to the baggage collection area.");
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 7:
                    System.out.println("Security Check is located at the first floor.");
                    System.out.println("Take the escalator or elevator down to the first floor and follow the sign to the Security Check.");
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 8:
                    System.out.println("Check-In Counter is located at the Second floor.");
                    System.out.println("Take the escalator or elevator up to the Second floor and follow the sign to the Check-In Counter.");
                    System.out.println("-------------------------------------------------------------");
                    break;
                case 9:
                    System.out.println("Exiting...!!");
                    break;
                default:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Choose a valid option.");
                    System.out.println("-------------------------------------------------------------");
                    break;
            }
        } while (option != 9);
    }
    
    static class FlightInfo {
        String flightNumber;
        String airline;
        String from;
        String to;
        String departureTime;
        String arrivalTime;
    }
    
    public static int displayFlightInfo() {
        try {
            File file = new File("flights.txt");
            Scanner inputFile = new Scanner(file);
            while (inputFile.hasNext()) {
                FlightInfo flight = new FlightInfo();
                flight.flightNumber = inputFile.next();
                flight.airline = inputFile.next();
                flight.from = inputFile.next();
                flight.to = inputFile.next();
                flight.departureTime = inputFile.next();
                flight.arrivalTime = inputFile.next();
                System.out.println("-----------------------");
                System.out.println("Flight Number: " + flight.flightNumber);
                System.out.println("Airline: " + flight.airline);
                System.out.println("From: " + flight.from);
                System.out.println("To: " + flight.to);
                System.out.println("Departure Time: " + flight.departureTime);
                System.out.println("Arrival Time: " + flight.arrivalTime);
                System.out.println();
            }
            inputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: failed to open file.");
            return 1;
        }
        return 0;
    }
    
    public static int displayActivity() {
        try {
            File file = new File("Activities.txt");
            Scanner inputFile = new Scanner(file);
            System.out.println("Recommended activities during waiting time in the airport:");
            while (inputFile.hasNextLine()) {
                System.out.println("  " + inputFile.nextLine());
            }
            inputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: failed to open file.");
            return 1;
        }
        return 0;
    }
    public static int displayAccessibility() {
        try {
            File file = new File("accessibility.txt");
            Scanner inputFile = new Scanner(file);
            System.out.println("Accessibility Features:");
            while (inputFile.hasNextLine()) {
                System.out.println("  " + inputFile.nextLine());
            }
            inputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: failed to open file.");
            return 1;
        }
        return 0;
    }
    public static int displayTravelTips() {
        try {
            File file = new File("tipsntricks.txt");
            Scanner inputFile = new Scanner(file);
            System.out.println("Travel Tips and Tricks:");
            while (inputFile.hasNextLine()) {
                System.out.println("  " + inputFile.nextLine());
            }
            inputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: failed to open file.");
            return 1;
        }
        return 0;
    }  
    public static int displayRulesAndRegs() {
        try {
            File file = new File("rulesnregulation.txt");
            Scanner inputFile = new Scanner(file);
            System.out.println("Rules and Regulations:");
            while (inputFile.hasNextLine()) {
                System.out.println("  " + inputFile.nextLine());
            }
            inputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: failed to open file.");
            return 1;
        }
        return 0;
    }
    public static int displayDosAndDonts() {
        try {
            File file = new File("dosndonts.txt");
            Scanner inputFile = new Scanner(file);
            System.out.println("DOs and DON'Ts:");
            while (inputFile.hasNextLine()) {
                System.out.println("  " + inputFile.nextLine());
            }
            inputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: failed to open file.");
            return 1;
        }
        return 0;
    }
    public static int displayTips()
    {
	int option;
    do
    {
        System.out.println("Enter your choice:\n1.Travel Tips & Tricks\n2.Rules & Regulations\n3.Do's & Dont's\n4.Exit\n");
        option=scanner.nextInt();
 
        switch(option)
        {
        	case 1:
        		displayTravelTips();
        		break;
            case 2:
                displayRulesAndRegs();
                System.out.println();
                break;
            case 3:
                displayDosAndDonts();
                System.out.println();
                break;        		
        	case 4:
        		return 0;
        	default:
            System.out.println("Please enter correct option!!\n");
        	
		}
		
    }while(option!=4);
    return 0;
}    
    public static void main(String[] args) {
        int option;
        do {
            System.out.println("Enter your choice from the following:");
            System.out.println("1. FLIGHT INFORMATION\n2. ACTIVITIES\n3. AVAILABLE ACCESSIBILITIES\n4. DIRECTIONS\n5. TRAVEL TIPS & TRICKS\n6. Customer Service\n7. Exit");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    displayFlightInfo();
                    break;
                case 2:
                    displayActivity();
                    break;
                case 3:
                     displayAccessibility();
                    break;
                case 4:
                    displayDirection();
                    break;
                case 5:
                    displayTips();
                    break;
                case 6:
                    System.out.println("Exiting...!!");
                    break;
                default:
                    System.out.println("Wrong option... please choose valid option");
                    break;
            }
        } while (option != 6);
    }
}
