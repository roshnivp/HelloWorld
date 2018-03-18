import sun.jvm.hotspot.debugger.AddressException;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author Roshni Velluva Puthanidam
 *
 */



public class Helloworld {

    public static void main(String[] args) {
        String domain = "1mbc";
        if (domain.matches("^[a-m].*$")| domain.matches("^[0-9].*$")) {
            System.out.println("hello");
        }
        String line = "ECT@ECT.com" +
                "";

        StringTokenizer tokens = new StringTokenizer(line);
        while(tokens.hasMoreTokens()) {
            // TODO: iterate through tokens and emit (domain, one)
            String token=tokens.nextToken();
            String regex = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";

// "^(.+)@(.+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(token);
            if(token.matches(regex)){
                if(token.contains(("."))) {
                    domain = token.substring(token.lastIndexOf("@") + 1, token.length());
                    domain = domain.replaceAll("[^A-Za-z0-9.]", "");
                    System.out.println(domain);
                }

            }

        }

    }



}
