/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxheap;

/**
 *
 * @author Xenia
 */
public class TestMaxHeap {
    
    public static void main(String[] args) {
        // TODO code application logic here\
        int[] test0 = {6,8,5,12,10,35,21,0,8};
        int[] test1 = {66, 93, 32, 35, 50, 71, 73, 65, 3, 25, 94, 38, 67, 58, 70, 64, 24, 28, 37, 57, 88, 2, 5, 51, 9, 49, 42, 74, 85, 47};
        int[] test2 = {137, 134, 14, 131, 197, 135, 163, 75, 129, 16, 91, 36, 52, 166, 50, 62, 185, 10, 43, 188};
        int[] test3 = {68, 19, 8, 7, 45, 41, 17, 50, 56, 54, 51, 3, 5, 67, 35, 15, 32, 18, 40, 64, 36, 60, 46, 63, 6};
        int[] test4 = {25, 75, 7, 9, 4, 34, 36, 14, 15, 69, 82, 85, 62, 48, 99, 5, 39, 86, 43, 45, 13, 95, 73, 41, 30, 59, 81, 47, 61, 49, 90, 66, 10, 88, 83, 74, 40, 79, 65};
        
        
        System.out.println("Arbitrary ordered initial array is: " + java.util.Arrays.toString(test0));
        MaxHeap testing0 = new MaxHeap(test0);
        System.out.println("MaxHeap object constructed!");
        testing0.printMaxHeap();
        testing0.heapSort();
        System.out.println("Heapsort called!");
        testing0.printMaxHeap();
        System.out.println("//---------- END OF TEST -----------//");
        
        System.out.println("Arbitrary ordered initial array is: " + java.util.Arrays.toString(test1));
        MaxHeap testing1 = new MaxHeap(test1);
        System.out.println("MaxHeap object constructed!");
        testing1.printMaxHeap();
        testing1.heapSort();
        System.out.println("Heapsort called!");
        testing1.printMaxHeap();
        System.out.println("//---------- END OF TEST -----------//");
        
        System.out.println("Arbitrary ordered initial array is: " + java.util.Arrays.toString(test2));
        MaxHeap testing2 = new MaxHeap(test2);
        System.out.println("MaxHeap object constructed!");
        testing2.printMaxHeap();
        testing2.heapSort();
        System.out.println("Heapsort called!");
        testing2.printMaxHeap();
        System.out.println("//---------- END OF TEST -----------//");
        
        System.out.println("Arbitrary ordered initial array is: " + java.util.Arrays.toString(test3));
        MaxHeap testing3 = new MaxHeap(test3);
        System.out.println("MaxHeap object constructed!");
        testing3.printMaxHeap();
        testing3.heapSort();
        System.out.println("Heapsort called!");
        testing3.printMaxHeap();
        System.out.println("//---------- END OF TEST -----------//");
        
        System.out.println("Arbitrary ordered initial array is: " + java.util.Arrays.toString(test4));
        MaxHeap testing4 = new MaxHeap(test4);
        System.out.println("MaxHeap object constructed!");
        testing4.printMaxHeap();
        testing4.heapSort();
        System.out.println("Heapsort called!");
        testing4.printMaxHeap();
        System.out.println("//---------- END OF TEST -----------//");
        
    }
}



