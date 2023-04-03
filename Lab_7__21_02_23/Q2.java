/*Q2.  insert the element at any position of the array using the index concept.*/

import java.util.*;

class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = s.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        System.out.println("Enter  the index number:");
        int index = s.nextInt();
        System.out.println("Enter  the number you want to insert:");
        int key = s.nextInt();
        a = insert(a, key, index, n);
        System.out.println(Arrays.toString(a));
    }

    public static int[] insert(int[] a, int key, int index, int n) {
        int[] result = new int[a.length + 1];

        for (int i = 0; i < index; i++) {
            result[i] = a[i];
        }
        result[index] = key;

        for (int i = index + 1; i <= n; i++) {
            result[i] = a[i - 1];
        }
        return result;
    }

}