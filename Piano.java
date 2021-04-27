import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A piano that can be played with the computer keyboard.
 * 
 * @author: M. Kolling
 * @version: 0.1
 */
public class Piano extends World
{
    private String[] whitekeys = 
       {"a","s","d","f","g","h","j","k","i",";","'","\\"};
    private String[] whiteNotes = 
       {"3c","3d","3e","3f","3g","3a","3b","4c","4d","4e","4f","4g"};
    /**
     * Make the piano.
     */
    public Piano() 
   {
        super(800, 340, 1);
        
        int i;
        
        for (i=0;i<whitekeys.length; i++)
        {
            Key key=new Key(whiteKeys[i], whiteNotes[i]+".wav");
            addObject(key,54 + i*63, 140);
      }
   }
} 