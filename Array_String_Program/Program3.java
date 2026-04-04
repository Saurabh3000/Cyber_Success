public class Program3 {
    
    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {10, 20, 30, 40};
        int values = arr.length;

        for (int i=0; i<arr.length; i++) {
            sum = sum +arr[i];
        }

        System.out.println("Average of array elements = "+(sum/values));
        
    }
}
