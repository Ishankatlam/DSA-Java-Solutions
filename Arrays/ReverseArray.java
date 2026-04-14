/*
Problem: Reverse Array
Platform: Basic DSA Practice

Approach:
Use two pointers:
- One starts from beginning
- One starts from end
Swap both until they meet

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
