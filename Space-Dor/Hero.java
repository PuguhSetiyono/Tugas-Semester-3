import greenfoot.*; 

public class Hero extends Actor {
    private int targetx = 0;
    private int targety = 0;
    private int jeda = 0;

    public void act() {
       move(2);
        if (isAtEdge()) {
            setLocation(0, getY());
        }

        heroMovement();

        if (jeda > 0)
            jeda--;
        if (jeda == 1)
            getWorld().addObject(new Bullet(), getX() + 100, getY());
        if (jeda == 0)
            jeda = 15;
    }

    public void heroMovement() {
    if (Greenfoot.isKeyDown("D")) {
        setLocation(getX() + 3, getY());
    } else if (Greenfoot.isKeyDown("A")) {
        setLocation(getX() - 3, getY());
    }

    if (Greenfoot.isKeyDown("W")) {
        setLocation(getX(), getY() - 3);
    } else if (Greenfoot.isKeyDown("S")) {
        setLocation(getX(), getY() + 3);
    }
}

    int bulletTimer = 0;

public void shootBullet() {
    if (bulletTimer == 30) {
        Bullet bullet = new Bullet(); 
        getWorld().addObject(
                bullet,
                getX() + 10,
                getY()
        );
        bulletTimer = 0;
    }

    bulletTimer++;
}


    
}
