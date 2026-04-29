// Definition for a pair.
// class Pair {
//     public int key;
//     public String value;
//
//     public Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
class Solution {
    public List<Pair> mergeSort(List<Pair> pairs) {
        int size = pairs.size();

        if (size > 1) {
            int mid = size / 2;

            mergeSort(pairs.subList(0, mid));
            mergeSort(pairs.subList(mid, size));

            merge(pairs, mid, size);
        }

        return pairs;
    }

    public void merge(List<Pair> pairs, int mid, int size) {
        List<Pair> leftPair = new ArrayList<>(pairs.subList(0, mid));
        List<Pair> rightPair = new ArrayList<>(pairs.subList(mid, size));

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < leftPair.size() && j < rightPair.size()) {
            if (leftPair.get(i).key <= rightPair.get(j).key) {
                pairs.set(k, leftPair.get(i));
                i++;
            } else {
                pairs.set(k, rightPair.get(j));
                j++;
            }
            k++;
        }
        while (i < leftPair.size()) {
            pairs.set(k, leftPair.get(i));
            i++;
            k++;
        }
        while (j < rightPair.size()) {
            pairs.set(k, rightPair.get(j));
            j++;
            k++;
        }
    }
}
