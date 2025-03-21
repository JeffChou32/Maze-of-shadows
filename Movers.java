import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Movers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Movers extends Actor
{
    /**
     * Act - do whatever the Movers wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void moveAround() {
         int x = getX();
    int y = getY();

    if (Greenfoot.isKeyDown("right")) {
        if (getOneObjectAtOffset(4, 0, Walls.class) == null) {
            setLocation(x + 4, y);
        }
    }
    if (Greenfoot.isKeyDown("left")) {
        if (getOneObjectAtOffset(-4, 0, Walls.class) == null) {
            setLocation(x - 4, y);
        }
    }
    if (Greenfoot.isKeyDown("up")) {
        if (getOneObjectAtOffset(0, -4, Walls.class) == null) {
            setLocation(x, y - 4);
        }
    }
    if (Greenfoot.isKeyDown("down")) {
        if (getOneObjectAtOffset(0, 4, Walls.class) == null) {
            setLocation(x, y + 4);
        }
    }
    }
}
