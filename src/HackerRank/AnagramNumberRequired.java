package HackerRank;

/**
 * Created by Roshni Velluva Puthanidam on 10/08/16.
 */
public class AnagramNumberRequired {
    public static void main(String[] args) {

        AnagramNumberRequired an = new AnagramNumberRequired();
        String[] arr_new = new String[]{"abccbd", "malayalam"};
        an.NoOfCharForAnagram(arr_new);
    }

    void NoOfCharForAnagram(String[] arr) {


        for (int k = 0; k < arr.length; k++) {

            String newString = arr[k];

            if (newString.length() % 2 == 0) {
                int mid = newString.length() / 2;
                String s = newString.substring(0, mid);
                String r = newString.substring(mid);


                for (int x = 0; x < s.length(); x++) {

                    char str = (s.charAt(x));
                    int index = r.indexOf(str);
                    if(index == -1){
                        continue;
                    }
                    else {
                        r = r.substring(0,index)+r.substring(index+1);
                    }

//                    for (int pos1 = 0; pos1 < s.length(); pos1++) {
//                        if ((r.charAt(x) == s.charAt(pos1))) {
//                            s = s.substring(0, pos1) + s.substring(pos1 + 1);
//                            break;
//                        }
//
//                    }

                }
                System.out.println(r.length());


            } else {
                System.out.println(-1);
//

            }
        }

    }
}
