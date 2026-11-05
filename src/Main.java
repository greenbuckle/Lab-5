// https://github.com/greenbuckle/Lab-5.git
public class Main {
    public static void main(String[] args) {
        String num = "1221";
    System.out.println(Check(num));
    }

    public static boolean Check(String num) {
        if (num.length() <= 1) {
            return true;
        }
        if (num.charAt(0) != num.charAt(num.length() - 1)) {
            return false;
        } else {
            return Check(num.substring(1, num.length() - 1));

        }
    }
}