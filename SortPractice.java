import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {
        int[] array = {3, 33, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        System.out.println("排序之前：\n" + Arrays.toString(array));

        bubbleSort(array);//冒泡排序
        quickSort(array);//快速排序

    }

    //冒泡排序
    static void bubbleSort(int[] array){
        int[] arrayTemp = new int[array.length];
        arrayTemp = array.clone();

        for(int i=1; i<arrayTemp.length; i++){
            for (int j = 0; j<arrayTemp.length-i; j++){
                if(arrayTemp[j]>arrayTemp[j+1]){
                    int tmp = arrayTemp[j+1];
                    arrayTemp[j+1] = arrayTemp[j];
                    arrayTemp[j] = tmp; 
                }
            }
            System.out.println("第"+i+"次冒泡排序：\n" + Arrays.toString(arrayTemp));
        }
        System.out.println("冒泡排序之后：\n" + Arrays.toString(arrayTemp));
    }

    //快速排序
    static void quickSort(int[] array){
        int[] arrayTemp = new int[array.length];
        arrayTemp = array.clone();

        quickSortRecurrence(arrayTemp,0,arrayTemp.length-1);

        System.out.println("快速排序之后：\n" + Arrays.toString(arrayTemp));
    }

    static void quickSortRecurrence(int[] arrayTemp, int low, int high){
        if(low > high){
            return;
        }
        int i=low, j=high, t, temp=arrayTemp[low];

        while(i<j){
            while(temp<=arrayTemp[j] && i<j){
                j--;
            }
            while(temp>=arrayTemp[i] && i<j){
                i++;
            }
            if(i<j){
                t=arrayTemp[j];
                arrayTemp[j] = arrayTemp[i];
                arrayTemp[i] = t;
            }
        }

        arrayTemp[low] = arrayTemp[i];
        arrayTemp[i] = temp;

        quickSortRecurrence(arrayTemp,low,j-1);
        quickSortRecurrence(arrayTemp,j+1,high);
    }

}
