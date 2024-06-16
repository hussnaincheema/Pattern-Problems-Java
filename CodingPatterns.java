
// /////////Print the Pattern of Solid Rectangle////////////
                     * * * * *
                     * * * * * 
                     * * * * * 
                     * * * * * 

public class CodingPatterns{
    public static void main(String args[]){
        int n = 4; //rows
        int m = 5; //columns
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// /////////Print the Pattern of Hollow Rectangle////////////
                     * * * * *
                     *       * 
                     *       * 
                     * * * * * 

public class CodingPatterns{
    public static void main(String args[]){
        int n=4;
        int m=5;

        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*" + " ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

// /////////Print the Pattern of Half Pyramid////////////
                     * 
                     * *  
                     * * * 
                     * * * * 
                     * * * * *

public class CodingPatterns{
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }

    }
}


// /////////Print the Pattern of Inverted Half Pyramid////////////
                     * * * *
                     * * *  
                     * *  
                     * 

public class CodingPatterns{
    public static void main(String args[]){
        int n=4;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}

// /////////Print the Pattern of Inverted Half Pyramid (Rotated by 180deg) ////////////
                          *
                        * * 
                      * * * 
                    * * * * 


public class CodingPatterns{
    public static void main(String args[]){
        int n=4;
        for(int i=1; i<=n; i++){
            // inner loop for spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
                // inner loop for star printing
                for(int k=1; k<=i; k++){
                    System.out.print("*");
                }
            
            System.out.println();
        }
    }
}

//    ////////////Print the Number Pattern ///////////////
                    1
                    1 2
                    1 2 3
                    1 2 3 4 
                    1 2 3 4 5

public class CodingPatterns {

    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//    ////////////Print the Number Pattern ///////////////
                    1 2 3 4 5
                    1 2 3 4
                    1 2 3
                    1 2
                    1

public class CodingPatterns {

    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

//    ////////////Print the Number Pattern (Floyd's Triangle) ///////////////

                1
                2  3
                4  5  6
                7  8  9  10
                11 12 13 14 15

public class CodingPatterns {

    public static void main(String args[]){
        int n=5;
        int number = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number + "  ");
                number++;
            }
            System.out.println();
        }
    }
}

//    ////////////Print the Number Pattern ///////////////
                    1
                    0 1
                    1 0 1
                    0 1 0 1
                    1 0 1 0 1

public class CodingPatterns {

    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum % 2 ==0){
                    System.out.print("1" + " ");
                }else{
                    System.out.print("0" + " ");
                }
            }
            System.out.println();
        }
    }
}


//    ////////////Print the Butterfly Pattern ///////////////

                *             *
                * *         * *
                * * *     * * *
                * * * * * * * *
                * * * * * * * *
                * * *     * * *
                * *         * *
                *             *

