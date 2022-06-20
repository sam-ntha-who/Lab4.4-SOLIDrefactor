import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MovieTest {

	@Test
	void DVDTitleRunTimeTest() {
		ArrayList<String> AvatarSceneList = new ArrayList<String>(
				Arrays.asList("Jake's twin brother is killed and he decideds to take his place on Pandora",
						"Jake learns to pilot a big blue kitty person avatar",
						"Bad guys do bad guy stuff because money", "The baddest guy starts a war he can't finish",
						"Jake is now one of the big blue kitty people forever"));
		// title + runtime + scenes added to second arrayList
		Movie tester = new Movie("Avatar", 160, AvatarSceneList, new DVD());
		String expected = "Avatar, Runtime of: 160 minutes";
		String actual = tester.printInfo();
		assertEquals(expected, actual);

	}

	@Test
	void VHSTitleTest() {

		ArrayList<String> divineSecretsOfTheYaYaSisterhoodSceneList = new ArrayList<String>(
				Arrays.asList("Article prints in Time Magazine", "Vivi gets real mad",
						"Sidda gets kidnapped by the Ya-Yas", "All is revealed", "Sidda & Vivi make up"));
		Movie tester = new Movie("Divine Secrets of the Ya-Ya Sisterhood", 116,
				divineSecretsOfTheYaYaSisterhoodSceneList, new VHS());
		String expected = "Divine Secrets of the Ya-Ya Sisterhood";
		String actual = tester.getTitle();
		assertEquals(expected, actual);

	}

	@Test
	void VHSRunTimeTest() {

		ArrayList<String> divineSecretsOfTheYaYaSisterhoodSceneList = new ArrayList<String>(
				Arrays.asList("Article prints in Time Magazine", "Vivi gets real mad",
						"Sidda gets kidnapped by the Ya-Yas", "All is revealed", "Sidda & Vivi make up"));
		Movie tester = new Movie("Divine Secrets of the Ya-Ya Sisterhood", 116,
				divineSecretsOfTheYaYaSisterhoodSceneList, new VHS());
		int expected = 116;
		int actual = tester.getRunTime();
		assertEquals(expected, actual);

	}

	@Test
	void VHSCurrentTimeTest() {

		ArrayList<String> divineSecretsOfTheYaYaSisterhoodSceneList = new ArrayList<String>(
				Arrays.asList("Article prints in Time Magazine", "Vivi gets real mad",
						"Sidda gets kidnapped by the Ya-Yas", "All is revealed", "Sidda & Vivi make up"));
		Movie tester = new Movie("Divine Secrets of the Ya-Ya Sisterhood", 116,
				divineSecretsOfTheYaYaSisterhoodSceneList, new VHS());
		tester.setCurrentTime(3);
		int expected = 3;
		int actual = tester.getCurrentTime();
		assertEquals(expected, actual);
	}

	@Test
	void VHSPlayTest() {

		ArrayList<String> divineSecretsOfTheYaYaSisterhoodSceneList = new ArrayList<String>(
				Arrays.asList("Article prints in Time Magazine", "Vivi gets real mad",
						"Sidda gets kidnapped by the Ya-Yas", "All is revealed", "Sidda & Vivi make up"));
		Movie tester = new Movie("Divine Secrets of the Ya-Ya Sisterhood", 116,
				divineSecretsOfTheYaYaSisterhoodSceneList, new VHS());
		tester.play();
		// should be 0 as rewind runs as a function of play
		int expected = 0;
		int actual = tester.getCurrentTime();
		assertEquals(expected, actual);

	}

	@Test
	void VHSRewindTest() {
 
		ArrayList<String> divineSecretsOfTheYaYaSisterhoodSceneList = new ArrayList<String>(
				Arrays.asList("Article prints in Time Magazine", "Vivi gets real mad",
						"Sidda gets kidnapped by the Ya-Yas", "All is revealed", "Sidda & Vivi make up"));
		Movie tester = new Movie("Divine Secrets of the Ya-Ya Sisterhood", 116,
				divineSecretsOfTheYaYaSisterhoodSceneList, new VHS());
		tester.setScenes(divineSecretsOfTheYaYaSisterhoodSceneList);
		tester.setCurrentTime(4);
		tester.rewind();
		int expected = 0;
		int actual = tester.getCurrentTime();
		assertEquals(expected, actual);

	}

}
