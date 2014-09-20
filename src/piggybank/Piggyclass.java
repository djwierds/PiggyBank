/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package piggybank;

/**
 *
 * @author Daniel
 */
public class Piggyclass {
    private double amount;
    private double withdrawl;
    
    public Piggyclass(){
    amount = 0;
    }
    
    public double getAmount(){
        return(amount);
    }
    
    public double addPenny(){
        amount = amount + 0.01;
        
        return(amount);
    }
    
    public double addNickel(){
        amount = amount + 0.05;
        
        return(amount);
    }
    
    public double addDime(){
        amount = amount + 0.10;
        
        return(amount);
    }
    
    public double addQuarter(){
        amount = amount + 0.25;
        
        return(amount);
    }
    
    public double addLoonie(){
        amount = amount + 1.00;
        
        return(amount);
    }
    
    public double addToonie(){
        amount = amount + 2.00;
        
        return(amount);
    }
    
    public double addFive(){
        amount = amount + 5.00;
        
        return(amount);
    }
    
    public double addTen(){
        amount = amount + 10.00;
        
        return(amount);
    }
    
    public double addTwenty(){
        amount = amount + 20.00;
        
        return(amount);
    }
    
    public double addFifty(){
        amount = amount + 50.00;
        
        return(amount);
    }
    
    public double addHundred(){
        amount = amount + 100.00;
        
        return(amount);
    }
    
    public void Remove(double remove){
        if (amount <= remove){
            remove -= amount;
        } else {
            System.out.println("Not enough money in account.");
        }
        
    }
}
    
    
