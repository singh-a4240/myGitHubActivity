import java.io.File;

public class EditFile implements ListInterface {


	public void importFile() {
		String fileName = "";
		
		File fn = new File(fileName);
		
		System.out.println("File Name: " + fn.getName());
		System.out.println("File Type: " );
		System.out.print(fileType());
	}
	
	@Override
	public void add(int newPosition, Object newEntry) {
		Object auObject = "Audio 1";
		
	}

	@Override
	public void remove(int givenPosition) {
		
	}
	public boolean fileType() {
		String fileType = "";
		if(!fileType.equals(".mp3") || !fileType.equals(".mp4")) {
			System.out.println("Please import the file again. The selected file type is not an audio file");
		}else {
			System.out.println("File Imported. Have a good time editing the file :)");
		}
		return true;
	}

	@Override
	public void clear() {
	}


	@Override
	public boolean isEmpty() {
		return false;
	}

}
