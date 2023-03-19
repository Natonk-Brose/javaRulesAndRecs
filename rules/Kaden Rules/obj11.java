// /**
//  * Class declared as final so it cannot be extended
//  */

// public final class obj11 {
//     private int ssn;
//     private int accountNo;

//     public obj11()
//     {
//         ssn = 12345;
//         accountNo = 123456;
//     }

//     public int getSSN()
//     {
//         return ssn;
//     }

//     public int getAccountNo()
//     {
//         return accountNo;
//     }
// }


/**
 * Class not declared as final -> declare empty final finalize() method
 */
public class obj11 {
    private int ssn;
    private int accountNo;

    public obj11()
    {
        ssn = 12345;
        accountNo = 123456;
    }

    /**
     * Empty finalize method so attackers cannot override
     */
    public final void finalize()
    {
        //do nothing
    }

    public int getSSN()
    {
        return ssn;
    }

    public int getAccountNo()
    {
        return accountNo;
    }
}