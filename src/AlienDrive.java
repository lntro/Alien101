public class AlienDrive
{
    public static void main(String[] args)
    {
        Fighter joe = new Fighter("Captain", "Joe", "Spork", 28, 1000);
        Enemy generic = new Enemy("generic", "floon", 356, 5)
        {
            @Override
            public void Attack(int damage)
            {

            }
        };


        Creeper creepie = new Creeper("Creepie", "TNT", 1, 20, true);
        Klingon worf = new Klingon("Worf", "Phaser", 1, 1000, true);
        Klingon burtog = new Klingon("Burtog", "bat'leth", 1, 1000, false);

        Actor[]cast = {creepie,worf,burtog};
        for(Actor e:cast)
        {
            System.out.println(e);
        }

        int[]numArray = {5,6,7,8,2,23};
        for(int e:numArray)
        System.out.println(e);

      System.out.println(joe);

       System.out.println(generic);
        System.out.println(creepie);
        System.out.println(worf);
        System.out.println(burtog);
        creepie.Attack(10);
        System.out.println(creepie);


    }//end Main method
}//end Driver class


