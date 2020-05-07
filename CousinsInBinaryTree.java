class CousinsInBinaryTree {
    public boolean isCousins(TreeNode root, int x, int y) {
        
        if(root == null) return false;
        Queue<TreeNode> list = new LinkedList<TreeNode>();
        TreeNode p1=null, p2=null;
        list.add(root);
        while(!list.isEmpty()){
            int count = list.size();
            
            while(--count>=0){
                TreeNode temp = list.poll();
                
                if(temp.left != null){
                    if(temp.left.val == x)
                        p1=temp;
                    else if(temp.left.val == y)
                        p2=temp;
                    list.add(temp.left);
                   
                }
                
                if(temp.right != null){
                    if(temp.right.val == x)
                        p1=temp;
                    else if(temp.right.val == y)
                        p2=temp;
                    list.add(temp.right);
                    
                }
                if(p1!=null && p2 !=null) break;
            }
            if(p1 != null && p2 != null) return p1 != p2;
            if((p1 != null && p2 == null) || 
               (p1 == null && p2!= null)) return false;
        }
      
        return false;
    }
}
