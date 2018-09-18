import java.util.Scanner;

public class OverviewClass {

	public static void main(String[] args) {
		
		String name;
		int atBats;
		int hits;
		int doubles;
		int triples;
		int homeruns;
		int runs;
		int walks;
		int hbp;
		int sf;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the name of baseball player: ");
		name = in.nextLine();
		
		System.out.print("Please enter the number of at bats: ");
		atBats = in.nextInt();
	
		System.out.print("Please enter the number of hits: ");
		hits = in.nextInt();
		
		System.out.print("Please enter the number of doubles: ");
		doubles = in.nextInt();
		
		System.out.print("Please enter the number of triples: ");
		triples = in.nextInt();
		
		System.out.print("Please enter the number of home runs: ");
		homeruns = in.nextInt();
		
		System.out.print("Please enter the number of runs: ");
		runs = in.nextInt();
		
		System.out.print("Please enter the number of walks: ");
		walks = in.nextInt();
		
		System.out.print("Please enter the number of times player has been hit by pitch: ");
		hbp = in.nextInt();
		
		System.out.print("Please enter the number of sacrifice flies: ");
		sf = in.nextInt();
		
		Batting sample = new Batting(atBats, hits, doubles, triples, homeruns, walks, hbp, sf);
		// creating new object of 'Batting' class
		
		System.out.println("");
		System.out.println("The batting average for "+name+ " is: "+ sample.BA());
		System.out.println("The on base percentage for "+name+ " is: "+ sample.OBP());
		System.out.println("The slugging percentage for "+name+ " is: "+ sample.SLG());
		System.out.println("The on base plus slugging percentage for "+name+ " is: "+ sample.OBS());
		System.out.println("The total bases for "+name+ " is: "+ sample.TB());
	}

}
