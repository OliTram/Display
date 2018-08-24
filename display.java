import java.util.Scanner;

public class display {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter your name : ");
		String name = reader.next();
		System.out.println("Enter your nickname : ");
                String nickname = reader.next();
		System.out.println("Enter your address : ");
                String address = reader.next();


		System.out.println(" your name is : " + name + " your nickname is : " + nickname + " and your address" + address);
	}

}

