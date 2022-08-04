  class Solution {
  public int divide(int dividend, int divisor) 
  {
      if(dividend==Integer.MIN_VALUE && divisor==1)
     {
        return Integer.MIN_VALUE;
     }
    else if((dividend==Integer.MAX_VALUE && divisor==1) || (dividend==Integer.MIN_VALUE && divisor==-1))
    {
        return Integer.MAX_VALUE;
    }
    long divisor1=Math.abs((long)divisor);
    long dividend1=Math.abs((long)dividend);
    int count=0;
    while(divisor1<=dividend1)
    {
        int x=0;
        while(dividend1 >= divisor1<<x)
        {
            x++;
        }
        count=count+(1<<(x-1));
        dividend1=dividend1-(divisor1<<(x-1));
    }
    
    if(count>= Integer.MAX_VALUE)
    {
        return Integer.MAX_VALUE;
    }
    else if(divisor<0 && dividend<0)
    {
        return count;
    }
    else if(divisor<0 || dividend<0)
    {
        count=0-count;
    }
    return count;
  }
}
