public class Test
{
    private Question [] testQuestions;
    
    public Test(Question [] questions)
    {
        testQuestions = questions;
    }
    
    public static void main(String [] args)
    {
        String oq = "What about a woodchuck?";
        ObjectiveQuestion OQ1 = new ObjectiveQuestion(oq, 5, 3, 2, "Huh?");
        
        String fib = "Who will win fantasy baseball?";
        FillInTheBlank FB1 = new FillInTheBlank(fib, 5, 1, 2, "The Closer");
        
        String MC = "Who lives in the pineapple under the sea?";
        String [] pa = {"Peter Griffin", "Scooby Doo", "Spongebob", "Eric Carman"};
        String [] ca = {"Peter Griffin", "Scooby Doo", "*** Spongebob ***", "Eric Carman"};
        MultipleChoice MC1 = new MultipleChoice(MC, 4, 2, 2, pa, ca);
        
        Question [] myQuestions = {OQ1, FB1, MC1};
        Test newTest = new Test(myQuestions);
        System.out.print(newTest.toString());
    }    
    
    public String toString()
    {
       String output = ""; 
       int total = 0;
       String s = "\n";
       
       for(int i = 0; i < testQuestions.length; i++)
       {
           String space = "";
           
           for(int j = 0; j < testQuestions[j].getAnswerSpace(); j++){
                    space += s;
           }
           System.out.println(space);
           output += testQuestions[i].getQuestionText() + space;
           total += testQuestions[i].getPoints();
       } 
       
       return output + "For a total of " + total + " points.";
   }
}