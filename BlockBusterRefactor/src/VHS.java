import java.util.ArrayList;

public class VHS implements Play {

	// instead of movie, this class should implement the Play interface
	// otherwise the play methods should hold the same functionality as before - VHS
	// starts from current scene and play through
	// instead of coming from a property, the play method in VHS should be passed as
	// parameters into the Play() method

	private String title;
	private int currentTime;
	
	public VHS() {
		
	}
	@Override
	public void play(ArrayList<String> scenes) {
		for (int i = 0; i < scenes.size(); i++) {
			System.out.println("Scene " + (i + 1) + ": " + scenes.get(i));
		}

		if (scenes.size() < getCurrentTime() + 1) {
			rewind();
		}
	}
	
	
	// A method called rewind() that returns nothing and sets currentTime to 0.
	public void rewind() {
		setCurrentTime(0);
		System.out.println("\nBe Kind, Rewind");
		System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
	}

	public int getCurrentTime() {
		return currentTime;
	}

	public void setCurrentTime(int currentTime) {
		this.currentTime = currentTime;
	}

	public String getTitle() {
		return title;
	}

}
