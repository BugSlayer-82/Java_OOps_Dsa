import java.util.HashMap;

public class OnlyDsaHashMap_5 {

    // /* Question 2 ---> Two Sum */
    static int [] twoSum(int [] arr,int target){
        
        return new int []{};
    }


    // /* Question 1 ---> Check Whether array contains duplicate */
    static boolean isDuplicate(int [] arr){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i<arr.length; i++){
            int count = 0;
            if(!map.containsKey(arr[i]))
            {
                count++;
                map.put(arr[i],count);
            }else{
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // /* Question 1 ---> Check Whether array contains duplicate */
        // int [] arr={2,5,4,5,3,1};
        // boolean result = isDuplicate(arr);
        // if(result){
        //     System.out.print("Element : "+result);
        // }
        // else{
        //     System.out.println("Element : "+result);
        // }
        // System.out.println();


        // /* Question 2 ---> Two Sum */
        // int[] arr = { 2, 5, 9, 11, 16 };
        // int target = 7;
        // for (int i : twoSum(arr, target)) {
        //     System.out.print(i + " ");
        // }
        // System.out.println();

    }
}
