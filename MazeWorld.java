import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Maze here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MazeWorld extends World
{

    private LightLayer lightLayer;
    public MazeWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
        
        
    }
    
    
    private void prepare()
    {
        
        Walls walls = new Walls();
        addObject(walls,2*50,11*50);
        Walls walls2 = new Walls();
        addObject(walls2,2*50,10*50);
        Walls walls3 = new Walls();
        addObject(walls3,2*50,9*50);
        Walls walls4 = new Walls();
        addObject(walls4,2*50,8*50);
        walls.setLocation(1*50,11*50);
        walls2.setLocation(2*50,10*50);
        walls2.setLocation(1*50,10*50);
        walls3.setLocation(1*50,9*50);
        walls4.setLocation(1*50,8*50);
        Walls walls5 = new Walls();
        addObject(walls5,0,6*50);
        Walls walls6 = new Walls();
        addObject(walls6,1*50,6*50);
        Walls walls7 = new Walls();
        addObject(walls7,2*50,6*50);
        Walls walls8 = new Walls();
        addObject(walls8,3*50,11*50);
        Walls walls9 = new Walls();
        addObject(walls9,3*50,10*50);
        Walls walls10 = new Walls();
        addObject(walls10,3*50,9*50);
        Walls walls11 = new Walls();
        addObject(walls11,3*50,8*50);
        Walls walls12 = new Walls();
        addObject(walls12,4*50,8*50);
        Walls walls13 = new Walls();
        addObject(walls13,4*50,7*50);
        Walls walls14 = new Walls();
        addObject(walls14,4*50,6*50);
        Walls walls15 = new Walls();
        addObject(walls15,4*50,5*50);
        Walls walls16 = new Walls();
        addObject(walls16,4*50,4*50);
        Walls walls17 = new Walls();
        addObject(walls17,3*50,4*50);
        Walls walls18 = new Walls();
        addObject(walls18,2*50,4*50);
        Walls walls19 = new Walls();
        addObject(walls19,1*50,4*50);
        Walls walls20 = new Walls();
        addObject(walls20,1*50,3*50);
        Walls walls21 = new Walls();
        addObject(walls21,1*50,1*50);
        Walls walls22 = new Walls();
        addObject(walls22,2*50,1*50);
        Walls walls23 = new Walls();
        addObject(walls23,3*50,1*50);
        Walls walls24 = new Walls();
        addObject(walls24,4*50,1*50);
        Walls walls25 = new Walls();
        addObject(walls25,3*50,2*50);
        Walls walls26 = new Walls();
        addObject(walls26,4*50,3*50);
        Walls walls27 = new Walls();
        addObject(walls27,6*50,0);
        Walls walls28 = new Walls();
        addObject(walls28,6*50,1*50);
        Walls walls29 = new Walls();
        addObject(walls29,6*50,3*50);
        Walls walls30 = new Walls();
        addObject(walls30,6*50,4*50);
        Walls walls31 = new Walls();
        addObject(walls31,6*50,5*50);
        Walls walls32 = new Walls();
        addObject(walls32,7*50,3*50);
        Walls walls33 = new Walls();
        addObject(walls33,8*50,3*50);
        Walls walls34 = new Walls();
        addObject(walls34,8*50,2*50);
        Walls walls35 = new Walls();
        addObject(walls35,8*50,1*50);
        Walls walls36 = new Walls();
        addObject(walls36,9*50,1*50);
        Walls walls37 = new Walls();
        addObject(walls37,10*50,1*50);
        Walls walls38 = new Walls();
        addObject(walls38,6*50,6*50);
        Walls walls39 = new Walls();
        addObject(walls39,5*50,8*50);
        Walls walls40 = new Walls();
        addObject(walls40,6*50,8*50);
        Walls walls41 = new Walls();
        addObject(walls41,7*50,6*50);
        Walls walls42 = new Walls();
        addObject(walls42,8*50,6*50);
        Walls walls43 = new Walls();
        addObject(walls43,8*50,7*50);
        Walls walls44 = new Walls();
        addObject(walls44,8*50,8*50);
        Walls walls45 = new Walls();
        addObject(walls45,8*50,9*50);
        Walls walls46 = new Walls();
        addObject(walls46,7*50,9*50);
        Walls walls47 = new Walls();
        addObject(walls47,11*50,3*50);
        Walls walls48 = new Walls();
        addObject(walls48,10*50,3*50);
        Walls walls49 = new Walls();
        addObject(walls49,11*50,5*50);
        Walls walls50 = new Walls();
        addObject(walls50,10*50,5*50);
        Walls walls51 = new Walls();
        addObject(walls51,9*50,7*50);
        Walls walls52 = new Walls();
        addObject(walls52,10*50,7*50);
        Walls walls53 = new Walls();
        addObject(walls53,11*50,9*50);
        Walls walls54 = new Walls();
        addObject(walls54,10*50,9*50);
        Walls walls55 = new Walls();
        addObject(walls55,8*50,11*50);
        Walls walls56 = new Walls();
        addObject(walls56,7*50,11*50);
        Walls walls57 = new Walls();
        addObject(walls57,6*50,11*50);
        Walls walls58 = new Walls();
        addObject(walls58,10*50,11*50);
        Walls walls59 = new Walls();
        addObject(walls59,11*50,11*50);
        Walls walls60 = new Walls();
        addObject(walls60,49,599);
        Walls walls61 = new Walls();
        addObject(walls61,149,599);
        Walls walls62 = new Walls();
        addObject(walls62,299,597);
        Walls walls63 = new Walls();
        addObject(walls63,399,598);
        Walls walls64 = new Walls();
        addObject(walls64,501,598);
        Walls walls65 = new Walls();
        addObject(walls65,597,549);
        Walls walls66 = new Walls();
        addObject(walls66,598,449);
        Walls walls67 = new Walls();
        addObject(walls67,597,250);
        Walls walls68 = new Walls();
        addObject(walls68,598,150);
        Walls walls69 = new Walls();
        addObject(walls69,596,199);
        Walls walls70 = new Walls();
        addObject(walls70,449,597);
        Walls walls71 = new Walls();
        addObject(walls71,250,596);
        Walls walls72 = new Walls();
        addObject(walls72,198,596);
        Walls walls73 = new Walls();
        addObject(walls73,597,398);
        Walls walls74 = new Walls();
        addObject(walls74,597,347);
        Walls walls75 = new Walls();
        addObject(walls75,598,297);
        Walls walls76 = new Walls();
        addObject(walls76,598,98);
        Player player = new Player();
        addObject(player,99,573);
        enemy enemy = new enemy();
        addObject(enemy,393,221);
        enemy enemy2 = new enemy();
        addObject(enemy2,234,477);
        lightLayer = new LightLayer(player, 150);  // 150 radius
        addObject(lightLayer, player.getX(), player.getY());

        // Set paint order to show the player over the light
        setPaintOrder(Player.class, LightLayer.class);
    }
}
