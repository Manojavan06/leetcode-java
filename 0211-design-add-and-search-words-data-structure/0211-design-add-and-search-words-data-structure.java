class WordDictionary {

    class TrieNode {
        TrieNode[] child = new TrieNode[26];
        boolean end;
    }

    TrieNode root;

    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;

        for (char c : word.toCharArray()) {
            int i = c - 'a';
            if (node.child[i] == null)
                node.child[i] = new TrieNode();

            node = node.child[i];
        }

        node.end = true;
    }

    public boolean search(String word) {
        return dfs(word, 0, root);
    }

    private boolean dfs(String word, int index, TrieNode node) {
        if (node == null)
            return false;

        if (index == word.length())
            return node.end;

        char c = word.charAt(index);

        if (c == '.') {
            for (TrieNode child : node.child)
                if (dfs(word, index + 1, child))
                    return true;
            return false;
        }

        return dfs(word, index + 1, node.child[c - 'a']);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna