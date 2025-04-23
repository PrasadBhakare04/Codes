//Leftshift means abcdef = bcdefa this is leftshift 1 time
//rightshift means abcdef = fabcde this is rightshift 1 time

public class QLeftshiftRighshift {
    public static void main(String[] args) {
        System.out.println(rightshift(leftshift("abcdef", 1), 1));
    }

    static String rightshift(String s, int shifts){
        String s1 = s.substring(s.length() - shifts);
        s1 = s1 + s.substring(0, s.length() - shifts);
        return s1;
    }

    static String leftshift(String s, int shifts){
        String s1 = s.substring(shifts, s.length());
        s1 = s1 + s.substring(0, shifts);
        return s1;
    }
}
