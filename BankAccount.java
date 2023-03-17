//green program
//IT355 Project 1
//By: Curtis Bryant, Ryan Leone, Thomas Gray, Nathan Brose, Kaden Hargrove, Aneel Gillan

import java.io.Serializable;
import java.security.AccessControlException;
import java.util.Date;

/** 
 * Class that represents a client's bank account. Maintians the clients name, account number, and balance
 */
public class BankAccount implements Cloneable{

    private String SSN; // just for showing the next subclass
    public class BankAccountSSN{ // SER05: Do not serialize instances of inner classes
        
        //OBJ08-J: Do not expose private members of an outer class from within a nested class
        public String getSSN() {
            //return SSN; <-- HORRIBLE IDEA, DO NOT DO THIS!!
            return getSocialSecurity();
        }
        
    }

    public String getSocialSecurity() {
        throw new AccessControlException("Access denied"); // <-- Also a bad idea, this library is old and is marked for removal (shown for example) - use up to date libraries
    }

    //OBJ01-J: Limit accessibility of fields 
    private double balance;
    private String name;
    private int accountNo;
    private Date dateCreated;
    private static final double [] interestRates = {1.01, 1.02, 1.03, 1.04, 1.05};
    
    
    //DCL56-J: Do not attach significance to the ordinal associated with an enum
    public enum Location {BLOOMINGTON(1), SPRINGFIELD(2), CHICAGO(3);
        private final int locationId;
        Location(int locationId) {this.locationId = locationId;}

        public int getLocationId() {
            return this.locationId;
        }

        //public int getId() {          <--- BAD IDEA, just use getLocationId()
        //    return ordinal() + 1;     makes code reliant on ordinal() to work properly to get the location ID
        //}
    }

    public BankAccount(int num, String nm)
    {
        balance = 100.0;
        dateCreated = new Date();
        name = nm;
        accountNo = num;
    }

    /**
     * Clone method that clones our class object
     * MET06-J: Do not invoke overridable methods in clone()
     * MET53-J: Ensure that the clone() method calls super.clone()
     */
    public Object clone() throws CloneNotSupportedException
    {
        final BankAccount clone = (BankAccount) super.clone();
        clone.getAccountNo();
        return super.clone(); //By calling super.clone() rather than just clone(), we guarantee that the correct object class is cloned.
    }

    public double getBalance()
    {
        return balance;
    }

    public String getName()
    {
        return name;
    }

    /**
     * Public getter for private interestRates array
     * Returns a clone to array
     * Prevents client from modifiying the original array
     * OBJ13-J: Ensure that references to mutable objects are not exposed
     */
    public static final double [] interestRates()
    {
        return interestRates.clone();
    }

    public void setSSN(String SSN) {
        this.SSN = SSN;
    }

    /**
     * Public accessor method for account number
     * Declared as final because method is invoked in clone()
     * MET06-J: Do not invoke overridable methods in clone() 
     */
    public final int getAccountNo()
    {
        return accountNo;
    }

    /**
     * Public accessor method returns clone of Date object
     * OBJ05-J: Do not return references to private mutable class members 
     */
    public Date getDateCreated()
    {
        return (Date)dateCreated.clone();
    }

    /**
     * Empty final finalize method so attackers cannot override
     * OBJ11-J: Be wary of letting constructors throw exceptions 
     */
    public final void finalize()
    {
        //do nothing
    }
    
    /**
     * Increases balance by depoAmount
     * @param deopAmount The amount to increase balance by
     */
    public void deposit(double depoAmount)
    {
        balance += depoAmount;
    }

    /**
     * Decreases balance by withdrawAmount
     * @param withdrawAmount
     * @return 0 if the withdraw was successful, -1 if the withdraw was unsuccessful due to the balance not being
     * greater than or equal to 0.0 if the withdraw occured
     */
    public int withdraw(double withdrawAmount)
    {
        
        int returnVal;

        if(balance - withdrawAmount >= 0.0)
        {
            balance -= withdrawAmount;
            returnVal = 0;
        }
        else
        {
            returnVal = -1;
        }

        return returnVal;
        
    }

    /**
     * Multiplies current balance by corresponding interest rate
     */
    public void addInterest()
    {
        if (balance > 10000)
        {
            balance = balance * interestRates[4];
        }
        else if(balance > 5000)
        {
            balance = balance * interestRates[3];
        }
        else if(balance > 2500)
        {
            balance = balance * interestRates[2];
        }
        else if(balance > 1000)
        {
            balance = balance * interestRates[1];
        }
        else
        {
            balance = balance * interestRates[0];
        }
    }

    /**
     * Returns formatted string of account details
     */
    public String toString()
    {
        return "Name: " + name + "\nAccount Number " + accountNo + "\nBalance: $" + balance + "\nDate Account Opened: " + dateCreated + "\n";
    }
}

