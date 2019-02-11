package PracticeQstns;

import HackerRank.StringToNumber;

import java.util.Scanner;

/**
 * Created by Roshni Velluva Puthanidam on 09/02/17.
 */
public class IntToEnglish {
    private String[] ones = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private String[] teens = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private String[] tens = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private String[] thousands = {"", "Thousand", "Million", "Billion"};

    public String numberToWords(int num) {
       if(num==0)return "Zero";
       String englishWord ="";
       int thousandsPlace =0;

       while(num!=0){
           int rem = num %1000; //gives last 3 digits
           if(rem!=0){
               englishWord =evaluateChunk(rem)+" "+thousands[thousandsPlace]+" "+englishWord;
           }
           thousandsPlace++;
           num/=1000;
       }
       return englishWord.trim();

    }
    public String evaluateChunk(int n){
        int hundredPlace = (n/100)%10;
        int tensPlace = (n/10)%10;
        int onesPlace = (n)%10;
        String chunk="";

        if(hundredPlace!=0){
            chunk+=ones[hundredPlace]+" "+"Hundred";
            if(tensPlace!=0 || onesPlace!=0){
                chunk+=" ";
            }
        }

        if(tensPlace==0){
            chunk+=ones[onesPlace];
        }
        else if(tensPlace==1){
            chunk+=teens[onesPlace];
        }
        else if(tensPlace>1 && onesPlace!=0){
            chunk+=tens[tensPlace]+" "+ones[onesPlace];
        }
        else{
            chunk+=tens[tensPlace];
        }
        return chunk;

    }
    public static void main(String[] args){
//        Scanner in=new Scanner(System.in);
//        int n=in.nextInt();
        IntToEnglish ie=new IntToEnglish();
        String s=ie.numberToWords(12567);
        System.out.println(s);
    }
}
