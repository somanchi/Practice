import java.util.List;

public class Bribe {

    /*
    * It is New Year's Day and people are in line for the Wonderland rollercoaster ride.
    * Each person wears a sticker indicating their initial position in the queue from  to .
    * Any person can bribe the person directly in front of them to swap positions, but they still wear their original sticker.
    * One person can bribe at most two others.Determine the minimum number of bribes that took place to get to a given queue order.
    * Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.
    *
    * */

    public void minimumBribes(List<Integer> q) {
        int counter = 0 ;
        boolean flag = false;
        for (int i = 0 ; i < q.size() ; i ++ ) {
            int diff = Math.abs(q.get(i) - (i+1));
            if (! ( diff == 0)) {
                i = i + 1;
                if (diff > 2) {
                    System.out.println("Too chaotic");
                    flag = true;
                    break;
                }
                else {
                    counter = counter + diff;
                }
            }
        }
        if (! flag) {
            System.out.println(counter);
        }
    }
}
