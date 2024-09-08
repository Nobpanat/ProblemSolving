public class FindMaxInArray {

    public static int findMaxInArray(int [] array){
        int max = Integer.MIN_VALUE;
        for(int i =0; i< array.length; i++){
            if(array[i] >= max){
                max = array[i];
            }
        }    
        return max;
    }
    public static void main(String[] args) {
        int [] array = {1,2,5,3,4};
        
        System.out.println(findMaxInArray(array));
    }
}