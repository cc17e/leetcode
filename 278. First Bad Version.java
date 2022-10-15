/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int head=1,mid=1;
        while(head<=n){
            mid=head+(n-head)/2;
            if(isBadVersion(mid-1)==false&&isBadVersion(mid)==true)return mid;

            else if(isBadVersion(mid)){
                n=mid-1;
            }
            else head=mid+1;
        }
        return mid;
    }
