//APCS Summer Homework
//Andrew Zhang

public class HelloWorld{
    public static void main(String[] args){
        int[] num = {5, 12, 17, 28, 41, 58, 63, 76, 82, 99};
        int[] primes = {13, 41, 61, 109, 181, 277, 311, 389, 431, 541};

       for (int i = 0; i < num.length; i++) {
        int input = num[i];
        int expected = primes[i];
        int result = nthPrime(input);

        if (result == expected) {
            System.out.println("pass");
        } else {
            System.out.println("fail: expected " + expected + ", but value returned was " + result);
        }
        }
    }

//return true if and only if x is prime,false otherwise.
    public static boolean isPrime(int x){
        if (x <= 1){
            return false;
        }
        for (int i = 2; i < x; i++){
            if (x % i == 0){
                return false;
            }
        }
        return true;
  //just check divisibility for all values from `2` through `x - 1` inclusive.
  //(This is not a good algorithm, just use it)
}

//return the nth prime,
//e.g. nthPrime(0) returns 2, nthPrime(1) returns 3, etc.
    public static int nthPrime(int n){
        int count = 0;
        int num = 2;
        while (true){
            if(isPrime(num)){     
                if (count == n){
                    return num;
                }
                count++;
            }
                num++;
            }
        }

  //Loop through values and check if they are prime until you find n of them
  //use your isPrime function.
} 

