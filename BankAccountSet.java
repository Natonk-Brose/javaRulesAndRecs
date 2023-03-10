public class BankAccountSet extends BankAccount {
    public BankAccountSet(String SSN) {
        super.setSSN(SSN);
    }

    public String getSSN() {
        return super.getSocialSecurity();
    }

    //OBJ56-J: Provide sensitive mutable classes with unmodifiable wrappers
    public void setSSN(String SSN) {
        throw new UnsupportedOperationException();
    }

}