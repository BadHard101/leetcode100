public class Main {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p != null && q != null) {
            if (p.val == q.val) {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        } else return p == null && q == null;
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}