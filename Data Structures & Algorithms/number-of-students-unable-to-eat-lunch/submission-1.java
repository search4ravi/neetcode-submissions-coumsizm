class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> qs = new LinkedList<>();

        for (int student : students) {
            qs.offer(student);
        }

        int rotation = 0;
        int n = qs.size();
        int i = 0;

        while (!qs.isEmpty() && rotation <= n) {
            if (sandwiches[i] == qs.peek()) {
                i++;
                qs.poll();
                rotation = 0;
            } else {
                rotation++;
                qs.offer(qs.poll());
            }
        }
        return qs.size();
    }
}