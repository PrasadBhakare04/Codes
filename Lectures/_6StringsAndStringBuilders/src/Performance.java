public class Performance {
    public static void main(String[] args){
        String series = "";
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);//for converting it into string
            series += ch + " ";
        }
        System.out.println(series);
    }
}
/*The series first points towards empty String then to a and then to ab and so on
This creates a new object every time this uses very large space because we cannot modify a string */