package jumpGame;

public class CheckIfFirstRearchEndFunction {
    public boolean canJump(int[] nums) {
        int maxDistance = 0;
        
        for(int i = 0; i < nums.length; i++){
            // If it can't reach to current index with zero, return false
            if(maxDistance < i){
                return false;
            }
            
            // Don't really need this, but
            // If maxDistance could reach the end of the index already, return true
            if(maxDistance >= nums.length - 1){
                return true;
            }
            
            // if current index plus current value more than maxDistance, update maxDistance, otherwise current maxDistance is the best
            maxDistance = ((i + nums[i]) > maxDistance) ? (i+ nums[i]) : maxDistance;
        }
        
        return true;
    }
}
