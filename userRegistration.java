import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.Scanner;
class Registration{
	Scanner input =new Scanner(System.in);
	public void firstName(){
		System.out.println("Please Enter FirstName and must contain min 3 charscters :");
		String firstName=input.nextLine();
		String regex="^[A-Z]{1}[a-z0-9]{2}[a-z0-9]+$";

		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(firstName);
		System.out.println("First name "+firstName+" is "+m.matches());
		}
}

public class userRegistration{
	public static void main(String[] args){
		Registration userRegistration=new Registration();
		userRegistration.firstName();
	}
}
