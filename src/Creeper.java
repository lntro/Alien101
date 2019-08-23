public class Creeper extends Enemy
{
    //Instance Variables
    boolean isAgressive = true;

    //Constructors
    public Creeper(String name, String weapon, int lives, int health, boolean isAgressive)
    {
        super(name, weapon, lives, health);
        this.isAgressive = isAgressive;
    }//end full constructor with  call to super

    //Getters and Setters
    public boolean getIsAgressive()
    {
        return isAgressive;
    }//end getIsAgressive

    public void setIsAgressive(boolean agressive)
    {
        isAgressive = agressive;
    }//end setIsAgressive

    //Brain Methods
    @Override
    public void Attack(int damage)
    {
        if(isAgressive)
            health -= damage;
        else
            System.out.println("Your cat saved you");
    }//end Overridden Attack method


    //ToString
    @Override
    public String toString()
    {
        return "Creeper{" +
                "isAgressive=" + isAgressive +
                ", lives=" + lives +
                ", health=" + health +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }// end toString
}//end Creeper class