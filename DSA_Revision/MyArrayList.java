 
import java.util.*;
public class MyArrayList {
    public static void main(String[] args){
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        int n = List.size();
        System.out.println("Size of the list: " + n);
        int a = List.get(2); // get the element at index 2
        System.out.println("Element at index 2: " + a);
        List.set(2, 10); // set the element at index 2 to 10
        System.out.println("Element at index 2 after setting: " + List.get(2));
        List.remove(2); // remove the element at index 2
        System.out.println("Element at index 2 after removing: " + List.get(2));
        System.out.println("List after removing element at index 2: " + List);
        List.add(2, 20); // add 20 at index 2

        //reverse the list
        for(int i = 0; i < n/2; i++){
            int temp = List.get(i);
            List.set(i, List.get(n-i-1));
            List.set(n-i-1, temp);
        }
        System.out.println("List after reversing: " + List);

        //sort the list
        Collections.sort(List);
        System.out.println("List after sorting: " + List);
        Collections.sort(List, Collections.reverseOrder()); // sort in descending order
        System.out.println("List after sorting in descending order: " + List);

        //Multidimensional ArrayList
        ArrayList<ArrayList<Integer>> List2D = new ArrayList<>();
        for(int i = 0; i < 3; i++){
            List2D.add(new ArrayList<>());
        }
        List2D.get(0).add(1);
        List2D.get(0).add(2);
        List2D.get(1).add(3);
        List2D.get(1).add(4);
        List2D.get(2).add(5);
        List2D.get(2).add(6);
        System.out.println("2D List: " + List2D);
        //Iterate through the list using for loop
        for(int i = 0; i < List.size(); i++){
            System.out.print(List.get(i) + " ");
        }
        System.out.println();
        //Iterate through the list using for-each loop
        for(int i : List){
            System.out.print(i + " ");
        }
        System.out.println();


        //container with most water problem
        int[] height = {1,8,6,2,5,4,8,3,7};
        int maxArea = 0;
        int left = 0, right = height.length - 1;
        

    }
}
