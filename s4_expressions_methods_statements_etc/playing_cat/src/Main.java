public class Main {

    public static void main(String[] args) {
	    boolean catOne = PlayingCat.isCatPlaying(true, 10);
	    boolean catTwo = PlayingCat.isCatPlaying(false, 36);
	    boolean catThree = PlayingCat.isCatPlaying(false, 35);

	    System.out.println(catOne);
	    System.out.println(catTwo);
	    System.out.println(catThree);
    }
}
