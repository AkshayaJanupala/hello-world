import java.sql.SQLOutput;
import java.util.Scanner;

public class Conditional {
     public static void main(String[] args) {
         int age=20;
         if (age>=16){
             System.out.println("Major");
         }
         else{
             System.out.println("Minor");
         }

         Scanner input=new Scanner(System.in);
         System.out.println("please enter your marks ");
         int score=input.nextInt();
         if(score>=70){
             System.out.println("Grade A");}
         else if (score<70 && score>=50){
             System.out.println("Grade B");}
         else if (score>50 && score>=35){
             System.out.println("Grade C");}
         else{
             System.out.println("Fail");
       }

     }
 }
