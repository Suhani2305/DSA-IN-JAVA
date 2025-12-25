import java.util.Map;
import java.util.HashMap;

public class slidingWindow {
    // constants window 
    public static int constantWindow(int[] arr, int k){
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        int l = 0;
        int r = k - 1;
        int maxSum = sum;
        while(r< arr.length -1){
            sum = sum - arr[l];
            l++;
            r++;
            sum += arr[r];
            maxSum = Math.max(maxSum, sum);

        }
        return maxSum;
        
    }

    //variable window with sum <= k
    public static int variableWindow(int[] arr, int k){
        int l =0, r =0;
        int sum =0;
        int maxlength = 0;
        while(r<arr.length){
            sum = sum+arr[r];
            while(sum > k && l <= r){
                sum = sum - arr[l];
                l++;
            }
            if(sum<=k){
                maxlength = Math.max(maxlength, r - l + 1);
            }
            r++;
        }
        return maxlength;

    }
    //no of subarrays with sum <= k
    public static int noOfSubarrays(int[] arr, int k){
        int l = 0, r = 0;
        int sum = 0;
        int count = 0;
        while(r < arr.length){
            sum += arr[r];
            while(sum > k && l <= r){
                sum -= arr[l];
                l++;
            }
            count += (r - l + 1);
            r++;
        }
        return count;
    }

    //shortest / minimum window with condition
    public static int minWindow(int[] arr, int k){
        int l = 0, r = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        while(r < arr.length){
            sum += arr[r];
            while(sum >= k && l <= r){
                minLength = Math.min(minLength, r - l + 1);
                sum -= arr[l];
                l++;
            }
            r++;
        }
        return minLength == Integer.MAX_VALUE ? 0 : minLength; // return 0 if no valid window found
    }


    //longest substring with at ost k distinct characters
    public static int longestSubstringWithKDistinct(String s, int k) {
        int maxlength = 0;
        int l = 0, r = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            if( map.size() <= k) {
                maxlength = Math.max(maxlength, r - l + 1);
            }
           if (map.size() > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }
                l++;
            }
            r++;
        }
        return maxlength;

    }

    //number of substring conatining all three characters
    public static int numberOfSubstringWithAllThreeCharacters(String s){
        int count = 0;
        int l = 0, r = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (r < s.length()) {
            map.put(s.charAt(r), map.getOrDefault(s.charAt(r), 0) + 1);
            while (map.size() == 3) {
                count += (s.length() - r); // all substrings starting from l to r
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                if (map.get(s.charAt(l)) == 0) {
                    map.remove(s.charAt(l));
                }
                l++;
            }
            r++;
        }
        return count;
    }

    //subarrays with k different integers
    public static int subarraysWithKDistinct(int[] arr, int k) {
        return atMostKDistinct(arr, k) - atMostKDistinct(arr, k - 1);
    }
    private static int atMostKDistinct(int[] arr, int k) {
        int l = 0, r = 0;
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (r < arr.length) {
            map.put(arr[r], map.getOrDefault(arr[r], 0) + 1);
            while (map.size() > k) {
                map.put(arr[l], map.get(arr[l]) - 1);
                if (map.get(arr[l]) == 0) {
                    map.remove(arr[l]);
                }
                l++;
            }
            count += (r - l + 1);
            r++;
        }
        return count;
    }


    // maximum points you can obtain from cards
    public static int maxPointsFromCards(int[] arr, int k) {
    int n = arr.length;
    int lsum = 0;

    // take first k cards
    for (int i = 0; i < k; i++) {
        lsum += arr[i];
    }

    int totalSum = lsum;
    int rsum = 0;

    // now start replacing from the back
    for (int i = 1; i <= k; i++) {
        lsum -= arr[k - i];        // remove from left
        rsum += arr[n - i];        // add from right
        totalSum = Math.max(totalSum, lsum + rsum);
    }

    return totalSum;
}


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 10;
        int l = 4;
        System.out.println("Constant Window Max Sum: " + constantWindow(arr, l));
        System.out.println("Variable Window Max Length: " + variableWindow(arr, k));
        System.out.println("No of Subarrays with Sum <= k: " + noOfSubarrays(arr, k));
        System.out.println("Minimum Window Length with Sum >= k: " + minWindow(arr, k));
        String s = "aaabbccd";
        int distinctK = 2;
        System.out.println("Longest Substring with " + distinctK + " Distinct Characters:" + longestSubstringWithKDistinct(s, distinctK));
        int [] arr2 = {6,2,3,4,7,2,1,7,1};
        System.out.println(maxPointsFromCards(arr2, 4));

    }
}
