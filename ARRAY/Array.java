public class Array {
     public static void array (int arr []) {

        int sum = 0;
        for(int i = 0; i<arr.length; i++){

        
         sum = sum + arr[i];

        
    }
    // return sum;
    System.out.println(sum);


}
    public static void main(String[] args) {

        int []arr = {2,5,4,3,6,7};
        array(arr);
        
        // System.out.println(array(arr));

    }
    
}
