import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.Scanner;
class Registration{
   Scanner input =new Scanner(System.in);
   public void mobile(){
      System.out.println("Enter your Mobile Number :");
      String mobile=input.nextLine();

		String regex="^[0-9]{2} [0-9]{10}+$";
      Pattern p=Pattern.compile(regex);
      Matcher m=p.matcher(mobile);
      System.out.println("Mobile Number +" +mobile+" is : +" +m.matches());
      }
}

public class userRegistration{
   public static void main(String[] args){
      Registration userRegistration=new Registration();

      userRegistration.mobile();
   }
}
