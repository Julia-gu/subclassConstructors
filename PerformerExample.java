public class PerformerExample 
{
    public static void main(String[] args) 
    {
        BalletDancer dancer1 = new BalletDancer("Anna", 5, "Pointe Shoes");

        System.out.println(dancer1.getName() + " has " + dancer1.getExperience() + " years of experience.");
        System.out.println(dancer1.getName() + " wears " + dancer1.getBalletShoes() + ".");
        dancer1.jete();
        dancer1.pirouette();
    }
}
