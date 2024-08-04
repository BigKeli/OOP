package Homework.Containers;

import java.util.ArrayList;

public class Container {
    public ArrayList<Integer> itemsHandler = new ArrayList<Integer>(1);
    public int weight;
    Container(int l) {
        this.weight = l;
    }
    public Boolean addItems(int l){
        if(l>weight)
            return false;
        weight -= l;
        itemsHandler.add(l);
        return true;
    }
    public void getAllItems(){
        for (Integer SingleItem : itemsHandler) {
            System.out.print(SingleItem + " ");
        }}

    public int getRemainingWeight(){
        return weight;
    }
}