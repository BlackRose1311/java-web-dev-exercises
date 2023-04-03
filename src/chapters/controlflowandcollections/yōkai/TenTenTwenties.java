package chapters.controlflowandcollections.yōkai;

import java.util.ArrayList;

public class TenTenTwenties {
    public static int evenEquation(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(10);
        numList.add(10);
        numList.add(20);
        numList.add(13);
        numList.add(76);
        numList.add(93);
        numList.add(57);
        numList.add(46);
        numList.add(9);
        numList.add(4);

        evenEquation(numList);
        }
    }
