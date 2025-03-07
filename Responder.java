import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private Random randomGenerator;
    //private ArrayList<String> responses;
    private HashMap<String,String> responses;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        randomGenerator = new Random();
        //responses = new ArrayList<>();
        responses = new HashMap<>();
        fillResponses();
    }

    private void fillResponses()
    {
        /**responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("who knows");
        responses.add("I'll ask my mom");
        responses.add("no idea");**/
        responses.put("help","yes");
        responses.put("java","I don't know");
        responses.put("joe","mama");
        responses.put("cat","dog");
    }
    
    private String pickDefaultResponse()
    {
        return "no idea, sorry";
    }
    
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String word)
    {
        //return "That sounds interesting. Tell me more...";
        //int index = randomGenerator.nextInt(responses.size());
        String answer = responses.get(word);
        if (answer == null){
            answer = pickDefaultResponse();
        }
        return answer;
    }
}
