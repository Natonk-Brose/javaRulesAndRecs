//green program
//IT355 Project 1
//By: Curtis Bryant, Ryan Leone, Thomas Gray, Nathan Brose, Kaden Hargrove, Aneel Gillan
public class BankAccountDriver {
    public static void main(String[] args)
    {

        //Bank accounts default to a balance of 100.0
        BankAccount bankAccount1 = new BankAccount(12345678, "Rishi");
        BankAccount bankAccount2 = new BankAccount(13579135, "Bob");

        final double WITHDRAW_AMOUNT = 100.1;

        //EXP00-J: Do not ignore values returned by methods (if this return value was ignored the user 
        //  would not know the withdraw did not occur)
        if(bankAccount1.withdraw(WITHDRAW_AMOUNT) == -1)
        {
            System.out.println("The withdraw was unsuccessful.\n");
        }

        bankAccount1.deposit(1000);
        bankAccount2.deposit(200);

        System.out.println(bankAccount1.toString());
        System.out.println(bankAccount2.toString());

        bankAccount1.addInterest();
        bankAccount2.addInterest();

        System.out.println(bankAccount1.toString());
        System.out.println(bankAccount2.toString());
    }
}
