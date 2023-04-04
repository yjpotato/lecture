package chap98_homework.nc230404.clazz;

import java.util.Arrays;

public class IntArrUtils {
    public int getMax(int[] arr){
        int max = arr[0];
        int min = arr[0];
        int mid = arr[0];

        for (int i : arr){
            if(i < min){
                min = i;
            }
        }
        return min;

    }
    public int getMain(int[] arr){
        int min = arr[0];
        int max = arr[0];
        int mid = arr[0];

        for (int i : arr){
            if(i < min){
                min = i;
            }
        }
        return min;
    }
    public int getMid(int[] arr){
        Arrays.sort(arr);

        int mid = arr[arr.length/2];
        return mid;

    }
}
