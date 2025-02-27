public class StringDemo {

    public static void main(String[] args) {
        //var message = "hello world";
        //var extra = "my name is gorkem iskeceli (-_-)";

        String message = "hello world ";
        String extra = "my name is gorkem iskeceli (-_-)";

        System.out.println(message + extra);
        System.out.println("length of message " + message + " is " + message.length());
        System.out.println("Upper case version of " + message + " is " + message.toUpperCase());
        System.out.println("lower case version of " + message + " is " + message.toLowerCase());

        String combo = message +""+ extra;
        System.out.println("Combo: "+ combo);

        String upperVersion = combo.toUpperCase();
        System.out.println("Upper version of combo: " + upperVersion);
    }
}
