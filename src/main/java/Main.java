import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    // Day 1
    public void findOccurrenceOfInt(){
        System.out.println("Please enter numbers separated by space");
        String[] strArr = scanner.nextLine().split(" ");

        System.out.println("Which numbers occurrence you would like to count?");
        int numToSearch = scanner.nextInt();

        int count = 0;

        for (int i = 0; i < strArr.length; i++) {
            try {
                if (Integer.parseInt(strArr[i]) == numToSearch) count++;
            } catch (NumberFormatException e) {
            }
        }
        System.out.println("Number " + numToSearch + "'s occurrence is: " + count);
    }

    // Day 2
    public static void stripOutFromStr(){
        ArrayList<String> errorFullTexts = new ArrayList<>();
        ArrayList<String> errorMessageTexts = new ArrayList<>();

        //Add the text to the first spot, you can add as many as you would like
        errorFullTexts.add("ValidationError line 23 col 40:'Bad value ius-cors for attribute name on element meta: Keyword ius-cors is not registered.'");

        for(String errorFullText : errorFullTexts){
            errorMessageTexts.add(errorFullText.substring(errorFullText.indexOf(":'")+2, errorFullText.lastIndexOf(".'")));
        }
    }
}
