import java.util.Scanner;

public class MainProject {

	public static void main(String[] args) {
		EditFile file = new EditFile();
		SaveFile save = new SaveFile();
		
		printHeader();
		editFile();
		saveFile();
		printThankYou();
	}

	public static void printHeader() {
		for (int i = 0; i < 50; i++){
			System.out.print("*");
		}
		System.out.println();
		System.out.println("*		M U S I C I T Y			*");
		for (int i = 0; i < 50; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void editFile() {
		Scanner myScan = new Scanner(System.in);
		
		String importFile = "Select a file to import\n"
				+ "1. Audio 1\n"
				+ "2. Audio 2\n"
				+ "3. Audio 3\n"
				+ "4. Audio 4\n";
		System.out.println(importFile);
		
		int userEntry = myScan.nextInt();
		switch (userEntry) {
		case 1:
			System.out.println("Audio 1 imported");
			System.out.println("Opening file...");
			System.out.println("File ready to use\n\n");
			System.out.println("working on File..................................................................................................................................................................\n\n\n\n");
			break;
		case 2:
			System.out.println("Audio 2 imported");
			System.out.println("Opening file...");
			System.out.println("File ready to use\n\n");
			System.out.println("working on File..................................................................................................................................................................\n\n\n\n");
			break;
		case 3:
			System.out.println("Audio 3 imported");
			System.out.println("Opening file...");
			System.out.println("File ready to use\n\n");
			System.out.println("working on File..................................................................................................................................................................\n\n\n\n");
			break;
		case 4:
			System.out.println("Audio 4 imported");
			System.out.println("Opening file...");
			System.out.println("File ready to use\n\n");
			System.out.println("working on File..................................................................................................................................................................\n\n\n\n");
			break;

		}
	}
	
	public static void saveFile() {
		Scanner myScan = new Scanner(System.in);
		System.out.println("Save as Original: press o or Save as Separate: press s");
		String userEntry = myScan.nextLine();
		if(userEntry.equals("o")) {
			System.out.println("File saved as original");
		}else if(userEntry.equals("s")) {
			String filename;
			System.out.println("Please enter the name of the file: ");
			filename = myScan.nextLine();
			System.out.println("File saved as " + filename);
		}
	}
	
	public static void printThankYou() {
		for (int i = 0; i < 70; i++) {			
			System.out.print("*");
		}
		System.out.println();
		System.out.println("		Thank you for usign MUSICITY		");
		System.out.println("			Good Bye!			\n");
		for (int i = 0; i < 70; i++) {			
			System.out.print("*");
		}
	}
}
