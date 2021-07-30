import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lava here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lava extends corredor
{
    /**
     * Act - do whatever the lava wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Limite())
            setLocation(0,0);
    }
    public Boolean Limite()
    {
        if (getX()>getWorld().getWidth()-10)
            return true;
        else
            return false;
    }
}
