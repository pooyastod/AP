import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Launcher {

    public static void main(String[] args) {

        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(1024);

        read reader = new read(queue);
        write writer = new write(queue);

        new Thread(reader).start();
        new Thread(writer).start();

    }

}