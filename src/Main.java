//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        //A program that uses home maintenance costs for each of the four seasons and returns the total yearly maintenance costs.
        // Again, be clear in the output by echoing the values for the seasonal costs when you display the combined total.

        double homeCostSummer = 150;
        double homeCostWinter = 250;
        double homeCostSpring = 100;
        double homeCostFall = 125;
        double homeMaintenanceCost = 0;
        homeMaintenanceCost = homeCostWinter + homeCostSpring + homeCostFall + homeCostSummer;

        System.out.println("The total home maintenance cost is $" + homeMaintenanceCost + ", given that your summer cost is $" +
                homeCostSummer + ", winter cost is $" + homeCostWinter + ", spring cost is $" + homeCostSpring +
                ", and your fall cost is $" + homeCostFall);
   }
}