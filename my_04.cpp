class Solution {
public:
    bool Find(int target, vector<vector<int> > array) {
        int m_max = array.size() - 1;
        int n = array[0].size() - 1;
        int m = 0;
        while((m <= m_max) && (n >= 0)){
        	if(target == array[m][n]){
        		return true;
        	}
        	else if(target < array[m][n]){
        			n--;
        	}
        	else{
        		m++;
        	}      
    	}
    	return false;
    }
};