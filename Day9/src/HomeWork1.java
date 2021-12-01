public class HomeWork1 {

    public static void main(String[] args) {
        Superstack superstack = new Superstack(5);
        superstack.push(30);
        superstack.push(20);
        superstack.push(50);
        superstack.push(70);
        System.out.println(superstack.peek());
        System.out.println(superstack.pop());
        System.out.println(superstack.peek());
        superstack.toString();
        superstack.stack();
        System.out.println();
        SuperQueue superQueue = new SuperQueue(5);
        superQueue.offer(20);
        superQueue.offer(50);
        superQueue.offer(10);
        System.out.println();
        superQueue.poll();

    }
}
