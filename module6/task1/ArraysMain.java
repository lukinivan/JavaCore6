package HomeWork.module6.task1;

import java.util.Arrays;

public class ArraysMain {
    public static void main(String[] args) {
        int[] arrI = new int[]{10, -15, 22, 53, -81, 64, 97, 2, 144, -18};

        System.out.println(ArraysUtils.sumInt(arrI));
        System.out.println(ArraysUtils.maxInt(arrI));
        System.out.println(ArraysUtils.minInt(arrI));
        System.out.println(ArraysUtils.maxPositiveI(arrI));
        System.out.println(ArraysUtils.secondLargest(arrI));
        System.out.println(ArraysUtils.multiplicationI(arrI));
        System.out.println(Arrays.toString(ArraysUtils.reverse(arrI)));
        System.out.println(ArraysUtils.findEvenElements(arrI));
    }
}
