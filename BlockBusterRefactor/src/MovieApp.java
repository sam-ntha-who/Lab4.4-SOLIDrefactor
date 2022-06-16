

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MovieApp {


		public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		boolean yesOrNo = true;
		int userSelection;
		String response;
		ArrayList<Movie> movie = new ArrayList<>(); 
		ArrayList<VHS> vhs = new ArrayList<>();
		ArrayList<DVD> dvd = new ArrayList<>();
		ArrayList<String> divineSecretsOfTheYaYaSisterhoodSceneList = new ArrayList<String>(
				Arrays.asList("Article prints in Time Magazine", "Vivi gets real mad",
						"Sidda gets kidnapped by the Ya-Yas", "All is revealed", "Sidda & Vivi make up"));
		//		vhs.add(new VHS("Divine Secrets of the Ya-Ya Sisterhood", 116, divineSecretsOfTheYaYaSisterhoodSceneList));
		Play vhs1 = new VHS("Divine Secrets of the Ya-Ya Sisterhood", 116, divineSecretsOfTheYaYaSisterhoodSceneList);
		movie.add(new Movie(vhs1));
		vhs.add(new VHS("Divine Secrets of the Ya-Ya Sisterhood", 116, divineSecretsOfTheYaYaSisterhoodSceneList));
		ArrayList<String> EncantoSceneList = new ArrayList<String>(
				Arrays.asList("We meet the family Madrigal and how not special Mirabel is", "The magic is getting weak",
						"WE DON'T TALK ABOUT BRUNO", "We talk about Bruno", "The magic returns!"));
		
		Play vhs2 = (new VHS("Encanto", 109, EncantoSceneList));
		movie.add(new Movie(vhs2));
		vhs.add(new VHS("Encanto", 109, EncantoSceneList));
		// arrayList for scenes copypasta
		ArrayList<String> FreeSoloSceneList = new ArrayList<String>(Arrays.asList(
				"Alex considers climbing the big rock without ropes",
				"We look at Alex's brain to see why he's not afraid", "Everyone else talks about how scary this is",
				"False start, Alex quits part way up because it doesn't feel right",
				"Alex climbs El Capitan without ropes or gear"));
		// title + runtime + scenes added to second arrayList
		Play vhs3 = (new VHS("Free Solo", 100, FreeSoloSceneList));
		movie.add(new Movie(vhs3));
		vhs.add(new VHS("Free Solo", 100, FreeSoloSceneList));
		// arrayList for scenes copypasta
		ArrayList<String> AvatarSceneList = new ArrayList<String>(
				Arrays.asList("Jake's twin brother is killed and he decideds to take his place on Pandora",
						"Jake learns to pilot a big blue kitty person avatar",
						"Bad guys do bad guy stuff because money", "The baddest guy starts a war he can't finish",
						"Jake is now one of the big blue kitty people forever"));
		// title + runtime + scenes added to second arrayList
		Play dvd1 = (new DVD("Avatar", 160, AvatarSceneList));
		movie.add(new Movie(dvd1));
		dvd.add(new DVD("Avatar", 160, AvatarSceneList));
		// arrayList for scenes copypasta
		ArrayList<String> SoulSceneList = new ArrayList<String>(
				Arrays.asList("Joe gets the gig of his life", "Joe accidentally dies",
						"Joe finds himself in the great before", "Joe and 22 accidentally wind up in the wrong bodies",
						"Joe helps 22 find purpose and grabs life by the horns"));
		// title + runtime + scenes added to second arrayList
		Play dvd2 = (new DVD("Soul", 100, SoulSceneList));
		dvd.add(new DVD("Soul", 100, SoulSceneList));
		movie.add(new Movie(dvd2));

		// arrayList for scenes copypasta
		ArrayList<String> TheMatrixSceneList = new ArrayList<String>(Arrays.asList("Neo follows the white rabbit",
				"Red pill or blue pill", "Ope everything is bad, humanity is living in the matrix",
				"Neo learns everything", "Neo saves the day"));
		// title + runtime + scenes added to second arrayList
		Play dvd3 = (new DVD("The Matrix", 139, TheMatrixSceneList));
		dvd.add(new DVD("The Matrix", 139, TheMatrixSceneList));
		movie.add(new Movie(dvd3));
		System.out.println("Welcome to Sam's BlockBuster!");
		System.out.println("Our selection is unbeatable.");
		do {

		System.out.println("Please select a movie from the list:");
		for (int i = 0; i < vhs.size(); i++) {
			System.out.println(i+1 + ". " + vhs.get(i).printInfo());	
		}
		for (int i = 0; i < dvd.size(); i++) {
			System.out.println(i+4 + ". " + dvd.get(i).printInfo());	
		}
		

		
		System.out.println("Which Movie would like to watch? Select by number:");
		userSelection = scnr.nextInt();
		int movieChoice = userSelection -1;
		
		if (userSelection <= (movie.size()) && (userSelection != 0)) {
			if (userSelection <= vhs.size()) {
				System.out.println("Now Playing: " + vhs.get(movieChoice).getTitle());
				 movie.get(movieChoice).play();
			} else {
				System.out.println("Now Playing: " + dvd.get(movieChoice - vhs.size()).getTitle());
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