package jumpGame;

public class CheckIfFirstRearchEndFunction {
    public boolean canJump(int[] nums) {
        int maxDistance = 0;
        
        // starting from first index, calculate the distance the current distance could reach
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
//            if(i + nums[i] > maxDistance){
//            	maxDistance = i + nums[i];
//            }
            maxDistance = Math.max(maxDistance, i + nums[i]);
        }
        
        return true;
    }
    
    // Method 2
    public boolean canJump2(int[] nums){
    	if(nums == null || nums.length == 0){
    		return false;
    	}
    	
    	int canReachTo = nums.length - 1;
    	
    	// If it can reach to the last element, then save that index
    	for(int i = nums.length - 2; i >= 0; i--){
    		if(i + nums[i] >= canReachTo){
    			canReachTo = i;
    		}
    	}
    	
    	// It must to able to reach from index 0;
    	return canReachTo == 0;
    }
}
