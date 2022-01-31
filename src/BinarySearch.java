public class BinarySearch {

    public int binarySearch(int[] array,int target ,int start , int end)  {
        int mid = (start + end)/2;
        if (start == end) {
            System.out.println("element not found");
            return -1 ;
        }
        if (array[mid] == target) {
            System.out.println("element found at " + mid);
            return mid;
        }
        else if (array[mid] > target) {
            return binarySearch(array,target,start,mid-1);
        }
        else {
            return binarySearch(array,target,mid+1,end);
        }
    }
}
