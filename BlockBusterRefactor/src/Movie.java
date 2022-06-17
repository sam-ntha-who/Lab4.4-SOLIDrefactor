

//Movie should no longer be an abstract class, instead swap to a concrete class [We're using 
//composition instead of inheritance. VHS & DVD should implement the Play interface, meaning 
//they can be referenced by type Play.]

import java.util.ArrayList;

public class Movie {

//	Create a Play Property at the top, fill in that property by taking in a parameter in the 
//	constructor [Play is the name of the interface- create a field of type Play and give it 
//	value via the constructor.]

	private Play play;
	private String title;
	private int runTime;
	private ArrayList<String> scenes;
	private int currentTime = 0;
	
	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}

	public Movie(Play play) {
		
	}
	
	public Movie(String title, int runTime, ArrayList<String> scenes, Play play) {
	this.play = play;
	this.title = title;
	this.runTime = runTime;
	this.scenes = scenes;
	
	}

	public void setPlay(Play play) {
		this.play = play;
	}

	public Play getPlay() {
		return play;
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

	public void printScenes() {
		for (String scene : scenes) {
			System.out.println("Scene " + (scenes.indexOf(scene)+1) + ": " + scene);
		}
	}
	public void rewind() {
		setCurrentTime(0);
		System.out.println("\nBe Kind, Rewind");

	}
	
	public void play() {
		play.play(scenes);
//		for (String scene : scenes) {
//			System.out.println("Scene " + (scenes.indexOf(scene)+1) + ": " + scene);
//		}
	}
}