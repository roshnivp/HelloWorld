package HackerRank;

/**
 * Created by Roshni Velluva Puthanidam on 10/02/17.
 */
public class ReverseEachWord
{
    static void reverseEachWordOfString(String inputString)
    {

        String[] words = inputString.split(" ");
        String reverseString = "";

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            //word.replaceAll("","");
            String reverseWord = "";

            for (int j = word.length()-1; j >= 0; j--)
            {
                //boolean isWhitespace = String.valueOf(word.charAt(j)).matches("^\\s*$");

                reverseWord = reverseWord + word.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
//            if(reverseWord.length()>0){
//                reverseString = reverseString + reverseWord + " ";
//            }

        }

        System.out.println(inputString);

        System.out.println(reverseString);

        System.out.println("-------------------------");
    }

    public static void main(String[] args)
    {
//        reverseEachWordOfString("Java Concept Of The Day");
//
//        reverseEachWordOfString("Java J2EE JSP Servlets Hibernate Struts");
//
        reverseEachWordOfString("I am string");

        reverseEachWordOfString("Reverse       Me");
    }
}