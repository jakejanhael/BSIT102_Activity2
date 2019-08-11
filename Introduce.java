														
														//Jake Janhael Hapita
import java.util.Scanner;

public class Introduce {
    
    public static void main(String[] args) {
    	
    		Scanner sn = new Scanner(System.in);
    		
    		//Name
    		System.out.println("What is your name: ");
    		String name = sn.nextLine();
    		   		
    		//Section
    		System.out.println("What is your section? ");
    		String section = sn.nextLine();
    		
    		//Address
    		System.out.println("Where do you live? ");
    		String address = sn.nextLine();
    		
    		//Contact
    		System.out.println("What is your Contact number? ");
    		String contact = sn.nextLine();
    		
    		System.out.println("Hi! I'm " + name + " from " + section + ". I live in " + address + " and you can contact me at my mobile number " + contact);
    		
    		
    		
    		
    		
    		
    }
}
