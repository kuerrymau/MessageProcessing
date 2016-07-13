package message;

/**
 * Created by chingwenje on 7/10/16.
 */
public class MySingleton {

    private static MySingleton mySingleton = new MySingleton();

    private MySingleton() {
    }

    public static MySingleton getInstance() {
        return mySingleton;
    }

    protected static String reverseString(String stringToReverse) {
        String reversedString = "";
        
        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversedString += stringToReverse.charAt(i);
        }

        return reversedString;
    }
}
