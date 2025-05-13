
//TC: O(n)
//SC: O(1)
class SingleNumberIII {
  public int[] singleNumber(int[] nums) {
      //result
      int bitmask=0;

      for(int num:nums){
          bitmask=bitmask^num;
      }
      //bitmask is x+y
      //2's complement
      int lsb=bitmask & (-bitmask);

      //lsb represent LSB

      int bitmask2=0;
      for(int num:nums){
          if((num & lsb) !=0){
              bitmask2=bitmask2^num;
          }
      }
      return new int[]{bitmask2, bitmask2^bitmask};
  }
}