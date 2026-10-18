class MoveZeroes {
    public void moveZeroes(int[] arr) {
        int write = 0;

        for (int read = 0; read < arr.length; read++) {
            if (arr[read] != 0) {

                if (read != write) {
                    int temp = arr[read];
                    arr[read] = arr[write];
                    arr[write] = temp;
                }

                write++;
            }
        }
    }
}