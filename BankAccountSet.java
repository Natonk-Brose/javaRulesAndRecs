/*
* @Author Thomas Gray
* This class is used demonstration of OBJ56-J, where you should not be able to change someone's social security number
* Not necessary for function of overall system, but used primarily just for demonstration purposes
*/

public class BankAccountSet extends BankAccount {
    
    /**
    * Constructor for the BankAccountSet class
    * @param The SSN as a String to be associated with the bank account
    *
    */
    public BankAccountSet(String SSN, int accNo) {
        super(accNo, SSN);
    }
    
    /**
    * Returns the SSN of a customer
    * @return SSN as a String
    *
    */
    public String getSSN() {
        return super.getSocialSecurity();
    }

    //OBJ56-J: Provide sensitive mutable classes with unmodifiable wrappers
    /**
    * Sets the SSN associated with a bank account (will not work in order to demonstrate OBJ56-J)
    * @param The SSN as a String to be associated with the bank account
    *
    */
    public void setSSN(String SSN) {
        throw new UnsupportedOperationException();
    }

}
