import java.util.ArrayList;
import java.util.Scanner;

public class DVD implements Play {
//	Instead of Movie, these should implement the Play interface. Otherwise their play methods 
//	should hold the same functionality: DVD lets you pick any scene, VHS plays whatever scene 
//	you are currently on and rewinds when appropriate
	private String title;
	private int runTime;
	private ArrayList<String> scenes;

	public DVD(String title, int runTime, ArrayList<String> scenes) {
		//	this.play = play;
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
	}
	public DVD(){
		
	}
	
	public DVD(Play play) {
		
	}
	
	@Override
	public void play(ArrayList<String> scenes) {

		System.out.println("Which scene would you like to watch?");
		
		printScenes(scenes);
		System.out.println("Please choose a scene (by number):");
		Scanner scnr = new Scanner(System.in);
		int sceneSelection = scnr.nextInt() - 1;
		System.out.println(scenes.get(sceneSelection));

		boolean yesOrNo = false;
	
		System.out.println("Would you like to watch another scene? y/n");
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
			System.out.println("Would you like to continue watching? y/n");
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRunTime() {
		return runTime;
	}

	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	public ArrayList<String> getScenes() {
		return scenes;
	}

	public void setScenes(ArrayList<String> scenes) {
		this.scenes = scenes;
	}

	public String printInfo() {

		return getTitle() + ", Runtime of: " + getRunTime() + " minutes";
	}

}
