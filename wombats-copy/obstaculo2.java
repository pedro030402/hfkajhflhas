import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class obstaculo2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class obstaculo2 extends corredor
{
    /**
     * Act - do whatever the obstaculo2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setLocation(getX()+2,getY());
        if (Limite())
            setLocation(Greenfoot.getRandomNumber(50),Greenfoot.getRandomNumber(400));
            agregar();
            
            
    }
    public void agregar()
    {
        carrera2 mundo= (carrera2)getWorld();
        contador cont=mundo.getcontador();
        cont.addcontar2();
        }
        public Boolean Limite()
    {
        if (getX()>getWorld().getWidth()-10)
            return true;
        else
            return false;
    }
}
