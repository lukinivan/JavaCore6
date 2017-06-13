package HomeWork.module6.task1;

import java.util.ArrayList;
import java.util.List;

final class ArraysUtils {

    static int sumInt(int arr[]) {
        int _arr = 0;
        for (int anArr : arr) _arr += anArr;
        return _arr;
    }

    static int minInt(int arr[]) {
        int min = 0;
        for (int anArr : arr) if (min > anArr) min = anArr;
        return min;
    }

    static int maxInt(int arr[]) {
        int _max = 0;
        for (int anArr : arr) if (_max < anArr) _max = anArr;
        return _max;
    }

    static int maxPositiveI(int arr[]) {
        int _maxPos = 0;
        for (int anArr : arr) if (_maxPos < anArr) _maxPos = anArr;
        return _maxPos;
    }

    static int secondLargest(int arr[]) {
        int _second = 0;
        for (int anArr : arr) if (_second < anArr && anArr != maxPositiveI(arr)) _second = anArr;
        return _second;
    }

    static int multiplicationI(int arr[]) {
        int _mult = 1;
        for (int anArr : arr) _mult *= anArr;
        return _mult;
    }

    static int modul(int arr[]) {
        int _modul = 0;
        _modul = Math.abs(arr[0]);
        return _modul;
    }

    static int[] reverse(int[] array) {
        int[] reverseArray = new int[array.length];
        for (int i = array.length - 1; i >= 0; i--) {
            reverseArray[array.length - 1 - i] = array[i];
        }
        return reverseArray;
    }

    static List<Integer> findEvenElements(int[] array) {
       List<Integer> evenElements = new ArrayList<>();
        for (int i : array) {
            if (i % 2 == 0) {
                evenElements.add(i);
            }
        }
        return evenElements;
    }

}
