package week05;

public class DynamicSubstring {
    public static void main(String[] args) {

        String searchResult= "result count:12345";
                            //012345678910...
        //substring() method : it takes index location of the char, returns you a new string

        System.out.println(searchResult.substring(13));
        System.out.println(searchResult.substring(13,18));
        System.out.println(searchResult.indexOf(":"));
        int colonIndex=searchResult.indexOf(":");
        System.out.println(searchResult.substring(colonIndex+1));
        
        // in indexOf("") if there are one more than same character?
        String searchResultTwo="username: oscar search result count:12345";
        int firstColon= searchResultTwo.indexOf(":");
        System.out.println("firstColon = " + firstColon);
        int secondColon =searchResultTwo.indexOf(":",firstColon+1);
        System.out.println("secondColon = " + secondColon);
        System.out.println(searchResultTwo.substring(secondColon+1,secondColon+6));
        //secondColon+1: beginning index
        //secondColon+6: ending index
        //Why did we create Dynamic Substring example ? you want to find the index of
        String today = "I coded a lot of [java] today"; // imagine that inside square brackets is dynamic
        // get me the word inside brackets using indexof and substring methods
        String word = today.substring(today.indexOf("[")+1,today.indexOf("]"));
        System.out.println("word = " + word);

    }
}
