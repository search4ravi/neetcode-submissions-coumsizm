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
        List<Pair> lPair = new ArrayList<>(pairs.subList(0, mid));
        List<Pair> rPair = new ArrayList<>(pairs.subList(mid, size));

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < lPair.size() && j < rPair.size()) {
            if (lPair.get(i).key <= rPair.get(j).key) {
                pairs.set(k++, lPair.get(i++));
            } else {
                pairs.set(k++, rPair.get(j++));
            }
        }

        while (i < lPair.size()) {
            pairs.set(k++, lPair.get(i++));
        }

        while (j < rPair.size()) {
            pairs.set(k++, rPair.get(j++));
        }
    }
}
