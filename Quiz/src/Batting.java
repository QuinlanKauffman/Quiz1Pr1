
public class Batting{
	
	
	private int atBats;
	private int singles;
	private int hits;
	private int doubles;
	private int triples;
	private int homeruns;
	private int walks;
	private int hbp;
	private int sf;
	
	
	public Batting(int iAtBats, int iHits, int iDoubles, int iTriples, int iHomeruns, int iWalks, int iHbp, int iSf)
	{
		atBats = iAtBats;
		hits  = iHits;
		doubles = iDoubles;
		triples = iTriples;
		homeruns = iHomeruns;
		walks = iWalks;
		hbp = iHbp;
		sf= iSf;
		singles = hits - doubles - triples - homeruns;
		
	}
	
	
	public double BA() {
		double a = (double)hits / (double)atBats;
		return (a);
	}
	
	public double OBP() {
		double a = ((double)walks + (double)hits + (double)hbp) / ((double)atBats + (double)walks + (double)hbp + (double)sf);
		return (a);
	}
	
	public double SLG() {
		double a = TB() / (double)atBats;
		return (a);
	}
		
	public double OBS() {
		double a = SLG() + OBP();
		return (a);
	}
	
	public int TB() {
		return (singles + doubles*2 + triples*3 + homeruns*4);
	}
	

}
