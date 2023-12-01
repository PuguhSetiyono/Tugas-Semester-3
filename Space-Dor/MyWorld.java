import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class NewWorld.
     * 
     */
    private int jeda=0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

        super(600, 400, 1); 
        prepare();
    }
    public void test(){
        
    }
    
    private void prepare()
    {
        Hero hero = new Hero();
        addObject(hero,50,200);
        Hero hero2 = new Hero();
        addObject(hero2,163,227);
        removeObject(hero);
        hero2.setLocation(51,227);
    }
    
    int EnemyTimer = 0;
    public void act()
    {
        if (EnemyTimer==120){
            Enemy Enemy1 = new Enemy();
            addObject(
                Enemy1,
                590,
                Greenfoot.getRandomNumber(300) + 50
            );
            EnemyTimer = 0;
        }
        
        EnemyTimer++;
       
    }
}
