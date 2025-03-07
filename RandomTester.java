import java.util.Random;
import java.util.ArrayList;

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
    private ArrayList<String> responses;
    
    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        randomGenerator = new Random();
        responses = new ArrayList<>();
        fillResponses();
    }

    private void fillResponses()
    {
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("who knows");
        responses.add("I'll ask my mom");
        responses.add("no idea");
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
    
    public String getRespond()
    {
        int index = randomGenerator.nextInt(3);
        if(index == 0){
            return "yes";
        }
        else if (index == 1){
            return "no";
        }
        else{
            return "maybe";
        }
        
    }
    
    public String getBetterReponses()
    {
        int index = randomGenerator.nextInt(responses.size());
        return responses.get(index);
    }
    
}