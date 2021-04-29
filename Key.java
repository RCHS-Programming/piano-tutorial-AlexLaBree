import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

public class Key extends Actor
{
    private boolean isDown;
    private String key;
    private String sound;
    private String upImage;
    private String downImage;
    /**
     * Create a new key.
     */
    public Key(String keyName, String soundFile, String img1, String img2)
    { 
       isDown=false;
       key=keyName;
       sound=soundFile;
       upImage= img1;
       downImage= img2;
       setImage( upImage );
       isDown=false;
    }

    /**
     * Do the action for this key.
     */
    public void act()
    {

        if(!isDown&&Greenfoot.isKeyDown("key"))
        {
            setImage("white-key-down.png");
            play ();
            isDown=true;
        }
        if(isDown&&!Greenfoot.isKeyDown("key"))
        {
            setImage("white-key.png");
            isDown = false;
        }
        
        if( !isDown&&Greenfoot.isKeyDown(key))
        {
            setImage(downImage);
            play();
            isDown=true;
        }
        if( isDown&&!Greenfoot.isKeyDown(key))
        {
            setImage(upImage);
            isDown=false;
        }
    }
    
    /*
     * Play the note of this key
     */
    public void play()
    {
        Greenfoot.playSound("sound");
    }
}   
     