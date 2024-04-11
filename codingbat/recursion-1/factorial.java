package codingbat.recursion-1;

public class factorial {

    public int factorial(int n) {

        int result = n;

        for(int i = n-1; i >= 1; i--){
            result *= i;
        }

        return result;
  
    }

    public int alternative(int n ){
        if(n==1){
            return n;
        }else{
            return n * factorial(n-1);
        }
    }
    
}
