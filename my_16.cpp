class Solution {
public:

	bool equal(double a, double b)
	{
		if((a-b < 0.000000001) && (a-b > -0.000000001))
		{
			return true;
		}
		return false;
	}

	double mi(double base_1, int exp_1)
	{
		if(exp_1 == 0)
		{
			return 1.0;
		}
		if(exp_1 == 1)
		{
			return base_1;
		}
		int temp = mi(base_1, exp_1>>1);
		int result_1 = temp * temp;
		if(exp_1 & 1)
		{
			result_1 *= base_1;
		}
		return result_1;
	}

    double Power(double base, int exponent) {
    	if(equal(base, 0.0) && (exponent < 0))
    	{
    		return 0.0;
    	}
    	if(exponent == 0)
    	{
    		return 1.0;
    	}
    	int exp = abs(exponent);
    	double result = mi(base, exp);
    	if(exponent > 0)
    	{
    		return result;
    	}
    	else
    	{
    		return 1.0/result;
    	}
    }
};