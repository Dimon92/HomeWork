package HomeWorks7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {
	public int data;
	TreeNode right;
	TreeNode left;

	public TreeNode(int root) {
		this.data = root;
	}

	public int getData() {
		return data;
	}

	public void setData(int r) {
		this.data = r;
	}

	public void insert(int f) {
		if (f < data) {
			if (left != null) {
				left.insert(f);
			} else {
				left = new TreeNode(f);
			}
		} else {
			if (right != null) {
				right.insert(f);
			} else {
				right = new TreeNode(f);
			}
		}
	}

	public void remove(TreeNode rTree) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Stack<Integer> v = new Stack<Integer>();
		q.add(this);
		while (!q.isEmpty()) {
			TreeNode temp = q.remove();
			v.push(temp.getData());
			if (temp.right != null) {
				q.add(temp.right);
			}
			if (temp.left != null) {
				q.add(temp.left);
			}
		}
		v.pop();
		left = null;
		right = null;
		while (!v.isEmpty()) {
			int t = v.pop();
			if (rTree.getData() != t) {
				this.insert(v.pop());
			}
		}
	}
}