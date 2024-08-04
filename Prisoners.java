package Homework;
// The 100 prisoners dilemma involves 100 prisoners,
// each assigned a unique number from 1 to 100.
// They must find their own number in one of 100 boxes,
// with the restriction of only being able to open up to 50 boxes.
// The prisoners' strategy to maximize their chances of survival
// is to follow a cycle-based approach. Each prisoner starts by opening the box
// corresponding to their number and then continues to open the box whose number is
// found in the previously opened box, up to 50 boxes.
// This approach exploits the cycle structure of permutations to increase the probability of all prisoners finding their number.

public class Prisoners {
    public static void main(String[] args) {
        int[] Prisoners = new int[100];
        int[] Shelves = new int[100];
        // Run the simulation and print the probability of success
        System.out.print(MultSim(Prisoners, Shelves) + "%");
    }

    // Initialize an array with values from 0 to 99

    public static int[] Array_entry(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
    // Randomly shuffle the array

    public static int[] Randomizer() {

        boolean[] BoolTest = new boolean[100];

        int[] Array = new int[100];

        for (int i = 0; i < Array.length; ) {


            Array[i] = (int) (100 * Math.random());
            // Ensure no duplicate values


            if (BoolTest[Array[i]] != true) {

                BoolTest[Array[i]] = true;

                i++;

            }

        }

        return Array;
    }
    // Simulate the prisoners' strategy to find their own number

    public static int Simulation(int[] array1, int[] array2) {

        int var = 0;
        int k;
        for (int i = 0; i < 100; i++) {
            k = i;

            for (int j = 0; j < 50; j++) {
                // Each prisoner tries to find their number within 50 attempts



                if (array1[i] == array2[k]) {
                    var++;
                    break;
                }

                k = array2[k];
            }

        }
        // Check if all prisoners succeeded

        if (var == 100)
            return 1;
        else return 0;

    }
    // Perform multiple simulations to estimate the success rate

    public static double MultSim(int[] array1, int[] array2) {
        double k = 0;
        for (int l = 0; l < 100000; l++) {
            array1 = Array_entry(array1);
            array2 = Randomizer();

            k = k + Simulation(array1, array2);
        }
        // Return the estimated probability of all prisoners succeeding

        return k / 1000;

    }
}