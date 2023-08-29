# Java-Udemy-Masterclass-Lambda-Mini-Challenge
In this challenge, Tim assigned a series of tasks for us to solve to demonstrate our understanding of Lambda Expressions with Functional Interfaces and some of their syntax differences.

//Mini challenge 1: Write the anonymous class below as a Lambda expression

        Consumer<String> printTheParts = new Consumer<String>() {
            @Override
            public void accept(String s) {
                String[] parts = s.split(" ");
                for (String part : parts) {
                    System.out.println();
                }
            }
        };

//Mini Challenge 2: Write the following method as a lambda expression

    public static String everySecondChar(String source) {
        StringBuilder returnVal = new StringBuilder();
        for (int i = 0; i < source.length(); i++){
            if(i % 2 == 1) {
                returnVal.append(source.charAt(i));
            }
        }
        return returnVal.toString();
    }

   //Mini Challenge 3: Write the code to execute the Mini Challenge 2's lambda expression's functional method, using 1234567890 as the argument to that method and print the result out
   //Mini Challenge 4: write another method called everySecondCharacter which should accept a Function or Unary Operator as a parameter as well as a second parameter that lets us pass 
     "1234567890"
   //Mini Challenge 5: Write a lambda expression that is declared with the Supplier Interface - it should return "I love Java", and assign it to a variable iLoveJava
   //Mini Challenge 6: Use the Supplier to assign a String "I love Lambda to a variable called supplierResult
   
