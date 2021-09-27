public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = x -> System.out.println(x);
        Worker.OnTaskErrorListener listener1 = x -> System.out.println(x);

        Worker worker = new Worker(listener, listener1);
        worker.start();
    }
}
