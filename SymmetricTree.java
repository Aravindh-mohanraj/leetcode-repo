class Solution {
    public boolean isSymmetric(TreeNode root) {
        return m(root.left,root.right);
    }
    public boolean m(TreeNode a,TreeNode b) {
        if(a==null&&b==null)return true;
        if(a==null||b==null)return false;
        return a.val==b.val&&m(a.left,b.right)&&m(a.right,b.left);
    }
}
