class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        // code here
        ArrayList<Integer> result=new ArrayList<>();
        int s=0;
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
          sum+=arr[i];
          while(sum>target&&s<=i)
          {
            sum-=arr[s];
            s++;
          }
           if(sum==target)
           {
              result.add(s+1); 
              result.add(i+1);
              return result;
            }
        }
        result.add(-1);
        return result;
    }
}
