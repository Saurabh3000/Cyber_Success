public class Program2 {

    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {2, 5, 3,5};

        for(int i = 0; i<arr.length; i++ )
        {
            sum = sum+arr[i];
        }

        System.out.println("Sum of all array elements = "+sum);
    }
    
}
