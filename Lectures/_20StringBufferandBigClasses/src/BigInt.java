//there are various methods available in BigInteger Class you can check the documetation
//methods like add, multiply, subtract, divide, remainder, intValue, negate, pow etc

import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args){
        BigInteger bi = BigInteger.valueOf(565656565);
        BigInteger b2 = BigInteger.valueOf(47536463);
        BigInteger b3 = new BigInteger("9847974798654985364753647659873497694357693476");
        BigInteger b4 = new BigInteger("9847974798654985364753647659873497694357693476");
        BigInteger s = b3.multiply(b4);
        System.out.println(s);
    }
}
