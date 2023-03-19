public class obj13 
{
    private static final int [] array = {1, 2, 3, 4, 5};

    /**
     * Public getter for private array
     * Returns a clone to array
     * Prevents clients from modifying the original array
     */
    public static final int [] arrayAccessor()
    {
        return array.clone();
    }
}
