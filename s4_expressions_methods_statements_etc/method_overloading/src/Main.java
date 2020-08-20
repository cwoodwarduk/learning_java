public class Main {

    // Method overloading is a feature that allows us to have
    // more than one method with the same name, so long as we
    // use different parameters.

    // The ability to create multiple methods of the same name
    // but with different implementations.

    // Calls to an overloaded method will run a specific
    // implementation of that method.

    // In the example of the calculateScore method we have
    // implementations with 0, 1 and 2 parameters.

    // In Java, method overloading is considered good practice
    // to avoid having to memorise the names of methods that have
    // more or less identical functionality.

    // e.g. having differently-named methods whose functionality
    // is to add int parameters together and return the result.
    // Rather than having tons of methods with different names
    // doing more or less the same thing, just give them all the same
    // name and alter the number of parameters required.

    // ex. the println() method in Java is actually 10 methods
    // with the same name - one for each datatype.


    public static void main(String[] args) {
//        int newScore = calculateScore("Calum", 500);
//        System.out.println("New score is " + newScore);
//        calculateScore(200);
//        calculateScore();

        double conversionFtIn = calcFeetAndInchesToCentimeters(6, 2);
        System.out.println(conversionFtIn);

        double conversionIn = calcFeetAndInchesToCentimeters(74);
        System.out.println(conversionIn);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    // Overloaded method with only one param rather than two
    public static int calculateScore(int score){
        System.out.println("Player scored " + score + " points.");
        return score * 1000;
    }

    // Overloaded method with no params
    public static int calculateScore(){
        System.out.println("No player name, no player score.");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if ((feet >= 0) && (inches >= 0 && inches <=12)){
            return ((feet * 30.48) + (inches * 2.54));
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if (inches >= 0){
            int feet = inches / 12;
            int remainingInches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return -1;
        }
    }

}
