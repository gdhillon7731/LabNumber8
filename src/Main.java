import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //welcome prompt
        System.out.println("\nWelcome to the Batting Average Calculator!");
        //Asking user input for number of times ar bat
        String answer = "y";
        int bases = 0;
        double earnedBase = 0.000;

        do {
            System.out.print("\nEnter number of times at bat:\n");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();

            Double sum = 0.0;
            int batting = 0;
            double battingAve = 0;
            int i = 0;
            int array[] = new int[num];


            System.out.println("0==out, 1==single, 2==double, 3==triple, 4==home run");


            for (i = 0; i < array.length; i++) {
                System.out.print("Result for at bat " + (i + 1) + ":");
                int basesEarned = input.nextInt();
                input.nextLine();

                array[i] = basesEarned;
                sum = sum + array[i];


                bases += array[i];
                if (array[i] > 0) {
                    earnedBase++;
                }

            }

            System.out.println("Batting average: " + (earnedBase / num));
            System.out.println("Slugging Percentage: " + (sum / num));

            System.out.println("Another batter? (y/n)");
            answer = input.nextLine();


        }
        while (answer.equalsIgnoreCase("y"));
    }
}

