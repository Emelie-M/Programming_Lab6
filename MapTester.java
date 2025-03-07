import java.util.HashMap;

/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private HashMap<String,String> hashMap;

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        // initialise instance variables
        hashMap = new HashMap<>();
        
        enterNumber("Mary","123");
        enterNumber("Jonh","321");
        enterNumber("Will","231");
        enterNumber("Jess","312");
    }

    public void enterNumber(String name, String number)
    {
        // put your code here
        hashMap.put(name, number);
    }
    
    public String lookupNumber(String name)
    {        
        return hashMap.get(name);
    }
}
