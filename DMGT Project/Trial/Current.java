public class Current {

    private String privateString;

    private void myPrivateMethod() {
        // Some logic to set the privateString
        privateString = "Hello, World!";
    }

    public String getPrivateString() {
        myPrivateMethod(); // Call the private method to set the privateString
        return privateString;
    }

    public static void main(String[] args) {
        Current obj = new Current();
        String result = obj.getPrivateString();
        System.out.println(result); // Output: Hello, World!
    }
}
