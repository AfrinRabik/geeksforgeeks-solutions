class Solution {
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int max=arr[arr.length-1];
        for(int i=arr.length-2;i>=0;i--)
        {
            if(arr[i]!=max)
            {
                return arr[i];
            }
        }
        return -1;
    }
}
