import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstaculo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstaculo extends corredor
{
    /**
     * Act - do whatever the obstaculo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
        setLocation(getX()+2,getY());
        if (Limite())
            setLocation(0,Greenfoot.getRandomNumber(600));
            
            
    }
    public Boolean Limite()
    {
        if (getX()>getWorld().getWidth()-10)
            return true;
        else
            return false;
    }
    }
