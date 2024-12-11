package weekThirteen;

public class Test {
    /*public static void main(String[] args) {

        ValidParenthesis valid = new ValidParenthesis();
        System.out.println(valid.isValid("({[]})"));
        System.out.println(valid.isValid("({[)}]"));
    }

     */
    public static void main(String[] args) {

        RecentCounter recCou = new RecentCounter();
        System.out.println(recCou.ping(1));
        System.out.println(recCou.ping(100));
        System.out.println(recCou.ping(3001));
        System.out.println(recCou.ping(3002));
    }
}
