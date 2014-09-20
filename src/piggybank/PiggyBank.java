/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piggybank;
import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class PiggyBank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int choice, account;
        double remove;
        String again = "Yes";
        
        
        Piggyclass daniel = new Piggyclass();
        Piggyclass abraam = new Piggyclass();
        Piggyclass connor = new Piggyclass();
        
        while(again.equalsIgnoreCase("Yes")){
        
        System.out.println("What account would you like to select? \n1. Daniel \n2. Abraam \n3. Connor");    
        account = input.nextInt();    
        
        if(account == 1 ){
        
        System.out.println("1. Show total amount in bank. \n2. Add a Penny. \n3. Add a nickel. \n4. Add a dime. \n5. Add a quarter. \n6. Add a Loonie. \n7. Add a toonie. \n8.Add a Five dollar bill. \n9. Add a Ten dollar bill.  \n10. Add a Twenty dollar bill. \n11. Add a Fifty dollar bill. \n12. Add a Hundred dollar bill. \n13. Take money out of the bank. \nEnter 0 to quit.");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        
        if(choice == 1){
            System.out.println("Amount in Daniel's account is: " + daniel.getAmount());
        } else if (choice == 2){
            System.out.println("Amount in Daniel's account is: " + daniel.addPenny());
        } else if (choice == 3){
            System.out.println("Amount in Daniel's account is: " + daniel.addNickel());
        } else if (choice == 4){
            System.out.println("Amount in Daniel's account is: " + daniel.addDime());
        } else if (choice == 5){
            System.out.println("Amount in Daniel's account is: " + daniel.addQuarter());
        } else if (choice == 6){
            System.out.println("Amount in Daniel's account is: " + daniel.addLoonie());
        } else if (choice == 7){
            System.out.println("Amount in Daniel's account is: " + daniel.addToonie());
        } else if (choice == 8){
            System.out.println("Amount in Daniel's account is: " + daniel.addFive());
        } else if (choice == 9){
            System.out.println("Amount in Daniel's account is: " + daniel.addTen());
        } else if (choice == 10){
            System.out.println("Amount in Daniel's account is: " + daniel.addTwenty());
        } else if (choice == 11){
            System.out.println("Amount in Daniel's account is: " + daniel.addFifty());
        } else if (choice == 12){
            System.out.println("Amount in Daniel's account is: " + daniel.addHundred());
        } else if (choice == 13){
            System.out.println("How much would you like to remove: ");
            remove = input.nextDouble();
            daniel.Remove(remove);
            
            System.out.println("Balance is: " + daniel.getAmount());
        } else if (choice == 0){
            again = "";
        }
        
        } else if (account == 2){
        System.out.println("1. Show total amount in bank. \n2. Add a Penny. \n3. Add a nickel. \n4. Add a dime. \n5. Add a quarter. \n6. Add a Loonie. \n7. Add a toonie. \n8.Add a Five dollar bill. \n9. Add a Ten dollar bill.  \n10. Add a Twenty dollar bill. \n11. Add a Fifty dollar bill. \n12. Add a Hundred dollar bill. \n13. Take money out of the bank. \nEnter 0 to quit.");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        
        if(choice == 1){
            System.out.println("Amount in Abraam's account is: " + abraam.getAmount());
        } else if (choice == 2){
            System.out.println("Amount in Abraam's account is: " + abraam.addPenny());
        } else if (choice == 3){
            System.out.println("Amount in Abraam's account is: " + abraam.addNickel());
        } else if (choice == 4){
            System.out.println("Amount in Abraam's account is: " + abraam.addDime());
        } else if (choice == 5){
            System.out.println("Amount in Abraam's account is: " + abraam.addQuarter());
        } else if (choice == 6){
            System.out.println("Amount in Abraam's account is: " + abraam.addLoonie());
        } else if (choice == 7){
            System.out.println("Amount in Abraam's account is: " + abraam.addToonie());
        } else if (choice == 8){
            System.out.println("Amount in Abraam's account is: " + abraam.addFive());
        } else if (choice == 9){
            System.out.println("Amount in Abraam's account is: " + abraam.addTen());
        } else if (choice == 10){
            System.out.println("Amount in Abraam's account is: " + abraam.addTwenty());
        } else if (choice == 11){
            System.out.println("Amount in Abraam's account is: " + abraam.addFifty());
        } else if (choice == 12){
            System.out.println("Amount in Abraam's account is: " + abraam.addHundred());
        } else if (choice == 13){
            System.out.println("How much would you like to remove: ");
            remove = input.nextDouble();
            daniel.Remove(remove);
            
            System.out.println("Balance is: " + abraam.getAmount());
        } else if (choice == 0){
            again = "";
        }
        
        } else if (account == 3){
            System.out.println("1. Show total amount in bank. \n2. Add a Penny. \n3. Add a nickel. \n4. Add a dime. \n5. Add a quarter. \n6. Add a Loonie. \n7. Add a toonie. \n8.Add a Five dollar bill. \n9. Add a Ten dollar bill.  \n10. Add a Twenty dollar bill. \n11. Add a Fifty dollar bill. \n12. Add a Hundred dollar bill. \n13. Take money out of the bank. \nEnter 0 to quit.");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        
        if(choice == 1){
            System.out.println("Amount in Connor's account is: " + connor.getAmount());
        } else if (choice == 2){
            System.out.println("Amount in Connor's account is: " + connor.addPenny());
        } else if (choice == 3){
            System.out.println("Amount in Connor's account is: " + connor.addNickel());
        } else if (choice == 4){
            System.out.println("Amount in Connor's account is: " + connor.addDime());
        } else if (choice == 5){
            System.out.println("Amount in Connor's account is: " + connor.addQuarter());
        } else if (choice == 6){
            System.out.println("Amount in Connor's account is: " + connor.addLoonie());
        } else if (choice == 7){
            System.out.println("Amount in Connor's account is: " + connor.addToonie());
        } else if (choice == 8){
            System.out.println("Amount in Connor's account is: " + connor.addFive());
        } else if (choice == 9){
            System.out.println("Amount in Connor's account is: " + connor.addTen());
        } else if (choice == 10){
            System.out.println("Amount in Connor's account is: " + connor.addTwenty());
        } else if (choice == 11){
            System.out.println("Amount in Connor's account is: " + connor.addFifty());
        } else if (choice == 12){
            System.out.println("Amount in Connor's account is: " + connor.addHundred());
        } else if (choice == 13){
            System.out.println("How much would you like to remove: ");
            remove = input.nextDouble();
            daniel.Remove(remove);
            
            System.out.println("Balance is: " + connor.getAmount());
        } else if (choice == 0){
            again = "";
        }
            
        }
        
        } 
    }
}
