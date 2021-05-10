package hmjc.hm12;

public class Main {
    public static void main(String[] args) {


        Worker.OnTaskErrorListener listener2 = Main::printError;//st -> System.out.printf("Error: %s\n", st );
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start();

        Worker worker2 = new Worker(listener, listener2);
        worker2.start(33);

    }

    private static void printError(String s) {
        System.out.println("Error: " + s);
    }

}
