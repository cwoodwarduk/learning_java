public class Main {

    public static void main(String[] args) {
	    String duration = SecondsAndMinutes.getDurationString(1290, 42);
	    System.out.println(duration);

        String durationFromSeconds = SecondsAndMinutes.getDurationString(77442);
        System.out.println(durationFromSeconds);
    }
}
