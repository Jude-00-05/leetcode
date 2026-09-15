import java.util.*;

class MyStack {
    Queue<Integer> queue1, queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    
    public void push(int x) {
        queue1.add(x);
    }
    
    public int pop() {
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        int top = queue1.poll(); // last element

        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }

        return top;
    }
    
    public int top() {
        while (queue1.size() > 1) {
            queue2.add(queue1.poll());
        }

        int top = queue1.poll(); // last element
        queue2.add(top); // put it back

        while (!queue2.isEmpty()) {
            queue1.add(queue2.poll());
        }

        return top;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}