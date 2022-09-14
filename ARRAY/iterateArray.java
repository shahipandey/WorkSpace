// import java.nio.IntBuffer;

// import javax.sql.rowset.spi.SyncProviderException;

public class iterateArray {

    static int iterate(int arr[], int n) {
        
        int sum = 0;


        for(int i=0; i<n; i++) {

            sum = sum + arr[i];
            

        }
        // System.out.println(sum);

        return sum;
        
        
    }
        
    
   
    public static void main(String[] args) {

        
 
        int arr[] = {10, 2, 4, 5, 9, 4, 7 }; 
        int n = arr.length;
        // iterate(arr, n);

        System.out.println(iterate(arr, n));

    }

    
}

