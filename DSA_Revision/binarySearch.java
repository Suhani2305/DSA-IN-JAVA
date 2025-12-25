// class binarySearch{
//     //lower bound binary search
//     public static int lowerBound(int arr[], int x){
//         int low =0 , high = arr.length -1;
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]>=x){
//                 return i; 
//             }
//         }
//         return -1;
//     }

//     public static int upperBound(int arr[], int x){
//         int low =0 , high = arr.length -1;
//         for(int i =0;i<arr.length;i++){
//             if(arr[i]>x){
//                 return i; 
//             }
//         }
//         return -1;
//     }


//     //floor / ceiling binary search
//     public static int floorBinarySearch(int arr[], int x){
//         int low = 0, high = arr.length - 1;
//         while(low <= high){
//             int mid = low + (high - low) / 2;
//             if(arr[mid] == x){
//                 return mid; // exact match
//             } else if(arr[mid] < x){
//                 low = mid + 1; // search in right half
//             } else {
//                 high = mid - 1; // search in left half
//             }
//         }
//         return high; // return the largest element less than x
//     }

//     public static int ceilBinarySearch(int arr[], int x){
//         int low = 0, high = arr.length - 1;
//         while(low <= high){
//             int mid = low + (high - low) / 2;
//             if(arr[mid] == x){
//                 return mid; // exact match
//             } else if(arr[mid] < x){
//                 low = mid + 1; // search in right half
//             } else {
//                 high = mid - 1; // search in left half
//             }
//         }
//         return low; // return the smallest element greater than x
//     }

    
//     public static void main(String[] args) {
//         int arr[] = {3,5,8,15,19};
//         int x = 15;
//         int result = lowerBound(arr, x);
//         if(result != -1){
//             System.out.println("Lower bound of " + x + " is at index: " + result);
//         } else {
//             System.out.println("Element not found");
//         }

//         int ans = upperBound(arr, x);
//         if(ans != -1){
//             System.out.println("Upper bound of " + x + " is at index: " + ans);
//         } else {
//             System.out.println("Element not found");
//         }
//     }
// }


class binarySearch {
    // sqrt using binary search
    public static int sqrt(int x){
        if (x < 2) return x;
        int low = 0, high = x;
        while(low <= high){
            int mid = low + (high - low) / 2;
            long square = (long) mid * mid;
            if(square == x){
                return mid;
            } else if(square < x){
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return high;
    }

    public static int func(int mid , int n , int m){
        long ans = 1;
        for(int i = 1; i <= n; i++){
            ans *= mid;
            if(ans > m) return 2;
        }
        if(ans == m) return 1;
        return 0;
    }

    public static int nthRoot(int n, int m) {
        int low = 1, high = m;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int result = func(mid, n, m);
            if (result == 1) {
                return mid;
            } else if (result == 2) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int x = 56;
        int result = sqrt(x);
        System.out.println("The square root of " + x + " is: " + result);

        int n = 3, m = 27;
        int nthRootResult = nthRoot(n, m);
        System.out.println("The " + n + "th root of " + m + " is: " + nthRootResult);
    }
}
