class Solution {
    public String validIPAddress(String queryIP) {

        if (queryIP.chars().filter(ch -> ch == '.').count() == 3) {
            String[] parts = queryIP.split("\\.", -1);

            if (parts.length != 4)
                return "Neither";

            for (String p : parts) {
                if (p.length() == 0 || p.length() > 3)
                    return "Neither";

                if (p.length() > 1 && p.charAt(0) == '0')
                    return "Neither";

                for (char c : p.toCharArray())
                    if (!Character.isDigit(c))
                        return "Neither";

                int num = Integer.parseInt(p);

                if (num > 255)
                    return "Neither";
            }

            return "IPv4";
        }

        if (queryIP.chars().filter(ch -> ch == ':').count() == 7) {
            String[] parts = queryIP.split(":", -1);

            if (parts.length != 8)
                return "Neither";

            String hex = "0123456789abcdefABCDEF";

            for (String p : parts) {
                if (p.length() == 0 || p.length() > 4)
                    return "Neither";

                for (char c : p.toCharArray())
                    if (hex.indexOf(c) == -1)
                        return "Neither";
            }

            return "IPv6";
        }

        return "Neither";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna