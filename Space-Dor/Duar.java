import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duar extends Actor
{
    int DuarTimer = 0;
    public void act()
    {
        turn(2);
        if (DuarTimer==60){
            getWorld().removeObject(this);
        }
        DuarTimer++;
    }
}
