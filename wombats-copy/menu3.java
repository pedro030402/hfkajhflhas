import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu3 extends World
{
    
 punto punto= new punto();
    private int opcion=0;
public menu3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        hacerMenu3();
    }
    private void hacerMenu3(){
        addObject(new gameover(),300,30);
        addObject(new volverj(),400,250);
        addObject(new salir(),400,350);
        addObject(punto,275,250);
        
    }
    public void act(){ 
        if (Greenfoot. isKeyDown("UP")&& opcion!=0) {opcion++;}
        if (Greenfoot. isKeyDown("DOWN")&& opcion!=1) {opcion--;}
        
        if (opcion>=2) opcion=0;
        if (opcion<0)opcion=1;
        
        punto.setLocation(275,250 +(opcion*100));
        
        if (Greenfoot.isKeyDown("SPACE")){ 
            switch(opcion){ 
                case 0:
                    Greenfoot.setWorld(new menu2());
                    break;
                case 1:
                    Greenfoot.stop();
                    break;
                }
            }
        
                
    }
}
