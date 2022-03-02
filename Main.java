package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(numPins(13));
        System.out.println(bunnyEars(20));
        System.out.println(bunnyEars2(20));
        System.out.println(count7(7373));
    }

    private static int count7(int i) {
        int num;
        if (i < 7) {
            return 0;
        }
        else
        { if ( 7 == i % 10) {
                num = 1;
            } else {
                num = 0;
            }
        }
        return num + count7(i / 10);
    }



    public static int bunnyEars (int bunnies){
        int totalEars;
        if (bunnies == 0) {
            totalEars = 0;
        }else {
            totalEars = 2 + bunnyEars(bunnies- 1);
        }

        return totalEars;
    }

    public static int bunnyEars2 (int bunnies){
        int totalEars;
        if (bunnies == 0) {
            totalEars = 0;
        }else  if (bunnies % 2  == 1 ) { // odd case
            totalEars = 2 + bunnyEars2( bunnies - 1);
        } else { // even case
            totalEars = 3 + bunnyEars2(bunnies - 1 );
        }

        return totalEars;
    }



    public static int  numPins (int rows ){
        int totalPins;
        if (rows == 0 ){ // the base case.
            totalPins = 0;
        } else {
            totalPins = rows + numPins(rows - 1);
        }
        return totalPins;
    }
}
