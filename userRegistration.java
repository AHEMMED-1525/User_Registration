import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.Scanner;
class Registration{
   Scanner input =new Scanner(System.in);
   public void upperCasepassword(){
      System.out.println("Enter your password must contain min 8 characters :");
      String passWord=input.nextLine();

      String regex="^(?=.*[A-Z]).{8,20}$";
      Pattern p=Pattern.compile(regex);
      Matcher m=p.matcher(passWord);
      System.out.println("PassWord " +passWord+" is " +m.matches());
      }
}

public class userRegistration{
   public static void main(String[] args){
      Registration userRegistration=new Registration();

      userRegistration.upperCasepassword();
   }
}
