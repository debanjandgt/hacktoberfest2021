class Solution {
    public int[] singleNumber(int[] nums) {
        int t=0;
        ArrayList<Integer> a1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a1.add(nums[i]);
        }
        ArrayList<Integer> a2=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int freq=Collections.frequency(a1,a1.get(i));
            if((freq==1)&&(t<=2)){
                a2.add(a1.get(i));
                t++;
            }
            if(t==2)
                break;
        }
        int back[]=new int[a2.size()];
        for(int i=0;i<a2.size();i++)
            back[i]=a2.get(i);
        return(back);
    }
}
