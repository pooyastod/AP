import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
public class read implements Runnable{
    protected BlockingQueue<String> blockingQueue = null;
    public read(BlockingQueue<String> blockingQueue){
        this.blockingQueue = blockingQueue;
    }
    @Override
    public void run() {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(new File("D:/Users/Pouya/Desktop/1.txt")));
            String buffer =null;
            while((buffer=br.readLine())!=null){
                blockingQueue.put(buffer);
                System.out.println(buffer);
            }
            blockingQueue.put("EOF");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch(InterruptedException e){
        }finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}