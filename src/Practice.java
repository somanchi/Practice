import java.util.*;

public class Practice {

    public static void main(String[] args) {

//        int[][] array = {
//                { 10, 20, 30, 40 },
//                { 15, 25, 35, 45 },
//                { 27, 29, 37, 48 },
//                { 32, 33, 39, 50 }
//        };
//
//        FindElement findElement = new FindElement();
//        findElement.findElement(array,50);
//
//        BinarySearch binarySearch = new BinarySearch();
//        binarySearch.binarySearch(array[0],50,0,array[0].length);
//
//        int[] a = {40,30,20,10};
//        BubbleSort bubbleSort = new BubbleSort();
//        bubbleSort.sort(a);
//
//        MatchingParenthesis matchingparenthesis = new MatchingParenthesis();
//        System.out.println(matchingparenthesis.match("(){{}}"));
//
//        RandomizePlayList randomizePlayList = new RandomizePlayList();
//        randomizePlayList.randomize(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
//
//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.sort();

//        Bribe bribe = new Bribe();
//        List<Integer> q = Arrays.asList(1,2,5,3,7,8,6,4);
//        bribe.minimumBribes(q);

//
//        AnagaramEncoding anagaramEncoding = new AnagaramEncoding();
//        anagaramEncoding.makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke");
//
//        // todo counting 1s in binary array --> find the index of last 1
//        /* TODO
//        1. Longest palindromic subSequence
//        2. continious subArray
//        3. ALL sub Strings
//        4. Rotation of a list
//        * */


        Question1 question1 = new Question1(3);
        question1.add(1);
        question1.add(2);
        question1.add(2);
        question1.add(3);
        question1.add(3);
        question1.add(2);

        System.out.println(question1.getData(1));
        System.out.println(question1.getData(2));
    }
}
