
// /////////Print the Pattern of Solid Rectangle////////////
//                      * * * * *
//                      * * * * * 
//                      * * * * * 
//                      * * * * * 

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
//                      * * * * *
//                      *       * 
//                      *       * 
//                      * * * * * 

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
//                      * 
//                      * *  
//                      * * * 
//                      * * * * 
//                      * * * * *

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
//                      * * * *
//                      * * *  
//                      * *  
//                      * 

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
//                           *
//                         * * 
//                       * * * 
//                     * * * * 


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
                    // 1
                    // 1 2
                    // 1 2 3
                    // 1 2 3 4 
                    // 1 2 3 4 5

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
                    // 1 2 3 4 5
                    // 1 2 3 4
                    // 1 2 3
                    // 1 2
                    // 1

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

                // 1
                // 2  3
                // 4  5  6
                // 7  8  9  10
                // 11 12 13 14 15

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
                    // 1
                    // 0 1
                    // 1 0 1
                    // 0 1 0 1
                    // 1 0 1 0 1

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

                // *             *
                // * *         * *
                // * * *     * * *
                // * * * * * * * *
                // * * * * * * * *
                // * * *     * * *
                // * *         * *
                // *             *

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

                        //           * * * * *
                        //         * * * * *
                        //       * * * * * 
                        //     * * * * *
                        //   * * * * *

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
