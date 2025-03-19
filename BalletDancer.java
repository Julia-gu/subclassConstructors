class BalletDancer extends Dancer {
    private String balletShoes;

    public BalletDancer(String name, int experience, String balletShoes) 
    {
        super(name, experience);
        this.balletShoes = balletShoes;
    }

    public void jete() 
    {
        System.out.println(getName() + " is performing a jete.");
    }

    public void pirouette() 
    {
        System.out.println(getName() + " is performing a pirouette.");
    }

    public String getBalletShoes() 
    {
        return balletShoes;
    }

    public void setBalletShoes(String balletShoes) 
    {
        this.balletShoes = balletShoes;
    }
}