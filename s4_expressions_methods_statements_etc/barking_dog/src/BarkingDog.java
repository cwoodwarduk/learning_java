public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay){

        // My first attempt (passes)

//        if (barking && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23))){
//            return true;
//        } else {
//            return false;
//        }

        // Simplified
        return barking && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay == 23));
    }

}
