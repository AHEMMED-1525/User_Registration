import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.Scanner;
class Registration{
   Scanner input =new Scanner(System.in);
   public void email(){
      System.out.println("Enter your Email Id :");
      String lastName=input.nextLine();
      //String regex="^(.+)@(.+)$";
		String regex="^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
      Pattern p=Pattern.compile(regex);
      Matcher m=p.matcher(lastName);
      System.out.println("Last Name" +lastName+" is " +m.matches());
      }
}

public class userRegistration{
   public static void main(String[] args){
      Registration userRegistration=new Registration();

      userRegistration.email();
   }
}


