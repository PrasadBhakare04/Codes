public class _7DiceSumTarget {
    public static void main(String[] args) {
        rollDice("", 4);
    }

    static void rollDice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            rollDice(p + i, target - i);
        }
    }

    //custom faces
    static void diceFace(String p, int target, int face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i, face);
        }
    }
}
