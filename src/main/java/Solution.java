public class Solution {
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * PLEASE REFER TO THE PROBLEMS.MD FILE FOR QUESTION DETAILS
     **/

    public Solution() {}

    public boolean endsLy(String x) {
        if (x == null || x.length() < 2) {
            return false;
        }
        return x.substring(x.length() - 2).equals("ly");
    }

    public String conCat(String s1, String s2) {
        if (s1 == null) {
            s1 = "";
        }
        if (s2 == null) {
            s2 = "";
        }
        if (s1.isEmpty() || s2.isEmpty()) {
            return s1 + s2;
        }
        if (s1.charAt(s1.length() - 1) == s2.charAt(0)) {
            return s1 + s2.substring(1);
        }
        return s1 + s2;
    }

    public String withoutX(String s1) {
        if (s1 == null) {
            return "";
        }
        String result = s1;
        if (result.startsWith("x")) {
            result = result.substring(1);
        }
        if (result.endsWith("x")) {
            result = result.substring(0, result.length() - 1);
        }
        return result;
    }

    public String fizzString(String s1) {
        if (s1 == null) {
            return "";
        }
        if (s1.startsWith("f") && s1.endsWith("b")) {
            return "FizzBuzz";
        }
        if (s1.startsWith("f")) {
            return "Fizz";
        }
        if (s1.endsWith("b")) {
            return "Buzz";
        }
        return s1;
    }

    public String fizzString2(int x) {
        boolean divisibleBy3 = x % 3 == 0;
        boolean divisibleBy5 = x % 5 == 0;

        if (divisibleBy3 && divisibleBy5) {
            return "FizzBuzz!";
        }
        if (divisibleBy3) {
            return "Fizz!";
        }
        if (divisibleBy5) {
            return "Buzz!";
        }
        return x + "!";
    }

}
