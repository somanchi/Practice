import java.util.*;

public class RandomizePlayList {

    public void randomize(int[] numbers) {
        Random random = new Random();
        HashSet<Integer> set = new  HashSet<>();
        int i = 0;
        do {
            int randomNumber = random.nextInt(10);
            if (!set.contains(randomNumber)) {
                set.add(randomNumber);
                int temp = numbers[i];
                numbers[i] = numbers[randomNumber];
                numbers[randomNumber] = temp;
                i++;
            }
        } while (set.size() != 10);
        System.out.println(Arrays.toString(numbers));
    }
}
