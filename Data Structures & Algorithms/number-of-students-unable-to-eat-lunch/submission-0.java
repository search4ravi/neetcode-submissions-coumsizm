class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> studentQueue = new LinkedList<>();

        for (int student : students) {
            studentQueue.add(student);
        }

        int i = 0;
        int rotation = 0;

        while (!studentQueue.isEmpty() && rotation <= studentQueue.size()) {
            if (studentQueue.peek() == sandwiches[i]) {
                i++;
                studentQueue.poll();
                rotation = 0;
            } else {
                rotation++;
                studentQueue.add(studentQueue.poll());
            }
        }

        return studentQueue.size();
    }
}