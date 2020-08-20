public class SecondsAndMinutes {

    public static String getDurationString(int minutes, int seconds){
        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)){
            int minsToSeconds = (minutes * 60);
            int durationHours = minsToSeconds / 3600;
            int durationMinutes = ((minsToSeconds) - (durationHours * 3600)) / 60;
            return durationHours + "h : " + durationMinutes + "m : " + seconds + "s";
        } else {
            return "Invalid value.";
        }
    }

    public static String getDurationString(int seconds){
        if (seconds >= 0){
            int durationMinutes = seconds / 60;
            int durationSeconds = seconds - (durationMinutes * 60);
            return getDurationString(durationMinutes, durationSeconds);
        } else {
            return "Invalid value.";
        }
    }

}
