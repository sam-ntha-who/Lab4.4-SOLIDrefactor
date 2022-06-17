import java.util.ArrayList;

public class VHS implements Play {

//	Instead of Movie, these should implement the Play interface. Otherwise their play methods 
//	should hold the same functionality: DVD lets you pick any scene, VHS plays whatever scene 
//	you are currently on and rewinds when appropriate	
	Play play;
	private int currentTime = 0;
	private String title;
	private int runTime;
	private ArrayList<String> scenes;

	public VHS(String title) {
	//	this.play = play;
		this.title = title;
	

	}
	public VHS(Play play) {
		
	}
	public Play getPlay() {
		return play;
	}
	public void setPlay(Play play) {
		this.play = play;
	}
	public VHS(){
		
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

	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}

//	Instead of coming from a property, the scenes in VHS and DVD should be passed in a 
//	parameter to the Play() method
	@Override
	public void play(ArrayList<String> scenes) {
	
		for (int i = 0; i < scenes.size(); i++) {
			System.out.println("Scene " + (i+1) + ": " + scenes.get(getCurrentTime()));
			currentTime++;

			if (scenes.size() < currentTime + 1) {
				rewind();
			}
		}

	}

//	A method called rewind() that returns nothing and sets currentTime to 0. 
	public void rewind() {
		setCurrentTime(0);
		System.out.println("\nBe Kind, Rewind");

	}

//	public String printInfo() {
//		
//		return getTitle() + ", Runtime of: " + getRunTime() + " minutes";
//	}
}
