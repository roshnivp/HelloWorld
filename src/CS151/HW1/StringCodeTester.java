package CS151.HW1;

/**
 * Created by Roshni Velluva Puthanidam on 31/08/16.
 */
public class StringCodeTester {

    public static void main(String[] args) {
        StringCode stringCode;
        System.out.println(StringCode.blowup("xx3abb"));
        System.out.println(StringCode.blowup("2x3Z"));
        System.out.println(StringCode.maxRun("abbcccddbbbxx"));
        System.out.println(StringCode.maxRun(""));

    }
}