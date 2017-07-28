/*
/из двух массивов создается объединенный и сортируется в обратном порядке
*/
package arraysorttwo;
import java.util.Arrays;

/**
 *
 * @author KovalchukAV
 */
public class ArraySortTwo {

    //массив сортировщик
    public static int[] arraySort(int array[]){

        if (array.length==0) return new int[]{};

        int count=0;
        //сортировка в двух циклах
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j]<array[j+1]){
                count = array[j];
                array[j] = array[j+1];
                array[j+1] = count;
                }
            }
        }
        return array;
    }

    //массив сборщик
    public static int[] unionArray(int a[], int b[]){
        int count = a.length + b.length;
        int rez[] = new int[count];

            for (int i = 0; i < a.length; i++) {
                rez[i] = a[i];
            }
            int j = 0;
            for (int i = a.length; i < count; i++) {
                rez[i] = b[j];
                j++;
            }
        return rez;
    }



    public static void main(String[] args) {
       int ar1[] = {1,8,0,5,7,3,7,2};
       int ar2[] = {1,2,3,8,9,0};
       //System.out.println("отсортированный в обратном порядке= " + Arrays.toString(arraySort(unionArray(ar1, ar2))));
        //System.out.println("Array.sort=" + Arrays.sort(ar2));
        Arrays.sort(ar2);
        System.out.println("ar2=" + Arrays.toString(ar2));
        //System.out.println("Arrays.sort=" + Arrays.sort(ar1));
    }
}
