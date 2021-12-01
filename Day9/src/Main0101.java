public class Main0101 {
    public static void main(String[] args) {
        SuperQueue superQueue = new SuperQueue(5);
        superQueue.offer(10);
        superQueue.offer(20);
        superQueue.offer(5);
        superQueue.offer(40);
        superQueue.queue();
        System.out.println(superQueue.peek());
        System.out.println(superQueue.poll());
        superQueue.queue();
    }
}
