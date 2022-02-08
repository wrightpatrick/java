public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffee = 2.25;
        double latte = 3.75;
        double cappuccino = 4.25;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = true;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        System.out.println(customer1 + pendingMessage);
        if (isReadyOrder4 == false) {
            System.out.println(customer4 + pendingMessage);
        }
        else {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccino);
        }
        System.out.println(generalGreeting + customer2 + "." + " " + displayTotalMessage + (cappuccino + cappuccino));
        if (isReadyOrder2 == false) {
            System.out.println(customer2 + pendingMessage);
        }
        else {
            System.out.println(customer2 + readyMessage);
        }
        System.out.println(generalGreeting + customer3 + "." + " " + displayTotalMessage + (cappuccino - dripCoffee));
    }
}
