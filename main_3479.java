
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n = fruits.length;
        int unplaced = 0;
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (j < n && baskets[j] < fruits[i]) {
                j++;
            }

            if (j == n) {
                // No basket can hold this fruit
                unplaced++;
            } else {
                // Place fruit in basket[j]
                j++;
            }
        }

        return unplaced;
    }
}
