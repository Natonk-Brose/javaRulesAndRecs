class obj01 {
    /**
     * Private variable
     */
    private int balance = 100;

    /**
     * Private array
     */
    private static final String[] list = {"ham", "turkey", "cheese"};

    /**
     * Public accessor for private variable.
     */
    public int getBalance()
    {
        return balance;
    }

    /**
     * Public accessor method for private array.
     */
    public static final String getListItem(int index)
    {
        return list[index];
    }
}
