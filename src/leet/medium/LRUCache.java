package leet.medium;

import java.util.HashMap;


public class LRUCache<K, V> {
	//Define Node with pointer to Next and previous item and a key value pair.
	
	private static class Entry<T,U> {
		T key;
		U value;
		Entry<T,U> previous;
		Entry<T,U> next;
		
		 Entry(Entry<T,U> previous,Entry<T,U> next,T key,U value){
			this.key = key;
			this.value = value;
			this.previous = previous;
			this.next = next;
		}
	}
	
	private static class IndexNode<Entry> {
		private Entry pointer;
		public IndexNode(Entry pointer){
			this.pointer = pointer;
		}
	}

	private transient  Entry<K,V> header = new Entry<K, V>(null, null, null, null);
	private HashMap< K, IndexNode<Entry<K,V>>> indexMap  = new HashMap<K, IndexNode<Entry<K,V>>>();
	private final int CACHE_LIMIT = 3;
	private int size;
	
	public LRUCache(){
		header.next = header.previous = header;
		this.size =0;
	}
	
	public void put(K key, V value){
		Entry<K,V> newEntry = new Entry<K, V>(null, null, key, value);
		addBefore(newEntry,header);
	}
	
	public void addBefore(Entry<K,V> newEntry,Entry<K,V> entry){
		if((size+1)<(CACHE_LIMIT + 1)){
			newEntry.next = entry;
			newEntry.previous = entry.previous;
			IndexNode<Entry<K,V>> indexNode = new IndexNode<Entry<K,V>>(entry);
			indexMap.put(newEntry.key, indexNode);
			newEntry.previous.next = newEntry;
			newEntry.previous.previous = newEntry;
			size++;
		}else{
			Entry<K,V> entryRemoved = new Entry<K, V>(null, null, null, null);
			indexMap.remove(entryRemoved.key);
			addBefore(newEntry,entry);
		}
		
	}
	
	private Entry<K,V> remove(Entry<K,V> entry){
		entry.previous.next = entry.next;
		entry.next.previous = entry.previous;
		size --;
		return entry;
		
	}
	
	public void get(K key){
		if(indexMap.containsKey(key)){
			Entry<K,V> newEntry = remove(indexMap.get(key).pointer);
			addBefore(newEntry, header);
		}else{
            System.out.println("No such element was cached. Go and get it from Disk");
        }
	
	}
	
	 public void display(){
	        for(Entry<K,V> curr=header.next;curr!=header;curr=curr.next){
	            System.out.println("key : "+curr.key+" value : " + curr.value);
	        }
	    }
	 
	public static void main(String[] args) {
	        LRUCache<String, Integer> cache = new LRUCache<String, Integer>();
	        cache.put("abc", 1);
	        //cache.display();
	        cache.put("def", 2);
	        cache.put("ghi", 3);
	        cache.put("xyz", 4);
	        cache.put("xab", 5);
	        cache.put("xbc", 6);
	        cache.get("xyz");
	        cache.display();
	        System.out.println(cache.indexMap);
	    }
}