/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maxheap;

/**
 *
 * @author xeniazantello
 */
public class MaxHeap {
    
    // protected int array to store heap
    protected int[] storage;
    // protected int heapsize - holds heapsize from zero to n-1
    protected int heapsize;
    
    /*
     * A public constructor method with an int array parameter.  
     * This constructor will take an int array filled with arbitrary values as a parameter, 
     * make a copy of it into its data field array made the same length, set heapsize to the array length, 
     * and then invoke buildMaxHeap (see below). 
     * You may want to use the java.util.Array.copyOfRange method in the constructor, or you can do it yourself.
     * 
     * @param storage stores the array we will eventually sort
     */
    
    
    public MaxHeap(int[] storage){
        this.storage = storage;
        heapsize = storage.length;
        //todo invoke build max heap
       
    }
    
    
    /*
     * A protected method named parentOf, with an index parameter. Return the index where the parent is stored. 
     * Remember, the root and indexes beyond the end of the heap have no parent, so in that case return -1.
     * You will first need to convert to a one-indexing by adding 1, 
     * then compute the parent's index, then finally subtract 1 to go back to zero-indexing.
     */
     protected int parentOf(int index){
        index ++;
        if(index != 1 && index < heapsize){
            index = index / 2;
            index --; 
            return index;
        }
        return -1;
     }
    
    /*
     * A protected method named leftChildOf, which takes an index parameter. 
     * Return the index where the left child is stored. 
     * Indices beyond the end of the heap have no children, so return -1. 
     * If the left child is beyond the end of the heap, return -1. Don't forget the zero indexing!
     */
     
     protected int leftChildOf(int index){
         index ++;
         if(2 * index <= heapsize){
             return (index * 2) - 1;
         }
         return -1;
     }
    
    /*
     * A protected method named rightChildOf, which takes an index parameter. 
     * Return the index where the right child is stored.  Indices beyond the end of the heap have no children, so return -1.  
     * If the right child is beyond the end of the heap, return -1. Don't forget the zero indexing!
     */
    
     protected int rightChildOf(int index){
         index ++;
         if((2 * index + 1) < heapsize){
             return (index * 2); //becuase we moved to one indexing it doesn't make sense to 2(index) +1 -1
         }
         return -1;
     }
     
    /*
     * A public method named printMaxHeap to write out the contents of its array data 
     * field to standard output in a nicely formatted print statement. 
     * Print out the heapsize, and then only print the values of indices 0 through heapsize-1 inclusive. 
     * You can do this yourself, or use the java.util.Arrays.toString method. 
     * You must only print indices from 0 to heapSize-1 inclusive, 
     * so you may want to use java.util.Arrays.copyOfRange before invoking java.util.Arrays.toString.
     */
    public void printMaxHeap(){
        //int[] rangeCopy = java.util.Arrays.copyOfRange(storage, 0, heapsize);
        System.out.println(heapsize);
        System.out.println(java.util.Arrays.toString(storage));
    }
    /*
     * A protected recursive method named maxHeapify based on the MAX-HEAPIFY method, 
     * whose pseudocode is in the textbook and the slides. 
     * The only parameter will be the index -- 
     * the array itself is a class member variable and thus need not be a parameter. 
     * Remember the heap ends at index heapsize-1 inclusive.
     */
    
    protected void maxHeapify(int index){
        int left = leftChildOf(index);
        int right = rightChildOf(index);
        int holder;
        int largest;
        //System.out.println("storage in left is " + storage[left] + "storage in index is " + storage[index] );
        if( left != -1 && left <= heapsize -1  && storage[left] > storage[index] ) {
            largest = left;
        } else largest  = index ;
        //burn this bridge when we get to it.
        if(right != -1 &&  storage[right] > storage[largest]){
            largest = right;
        }
        if(largest != index){
            holder = storage[index];
            //System.out.println("unswapped " + storage[index] + " , " + storage[largest]);
            storage[index] = storage[largest];
            storage[largest] = holder;
            //System.out.println("swapped " + storage[index] + " , " + storage[largest]);
            maxHeapify(largest);
        }
        
    }
    
    
    /*
     *A protected method buildMaxHeap based on the BUILD-MAX-HEAP method, 
     * whose pseudocode is in the textbook and the slides. This is a loop that invokes maxHeapify. 
     * It has no parameters since the array is a class member variable. 
     * Remember the heap ends at index heapsize-1 inclusive. 
     */
    
    protected void buildMaxHeap(){
        for(int i = (heapsize/2); i >= 0; i--){
            //System.out.println(i);
            maxHeapify(i);
        }
    }
    
    /*
     * A public method named heapsort, based on the HEAPSORT method, whose pseudocode is in the textbook and the slides. 
     * This method has no parameters, since the array is a class member variable.  
     * It will make use of buildMaxHeap and maxHeapify. Remember the heap ends at index heapsize-1 inclusive. 
     * This method modifies heapsize continuously, so remember to restore a backup copy of heapsize after - 
     * the sorting is done.
     */
    
    public void heapSort(){
        buildMaxHeap();
        int backUp = heapsize;
        for(int i = heapsize -1; i >= 1 ; i --){
            int swapCop;
            swapCop = storage[0];
            storage[0] = storage[i];
            storage[i] = swapCop;
            heapsize --;
            maxHeapify(0);
        }
        heapsize = backUp;
    }

    public static void main(String[] args) {
        // TODO code application logic here\
        int[] test0 = {6,8,5,12,10,35,21,0,8};
        MaxHeap testing = new MaxHeap(test0);
        testing.printMaxHeap();
        //System.out.println(testing.leftChildOf(4));

        testing.heapSort();
        testing.printMaxHeap();
        
    }
    
}
