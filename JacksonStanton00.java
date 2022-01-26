// Maxx Secrest, Arrays Practice, v0.2, 01/24/22

public class JacksonStanton00 {

    public static void main(String[] args) {

        
        

      /*  for(current_element = 0; current_element < carArr.length(); current _element += 1) {
            // code to execute
            // Statement 1 is executed ONCE BEFORE THE LOOP.
            // Statement 2 is the CONDITIONAL for the loop.
            // Statement 3 is executed EACH TIME THE LOOP RUNS.

        }
        
        
        String[] carArr  = {"BMW M5", "Ferrari 250 GTO", "Porsche 911", "Ford F150 Lightning", "Buick Skylark"};
        System.out.println(carArr[3]);
        // ONCE CREATED YOU CANNOT CHANGE THE SIZE OF AN ARRAY. IT IS FORBIDDEN!
        carArr[0] =  "Volkswagen Passat";
        


        for ( int i = 0; i <carArr.length; i++) {
            System.out.println(i);
            System.out.println(carArr[i]);
        }
    

        // Enhanced For Loop
        for (String eachElement : carArr ) {
            // Code to execute.
            System.out.println(eachElement);

        }
        int[] myGrades  = { 100, 25, 15, -3, 75, 35};
        for (int eachElement : myGrades ) {
            // Code to execute.
            System.out.println(eachElement);

        }
        double[] myBankAccount = {0.0, -1.25, 3.75, 456.99, 25.25, 12.123456, 3.14};
        for (double eachElement : myBankAccount ) {
            // Code to execute.
            System.out.println(eachElement);

        }
        */
        String[] carArr  = {"BMW M5", "Ferrari 250 GTO", "Porsche 911", "Ford F150 Lightning", "Buick Skylark"};
        System.out.println(carArr[3]);
        // ONCE CREATED YOU CANNOT CHANGE THE SIZE OF AN ARRAY. IT IS FORBIDDEN!
        carArr[0] =  "Volkswagen Passat";
        
        for (int i = 0; i < carArr.length; i++) {



            if (carArr[i].length() % 2 == 0) {}
                System.out.println(carArr[i]);
                System.out.println("This string has an even length.");


            }else {
            System.out.println(carArr[i]);
            System.out.println("This String has an even length")
        
        }



    }










}