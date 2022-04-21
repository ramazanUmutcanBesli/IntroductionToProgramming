package week03;

import java.util.ArrayList;

public class GroceryList {// blueprint for all my shopping Lists
    private ArrayList<String> groceryList;
    // this will act like a setter method
    public GroceryList(){
        groceryList=new ArrayList<>();
    }
    public void addGroceryList(String item){
        groceryList.add(item);
    }
    // will act like getter method
    public String toString() {
        String list = "You have "+ groceryList.size()+" items in your grocery List";
        for (int i = 0; i < groceryList.size(); i++) {
            list+="\n"+(i+1)+"."+groceryList.get(i);


        }


        return list;
    }

    public void modifyGroceryItem(int position,String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery Item "+(position+1)+" has been modified");

    }
    public void removeGroceryItem(int position){
        groceryList.remove(position);
        System.out.println("Grocery Item "+(position+1)+" has been removed");
    }
    public String findItem(String searchItem){
        // if you find an item you would be curious of index of the item, return the foundıng item
        String searchResult="Not found";

        int position =groceryList.indexOf(searchItem);
        // if I find item ıt will return index of item, otherwise we will get -1
        if(position>=0){
            searchResult=searchItem+" Item found at "+(position+1);

        }
        return searchResult;

    }

}
