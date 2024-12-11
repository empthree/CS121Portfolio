package weekThirteen;
import java.util.*;

public class RecentCounter {

    private Queue<Integer> queue = new LinkedList<>();
    public RecentCounter(){

    }
    public int ping(int t){
        queue.add(t);
        while (queue.peek() < t - 3000){
            queue.poll();
        }
        return queue.size();
    }
}
