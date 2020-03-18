package com.syntax.class04;

public class NestingElseIfs {

	public static void main(String[] args) {
		
		/* is the student completed a quiz we will check for a score 
		 * is score >90 -->great job 
		 * if score >80 -->well done 
		 * is score >70 --> you could have done better 
		 * 
		 * is student did not completed the quiz -->not good 
		 * please do homework ontime 
		 */
		
	
		boolean quizCompleted=false;
		int score=86;
		
		if(score>90) {
			System.out.println("Great job,you study a lot ");
		}else if (score>80) {
			System.out.println("Well done");
		}else if (score>70) {
			System.out.println("You could have done better");
		}else {
			System.out.println("You failed");
		
        } else {
			System.out.println("Please do Homework on time");
		}
		
        }
}
