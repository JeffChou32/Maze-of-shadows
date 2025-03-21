import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy extends Actor
{
    private int speed = 2;
    private int directionChangeInterval = 50; // Change direction every 50 acts
    private int actCounter = 0;
    public enemy() {
        getImage().scale(getImage().getWidth()/2, getImage().getHeight()/2);
    }
    public void act()
    {
        moveRandomly();
    }

    private void moveRandomly()
    {
        // Change direction every few acts
        if (actCounter % directionChangeInterval == 0) {
            int randomDirection = Greenfoot.getRandomNumber(360);
            setRotation(randomDirection);
        }

        // Move in the current direction
        int x = getX();
        int y = getY();
        move(speed);

        // If collided with a wall, move back and pick a new direction
        if (getOneIntersectingObject(Walls.class) != null) {
            move(-speed);  // Move back
            int randomDirection = Greenfoot.getRandomNumber(360); // Change direction
            setRotation(randomDirection);
        }

        actCounter++;
    }
}
