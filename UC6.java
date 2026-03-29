public class UC6 {
     public static void main(String[] args) {
        String text = "HelloWorld";

        // Using substring to split and print
        String part1 = text.substring(0, 5);  // Hello
        String part2 = text.substring(5);     // World

        System.out.println(part1 + " " + part2);
    }
}
