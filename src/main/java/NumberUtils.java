import java.math.BigInteger;

public class NumberUtils {
    public static BigInteger getNumberFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        while (n != 1) {
            result = result.multiply(BigInteger.valueOf(n--));
        }
        return result;
    }

    public static String getNumberFib(int initN) {
        StringBuffer strBuf = new StringBuffer();
        int n1 = 1;
        int n2 = 1;
        int n3;
        strBuf.append("1 ").append("1");

        while(true) {
            n3 = n1 + n2;
            if (n3 > initN) {
                break;
            }
            strBuf.append(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        return strBuf.toString();
    }
}
