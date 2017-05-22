/**
 * This class extends Question. It can use the constructor
 * and the methods of the super class to eliminate repetative code.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// A question on a test that has a definitive answer

class MultipleChoice extends Question
{
    private String [] possibleAnswers;
    private String [] correctAnswer;
    
    public MultipleChoice(String qT,int p, int d, int aS, String [] pA, String [] cA) 
    {
        super(qT, p, d, aS);
        possibleAnswers = pA;
        correctAnswer = cA;
    }
     
    public String getQuestionText()
    {
        String output = "";
        for(String s: possibleAnswers)
            output += s + "\n";
        
        return super.toString() + "\n" + output;
    }
    
    public String answerKey()
     {
        String output = "";
        for(String s: correctAnswer)
            output += s + "/n";
        
        return super.toString() + "/n" + output;
    }
        
}