class Solution {
public:
	void replaceSpace(char *str,int length) {
		int cnt = 0;
        for(int i = 0; i < length; i++){
            if(str[i] == ' '){
                cnt++;
            }
        }
        for(int i = length - 1; i >= 0; i-- ){
            if(str[i] != ' '){
                str[i+cnt*2] = str[i];
            }
            else{
                cnt--;
                str[i+cnt*2] = '%';
                str[i+cnt*2+1] = '2';
                str[i+cnt*2+2] = '0';
            }
        }
	}
};