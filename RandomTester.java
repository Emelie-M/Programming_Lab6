import java.util.Random;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random randomGenerator;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        randomGenerator = new Random();
    }

    public void printOneRandom()
    {
        // put your code here
        System.out.println("New random number: " + randomGenerator.nextInt(1000));
    }
    
    public void printMultiRandom(int howMany)
    {
        int index = 0;
        while (index < howMany){
            printOneRandom();
            index++;
        }
    }
}
