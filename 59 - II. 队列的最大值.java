class MaxQueue {

    Queue<Integer> queue1;
    PriorityQueue<Integer> queue2;

    public MaxQueue() {
        queue1 = new LinkedList<>();
        queue2 = new PriorityQueue<>((a, b) -> b-a);
    }
    
    public int max_value() {
        if (queue2.isEmpty()) {
            return -1;
        }
        return queue2.peek();
    }
    
    public void push_back(int value) {
        queue1.offer(value);
        queue2.offer(value);
    }
    
    public int pop_front() {
        if (queue1.isEmpty()) {
            return -1;
        }
        int tmp = queue1.poll();
        queue2.remove(tmp);
        return tmp;
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
