class RemoveDuplicates {
    public int removeDuplicates(int[] arr) {
        int write = 0;
        int read = 1;

        while (read < arr.length) {
            if (arr[write] != arr[read]) {
                write++;
                arr[write] = arr[read];
            }
            read++;
        }

        return write + 1;
    }
}