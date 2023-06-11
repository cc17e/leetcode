/**
 * Definition for a Node.
 * struct Node {
 *     int val;
 *     int numChildren;
 *     struct Node** children;
 * };
 */

int maxDepth(struct Node* root) {
    if (root == NULL) {
        return 0;
    }
    if(root -> numChildren == 0){
        return 1 ;
    }
    int max = -1;
    for (int i = 0; i < root->numChildren; i++) {
        int temp = maxDepth(root->children[i]);
        if (temp > max) {
            max = temp;
        }
    }
    return 1 + max;
}
