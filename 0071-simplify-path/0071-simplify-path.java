import java.util.*;

class Solution {
    public String simplifyPath(String path) {

        Stack<String> stack = new Stack<>();

        for (String dir : path.split("/")) {

            if (dir.equals("") || dir.equals("."))
                continue;

            if (dir.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                stack.push(dir);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (String s : stack)
            sb.append("/").append(s);

        return sb.length() == 0 ? "/" : sb.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna