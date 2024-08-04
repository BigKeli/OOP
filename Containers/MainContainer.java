package Homework.Containers;

import java.util.ArrayList;
import java.util.Scanner;
public class MainContainer {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        System.out.print("Enter Nr. Objects: ");
        int allItms = scnr.nextInt();
        ArrayList<Integer> obj = new ArrayList<>(allItms);

        System.out.print("Enter capacity: ");
        int Cap = scnr.nextInt();

        System.out.print("Enter the weight of all objects: ");
        for(int i = 0; i< allItms; i++ ){
            obj.add(scnr.nextInt());
        }
       int[] AllWeights = new int[obj.size()];
        for(int i = 0; i< AllWeights.length; i++){
            AllWeights[i] = (int) obj.get(i);
        }
        System.out.println("Next Fit");
        next_Fit(AllWeights, Cap);
        System.out.println("First Fit");
        firstFit(AllWeights, Cap);
    }
    public static void next_Fit(int[] weights, int cap){
        ArrayList<Container> ContArr = new ArrayList<Container>();
        ContArr.add(new Container(cap));
        int NumberOfContainers =0;

        for (int i : weights) {
            if (ContArr.get(NumberOfContainers).getRemainingWeight() >= i)
                ContArr.get(NumberOfContainers).addItems(i);
            else {
                ContArr.add(new Container(cap));
                NumberOfContainers++;
                ContArr.get(NumberOfContainers).addItems(i);
            }
        }
        for(int i = 0; i< ContArr.size(); i++){
            System.out.print("Container "+(i+1)+" has: ");
            ContArr.get(i).getAllItems();
            System.out.print("\n");
        }
    }
    public static void firstFit(int[]weights, int cap){
        ArrayList<Container> ContainerArr = new ArrayList<Container>();
        int NumberOfContainers =-1;
        for (int k : weights) {
            Boolean ContainerCond = true;
            for (int j = 0; j <= NumberOfContainers; j++) {
                if (ContainerArr.get(j).getRemainingWeight() >= k) {
                    ContainerArr.get(j).addItems(k);
                    ContainerCond = false;
                    j = NumberOfContainers + 1;
                }
            }
            if (ContainerCond) {
                ContainerArr.add(new Container(cap));
                NumberOfContainers++;
                ContainerArr.get(NumberOfContainers).addItems(k);
            }
        }

        for(int i = 0; i< ContainerArr.size(); i++){
            System.out.print("Container "+(i+1)+" has: ");
            ContainerArr.get(i).getAllItems();
            System.out.println("\n");
        }
    }
}