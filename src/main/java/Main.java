import java.util.*;

public class Main {

    Scanner scanner = new Scanner(System.in);

    // Day 1
    public void findOccurrenceOfInt() {
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
    public static void stripOutFromStr() {
        ArrayList<String> errorFullTexts = new ArrayList<>();
        ArrayList<String> errorMessageTexts = new ArrayList<>();

        //Add the text to the first spot, you can add as many as you would like
        errorFullTexts.add("ValidationError line 23 col 40:'Bad value ius-cors for attribute name on element meta: Keyword ius-cors is not registered.'");

        for (String errorFullText : errorFullTexts) {
            errorMessageTexts.add(errorFullText.substring(errorFullText.indexOf(":'") + 2, errorFullText.lastIndexOf(".'")));
        }
    }

    // Day 3
    public static void numberOfHouses() {
        String[] houses = {"a", "b", "c", "d", "a", "b", "a", "a", "b", "c"};

        Map<String, Integer> counts = new HashMap<>();

        for (String house : houses) {
            if (counts.containsKey(house)) {
                counts.put(house, counts.get(house) + 1);
            } else {
                counts.put(house, 1);
            }
        }
    }

    public static void stringLoop(){
        //There are multiple ways available

        //Using For Each loop
        String str = "Hello, World!";
        for (char c : str.toCharArray()) {
            // Process or print the character 'c'
        }

        //Using Java streams
        str.chars().forEach(c -> {
            // Process or print the character 'c'
        });
    }

    // day 4
    public static void countOccurrenceOf3Words(){
        Scanner scanner = new Scanner(System.in);
        // Creating while loop to be able to loop, until we get word EXIT from user
        OUTER:
        while (true){
            System.out.println("Please enter 3 words separated by space");
            // This way we can get all 3 words once, and store inside a String array
            String[] words = scanner.nextLine().split(" ");

            // Creating Hashmap counter where will be storing occurrence of each word
            HashMap<String, Integer> counter = new HashMap<>();

            // Looping Through the words
            for(String word : words){
                word = word.toLowerCase();

                // if One of the words is 'exit', we finish our program
                if(word.equals("exit")){
                    System.out.println("Finishing the Program!");
                    break OUTER;
                }
                // if counter contains this word, we increase its occurrence by 1
                if(counter.containsKey(word)){
                    counter.put(word, counter.get(word)+1);
                }
                // if not, its just 1
                else {
                    counter.put(word, 1);
                }
            }
            System.out.println(counter);
        }
    }

    public static void day5() {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 3, 5, 6));
        ArrayList<Integer> b = new ArrayList<>(Arrays.asList(1, 2, 6));

        int biggerSize = Math.max(a.size(), b.size());
        int smallerSize = Math.min(a.size(), b.size());

        for (int i = 0; i < biggerSize; i++) {
            for (int j = 0; j < smallerSize; j++) {
                // do something
            }
        }
    }

    public static void day6(){
        String[] names = new String[] {"John", "Cecille", "Mark", "Judas", "Theresa"};
        names = Arrays.copyOf(names, names.length+1);

        System.out.println(Arrays.toString(names));
    }

    public static void day7(){
        String[] names = new String[] {"John", "Cecille", "Mark", "Judas", "Theresa"};
        /* - Arrays.copyOf() method takes two params
           - 1st is the original array
           - 2 is size for your new array */
        String[] duplicate = Arrays.copyOf(names, names.length+1);
    }

    public static String day8(String str){
        char[] arr = str.toCharArray();

        for(int i = 0; i< arr.length/2; i++){
            char temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }

        return new String(arr);
    }

    public static void dat8_2(){
        Scanner scnr = new Scanner(System.in);
        final int MAX_INPUTS = 10;
        int[] numbers = new int[MAX_INPUTS];
        int count = 0;
        int input;

        // Reads user inputs until they enter negative integer
        while (true) {
            System.out.println("please enter a number "+(count+1)+" number");
            input = scnr.nextInt();

            if (input < 0) {
                break;
            }

            // checks if count is less than max inputs, adds only in case its less
            if(count<MAX_INPUTS){
                numbers[count] = input;
            }
            count++;
        }

        // Check if no data entered
        if (count == 0) {
            System.out.println("No data entered.");
            return;
        }

        // Calculate the median
        double median;

        if (count % 2 == 0) {
            int middle1 = numbers[count / 2 - 1];
            int middle2 = numbers[count / 2];
            median = (double) (middle1 + middle2) / 2;
        } else {
            median = numbers[count / 2];
        }

        // Display the result
        if (count > MAX_INPUTS) {
            System.out.println("Data items past number 10 ignored");
        }
        System.out.println("Median: " + median);
    }



    public static void main(String[] args) {
        dat8_2();
    }



}
