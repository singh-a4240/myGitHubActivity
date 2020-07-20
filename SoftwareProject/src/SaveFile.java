import java.util.Scanner;

public class SaveFile {
	String fileLocation = "C://SoftwareProject";
	String fileName = "";
	
	public void overrideOriginal(String filename) {
		boolean override = true;
		if(fileLocation.equals(fileLocation)) {
			override = true;
			System.out.println("File Overrided. Saved");
		}
	}
	
	public void saveNew(String location, String name) {
		Scanner myScan = new Scanner(System.in);
		String newLocation = "";
		newLocation = myScan.next(newLocation);
		if(fileLocation.equals(fileLocation)) {
			location = newLocation;
		}
	}
}
