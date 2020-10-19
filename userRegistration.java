import java.util.regex.Pattern;
import java.util.regex.Matcher;

import java.util.Scanner;
class Registration{
	Scanner input =new Scanner(System.in);
	// First name validation
	public void firstName(){
		System.out.println("Please Enter FirstName and must contain min 3 charscters :");
		String firstName=input.nextLine();
		String regex="^[A-Z]{1}[a-z0-9]{2}[a-z0-9]+$";

		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(firstName);
		System.out.println("First name "+firstName+" is "+m.matches());
		}

	// Last Name validation
			public void lastName(){
		System.out.println("Enter your lastname must have min 3 Character :");
		String lastName=input.nextLine();
		String regex="^[A-Z]{1}[a-z0-9]{2}[a-z0-9]+$";

		Pattern p=Pattern.compile(regex);
		Matcher m=p.matcher(lastName);
		System.out.println("Last Name" +lastName+" is " +m.matches());
		}
	// Email
		   public void email(){
      System.out.println("Enter your Email Id :");
      String lastName=input.nextLine();
      //String regex="^(.+)@(.+)$";
		String regex="^[A-Za-z0-9+_.]+@[A-Za-z0-9+_.]+$";
      Pattern p=Pattern.compile(regex);
      Matcher m=p.matcher(lastName);
      System.out.println("Last Name" +lastName+" is " +m.matches());
      }
	//Mobile Number
		   public void mobile(){
      System.out.println("Enter your Mobile Number :");
      String mobile=input.nextLine();

		String regex="^[0-9]{2} [0-9]{10}+$";
      Pattern p=Pattern.compile(regex);
      Matcher m=p.matcher(mobile);
      System.out.println("Mobile Number +" +mobile+" is : +" +m.matches());
      }
	//password
		public void password(){
      System.out.println("Enter your password must contain min 8 characters :");
      String passWord=input.nextLine();

		String regex="^[A-Za-z0-9]+$";
      Pattern p=Pattern.compile(regex);
      Matcher m=p.matcher(passWord);
      System.out.println("PassWord" +passWord+" is " +m.matches());
      }
	//One upper case
		public void upperCasepassword(){
      System.out.println("Enter your password must contain min 8 characters :");
      String passWord=input.nextLine();

      String regex="^(?=.*[A-Z]).{8,20}$";
      Pattern p=Pattern.compile(regex);
      Matcher m=p.matcher(passWord);
      System.out.println("PassWord " +passWord+" is " +m.matches());
      }
	//One numberic
		public void numberOnepassword(){
      System.out.println("Enter your password must contain min 8 characters :");
      String passWord=input.nextLine();

      String regex="^(?=.*\\d)(?=.*[A-Z]).{8,20}$";
      Pattern p=Pattern.compile(regex);
      Matcher m=p.matcher(passWord);
      System.out.println("PassWord " +passWord+" is " +m.matches());
      }
	//One Special Charcter
		   public void oneSpecialCharacter(){
      System.out.println("Enter your password must contain min 8 characters :");
      String passWord=input.nextLine();

      String regex="^(?=.*\\d)(?=.*[A-Z])(?=.*[@#!$%]).{8,20}$";
      Pattern p=Pattern.compile(regex);
      Matcher m=p.matcher(passWord);
      System.out.println("PassWord " +passWord+" is " +m.matches());
      }
}

public class userRegistration{
	public static void main(String[] args){
		Registration userRegistration=new Registration();
		userRegistration.firstName();
		userRegistration.lastName();
		userRegistration.email();
		userRegistration.password();
		userRegistration.upperCasepassword();
		userRegistration.numberOnepassword();
		userRegistration.oneSpecialCharacter();
	}
}
