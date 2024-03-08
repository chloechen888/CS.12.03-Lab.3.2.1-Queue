import java.util.LinkedList;
import java.util.Queue;

public class CISQueue<T> {

    private Queue<Integer> queue;

    public CISQueue(Queue<Integer> queue) {
        this.queue = queue;
    }

    public CISQueue(int i) {
        this.queue = new LinkedList<>();
        this.queue.add(i);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public Integer dequeue() {
        return queue.poll();
    }

    public void enqueue(Integer data) {
        queue.add(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (Integer i : queue) {
            if (i == null) {
                sb.append("null");
            } else {
                sb.append(i);
            }
            sb.append(" -> ");
        }
        sb.append("null");
        return sb.toString();
    }
}