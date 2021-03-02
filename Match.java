import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class Match {

	public static void main(String[] args) {
		ArrayList<Student> students = new ArrayList<Student>();
		
		System.out.print("\nEnter the name of file to open: ");
		Scanner scan = new Scanner(System.in); 
		String filename = scan.next();
		scan.close();
		
		int lineno = 0;
		
		
		
		System.out.println("Reading the file 1 line at a time ...");
		System.out.println("===========================================");
		try { // TRY it out 
			Scanner input = new Scanner(new FileReader(filename)); 
			
			while(input.hasNextLine()) {
				
				String str = input.nextLine();
				
				String[] parts = str.split("\t");
				
				String name = parts[0];
				char gender = parts[1].charAt(0);
				
				String[] dateParts = parts[2].split("-");
				int day = Integer.parseInt(dateParts[1]);
				int month = Integer.parseInt(dateParts[0]);
				int yr = Integer.parseInt(dateParts[2]);
				
				Date birthDate = new Date(1, 1, 1);
				Preference pref;
				
				
				lineno++;
				
				System.out.println("--------READING-LINE-" + lineno + "--------");
//				students.add(new Student());
//				while(line.hasNext()) {
//					int stage = 1;
//					
//					students.set(stage-1, new Student(line.next()));
//					
//					
//					switch(stage) {
//					case 1: students.set(stage-1, new Student(line.next()));
//						break;
//					case 2: students.set(stage-1, new Student(line.next().charAt(0)));
//						break;
//					case 3: students.set(stage-1, new Student(line.next()));
//						break;
//					case 4:	students.set(stage-1, new Student(line.next()));
//						break;
//					case 5:
//						break;
//					case 6:
//						break;
//					case 7:
//						break;
//					}
//					
//					stage++;
//					
//					
//					
//					//System.out.println(line.next()); // Print each word in line
//				}
			}
			
			input.close();
			System.out.println("===========================================");
		} catch(FileNotFoundException e) { // Catch Error 
			System.out.println(e); 
		} catch(NoSuchElementException e) { // Catch Error 
			System.out.println(e); 
		}
		
		
	}

}
