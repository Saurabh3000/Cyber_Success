public class Program7 {

    public static void main(String[] args) {
        
        int[] arr = {2, 58, 68, 3, 55};
        int max = arr[0];
        int sec_max = arr[0];

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]>max)
            {
                sec_max = max;
                max = arr[i];
            }else if(arr[i]>sec_max && arr[i] != max) {
                sec_max = arr[i];
            }
        }
        System.out.println("Second Maximum element = "+sec_max);
    }
    
}
