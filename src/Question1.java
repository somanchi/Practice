import java.util.LinkedHashMap;
import java.util.Map;

public class Question1 {

    int MAX_LIMIT = 5;

    LinkedHashMap<Integer,Cache> map;

    public Question1(int MAX_LIMIT) {
        this.MAX_LIMIT = MAX_LIMIT;
        map = new LinkedHashMap<>(MAX_LIMIT);
    }

    public void add(int data) {
        if (isFull()) {
            int keyToBeRemoved = getKeyToBeRemoved();
            map.remove(keyToBeRemoved);
            addData(data);
        }
        else  {
            addData(data);
        }
    }

    private void addData(int data) {
        Cache temp = new Cache();
        temp.setData(data);
        if (map.containsKey(data)) {
            int frequency = map.get(data).frequency;
            temp.setFrequency(frequency+1);
        }
        else {
            temp.setFrequency(0);
        }
        map.put(data,temp);
    }

    private int getKeyToBeRemoved() {
        int minFreq = Integer.MAX_VALUE;
        int min = 0;
        for (Map.Entry<Integer,Cache> entry : map.entrySet()) {
            if (minFreq < entry.getValue().getFrequency()) {
                min = entry.getKey();
            }
        }
        return min;
    }

    private boolean isFull() {
        if (map.size() == MAX_LIMIT) {
            return true;
        }
        else return false;
    }

    public Cache getData(int data) {
       return map.getOrDefault(data,new Cache());
    }
}


