package HomeWork.Modul_2.Task_1;

public class MyMath {


    public MyMath() {
    }

    int sumInt(int arr[]) {
        int _arr = 0;
        for (int i = 0; i < arr.length; i++) _arr += arr[i];
        return _arr;
    }

    int minInt(int arr[]) {
        int _min = 0;
        for (int i = 0; i < arr.length; i++) if (_min > arr[i]) _min = arr[i];
        return 0;
    }

    int maxInt(int arr[]) {
        int _max = 0;
        for (int i = 0; i < arr.length; i++) if (_max < arr[i]) _max = arr[i];
        return _max;
    }

    int maxPositiveI(int arr[]) {
        int _maxPos = 0;
        for (int i = 0; i < arr.length; i++) if (_maxPos < arr[i]) _maxPos = arr[i];
        return _maxPos;
    }

    int secondLargest(int arr[]) {
        int _second = 0;
        for (int i = 0; i < arr.length; i++) if (_second < arr[i] && arr[i] != maxPositiveI(arr)) _second = arr[i];
        return _second;
    }

    int multiplicationI(int arr[]) {
        int _mult = 1;
        for (int i = 0; i < arr.length; i++) _mult *= arr[i];
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
        for (int i = 0; i < arr.length; i++) _arr += arr[i];
        return _arr;
    }

    double minDoub(double arr[]) {
        double _min = 0;
        for (int i = 0; i < arr.length; i++) if (_min > arr[i]) _min = arr[i];
        return _min;
    }

    double maxDoub(double arr[]) {
        double _max = 0;
        for (int i = 0; i < arr.length; i++) if (_max < arr[i]) _max = arr[i];
        return _max;
    }

    double maxPositiveD (double arr[]) {
        double _maxPos = 0;
        for (int i = 0; i < arr.length; i++) if (_maxPos < arr[i]) _maxPos = arr[i];
        return _maxPos;
    }

    double secondLargestD(double arr[]) {
        double _second = 0;
        for (int i = 0; i < arr.length; i++) if (_second < arr[i] && arr[i] != maxPositiveD(arr)) _second = arr[i];
        return _second;
    }

    double multiplicationD(double arr[]) {
        double _mult = 1;
        for (int i = 0; i < arr.length; i++) _mult *= arr[i];
        return _mult;
    }

    double modulD(double arr[], String action) {
        double _modul = 0;
        if (action.equals("first")) _modul = Math.abs(arr[0]);
        if (action.equals("last")) _modul = Math.abs(arr.length - 1);
        return _modul;
    }
}
