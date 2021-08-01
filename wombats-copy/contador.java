import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color.*;
/**
 * Write a description of class counter here.
 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class contador extends Actor
{
    int contar=0;
    /**
     * Act - do whatever the counter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(new GreenfootImage("contador: "+ contar, 50, Color.GREEN, Color.BLACK));
    }
    public void addcontar()
    {
        contar=contar+5000;
    }
    public void addcontar2()
    {
        contar++;
    }
}
