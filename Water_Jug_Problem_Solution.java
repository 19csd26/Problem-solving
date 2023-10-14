class Solution {
    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        int x= jug1Capacity, y= jug2Capacity, z =targetCapacity;
        if (x == z || y == z || z == x + y) {
            return true;
        }
        
        if (x + y < z) {
            return false;
        }

        int n1 = fun(x, y);
        
        return z%n1== 0;
    }
    
    static int fun(int a, int b) {
        if (b == 0) {
            return a;
        }
            return fun(b, a%b);
        }
}
