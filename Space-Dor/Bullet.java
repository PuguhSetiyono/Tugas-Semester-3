import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    /**
     * Act - do whatever the laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX() + 7, getY()); // Bergerak ke kanan dengan kecepatan 4

        // Hapus peluru jika mencapai tepi layar
        
        if (isTouching(Enemy.class)){
            touchEnemy();
        }
        else if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
    
    public void touchEnemy(){
        getWorld().addObject(new Duar(), getX(), getY());
        removeTouching(Enemy.class);
        getWorld().removeObject(this);
    }
    public Bullet(){
        turn(90);
    }

}
