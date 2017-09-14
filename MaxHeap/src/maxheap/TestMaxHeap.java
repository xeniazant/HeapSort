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
        MaxHeap testing = new MaxHeap(test0);
        testing.printMaxHeap();
        //System.out.println(testing.leftChildOf(4));

        testing.heapSort();
        testing.printMaxHeap();
        testing.printMaxHeap();
        
    }
}



