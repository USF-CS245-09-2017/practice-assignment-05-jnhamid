import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort implements SortingAlgorithm {
    @Override
    public void sort(int[] a) {
       mergeSort(a);
    }
    void merge(int[] a, int[]b, int[]target){
        int ai=0;
        int bi=0;
        int ti=0;
        while(ai<a.length&&bi<b.length){
            if (a[ai] < b[bi]) {
                target[ti++]=a[ai++];

            }
            else{
                target[ti++] = b[bi++];
            }
        }
        while(ai<a.length){
            target[ti++] = a[ai++];
        }
        while (bi<b.length) {
            target[ti++] = b[bi++];

        }

    }

    void mergeSort(int [] a){
        if(a.length >1){

            int[] left = getLeft(a);
            int[] right = getRight(a);

            mergeSort(left);
            mergeSort(right);
            merge(left, right, a);
        }
    }
    int[]  getLeft(int[] a){
       return Arrays.copyOfRange(a, 0,a.length/2);

    }
    int[]  getRight(int[] a){
        return Arrays.copyOfRange(a, a.length/2, a.length);

    }
}
