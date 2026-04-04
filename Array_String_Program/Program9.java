public class Program9 {

    public static void main(String[] args) {
        
        int num = 6;
        int count = 0;

        for(int i = 1; i<=num; i++)
        {
            if(num % i == 0)
            {
                count++;
            }
        }

        if(count==2)
        {
            System.out.println("Give number is prime = "+num);
        }else{
            System.out.println("Give number is not prime = "+num);
        }
    }
    
}
