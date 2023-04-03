package chapters.controlflowandcollections.demonbrackets;

public class IHateArraysNow {
    public static void main(String[] args) {

        int[] loveNumbersTho = {1, 1, 2, 3, 5, 8};

        for (int i : loveNumbersTho) {
            System.out.println(i);
        }

        for (int i : loveNumbersTho) {
            int remainder = i % 2;

            if (remainder != 0) {
                System.out.println(i);
            }
        }
    }
}
