import java.util.ArrayList;
import java.util.Scanner;

public class DVD implements Play{
	// instead of movie, this class should implement the Play interface
		// otherwise the play methods should hold the same functionality as before - DVD lets you pick any scene and play it
		// instead of coming from a property, the play method in DVD should be passed as parameters into the Play() method
	public DVD() {
		
	}
	@Override
	public void play(ArrayList<String> scenes) {
		int sceneSelection = 0;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Which scene would you like to watch?\n");
		printScenes(scenes);
		System.out.println("\nPlease choose a scene (by number):");
	    try {
	    	sceneSelection = scnr.nextInt()-1;
	    	System.out.println(scenes.get(sceneSelection));
	    } catch (IndexOutOfBoundsException e) {
	    	System.out.println("Please choose from the numbers provided.");
	    }
		boolean yesOrNo = false;
		System.out.println("\nWould you like to watch another scene? y/n");
		String response = scnr.next();
		if (response.equalsIgnoreCase("y")) {
			yesOrNo = true;
		} else {
			yesOrNo = false;
		}
		while (yesOrNo == true) {
			System.out.println("Enter the next scene number you would like to see:");
			sceneSelection = scnr.nextInt() - 1;
			
			if (sceneSelection > 5 || sceneSelection < 0) {
				System.out.println("Scene does not exist. Goodbye.");
			}
			
			System.out.println(scenes.get(sceneSelection));
			System.out.println("\nWould you like to continue watching? y/n");
			response = scnr.next();
			if (response.equalsIgnoreCase("y")) {
				yesOrNo = true;
			} else {
				yesOrNo = false;
			}
		} 
		
	}
	
	public void printScenes(ArrayList<String> scenes) {
		
		for (int i = 0; i < scenes.size(); i++) {
			System.out.println("Scene " + (i + 1) + ": " + scenes.get(i));
		}
	}
}
