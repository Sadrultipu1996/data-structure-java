/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rahul
 */
public class Sorting2 {
    public void selection_sort(LinkedList arr)
    {
        Node i = arr.head;
        Node j = arr.head.next;
        int n = arr.countNode();
 
        // One by one move boundary of unsorted subarray
        while(i.next != null)
        {
            while(j != null)
            {
                if((int) j.element < (int) i.element)
                {
                    
                }
            }
        }
//        for (int i = 0; i < n-1; i++)
//        {
//            // Find the minimum element in unsorted array
//            int min_idx = i;
//            for (int j = i+1; j < n; j++)
//            {
//                if ((int) arr.nodeAt(j).element < (int) arr.nodeAt(min_idx).element)
//                {
//                    min_idx = j;
//                }
//            }
// 
//            // Swap the found minimum element with the first
//            // element
//            Node temp = arr.nodeAt(min_idx);
//            Node b = arr.nodeAt(i);
//            Node a = b;
//            b = temp;
//        }
    }
    public void insertion_sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }
    public void print_array(int arr[])
    {
        int a =0;
        while(a<arr.length)
        {
            System.out.print(arr[a++]+" ");
        }
        System.out.println();
    }
}
