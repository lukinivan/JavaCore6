/*
* MyMath
* Version 1.2
* Lukin Ivan
 */

package HomeWork.Modul_2.Task_1;

class MyMath {


    MyMath() {
    }

    int sumInt(int arr[]) {
        int _arr = 0;
        for (int anArr : arr) _arr += anArr;
        return _arr;
    }

    int minInt(int arr[]) {
        int _min = 0;
        for (int anArr : arr) if (_min > anArr) _min = anArr;
        return 0;
    }

    int maxInt(int arr[]) {
        int _max = 0;
        for (int anArr : arr) if (_max < anArr) _max = anArr;
        return _max;
    }

    int maxPositiveI(int arr[]) {
        int _maxPos = 0;
        for (int anArr : arr) if (_maxPos < anArr) _maxPos = anArr;
        return _maxPos;
    }

    int secondLargest(int arr[]) {
        int _second = 0;
        for (int anArr : arr) if (_second < anArr && anArr != maxPositiveI(arr)) _second = anArr;
        return _second;
    }

    int multiplicationI(int arr[]) {
        int _mult = 1;
        for (int anArr : arr) _mult *= anArr;
        return _mult;
    }

    int modul(int arr[], String action) {
        int _modul = 0;
        if (action.equals("first")) _modul = Math.abs(arr[0]);
        if (action.equals("last")) _modul = Math.abs(arr.length - 1);
        return _modul;
    }

    double sumDoub(double arr[]) {
        double _arr = 0;
        for (double anArr : arr) _arr += anArr;
        return _arr;
    }

    double minDoub(double arr[]) {
        double _min = 0;
        for (double anArr : arr) if (_min > anArr) _min = anArr;
        return _min;
    }

    double maxDoub(double arr[]) {
        double _max = 0;
        for (double anArr : arr) if (_max < anArr) _max = anArr;
        return _max;
    }

    double maxPositiveD(double arr[]) {
        double _maxPos = 0;
        for (double anArr : arr) if (_maxPos < anArr) _maxPos = anArr;
        return _maxPos;
    }

    double secondLargestD(double arr[]) {
        double _second = 0;
        for (double anArr : arr) if (_second < anArr && anArr != maxPositiveD(arr)) _second = anArr;
        return _second;
    }

    double multiplicationD(double arr[]) {
        double _mult = 1;
        for (double anArr : arr) _mult *= anArr;
        return _mult;
    }

    double modulD(double arr[], String action) {
        double _modul = 0;
        if (action.equals("first")) _modul = Math.abs(arr[0]);
        if (action.equals("last")) _modul = Math.abs(arr.length - 1);
        return _modul;
    }
}
