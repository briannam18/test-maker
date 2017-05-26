/**
 * This class extends Question. It can use the constructor
 * and the methods of the super class to eliminate repetative code.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
// A question on a test that has a definitive answer

class ObjectiveQuestion extends Question
{
    private String correctAnswer;
    
    public ObjectiveQuestion(String qT,int p, int d, int aS, String cA) 
    {
        super(qT, p, d, aS);
        correctAnswer = cA;
    }
     
    public String answerKey()
    {
        return super.toString() + correctAnswer;
    }
    
    public String getAnswer()
    {
        return correctAnswer;
    }
}

