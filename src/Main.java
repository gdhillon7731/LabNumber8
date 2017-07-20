import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //welcome prompt
        System.out.println("Welcome to the Batting Average Calculator!");
        //Asking user input for number of times ar bat
        String answer = "y";

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
                System.out.print("Result for at bat " + i + ":");
                int basesEarned = input.nextInt();


                array[i] = basesEarned;
                sum = sum + array[i];
                batting = basesEarned;

                if (i > 0 && i <= 4) {
                    battingAve = array[i];

                }


            }

            System.out.println("Batting average: " + (num / battingAve));
            System.out.println("Slugging Percentage: " + (sum / num));

            System.out.println("Another batter? (y/n)");
            answer = input.nextLine();


        }
        while (answer.equalsIgnoreCase("y"));
    }
}


//        Scanner input = new Scanner(System.in);
//        //Read user  input.
//        System.out.println("How many numbers do you want to enter?");
//        int num = input.nextInt();
//        int array[] = new int[num];
//        System.out.println("Enter the " + num + " numbers now.");
//        for (int i = 0 ; i < array.length; i++ )
//        {
//        array[i] = input.nextInt();
//        }
