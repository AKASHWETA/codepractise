package tree;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractBinaryTree<E> extends AbstractTree<E> implements BinaryTree<E> {

	public Position<E> sibling(Position<E> p){
		Position<E> parent = parent(p);
		if(parent == null)
			return null;
		
		if(p == left(parent))
		 return right(parent);
		else
		return left(parent);
	}
	
	public int numOfChildren(Position<E> p){
		int count =0;
		if(left(p)!=null)
			count++;
		if(right(p)!=null)
			count++;
		return count++;
	}
	
	public Iterable<Position<E>> children(Position<E> p) {
		List<Position<E>> snapshot = new ArrayList<>(2);
		
		if(left(p)!=null)
			snapshot.add(left(p));
		if(right(p)!=null)
			snapshot.add(right(p));
		return snapshot;
	}
	
	public Tree commonAncestor(Tree root, Tree p, Tree q){
		if(cover(root.left, p) && (covers(root.left,q)))
			return commonAncestor(root.left,p,q);
		if(covers(root.right,p) && covers(root.right,q))
			return commonAncestor(root.right,p,q);
		return root;
	}
	
	private boolean covers(Tree root, Tree p){/* is p a child of root? * */
		if(root == null) return false;
		if(root ==p) return true;
		return covers(root.left,p) || covers(root.right,p);
	}
}