public class CodingPatterns{
    public static void main(String args[]){
        int n = 5;
        //upper half part
        for(int i=1; i<=n; i++){
            //left part of upper half 
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            int spaces=2*(n-i);
            for(int k=1; k<=spaces; k++){
                System.out.print("  ");
            }
            //right part of upper half
            for(int l=1; l<=i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }

        //lower half part
        for(int i=n; i>=1; i--){
            //left part of lower half
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            //spaces
            int spaces = 2*(n-i);
            for(int k=1; k<=spaces; k++){
                System.out.print("  ");
            }
            //right part of lower half
            for(int l=1; l<=i; l++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// //    ////////////Print the Pattern of Solid Rhombus ///////////////

                                  * * * * *
                                * * * * *
                              * * * * * 
                            * * * * *
                          * * * * *

public class CodingPatterns{
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            //spaces
            int spaces= n-i;
            for(int j=1; j<=spaces; j++){
                System.out.print("  ");
            }
            //star
            for(int k=1; k<=5; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


// // //    ////////////Print the Number Pyramid Pattern ///////////////

                                    1
                                  2   2
                                3   3   3
                              4   4   4   4
                            5   5   5   5   5

public class CodingPatterns{
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //Numbers
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}


// // //    ////////////Print the Palindromic Pattern ///////////////

                                        1
                                      2 1 2
                                    3 2 1 2 3
                                  4 3 2 1 2 3 4
                                5 4 3 2 1 2 3 4 5

public class CodingPatterns{
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //left half Numbers
            for(int j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            //right half NUmbers
            for(int j=2; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


// // //    ////////////Print the Palindromic Pattern ///////////////

                                1 1
                              2 1 1 2
                            3 2 1 1 2 3
                          4 3 2 1 1 2 3 4
                        5 4 3 2 1 1 2 3 4 5


public class CodingPatterns{
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
        //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //left half Numbers
            for(int j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            //right half NUmbers
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


// // //    ////////////Print the diamond Pattern ///////////////


                                        *
                                      * * *
                                    * * * * *
                                  * * * * * * *
                                  * * * * * * *
                                    * * * * *
                                      * * *
                                        *

public class CodingPatterns{
    public static void main(String args[]){
        int n=4;
        //Upper Half Pattern
        for(int i=1; i<=n; i++){
            //spaces for Upper half
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //Stars for Upper half
            int stars = 2*i-1;
            for(int j=1; j<=stars; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //Lower Half Pattern
        for(int i=n; i>=1; i--){
            //spaces for Lower half
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            //Stars for Lower half
            int stars = 2*i-1;
            for(int j=1; j<=stars; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }


  // // //    ////////////Print the Character Triangle Pattern ///////////////


                                    A
                                    B C
                                    D E F 
                                    G H I J
                                    K L M N O

public class CodingPatterns{
    public static void main(String args[]){
        int n= 5;
        char ch = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
}


// // //    ////////////Print the Inverted Half Pyramid Numbers ///////////////


                            4 4 4 4
                            3 3 3
                            2 2 
                            1


public class CodingPatterns{
    public static void main(String args[]){
        int n = 4;
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}


// // // //    ////////////Print the Given Pattern ///////////////


                                1 2 3 4 5 6
                                  1 2 3 4 5
                                    1 2 3 4
                                      1 2 3 
                                        1 2 
                                          1


public class CodingPatterns{
    public static void main(String args[]){
        int n=6;
        for(int i=n; i>=1; i--){
            //for spaces
            for(int s=1; s<=n-i; s++){
                System.out.print("  ");//two spaces
            }
            //Numbers
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


// // // //    ////////////Print the Given Pattern ///////////////

                            1 2 3 4 5 6
                             1 2 3 4 5
                              1 2 3 4
                               1 2 3
                                1 2
                                 1

public class CodingPatterns {
    public static void main(String[] args) {
        int n = 6; 

        for (int i = n; i >= 1; i--) {
            //spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");//One Space
            }
            //Numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}


// // // // //    ////////////Print the Given Pattern ///////////////


                            1
                            2 4
                            3 6 9
                            2 4
                            1


public class CodingPatterns{
    public static void main(String args[]){
        int n=3;
        //Upper half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
        //lower half
        for(int i=2; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}


// // // // //    ////////////Print the Given Pattern ///////////////


                    &                &
                      &            &
                        &        &
                          &    &
                            & 


public class CodingPatterns {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            // Print "&" symbol
            System.out.print("&");

            // Print spaces between the two "&" symbols
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print("  ");
            }

            // Print second "&" symbol, except in the last line
            if (i != n) {
                System.out.print("&");
            }

            // Move to the next line
            System.out.println();
        }
    }
}


// // // // // //    ////////////Print the Given Pattern ///////////////


                            1 2 3 4 5
                            2 4 6 8 10
                            3 6 9 12 15
                            4 8 12 16 20
                            5 10 15 20 25

public class CodingPatterns{
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i*j + " ");
            }
            System.out.println();
        }
    }
}


// // // // // //    ////////////Print the Given Pattern ///////////////


                        1 2 4 6
                        2 2 4 6
                        3 2 4 6
                        4 2 4 6

public class CodingPatterns {
    public static void main(String args[]){
        int n=4;
        for(int i=1; i<=n; i++){
            System.out.print(i + " ");

            for(int j=1; j<n; j++){
                System.out.print(j*2 + " ");
            }
            System.out.println();
        }
    }
    
}


// // // // // //    ////////////Print the Given Pattern ///////////////


                            #####*#####
                            ####*#*####
                            ###*###*###
                            ##*#####*##
                            #*#######*#
                            *#########*


public class CodingPatterns{
    public static void main(String args[]){
        int n=6;
        for(int i=1; i<=n; i++){
            //Print leading Hashes
            for(int j=1; j<=n-i; j++){
                System.out.print("# ");
            }
            //Print the First Star
            System.out.print("* ");
            //Print middle Hashes
            for(int j=1; j<2*(i-1); j++){
                System.out.print("# ");
            }

            //Print Second Star If not the First row
            if(i!=1){
                System.out.print("* ");
            }

            //Print Trailing Hashes
            for(int j=1; j<=n-i; j++){
                System.out.print("# ");
            }

            //Move to the Next Line
            System.out.println();
        }
    }
}


// // // // // // //    ////////////Print the Given Pattern ///////////////


                            #####*#####
                            ####*#*####
                            ###*###*###
                            ##*#####*##
                            #*#######*#
                            *#########*
                            *#########*
                            #*#######*#
                            ##*#####*##
                            ###*###*###
                            ####*#*####
                            #####*#####


public class CodingPatterns{
    public static void main(String args[]){
        int n=6;
        //For Upper Half Pattern
        for(int i=1; i<=n; i++){
            //Print leading Hashes
            for(int j=1; j<=n-i; j++){
                System.out.print("# ");
            }
            //Print the First Star
            System.out.print("* ");
            //Print middle Hashes
            for(int j=1; j<2*(i-1); j++){
                System.out.print("# ");
            }

            //Print Second Star If not the First row
            if(i!=1){
                System.out.print("* ");
            }

            //Print Trailing Hashes
            for(int j=1; j<=n-i; j++){
                System.out.print("# ");
            }

            //Move to the Next Line
            System.out.println();
        }
        //For Lower pattern
        for(int i=n; i>=1; i--){
            //Print leading Hashes of Bottom part
            for(int j=1; j<=n-i; j++){
                System.out.print("# ");
            }
            //Print the First Star of Bottom part
            System.out.print("* ");
            //Print middle Hashes
            for(int j=1; j<2*(i-1); j++){
                System.out.print("# ");
            }

            //Print Second Star of Bottom part If not the First row
            if(i!=1){
                System.out.print("* ");
            }

            //Print Trailing Hashes of Bottom part
            for(int j=1; j<=n-i; j++){
                System.out.print("# ");
            }

            //Move to the Next Line for Bottom part
            System.out.println();
        }
    }
}


// // // // // // // //    ////////////Print the Given Pattern ///////////////


                                BBBBBBBBB
                                 BBBBBBB
                                  BBBBB
                                   BBB
                                    B

public class CodingPatterns{
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            //Leading Spaces
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            //Print B
            for(int j=1; j<=2*(n-i)+1; j++){
                System.out.print("B");
            }
            System.out.println();
        }
    }
}


// // // // // // // //    ////////////Print the Given Digit Pyramid ///////////////

                                                    1
                                                   232
                                                  34543
                                                 4567654
                                                567898765
                                               67890109876
                                              7890123210987
                                             890123454321098
                                            90123456765432109
                                           0123456789876543210


public class CodingPatterns{
    public static void main(String args[]){
        int  n=10;
        for(int i=1; i<=n; i++){
            //For Leading Spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            // Print increasing numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num % 10);
                num++;
            }

            // Print decreasing numbers
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num % 10);
                num--;
            }

            // Move to the next line
            System.out.println();
        }
    }
}


// // // // // // // //    ////////////Print the Given Pattern ///////////////


                                    A
                                    A B
                                    A B C
                                    A B C D
                                    A B C D E

public class CodingPatterns{
    public static void main(String args[]){
        int n=5;
        for(int i=1; i<=n; i++){
            for (char ch = 'A'; ch < 'A' + i; ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }

    }
}

// // // // // // // // //    ////////////Print the Given Pattern ///////////////


                                    1
                                    3 5
                                    7 9 11
                                    13 15 17 19
                                    21 23 25 27 29
                                    31 33 35 37 39 41
                                    43 45 47 49 51 53 55


public class CodingPatterns{
    public static void main(String[] args) {
        int n=7;
        int num=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(num + " ");
                num +=2;
            }
            System.out.println();
        }
    }
}


// // // // // // // // //    ////////////Print the Given Pattern ///////////////


                                1234567654321
                                123456 654321
                                12345   54321
                                1234     4321
                                123       321
                                12         21
                                1           1



    public class NumberPattern {
    public static void main(String[] args) {
        int n = 7; // Number of rows

        // Loop through each row
        for (int i = 1; i <= n; i++) {
            // Print increasing numbers
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }

            // Print spaces
            for (int j = 1; j < 2 * (i - 1); j++) {
                System.out.print(" ");
            }

            // Print decreasing numbers using if-else 
            for (int j = n - i + 1; j >= 1; j--) {
                if (i != 1 || j != n - i + 1) {  // To avoid printing the last number twice in the first row
                    System.out.print(j);
                }
            }

            // ANOTHER WAY TO PRINT RIGHT SIDE
            // if(i!=1){
            //     for (int j = n-i+1; j >= 1; j--) {
            //         System.out.print(j);
            //     }
            // }else{
            //     for (int j = n-i; j >= 1; j--) {
            //         System.out.print(j);
            //     }
            // }
            

            // Move to the next line
            System.out.println();
        }
    }
}


// // // // // // // // //    ////////////Print the Given Pattern ///////////////




                                                        &
                                                       & &
                                                      &   &
                                                     &     &
                                                    &       &
                                                   &         &
                                                  &           &
                                                 &             &
                                                &               &
                                               &&&&&&&&&&&&&&&&&&&


public class CodingPatterns{
    public static void main(String[] args) {
        int n=10;
        for(int i=1; i<=n; i++){
            //Spaces
            for(int j=n-i; j>=1; j--){
                System.out.print(" ");
            }
            //Print the First &
            System.out.print('&');

            //Print inner Spaces
            if(i!=1){
            for(int j=1; j<2*(i-1); j++){
                System.out.print(" ");
            }

            //Print the Second &
            System.out.print('&');
        }
            System.out.println();
            
        }

        // Print the last row with '&' symbols
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("&");
        }
        System.out.println();
    }
}


// // // // // // // // //    ////////////Print the Given Pattern ///////////////


                                    0
                                    0 1
                                    0 1 2
                                    0 1 2 3
                                    0 1 2 3 4
                                    0 1 2 3 4 5


public class CodingPatterns{
    public static void main(String[] args) {
        int n = 6;
        for(int i=1; i<=n; i++){
            for(int j=0; j<i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }


  // // // // // // // // //    ////////////Print the Given Pattern ///////////////



                                    --------
                                   --------
                                    --------
                                   --------
                                    --------
                                   --------
                                    --------
                                   --------

public class CodingPatterns {
    public static void main(String[] args) {
        int n = 8; // Number of rows

        // Loop through each row
        for (int i = 1; i <= n; i++) {

            // Print leading spaces for odd rows
            if (i % 2 == 1) {
                System.out.print(" ");
            }
            
            // Print the rest of the line
            for (int j = 1; j <= n; j++) {
                System.out.print("-");
            }

            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
}



