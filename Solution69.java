class Solution {
    public int mySqrt(int x) {
        if (x<2)
       return x;
    double y=x/2.0;
    

    // Newton-Raphson method
    while(Math.abs(y*y-x)>0.001)
       y=0.5*(y+x/y);
    return (int)y;

    }
}
