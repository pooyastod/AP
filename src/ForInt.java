
public class ForInt implements MyInteger {
    int adad;
    @Override
    public void isEven(int adad) {
        if (adad % 2 == 0)
            System.out.println("fard nist");
        else
            System.out.println("fard hast");
    }

    @Override
    public void isOdd(int adad) {
        if (adad % 2 == 0)
            System.out.println("zoj ast");
        else
            System.out.println("zoj nist");
    }

    @Override
    public void isPositive(int adad) {
        if (adad > 0)
            System.out.println("adad mosbat ast");
        else
            System.out.println("adad mosbat nist");
    }

    @Override
    public void isNegative(int adad) {
        if (adad < 0)
            System.out.println("adad manfi ast");
        else
            System.out.println("adad manfi nist");
    }

    @Override
    public void isZero(int adad) {
        if (adad == 0)
            System.out.println("adad sefr ast");
        else
            System.out.println("adad sefr nist");
    }
}
