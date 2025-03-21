import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Movers
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Player() {
        getImage().scale(getImage().getWidth(), getImage().getHeight());        
    }
    public void act()
    {
        moveAround();    
        updateFlashlight();
        
    }
    
    private void updateFlashlight()
    {
        // Get player position and rotation
        int x = getX();
        int y = getY();
        int direction = getRotation();

        // Update the light layer through the world
        ((MazeWorld) getWorld()).updateLight(x, y, direction);
    }
}
