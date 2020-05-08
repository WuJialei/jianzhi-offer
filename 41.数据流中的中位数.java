import java.util.*;
public class Solution {

    private PriorityQueue<Integer> minQueue = new PriorityQueue<Integer>(
        (a, b) -> b - a
    );
    private PriorityQueue<Integer> maxQueue = new PriorityQueue<Integer>(
        (a, b) -> a - b
    );
    
    public void Insert(Integer num) {
        if (maxQueue.size() == 0 || num < maxQueue.peek()) {
            minQueue.offer(num);
        } else {
            maxQueue.offer(num);
        }
        while (maxQueue.size() - minQueue.size() > 1) {
            minQueue.offer(maxQueue.poll());
        }
        while (minQueue.size() - maxQueue.size() > 0) {
            maxQueue.offer(minQueue.poll());
        }
    }

    public Double GetMedian() {
        if (minQueue.size() == maxQueue.size()) {
            return (((double)minQueue.peek()) + maxQueue.peek())/2;
        } else {
            return (double)maxQueue.peek();
        }
    }


}
