public interface Actor
{
    int lives = 0, health = 0;
    String name = "", weapon ="";

    public void Attack (int damage);

    public void setHealth(int health);
    public int getHealth();
}//end interface actor
