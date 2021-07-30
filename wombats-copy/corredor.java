import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class corredor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class corredor extends Actor
{
    /**
     * Act - do whatever the corredor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        checkKeys();
    }
    
    
    private void checkKeys()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(),getY()-3);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+3);
        }
        if(Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+3,getY());
        }
        if(Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-3,getY());
        }
        if( isTouching(obstaculo.class))
        {
         Greenfoot.stop();
        }
        if( isTouching(obstaculo2.class))
        {
         Greenfoot.stop();
        }
        if( isTouching(obstaculo3.class))
        {
         Greenfoot.stop();
        }
        if( isTouching(banana.class))
        {
            removeTouching(banana.class);
            getWorld().addObject(new banana(),Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(1000));
        }
        if( isTouching(lava.class))
        {
         Greenfoot.stop();
        }
    }
    
    
}
