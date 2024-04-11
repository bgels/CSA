package codingbat.recursion-1;

public class countX {
    public int countX(String str) {
        if(str.charAt(0) == 'x'){
            return 1 + countX(str.substring(1));
        }
        return 0;
    }
    
}
