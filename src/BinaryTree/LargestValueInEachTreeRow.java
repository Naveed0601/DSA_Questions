package BinaryTree;

import java.util.*;
import java.lang.*;
import java.io.*;

class LargestValueInEachTreeRow {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> result = new ArrayList<>();
        q.add(root);

        while(!q.isEmpty()){
            int size = q.size();
            int maxi = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++){
                TreeNode it = q.poll();
                maxi = Math.max(maxi , it.val);
                if(it.left != null) q.add(it.left);
                if(it.right != null) q.add(it.right);
            }
            result.add(maxi);
        }
        return result;
    }
}