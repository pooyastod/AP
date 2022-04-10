public class CarFactory {
    public static Car getCar(int a)
    {
        switch (a)
        {
            case 1:
                return new volvo();
            case 2:
                return new Mitsubishi();
            default:
                    return null;
        }
    }
}
