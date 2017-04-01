/*
* Main
* Version 1.2
* Lukin Ivan
 */

package HomeWork.Modul_2.Task_1;

public class Main {
    public static void main(String[] args) {
        int[] arrI = new int[]{10, -15, 22, 53, -81, 64, 97, 2, 144, -18};
        double[] arrD = new double[]{-10.5, 15.7, -22.8, 53.1, 81.2, -64.5, 97.5, 2.7, 74.1, 18.6};
        MyMath math = new MyMath();
        System.out.println("sum: " + math.sumInt(arrI) + ", " + "minI: " + math.minInt(arrI) + ", "
                + "maxI; " + math.maxInt(arrI) + ", " + "maxPosI: " + math.maxPositiveI(arrI) + ", "
                + "multiI: " + math.multiplicationI(arrI) + ", " + "secondI: " + math.secondLargest(arrI) + ", "
                + "modulFirst: " + math.modul(arrI, "first") + ", "
                + "modalLast: " + math.modul(arrI, "last"));
        System.out.println("sumD: " + math.sumDoub(arrD) + ", " + "minD: " + math.minDoub(arrD) + ", "
                + "maxD; " + math.maxDoub(arrD) + ", " + "maxPosD: " + math.maxPositiveD(arrD) + ", "
                + "multiD: " + math.multiplicationD(arrD) + ", " + "secondD: " + math.secondLargestD(arrD) + ", "
                + "modulFirst: " + math.modulD(arrD, "first") + ", "
                + "modulLast: " + math.modulD(arrD, "last"));

    }
}
