/**
 * Definition for binary tree
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
	//参数范围内是一颗子树,返回子树的根
	TreeNode* buildBtree(vector<int> v1, int a, int b, vector<int> v2, int c, int d){
		if(a > b || c > d){
			return NULL;
		}
		TreeNode* t_root = new TreeNode(v1[a]);
		for(int i = c; i <= d; i++){
			if(v2[i] == v1[a]){
				t_root->left = buildBtree(v1, a + 1, a + i - c, v2, c, i - 1);
				t_root->right = buildBtree(v1, a + i - c + 1, b, v2, i + 1, d);
				break;
			}
		}
		return t_root;
	}

    TreeNode* reConstructBinaryTree(vector<int> pre,vector<int> vin) {
    	TreeNode* root = buildBtree(pre, 0, pre.size() - 1, vin, 0, vin.size() - 1);
    	return root;
    }
};