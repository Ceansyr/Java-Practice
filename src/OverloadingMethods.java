public class OverloadingMethods {
    public static void main(String[] args) {
        convertToCentimeters(17);
        convertToCentimeters(5, 4);
        getDurationString(6789);
        getDurationString(123,35);
    }
    // inche to cm
    public static double convertToCentimeters(int inche){
        double cm = inche*2.54;
        System.out.println(cm);
        return 0;
    }
    public static double convertToCentimeters(int feet, int inche){
        int totalHeight = (feet*12)+inche;
        convertToCentimeters(totalHeight);
        return 0;
    }

    // seconds to minutes
    public static void getDurationString(int seconds){
        if (seconds > 0){
            int minutes = (int) Math.floor(seconds/60);
            int remainingSeconds = (int) (seconds%60);
            int hours = (int) Math.floor(minutes/60);
            int remainingMinutes = (int) (minutes%60);
            System.out.println(hours + "h " + remainingMinutes + "m " + remainingSeconds + "s");
        } else {
            System.out.println("Invalid Input");
        }
    }
    public static void getDurationString(int minutes, int seconds){
        int totalTime = (int) (60*minutes + seconds);
        getDurationString(totalTime);
    }
}
