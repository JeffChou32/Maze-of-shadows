import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * LightLayer class to create a circular flashlight effect.
 */
public class LightLayer extends Actor
{
    private GreenfootImage overlay;
    private int lightRadius = 150;  // Radius of the circular light
    private int imgTrans = 220;  // Darkness transparency
    private Color darkColor = new Color(0, 0, 0, 220);  // Default darkness color
    private Color lightColor = new Color(0, 0, 0, 0);   // Default transparent color

    private Actor source;

    public LightLayer(Actor actor, int radius)
    {
        source = actor;
        lightRadius = radius;

        int size = lightRadius * 2;
        overlay = new GreenfootImage(size, size);
        updateImage();
    }

    private void updateImage()
    {
        overlay.clear();

        // Create a darkness layer (semi-transparent)
        overlay.setColor(darkColor);
        //overlay.fillRect(0, 0, overlay.getWidth(), overlay.getHeight());

        // Create a transparent circular area (cut out the darkness)
        GreenfootImage mask = new GreenfootImage(overlay.getWidth(), overlay.getHeight());
        mask.setColor(lightColor);  // Fully transparent circle
        mask.fillOval(0, 0, overlay.getWidth(), overlay.getHeight());

        // Apply the mask to create the light effect
        overlay.drawImage(mask, 0, 0);

        setImage(overlay);
    }

    public void act()
    {
        // Follow the player's position
        if (source != null) {
            setLocation(source.getX(), source.getY());
        }
    }

    /**
     * Set the light radius (size of the transparent circle).
     */
    public void setRadius(int radius)
    {
        lightRadius = radius;
        int size = lightRadius * 2;
        overlay = new GreenfootImage(size, size);
        updateImage();
    }

    /**
     * Set the darkness transparency level.
     */
    public void setDarkness(int transparency)
    {
        imgTrans = transparency;
        darkColor = new Color(darkColor.getRed(), darkColor.getGreen(), darkColor.getBlue(), transparency);
        updateImage();
    }

    /**
     * Set the darkness color.
     */
    public void setDarkColor(Color color)
    {
        darkColor = new Color(color.getRed(), color.getGreen(), color.getBlue(), imgTrans);
        updateImage();
    }

    /**
     * Set the light color (transparency color).
     */
    public void setLightColor(Color color)
    {
        lightColor = color;
        updateImage();
    }
}