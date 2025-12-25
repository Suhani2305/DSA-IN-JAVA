import java.util.*;

// public class heap {
//     public static void main(String[] args) {
//         PriorityQueue<Integer> pq = new PriorityQueue<>();  // Min-heap

//         pq.add(10);
//         pq.add(20);
//         pq.offer(30);
//         pq.add(5);
//         pq.add(15); 
//         pq.add(25);
//         pq.add(40);
//         pq.add(35);

//         System.out.println("Initial PQ: " + pq);  // Not guaranteed sorted order

//         System.out.println("poll(): " + pq.poll());  // removes and prints top (10)
//         System.out.println("After poll: " + pq);

//         System.out.println("remove(20): " + pq.remove(20));  // true if 20 was removed
//         System.out.println("After remove(20): " + pq);

//         System.out.println("peek(): " + pq.peek());  // top element (should be 30)

//         System.out.println("isEmpty(): " + pq.isEmpty());  // false
//         System.out.println("size(): " + pq.size());        // size

//         System.out.println("contains(20): " + pq.contains(20)); // false
//         System.out.println("toArray(): " + Arrays.toString(pq.toArray()));

//         System.out.print("iterator(): ");
//         Iterator<Integer> it = pq.iterator();
//         while (it.hasNext()) {
//             System.out.print(it.next() + " ");
//         }
//         System.out.println();

//         pq.clear();  // clears all elements
//         System.out.println("After clear(): " + pq);
//         System.out.println("isEmpty() now: " + pq.isEmpty()); // true
//     }
// }


// class heap{
//     public static void main(String[] args){
//         PriorityQueue<String> pq = new PriorityQueue<>((a,b) -> a.length()- b.length()); // Custom comparator for min-heap based on string length
//         pq.add("apple");
//         pq.add("banana");
//         pq.add("kiwi");
//         pq.add("grape");
//         pq.add("orange");
//         pq.add("pear");
//         pq.add("blueberry");
//         pq.add("strawberry");
//         System.out.println("Initial PQ: " + pq);  // Not guaranteed sorted order
//         System.out.println("poll(): " + pq.poll());  // removes and prints top (kiwi)
//         System.out.println("After poll: " + pq);
//         System.out.println("Convert to Array: " + Arrays.toString(pq.toArray())); // Convert to array
//     }
// }


// min heap and max heap
// class minHeap{
//     public List<Integer> heap;
//     public minHeap() {
//         heap = new ArrayList<>();
//     }
//     public void insert(int val){
//         heap.add(val);
//         int  i = heap.size() - 1;
//         while(i> 0 && heap.get(i)<heap.get((i-1)/2)){
//             swap(i, (i-1)/2);
//             i = (i-1)/2;
//         }
//     }
//     public int extractMin(){
//         if(heap.isEmpty()){
//             throw new NoSuchElementException("Heap is empty");
//         }
//         int min = heap.get(0);
//         int last = heap.remove(heap.size() - 1);
//         if(!heap.isEmpty()){
//             heap.set(0, last);
//             minHeapify(0);
//         }
//         return min;
//     }

//     public int peek(){
//         return heap.isEmpty() ? Integer.MAX_VALUE : heap.get(0);
//     }
//     private void minHeapify(int i) {
//         int left = 2 * i + 1;
//         int right = 2 * i + 2;
//         int smallest = i;

//         if (left < heap.size() && heap.get(left) < heap.get(smallest)) {
//             smallest = left;
//         }
//         if (right < heap.size() && heap.get(right) < heap.get(smallest)) {
//             smallest = right;
//         }
//         if (smallest != i) {
//             swap(i, smallest);
//             minHeapify(smallest);
//         }
//     }
//     private void swap(int i, int j) {
//         int temp = heap.get(i);
//         heap.set(i, heap.get(j));
//         heap.set(j, temp);
//     }
//     public void printHeap() {
//         for (int val : heap) {
//             System.out.print(val + " ");
//         }
//         System.out.println();
//     }
// }

// class maxHeap{
//     public List<Integer> heap;
//     public maxHeap() {
//         heap = new ArrayList<>();
//     }
//     public void insert(int val){
//         heap.add(val);
//         int  i = heap.size() - 1;
//         while(i> 0 && heap.get(i)>heap.get((i-1)/2)){
//             swap(i, (i-1)/2);
//             i = (i-1)/2;
//         }
//     }
//     public int extractMax(){
//         if(heap.isEmpty()){
//             throw new NoSuchElementException("Heap is empty");
//         }
//         int max = heap.get(0);
//         int last = heap.remove(heap.size() - 1);
//         if(!heap.isEmpty()){
//             heap.set(0, last);
//             maxHeapify(0);
//         }
//         return max;
//     }

