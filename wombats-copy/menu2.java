import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menu2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menu2 extends World
{
    punto punto= new punto();
    private int opcion2=0;

    /**
     * Constructor for objects of class menu.
     * 
     */
    public menu2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        hacerMenu2();
    }
    private void hacerMenu2(){
        addObject(new dificultad1(),400,50);
        addObject(new dificultad2(),400,150);
        addObject(new dificultad3(),400,250);
        addObject(punto,275,50);
        
    }
    public void act(){ 
        if (Greenfoot. isKeyDown("UP")&& opcion2!=0) {opcion2--;}
        if (Greenfoot. isKeyDown("UP")&& opcion2!=1) {opcion2--;}
        if (Greenfoot. isKeyDown("DOWN")&& opcion2!=1) {opcion2++;}
        if (Greenfoot. isKeyDown("DOWN")&& opcion2!=2) {opcion2++;}
        
        if (opcion2>=3) opcion2=1;
        if (opcion2<0)opcion2=0;
        
        
        punto.setLocation(275,50 +(opcion2*100));
        
        if (Greenfoot.isKeyDown("enter")){ 
            switch(opcion2){ 
                case 0:
                    Greenfoot.setWorld(new carrera());
                    break;
                case 1:
                    Greenfoot.setWorld(new carrera2());
                    break;
                case 2:
                    Greenfoot.setWorld(new carreara3());
                    break;
                }
            }
        
        }      
    }
