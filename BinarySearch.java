import java.util.Arrays;

public class BinarySearch {

    public static int binarySearch(int [] array , int target){
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;
            if(array[mid] == target){
                return mid;
            } else if (target > array[mid]) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }

            
        }
        

        return -1;
    }
    public static void main(String[] args) {
        int [] array = {1,2,10,3,4,5};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int target = 10;
        int result = binarySearch(array, target);
        if (result == -1){
            System.out.println("ไม่เจอ target ใน array");

        } else {
            System.out.println("เจอ target " + target + "ที่ index " + result);
        }
    }
}
