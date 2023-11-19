class Solution {
    public int reductionOperations(int[] n) {
        int res = 0, size = n.length;
        Arrays.sort(n);
        for (int j = size - 1; j > 0; --j)
            if (n[j - 1] != n[j])
                res += size - j;
        return res;
    }
}
