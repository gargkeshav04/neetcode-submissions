
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int l = 0, r = s1.length();

        if (s2.length() < s1.length()) {
            return false;
        }

        HashMap<Character, Integer> mp = new HashMap<>();
        HashMap<Character, Integer> m = new HashMap<>();

        for (char c : s1.toCharArray()) {
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < r; i++) {
            char c = s2.charAt(i);
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        if (mp.equals(m)) {
            return true;
        }

        while (r < s2.length()) {
            char left = s2.charAt(l);
            m.put(left, m.get(left) - 1);

            if (m.get(left) == 0) {
                m.remove(left);
            }
            char right = s2.charAt(r);
            m.put(right, m.getOrDefault(right, 0) + 1);

            l++;
            r++;

            if (mp.equals(m)) {
                return true;
            }
        }

        return false;
    }
}
