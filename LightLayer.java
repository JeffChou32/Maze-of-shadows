import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * LightLayer class to create a circular flashlight effect.
 */
public class LightLayer extends Actor
{
    private GreenfootImage overlay;
    private int lightRadius = 100;  // Radius of the transparent light circle

    public LightLayer(int worldWidth, int worldHeight)
    {
        // Load the pre-made darkness image
        //overlay = new GreenfootImage("darkness.png");
        //overlay.scale(worldWidth, worldHeight);
        //setImage(overlay);
    }

    public void updateLight(int x, int y, int direction)
    {
        // Update the position of the light layer to follow the player
        //setLocation(x, y);
    }
}