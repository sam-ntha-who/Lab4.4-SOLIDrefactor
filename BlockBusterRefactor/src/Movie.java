import java.util.ArrayList;

public class Movie {
	// According to SOLID principles - each method should be responsible for one
	// thing
	// this method is responsible for the object movie and creating instances of it

	// [When you create an object of the Movie class
	// in the main method, you'll be passing it an object of type Play which will
	// need to be instantiated as either a DVD or a
	// VHS. The play() method gets defined in the DVD and VHS classes (because they
	// implement the Play interface).]

	private Play play;
	private String title;
	private int runTime;
	private ArrayList<String> scenes;

	private int currentTime = 0;

	public Movie() {

	}

	public Movie(String title, int runTime, ArrayList<String> scenes, Play play) {
		this.title = title;
		this.runTime = runTime;
		this.scenes = scenes;
		this.play = play;
	}

	public void printScenes() {
		for (String scene : scenes) {
			System.out.println("Scene " + (scenes.indexOf(scene) + 1) + ": " + scene);
		}
	}

	public String printInfo() {

		return getTitle() + ", Runtime of: " + getRunTime() + " minutes";
	}

	public String getTitle() {
		return title;
	}

	public int getRunTime() {
		return runTime;
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

	public void play() {
		play.play(scenes);
	}
	public void rewind() {
		setCurrentTime(0);
	}

	
}
