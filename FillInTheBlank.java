/**
 * We could have extended the ObjectiveQuestion class but
 * I think for structure we should keep it as you have it.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

//Provide a question with a blank
class FillInTheBlank extends Question
{
    private String correctAnswer;
    
    public FillInTheBlank(String qT,int p, int d, int aS, String cA) 
    {
        super(qT, p, d, aS);
        correctAnswer = cA;
    }
     
    public String answerKey()
    {
        return correctAnswer + super.toString();
    }
    public String getAnswer()
    {
        return correctAnswer;
    }
}
