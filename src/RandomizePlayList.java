import java.util.*;

public class RandomizePlayList {

    public void randomize(int[] numbers) {
        Random random = new Random();
        HashSet<Integer> set = new  HashSet<>();
        int i = 0;
        do {
            int randomNumeber = random.nextInt(10);
            if (!set.contains(randomNumeber)) {
                set.add(randomNumeber);
                int temp = numbers[i];
                numbers[i] = numbers[randomNumeber];
                numbers[randomNumeber] = temp;
                i++;
            }
        } while (set.size() != 10);
        System.out.println(Arrays.toString(numbers));
    }
}
