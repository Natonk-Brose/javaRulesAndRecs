import java.util.Date;

class obj05{
    private Date d;
    
    /**
     * Constructor
     */
    public obj05() 
    {
        d = new Date();
    }
    
    /**
     * Public accessor method returns a clone of the Date object
     */
    public Date getDate() 
    {
        return (Date)d.clone();
    }
}
