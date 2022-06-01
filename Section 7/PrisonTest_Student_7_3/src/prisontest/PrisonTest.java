package prisontest;

public class PrisonTest {
    public static void main(String[] args) {


Prisoner p01 = new Prisoner("BuBba", 2.08, 4);
Prisoner p02 = new Prisoner("Twitch", 1.73, 3);

        
	System.out.println("Variable: p01");
        System.out.println("Name:     " + p01.name);
        System.out.println("Height:   " + p01.height);
        System.out.println("Sentence: " + p01.sentence);
        
        
	System.out.println("");
        System.out.println("Variable: p02");
        System.out.println("Name:     " + p02.name);
        System.out.println("Height:   " + p02.height);
        System.out.println("Sentence: " + p02.sentence);

    } 
}
