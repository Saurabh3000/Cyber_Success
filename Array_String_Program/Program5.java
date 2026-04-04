public class Program5 {
    public static void main(String[] args) {
        
        int[] arr = {11, 2, 4, 38, 73};
        int even = 0;
        int odd = 0 ;

        for(int i = 0; i<arr.length; i++)
        {
            if(arr[i]%2==0)
            {
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Count of Even elements is = "+even);
        System.out.println("Count of Odd elements is = "+odd);
    }
    
}
