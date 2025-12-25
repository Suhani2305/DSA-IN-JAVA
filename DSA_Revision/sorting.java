

public class sorting {
    // insertion sort
    public static void  insertion_sort(int[] arr){
        int n = arr.length;
        for(int j =1; j<n;j++){
            int key = arr[j];
            int i = j-1;
            while(i>=0 && arr[i]<key){
                arr[i+1]=arr[i];
                i--;
            }
            arr[i+1]=key;
        }
    }


    //selection sort
    public static void selection_sort(int arr[]){
        int n = arr.length;
        for(int i=0; i<n-1;i++){
            int minIndex =i;
            for(int j =i+1; j<n;j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }    

    // counting sort
    public static void counting_sort(int[] arr){
        int n = arr.length;
        int max = arr[0];
        int min = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        int range = max-min+1;
        int count[]= new int[range];
        for(int i=0;i<n;i++){
            count[arr[i]-min]++;
        }

        int index =0;
        for(int i=0; i<range;i++){
            while(count[i]>0){
                arr[index++] = i+min;
                count[i]--;
            }
        }
    }

    //bucket sort
    public static void bucket_sort(int[] arr){
        int n = arr.length;
        if(n<=0){
            return;
        }
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int bucket[] = new int[max+1];
        for(int i=0; i<n; i++){
            bucket[arr[i]]++;
        }
        int index = 0;
        for(int i=0; i<bucket.length; i++){
            while(bucket[i]>0){
                arr[index++] = i;
                bucket[i]--;
            }
        }
    }

    // radix sort
    public static void radix_sort(int[] arr){
         
    }
    public static void main(String[] args){
        int arr[] = {12, 11, 13, 5, 6};
        insertion_sort(arr);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        int arr2[] = {64, 25, 12, 22, 11};
        selection_sort(arr2);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();
        int arr3[] = {4, 2, 2, 8, 3, 3, 1};
        counting_sort(arr3);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println();
        int arr4[] = {4, 2, 2, 8, 3, 3, 1};
        bucket_sort(arr4);
        System.out.println("Sorted array: ");
        for (int i = 0; i < arr4.length; i++) {
            System.out.print(arr4[i] + " ");
        }
    }
}
