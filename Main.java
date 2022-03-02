package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(sumDigits(434));
        System.out.println(count7(60000000));
        System.out.println(powerN(2,10));
        System.out.println(countX("nnxnnx"));
    }

    private static int  count7(int i) {
        int count;
        if (i == 0 ){
            count = 0;
        } else{
            int rightDigit = i % 10;
            int rest = i / 10;
            if (rightDigit == 7 ){
                count = 1 + count7(rest);
            } else {
                count = 0 + count7(rest);
            }
        }

        return count;
    }

    // non-negative number
    public static int sumDigits(int n ){
        int sum;
        if (n == 0){
            sum  = 0;
        } else {
            int rightDigit = n % 10;
            int rest = n / 10;
            sum = rightDigit + sumDigits(rest);
        }

        return sum;
    }
    // Preconditon: base > 0 and exp >= 0
    public static int powerN (int base, int exp){
        int product;

        if (exp == 0 ){
            product = 1;
        } else {
            product = base * powerN(base, exp - 1);
        }
        return product;
    }

    public static int countX(String str){
        int count;

        if (str.isEmpty()){
            count = 0;
        } else {
            if (str.charAt(0) == 'x') {
            count = 1  + countX(str.substring(1));
            } else {
                count = 0 + countX(str.substring(1));
            }
        }


        return count;
    }

}
