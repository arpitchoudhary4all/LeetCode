/*
Design a data structure that supports all following operations in average O(1) time.

insert(val): Inserts an item val to the set if not already present.
remove(val): Removes an item val from the set if present.
getRandom: Returns a random element from current set of elements. Each element must have the same probability of being returned.
*/

class RandomizedSet {

    /** Initialize your data structure here. */
    ArrayList<Integer> arr;
    HashMap<Integer, Integer>  hash;
 
    public RandomizedSet() {
        arr = new ArrayList<Integer>(); 
        hash = new HashMap<Integer, Integer>(); 
    }
    
    /** Inserts a value to the set. Returns true if the set did not already contain the specified element. */
    public boolean insert(int val) {
        if (hash.get(val) != null) 
            return false; 
        int s = arr.size(); 
        arr.add(val); 
        hash.put(val, s);
        return true;
    }
    
    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
       Integer index = hash.get(val); 
       if (index == null) 
          return false; 
  
       hash.remove(val); 
       int size = arr.size(); 
       Integer last = arr.get(size-1); 
       Collections.swap(arr, index,  size-1); 
       arr.remove(size-1); 
       hash.put(last, index);    
       return true;
    }
    
    /** Get a random element from the set. */
    public int getRandom() {
       Random rand = new Random();
       int index = rand.nextInt(arr.size()); 
       return arr.get(index);   
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
