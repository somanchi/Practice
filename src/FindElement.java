public class FindElement {

    public void findElement(int[][] array,int element) {
        int i = 0 ; int j = array[0].length-1;
        int k = 0; //First row

        while (i < array[0].length-1 || j >= 0) {
            if (array[i][j] == element) {
                System.out.println("element Found" + i + "," + j);
                break;
            }
            else if (array[i][j] < element) {
                i = i +1;
            }
            else if (array[i][j] > element) {
                j = j -1;
            }
        }
    }
}
