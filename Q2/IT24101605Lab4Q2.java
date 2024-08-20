import java.util.Scanner;
public class IT24101605Lab4Q2{
   public static void main(String[] args){
   
   Scanner input=new Scanner(System.in);
   System.out.print("Please enter exam marks (out of 100): ");
   double examMarks=input.nextDouble();
   
   if (examMarks>100){
   System.out.println("Invalid input for exam marks.Terminating program.");
   System.exit(0);
   }

   System.out.print("Please enter lab submmission marks (out of 100): ");
   double labMark=input.nextDouble();

   System.out.print("Please enter the percentage given for the exam: ");
   double examPercentage=input.nextDouble();

   System.out.print("Please enter the percentage given for the lab submission: ");
   double labPercentage=input.nextDouble();

   if((examPercentage+labPercentage)!=100){
   System.out.println("The percentages must add up to 100. Terminating program.");
   System.exit(0);
   }

   double finalMarks=(examMarks*examPercentage/100)+(labMark*labPercentage/100);
   System.out.println();
   System.out.println("Final Exam Mark is: " + finalMarks);
 }
}