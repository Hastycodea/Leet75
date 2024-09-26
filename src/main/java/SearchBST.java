public class SearchBST {
    
    public static void main(String[] args) {
        
    }

    public static TreeNode searchBST(TreeNode root, int val){
        if(root.val == val || root == null) return root;

        if(val < root.val) root = searchBST(root.left, val);
        if(val > root.val) root = searchBST(root.right, val);

        return root;
    }

}
