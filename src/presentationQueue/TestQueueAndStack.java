package presentationQueue;

public class TestQueueAndStack {
    public static void main(String[] args) {
        testQueue();
        testStack();
    }

    private static void testQueue() {
        SimpleQueue<Integer> queue = new SimpleQueue<>();
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " ");
            queue.add(i);
        }
        System.out.println("\nИзвлечение элементов из очереди: ");
        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
        System.out.println("\n");
    }

    private static void testStack(){
        SimpleStack<Integer> stack = new SimpleStack<>();
        for (int i = 1; i < 10; i++) {
            System.out.print(i + " ");
            stack.push(i);
        }
        System.out.println("\nИзвлечение элементов из стека: ");
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
