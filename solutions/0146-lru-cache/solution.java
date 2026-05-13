class LRUCache {
    int limit;
    private Map<Integer, Integer> cache;
    private LinkedList<Integer> l;
    public LRUCache(int capacity) {
        limit = capacity;
        cache = new HashMap<>();
        l = new LinkedList<>();
    }
    
    public int get(int key) {
        if(cache.containsKey(key)) {
            l.remove(Integer.valueOf(key));
            l.addLast(key);
            return cache.get(key);
            
        } else {
            return -1;
        }
    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)) {
            cache.put(key, value);
            l.remove(Integer.valueOf(key));
            l.addLast(key);
        } else {
            cache.put(key, value);
            if(l.size() >= limit) {
                cache.remove(l.removeFirst());
            }
            l.addLast(key);
        }
        // System.out.println(cache);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
