import greenfoot.*;

public class Enemy extends Actor {
    protected int speed = 7; // Access Modifier: protected

    public Enemy() {
        turn(360); // Berubah ke arah kiri
    }

    public Enemy(int EnemySpeed) {
        speed = EnemySpeed;
        turn(360); // Berubah ke arah kiri
    }

    public void act() {
        setLocation(getX() - speed, getY()); // Bergerak ke arah kiri dengan kecepatan speed
        
        if (isAtEdge()) {
            getWorld().removeObject(this);
        }
    }
}
