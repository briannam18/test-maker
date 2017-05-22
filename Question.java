/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rob Higgins
 */

public class Question {
    
   //defined the difficulty level
   public final int MIN_DIFFICULTY=1;
   public final int MAX_DIFFICULTY=5;
   
   //defined the instance variables
   private String questionText;
   private int points;
   private int difficulty;
   private int answerSpace;
   
   //constructor for Question
   public Question(String qT,int p, int d, int aS) 
   {
       questionText = qT;
       points = p;
       answerSpace = aS;
       //checking for difficulty range
       if(d<MIN_DIFFICULTY||d>MAX_DIFFICULTY)
       {
           throw new RuntimeException("Difficulty not in range");
       }
       difficulty = d;
       
   }

   public String getQuestionText()
   {
       return this.questionText;
   }
   
   public int getDifficulty(){
       return this.difficulty;
   }
   
   //set the points on per answer
   public void setPoints(int points){
       this.points = points;
   }
   
   public int getAnswerSpace()
   {
       return answerSpace;
   }
   
   public int getPoints()
   {
       return points;
   }    
   
   //string representation of question
   public String toString(){
       return questionText;
       
   }
}

