/*
Problem: Reverse Array
Platform: Basic DSA Practice

Approach:
there are 5 methods
Use two pointers:
using temporary array (Similar types)
using temp integer variable (Similar types)
using swapping and iterating it till n/2 element (Must understand to do)
using recursion (must do)
using arryalist Colleactions.reverse(arr) (basically reversing array through its inbuit function)


two Pointers
Time Complexity: O(n)
Space Complexity: O(1)
*/
public class ReverseArray {
    
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        reverse(arr);

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}

    // --------------------------------------------------
    //  Using Swapping + Iteration till n/2
    // --------------------------------------------------
    public static void reverseBySwapping(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    // Method 2: Using Recursion
    // --------------------------------------------------
    public static void reverseByRecursion(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        reverseByRecursion(arr, left + 1, right - 1);
    }
    // Method 3: Using ArrayList + Collections.reverse()
    // --------------------------------------------------
    public static void reverseByCollections(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int num : arr) {
            list.add(num);
        }

        Collections.reverse(list);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
    }





