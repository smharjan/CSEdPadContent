
package javapedagogy;

/**
  @author(Hasan Mashrique)
  @topic(Sorting)
  @title(BubbleSort)
  @goalDescription(Sort a given array using bubble sort)
  @source()
 */

public class BubbleSort {

        /**
          @comment(We define method Sorting to sort the unsorted list.)
         */
    static void Sorting(int[] list) {
        int n = list.length;
        int temp = 0;
        /**
          @comment(for each element of the list, compare with the rest of the values and swap their position when 
          list[j - 1] > list[j])
         */
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (list[j - 1] > list[j]) {
                    temp = list[j - 1];
                    list[j - 1] = list[j];
                    list[j] = temp;
                }
            }
        }

    }

    public static void main(String[] args) {
        /**
          @comment(We define the unsorted list and its values.)
         */
        int UnsortedList[] = {2, 5, -2, 6, -3, 8, 0, -7, -9, 4};
        
        System.out.println("Array Before Bubble Sort");
        
        /**
          @comment(Print the unsorted list as given.)
         */
        for (int i = 0; i < UnsortedList.length; i++) {
            System.out.print(UnsortedList[i] + " ");
        }
        
        System.out.print('\n' + "Array after Bubble Sort" + '\n');
        
        /**
          @comment(Call the  method Sorting to sort the unsorted list using bubble sort.)
         */
        Sorting(UnsortedList);
        
        /**
          @comment(Print the sorted list after bubble sort.)
         */
        for (int i = 0; i < UnsortedList.length; i++) {
            System.out.print(UnsortedList[i] + " ");
        }

    }
}
