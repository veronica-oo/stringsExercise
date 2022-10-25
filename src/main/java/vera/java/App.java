package vera.java;

/**
 * 1. What is the length of the String: "Java" ?
 *
 */
public class App 
{
    public static void main( String[] args )
    { String name = "Java";
        System.out.println(name.length());

// 2. What char is at index position 6 in the following String: "Long example sentence" ?

    String textSample = "Long example sentence" ;
    for (int i = 0; i < textSample.length(); i++);
        System.out.println(textSample.charAt(6));

// 3. What is the index position of 'o' in the following String: //"Even longer example sentence" ?

    String longerSentence = "Even longer example sentence" ;
    int indexPost = longerSentence.indexOf('o');
        System.out.println(indexPost);
    int index2 = longerSentence.indexOf("even");
        System.out.println(index2);     // -1 because of case

    int index3 = longerSentence.indexOf("Even");
        System.out.println(index3);

/* 4. Given the following String: "Ok this is not as long!" create a substring of only "not as long" (excluding the
      exclamation point) and print it out.   */


    String cutString = "Ok this is not as long!" ;
        System.out.println(cutString.substring(11, 22));


/* 4. Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out. Then convert it back to
      uppercase and print it out again.     */

    String capsString = "CAPS EQUALS SCREAMING";
        System.out.println(capsString.toLowerCase());
        System.out.println(capsString.toUpperCase());


/* 5. Correct the following String: "Java is the worst programming language!" by replacing the (obviously incorrect)
      word "worst" with the word "best". Then print out the sentence. */

    String replaceWord = "Java is the worst programming language!";
        System.out.println(replaceWord.replace("worst", "best"));



/* 6. What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it?    */

    String trimWord = "\tJ\ta\tv\ta\t";
        System.out.println(trimWord.trim());



/* 7. Parse the following int: 20 to a String and add a 20 to the end of the String.
      Printing it out should return: "2020".         */

    int year = 20;
        String year2 = Integer.toString(year) + "20";
        System.out.println(year2);

    int yr=20;
        System.out.println("Parsing string example"+ " "+ String.valueOf(yr)+20);



/* 8. Oil and water don't go well together. Given the String: "Oil and Water", split them up into the words "Oil",
      "Water" and store them in a String array.   */


    String words= "Oil and water";
    String[]strArray= null;
    strArray =words.split(" ");
        for( int i=0; i<strArray.length; i++){
            System.out.println(strArray[i]);
        }







    }





    //public static void ()


}
