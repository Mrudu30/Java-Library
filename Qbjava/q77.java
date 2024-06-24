// Assume a runner runs 15 kilometers in 50 minutes and 30 seconds. Write a program that displays the average speed in miles per hour. (Note that 1 mile is 1.6 kilometers.)
import java.text.DecimalFormat;
public class q77{
    public static void main(String[] args) {
        float distance = 15;
        double distance_miles = distance / 1.6;
        int minutes = 50;
        int seconds = 30;
        double total_time = ((minutes*60)+seconds)/3600.0;
        double averageSpeedMph  =  distance_miles/total_time;
        DecimalFormat df = new DecimalFormat("#.##");
        String roundedAverageSpeed = df.format(averageSpeedMph);
        System.out.println("The Average Speed in Miles per Hour is: "+roundedAverageSpeed);
    }
}