public class Practice {

    public static void main(String[] args) {

        int[][] array = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 }
        };

        FindElement findElement = new FindElement();
        findElement.findElement(array,50);

        BinarySearch binarySearch = new BinarySearch();
        binarySearch.binarySearch(array[0],50,0,array[0].length);

        int[] a = {40,30,20,10};
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(a);

        //TODO Selection Sort <Find min and swap it with first value>

        MatchingParenthesis matchingparenthesis = new MatchingParenthesis();
        System.out.println(matchingparenthesis.match("(){{}}"));

        RandomizePlayList randomizePlayList = new RandomizePlayList();
        randomizePlayList.randomize(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});

    }
}
