import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class suelo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class suelo2 extends Actor
{
    /**
     * Act - do whatever the suelo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()+2,getY());
        if (Limite())
            setLocation(80,251);
            
    }
    public Boolean Limite()
    {
        if (getX()>getWorld().getWidth()-10)
            return true;
        else
            return false;
    }
}
