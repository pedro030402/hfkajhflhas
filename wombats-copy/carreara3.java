import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carreara3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carreara3 extends World
{
    contador cont= new contador();
   
    /**
     * Constructor for objects of class carreara3.
     * 
     */
    public carreara3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        createSuelo();
        createSuelo2();
        createSuelo3();
        createSuelo4();
        createSuelo5();
        createSuelo6();
        createSuelo7();
        createSuelo8();
        createObstaculo();
        createObstaculo2();
        createObstaculo3();
        createCorredor();
        createBanan();
        createLava();
        createLava2();
        createLava3();
        createLava4();
        prepare();

    }
    public contador getcontador()
    {
        return cont;
    }
    public void prepare()
    {
        addObject( cont,300,30);
    }
    private void createSuelo() 
    {
        
    
        addObject( new suelo(),80,334);
    }
     private void createSuelo2() 
    {
        addObject( new suelo(),300,334);
    }
    private void createSuelo3() 
    {
        addObject( new suelo2(),80,251);
    }
     private void createSuelo4() 
    {
        addObject( new suelo2(),300,251);
    }
    private void createSuelo5() 
    {
        addObject( new suelo3(),80,172);
    }
     private void createSuelo6() 
    {
        addObject( new suelo3(),300,172);
    }
    private void createSuelo7() 
    {
        addObject( new suelo4(),80,89);
    }
     private void createSuelo8() 
    {
        addObject( new suelo4(),300,89);
    }
    private void createObstaculo() 
    {
        
    
        addObject( new obstaculo3(),0,400);
    }
    private void createObstaculo2() 
    {
        
    
        addObject( new obstaculo3(),0,283);
    }
    private void createObstaculo3() 
    {
        
    
        addObject( new obstaculo3(),0,100);
    }
    private void createCorredor() 
    {
        
    
        addObject( new corredor3(),260,260);
    }
    private void createBanan() 
    {
        
    
        addObject( new banana(),Greenfoot.getRandomNumber(600),Greenfoot.getRandomNumber(400));
    }
    private void createLava() 
    {
        
    
        addObject( new lava(),150,398);
    }
    private void createLava2() 
    {
        
    
        addObject( new lava(),450,398);
    }
    private void createLava3() 
    {
        
    
        addObject( new lava(),150,0);
    }
    private void createLava4() 
    {
        
    
        addObject( new lava(),450,0);
    }
}
