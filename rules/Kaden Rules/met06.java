public class met06 implements Cloneable
{
    private int ssn;

    public met06(int ssno)
    {
        ssn = ssno;
    }

    /**
     * Clone method that clones our class object
     */
    public Object clone() throws CloneNotSupportedException
    {
        final met06 clone = (met06) super.clone();
        clone.doSomething(); //invokes NON-overridable method
        return clone();
    }

    /**
     * Method that cannot be overridden by a subclass because it is declared as final
     */
    public final void doSomething()
    {
        //do something here
    }

}

/**
 * Subclass that could be created by a malicious client
 */
class Sub extends met06
{
    Sub(int ssno)
    {
        super(ssno);
    }

    public Object clone() throws CloneNotSupportedException
    {
        final Sub clone = (Sub) super.clone();
        clone.doSomething();
        return clone();
    }

    //client cannot override the doSomething() method to inject malicious code
}