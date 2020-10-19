import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.Scanner;
class Registration{
   Scanner input =new Scanner(System.in);
	public void lastName(){
		System.out.println("Enter your lastname must have min 3 Character :");
		String lastName=input.nextLine();
		String regex="^[A-Z]{1}[a-z0-9]{2}[a-z0-9]+$";

		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(lastName);
		System.out.println("Last Name" +lastName+" is " +m.matches());
		}
}

public class userRegistration{
   public static void main(String[] args){
      Registration userRegistration=new Registration();

		userRegistration.lastName();
   }
}
