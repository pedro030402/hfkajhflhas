import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class banana extends corredor
{
    /**
     * Act - do whatever the banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()+5,getY());
        if (Limite())
            setLocation(Greenfoot.getRandomNumber(1000),Greenfoot.getRandomNumber(1000));
            
            
    }
    public Boolean Limite()
    {
        if (getX()>getWorld().getWidth()-10)
            return true;
        else
            return false;
    }
    }

