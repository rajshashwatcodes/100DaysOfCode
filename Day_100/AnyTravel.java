// Abstract class or interface representing any type of travel
abstract class AnyTravel {
    String passengerName;
    String origin;
    String destination;
    
    // Common methods
    public abstract void bookTicket();
    public abstract void displayTicketDetails();
}
// Concrete class for bus travel
class BusTravel extends AnyTravel {
    public void bookTicket() {
        // Logic to book bus ticket
        System.out.println("Bus ticket booked for " + passengerName);
 }
 
public void displayTicketDetails() {
    // Logic to display bus ticket details
    System.out.println("Bus ticket details:");
    System.out.println("Passenger Name: " + passengerName);
    System.out.println("Origin: " + origin);
    System.out.println("Destination: " + destination);
 }
}

// Concrete class for train travel
class TrainTravel extends AnyTravel {
 
    public void bookTicket() {
    // Logic to book train ticket
    System.out.println("Train ticket booked for " + passengerName);
 }

public void displayTicketDetails() {
    // Logic to display train ticket details
    System.out.println("Train ticket details:");
    System.out.println("Passenger Name: " + passengerName);
    System.out.println("Origin: " + origin);
    System.out.println("Destination: " + destination);
    }
}
// Concrete class for flight travel
class FlightTravel extends AnyTravel {
 
    public void bookTicket() {
        // Logic to book flight ticket
        System.out.println("Flight ticket booked for " + passengerName);
 }

    public void displayTicketDetails() {
        // Logic to display flight ticket details
        System.out.println("Flight ticket details:");
        System.out.println("Passenger Name: " + passengerName);
        System.out.println("Origin: " + origin);
        System.out.println("Destination: " + destination);
    }
}

// Factory class responsible for creating the appropriate travel object
class TravelFactory {
    public static AnyTravel getObject(String travelType) {
        switch (travelType) {
            case "bus":
                return new BusTravel();
            case "train":
                return new TrainTravel();
            case "flight":
                return new FlightTravel();
            default:
                throw new IllegalArgumentException("Invalid travel type: " + 
            travelType);
        }
    }
}

// Example usage of the travel agency site
public class TravelAgency {
    public static void main(String[] args) {
        // Get the appropriate travel object from the factory
        AnyTravel travel = TravelFactory.getObject("bus");
        
        // Set the travel details
        travel.passengerName = "John";
        travel.origin = "City A";
        travel.destination = "City B";
        
        // Book and display the ticket details
        travel.bookTicket();
        travel.displayTicketDetails();
    }
}


