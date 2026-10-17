class RemoveElements {
    public int removeElement(int[] arr, int value) {
        int left = 0;
        int  right = arr.length-1;
        while(left<=right){

            if(arr[left]==value && arr[right]!=value){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right]= temp;
            }

            if(arr[left]!=value)
                left++;


            if(arr[right]==value)
                right--;


        }

        return right+1;
    }
}