//     public int peek(){
//         return heap.isEmpty() ? Integer.MIN_VALUE : heap.get(0);
//     }
//     private void maxHeapify(int i) {
//         int left = 2 * i + 1;
//         int right = 2 * i + 2;
//         int largest = i;

//         if (left < heap.size() && heap.get(left) > heap.get(largest)) {
//             largest = left;
//         }
//         if (right < heap.size() && heap.get(right) > heap.get(largest)) {
//             largest = right;
//         }
//         if (largest != i) {
//             swap(i, largest);
//             maxHeapify(largest);
//         }
//     }
//     private void swap(int i, int j) {
//         int temp = heap.get(i);
//         heap.set(i, heap.get(j));
//         heap.set(j, temp);
//     }
//     public void printHeap() {
//         for (int val : heap) {
//             System.out.print(val + " ");
//         }
//         System.out.println();
//     }
// }
// class heap{
//     public static void main(String[] args) {
//         minHeap minHeap = new minHeap();
//         minHeap.insert(10);
//         minHeap.insert(20);
//         minHeap.insert(5);
//         minHeap.insert(15);
//         minHeap.insert(30);
//         minHeap.insert(25);
//         minHeap.insert(40);
//         minHeap.insert(35);

//         System.out.println("Min Heap:");
//         minHeap.printHeap();

//         System.out.println("Extract Min: " + minHeap.extractMin());
//         System.out.println("After Extract Min:");
//         minHeap.printHeap();

//         System.out.println("Peek: " + minHeap.peek());




//         maxHeap maxHeap = new maxHeap();
//         maxHeap.insert(10);
//         maxHeap.insert(20);
//         maxHeap.insert(5);  

//     }
// }


// //Check if an array represents a min-heap or not
// class heap{
//     public static boolean isMinHeap(int []arr){
//         int n = arr.length;
//         for(int i =0;i<n/2;i++){
//             int l = 2*i + 1; // left child index
//             int r = 2*i + 2; // right child index
//             if(l< n  && arr[i] > arr[l]){ // check left child
//                 return false;
//             }
//             if(r< n && arr[i] > arr[r]){ // check right child
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         int[] arr = {10, 20, 5, 15, 30, 25, 40, 35};
//         System.out.println("Is Min Heap: " + isMinHeap(arr)); // true

//         int[] arr2 = {10, 5, 20, 15, 30, 25, 40, 35};
//         System.out.println("Is Min Heap: " + isMinHeap(arr2)); // false
//     }
// }


// // Convert Min Heap to Max Heap
// class heap {
//     public static void convertMinToMaxHeap(int[] arr) {
//         int n = arr.length;
//         for (int i = n / 2 - 1; i >= 0; i--) {
//             maxHeapify(arr, n, i);
//         }
//     }

//     private static void maxHeapify(int[] arr, int n, int i) {
//         int largest = i;
//         int left = 2 * i + 1;
//         int right = 2 * i + 2;

//         if (left < n && arr[left] > arr[largest]) {
//             largest = left;
//         }
//         if (right < n && arr[right] > arr[largest]) {
//             largest = right;
//         }
//         if (largest != i) {
//             swap(arr, i, largest);
//             maxHeapify(arr, n, largest);
//         }
//     }

//     private static void swap(int[] arr, int i, int j) {
//         int temp = arr[i];
//         arr[i] = arr[j];
//         arr[j] = temp;
//     }

//     public static void main(String[] args) {
//         int[] minHeap = {1, 3, 5, 7, 9, 11};
//         convertMinToMaxHeap(minHeap);
//         System.out.println("Converted Max Heap: " + Arrays.toString(minHeap));
//     }
// }


// Sort K sorted array
class heap{
    public static List<Integer> sortKSortedArray(List<Integer> arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> sortedList = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            pq.add(arr.get(i));
            if (pq.size() > k) {
                sortedList.add(pq.poll());
            }
        }

        while (!pq.isEmpty()) {
            sortedList.add(pq.poll());
        }

        return sortedList;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(3, 2, 1, 5, 4, 6, 8, 7);
        int k = 3;
        List<Integer> sortedArray = sortKSortedArray(arr, k);
        System.out.println("Sorted K-Sorted Array: " + sortedArray);
    }
}