
public class Klingon extends Enemy
{
    boolean isFriendly = false;

    public Klingon(String name, String weapon, int lives, int health, boolean isFriendly)
    {
        super(name, weapon, lives, health);
        this.isFriendly = isFriendly;
    }//end full constructor with super



    public void Attack(Actor a, int damage)
    {
        if (!isFriendly)
            a.setHealth(a.getHealth()-damage);
        else
            System.out.println("Thinking about what you can't control only wastes energy and creates its own enemy.");
    }

    @Override
    public void Attack(int damage)
    {

    }

    @Override
    public String toString()
    {
        return "Klingon{" +
                "isFriendly=" + isFriendly +
                ", lives=" + lives +
                ", health=" + health +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }// end toString
}//end class Klingon