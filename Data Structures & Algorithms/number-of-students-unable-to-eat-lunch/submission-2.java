class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Deque<Integer> stud = new LinkedList<>();

        for (int s : students) {
            stud.offer(s);
        }

        int counter = 0;
        int size = stud.size();
        int i = 0;

        while (i < sandwiches.length && counter <= size) {
            if (sandwiches[i] == stud.peek()) {
                i++;
                counter = 0;
                stud.poll();
            } else {
                counter++;
                stud.offer(stud.poll());
            }
        }

        return stud.size();
    }
}