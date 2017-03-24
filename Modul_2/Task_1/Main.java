package HomeWork.Modul_2.Task_1;

public class Main {
    public static void main(String[] args) {
        int[] arrI = new int[]{10, -15, 22, 53, -81, 64, 97, 2, 144, -18};
        double[] arrD = new double[]{-10.5, 15.7, -22.8, 53.1, 81.2, -64.5, 97.5, 2.7, 74.1, 18.6};

        MyMath math = new MyMath();

        double sumD = 0;
        double minD = 0;
        double maxD = 0;
        double maxPositiveD = 0;
        double multiplicationD = 1;
        double secondD = 0;

        for (int i = 0; i < arrD.length; i++) {
            sumD += arrD[i];
            multiplicationD *= arrI[i];
            if (minD > arrD[i]) minD = arrD[i];
            if (maxD < arrD[i]) maxD = arrD[i];
            if (maxPositiveD < arrD[i] && secondD < arrD[i]) maxPositiveD = arrD[i];
            if (arrD[i] < maxPositiveD) secondD = arrD[i];
        }

        for (int i = 0; i < arrD.length; i++) {
            if (secondD < arrD[i] && arrD[i] != maxPositiveD) secondD = arrD[i];
        }

        System.out.println("sum: " + math.sumInt(arrI) + ", " + "minI: " + math.minInt(arrI) + ", " + "maxI; " + math.maxInt(arrI) + ", " + "maxPosI: " + math.maxPositiveI(arrI) + ", " + "multiI: " + math.multiplicationI(arrI) + ", " + "secondI: " + math.secondLargest(arrI) + ", " + "modulFirst: " + math.modul(arrI,"first") + ", " + "modulLaast: " + math.modul(arrI,"last"));
        System.out.println("sumD: " + math.sumDoub(arrD) + ", " + "minD: " + math.minDoub(arrD) + ", " + "maxD; " + math.maxDoub(arrD) + ", " + "maxPosD: " + math.maxPositiveD(arrD) + ", " + "multiD: " + math.multiplicationD(arrD) + ", " + "secondD: " + math.secondLargestD(arrD) + ", " + "modulFirst: " + math.modulD(arrD,"first") + ", " + "modulLaast: " + math.modulD(arrD, "last"));

    }
}
