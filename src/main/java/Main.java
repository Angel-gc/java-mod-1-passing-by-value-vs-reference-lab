public class Main {
    int num;
    public static void main(String[] args) {
        // <========== Number Logic ============>
        
        NumberContainer num = new NumberContainer();
        product(num, 12, 5);
        System.out.println("Here is our product:");
        System.out.println(num.number);

        // <========== String Logic =============>

        // StringContainer str = new StringContainer();
        // str.text = "Let's not leave this null.";
        // addText(str, " Okay sounds good.");
        // System.out.println("Here is our string:");
        // System.out.println(str.text);

        String myString = "initial value";
        addText(myString, " - adding new text");
        System.out.println("modified text: " + myString);
    }

    // <============ Pass By Reference Logic ================>

    // public static void product(NumberContainer result, int num1, int num2){
    //     result.number = num1 * num2;
    // }

    public static void product(NumberContainer result, int num1, int num2){
        result = new NumberContainer();
        result.number = num1 * num2;
    }

    // public static void addText(StringContainer result, String newText ){
    //     result.text = result.text + newText;
    // }

    public static void addText(String result, String newText) {
        result = result + newText;
    }
}
