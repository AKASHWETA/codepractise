package graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class BFSGraph {
	int V;//No of Vertex;
	private LinkedList<Integer> adj[]; //Adjacency Lists
	
	//Constructor
	BFSGraph(int v){
		V= v;
		adj = new LinkedList[v];
		for(int i=0;i<v ;i++)
			adj[i] = new LinkedList<Integer>();
	}

	void addEdge(int v, int w){
		adj[v].add(w);
	}

	
	public static ArrayList<LinkedList<TreeNode>> findLevlLinkedList(TreeNode root){
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> list = new LinkedList<TreeNode>();
		int level =0;
		
		list.add(root);
		result.add(level,list);
		while(true){
			list = new LinkedList<TreeNode>();
			for(int i=0; i<result.get(level).size();i++){
				TreeNode n = (TreeNode) result.get(level).get(i);
				if(n!=null){
					if(n.left!=null) list.add(n.left);
					if(n.right!=null) list.add(n.right);
				}
			}
			if(list.size()>0){
				result.add(level+1,list);
			}else{
				break;
			}
			level++;
		}
		return result;
	}
	
	
	public static TreeNode inorderSucessor(TreeNode e){
		if(e!=null){
			TreeNode p ;
			//found right children return 1 inorder node on right
			if(e.parent == null || e.right !=null){
				p = leftMostChild(e.right);
			}else{
				//go up until we're on left instead of right(case 2b)
				while((p=e.parent)!=null){
					if(p.left ==e){
						break;
					}
					e=p;
				}
			}
		}
		return null;
	}
	
	public static TreeNode leftMostChild(TreeNode e){
		if(e ==null) return null;
		while(e.left !=null)e= e.left;
		return e;
	}
	void BFS(int s){
		boolean[] visited = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s] = true;
		queue.add(s);
		
		while(queue.size() !=0){
			s = queue.poll();
			System.out.println(s);
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()){
				int n = i.next();
				
				if(!visited[n]){
					visited[n] = true;
					queue.add(n);
				}
			}
			
		}
		
	}
	public static void main(String[] args) {
		BFSGraph bfs = new BFSGraph(4);
		bfs.addEdge(0, 1);
		bfs.addEdge(0, 2);
		bfs.addEdge(1, 2);
		bfs.addEdge(2,0);
		bfs.addEdge(2,3);
		bfs.addEdge(3,3);

		bfs.BFS(2);
	}

}
