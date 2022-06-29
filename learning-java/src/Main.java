import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;

public class Main {
	
	public static void main(String[] args) {
		 
				
		String [] names = {"Anna", "Ali", "Bob", "Mike"};
		for (String name : names) {
			
			
			if(name.startsWith("A")){
				continue;
			}
			System.out.println(name);
		}
		
		
			
			
	}
	
	

}

