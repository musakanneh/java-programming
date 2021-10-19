package Easy.String;

/***
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 *
 * A defanged IP address replaces every period "." with "[.]".
 */
public class DefangIPaddr {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("1.1.1.1"));
    }

    public static String defangIPaddr(String address) {
        StringBuilder build_string = new StringBuilder();

        for (char item : address.toCharArray()) {
            if (item == '.') {
                build_string.append("[.]");
            } else {
                build_string.append(item);
            }
        }
        return build_string.toString();
    }
}