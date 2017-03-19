package HomeWork.Modul_2.Task_1;

public class Main {
    public static void main(String[] args) {
        int[] arrI = new int[]{10,-15,22,53,-81,64,97,2,144,-18};
        double[] arrD = new double[]{-10.5,15.7,-22.8,53.1,81.2,-64.5,97.5,2.7,74.1,18.6};

        int sumI = 0;
        int minI = 0;
        int maxI = 0;
        int maxPositiveI = 0;
        int multiplicationI = 1;
        int modulFirst = 0;
        int modulLast = 0;
        int secondI = 0;

        double sumD = 0;
        double minD = 0;
        double maxD = 0;
        double maxPositiveD = 0;
        double multiplicationD = 1;
        double secondD = 0;

        for (int i = 0; i < arrI.length; i++) {
            sumI += arrI[i];
            multiplicationI *= arrI[i];
            modulFirst = Math.abs(arrI[0]);
            modulLast = Math.abs(arrI.length-1);
            if(minI > arrI[i]) minI = arrI[i];
            if(maxI < arrI[i]) maxI = arrI[i];
            if(maxPositiveI < arrI[i]) maxPositiveI = arrI[i];
        }
        for (int i = 0; i < arrI.length; i++) {
            if(secondI < arrI[i] && arrI[i] != maxPositiveI) secondI = arrI[i];
        }

        for (int i = 0; i < arrD.length; i++) {
            sumD += arrD[i];
            multiplicationD *= arrI[i];
            if(minD > arrD[i]) minD = arrD[i];
            if(maxD < arrD[i]) maxD = arrD[i];
            if(maxPositiveD < arrD[i] && secondD < arrD[i]) maxPositiveD = arrD[i];
            if(arrD[i]<maxPositiveD) secondD = arrD[i];
        }

        for (int i = 0; i < arrD.length; i++) {
            if(secondD < arrD[i] && arrD[i] != maxPositiveD) secondD = arrD[i];
        }

        System.out.println("sum: "+sumI+", "+"minI: "+minI+", "+"maxI; "+maxI+", "+"maxPosI: "+maxPositiveI+", "+"multiI: "+multiplicationI+", "+"secondI: "+secondI+", "+"modulFirst: "+ modulFirst+", "+"modulLaast: "+modulLast);
        System.out.println("sumD: "+sumD+", "+"minD: "+minD+", "+"maxD; "+maxD+", "+"maxPosD: "+maxPositiveD+", "+"multiD: "+multiplicationD+", "+"secondD: "+secondD);
    }
}
