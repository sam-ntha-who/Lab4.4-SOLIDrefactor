

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MovieApp {

//	In the Movie play() method body, call the interface Play’s play() method 
	

	
		public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean yesOrNo = true;
		int userSelection;
		String response;
		
		ArrayList<Movie> movie = new ArrayList<>(); 

		
	//  [When you create an object of the Movie class 
	//   in the main method, you'll be passing it an object of type Play which will need to be instantiated as either a DVD or a 
	//   VHS. The play() method gets defined in the DVD and VHS classes (because they implement the Play interface).]
		ArrayList<String> divineSecretsOfTheYaYaSisterhoodSceneList = new ArrayList<String>(
				Arrays.asList("Article prints in Time Magazine", "Vivi gets real mad",
						"Sidda gets kidnapped by the Ya-Yas", "All is revealed", "Sidda & Vivi make up"));
		movie.add(new Movie("Divine Secrets of the Ya-Ya Sisterhood", 116, divineSecretsOfTheYaYaSisterhoodSceneList, new VHS()));
		Play vhs1 = new VHS("Divine Secrets of the Ya-Ya Sisterhood");
		movie.get(0).setScenes(divineSecretsOfTheYaYaSisterhoodSceneList);
		
		ArrayList<String> EncantoSceneList = new ArrayList<String>(
				Arrays.asList("We meet the family Madrigal and how not special Mirabel is", "The magic is getting weak",
						"WE DON'T TALK ABOUT BRUNO", "We talk about Bruno", "The magic returns!"));
		movie.add(new Movie("Encanto", 109, EncantoSceneList, new VHS()));
		movie.get(1).setScenes(EncantoSceneList);
		
		ArrayList<String> FreeSoloSceneList = new ArrayList<String>(Arrays.asList(
				"Alex considers climbing the big rock without ropes",
				"We look at Alex's brain to see why he's not afraid", "Everyone else talks about how scary this is",
				"False start, Alex quits part way up because it doesn't feel right",
				"Alex climbs El Capitan without ropes or gear"));
		movie.add(new Movie("Free Solo", 100, FreeSoloSceneList, new VHS()));
		movie.get(2).setScenes(FreeSoloSceneList);
		
		ArrayList<String> AvatarSceneList = new ArrayList<String>(
				Arrays.asList("Jake's twin brother is killed and he decides to take his place on Pandora",
						"Jake learns to pilot a big blue kitty person avatar",
						"Bad guys do bad guy stuff because money", "The baddest guy starts a war he can't finish",
						"Jake is now one of the big blue kitty people forever"));
		movie.add(new Movie("Avatar", 160, AvatarSceneList, new DVD()));
		movie.get(3).setScenes(AvatarSceneList);
	
		ArrayList<String> SoulSceneList = new ArrayList<String>(
				Arrays.asList("Joe gets the gig of his life", "Joe accidentally dies",
						"Joe finds himself in the great before", "Joe and 22 accidentally wind up in the wrong bodies",
						"Joe helps 22 find purpose and grabs life by the horns"));
		movie.add(new Movie("Soul", 100, SoulSceneList, new DVD()));	
		movie.get(4).setScenes(SoulSceneList);

		
		ArrayList<String> TheMatrixSceneList = new ArrayList<String>(Arrays.asList("Neo follows the white rabbit",
				"Red pill or blue pill", "Ope everything is bad, humanity is living in the matrix",
				"Neo learns everything", "Neo saves the day"));
	
		movie.add(new Movie("The Matrix", 139, TheMatrixSceneList, new DVD()));
		movie.get(5).setScenes(TheMatrixSceneList);

		
		
		
		
		System.out.println("Welcome to Sam's BlockBuster!");
		System.out.println("Our selection is unbeatable.");
		do {

		System.out.println("Please select a movie from the list:");
		for (int i = 0; i < movie.size(); i++) {
			System.out.println(i+1 + ". " + movie.get(i).printInfo());	
		}

		

		
		System.out.println("Which Movie would like to watch? Select by number:");
		userSelection = scnr.nextInt();
		int movieChoice = userSelection -1;
		
		if (userSelection <= (movie.size()) && (userSelection != 0)) {
			if (userSelection <= movie.size()) {
				System.out.println("Now Playing: " + movie.get(movieChoice).getTitle());
				
			 movie.get(movieChoice).play();
				
			}
				 
			System.out.println("Would you like to watch another movie? y/n");
			response = scnr.next(); 
		
			
			
			if (response.equalsIgnoreCase("y")) {
				yesOrNo = true;
			} else {
				System.out.println("Thanks for visiting Sam's Blockbuster! Be kind, rewind!");
				yesOrNo = false;
			}
			
			
		} else {
			System.out.println("That is not a valid selection, please try again.");
		}
		} while (userSelection > 6 || userSelection < 1 || yesOrNo == true);
}
	
		
		
}