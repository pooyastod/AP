public class Launcher {
    private static Runnable FetchData;
    private static Runnable RegistrationForm;
    public static void main(String[] args) throws Exception{
        FetchData fetch = new FetchData();
        RegistrationForm register = new RegistrationForm();
        read read = new read();
        Thread readerr = new Thread(read);
        Thread registerr = new Thread(RegistrationForm);
        Thread fetchh = new Thread(FetchData);
        fetchh.start();
        registerr.start();
        readerr.start();
    }
}