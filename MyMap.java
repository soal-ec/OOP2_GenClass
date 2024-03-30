import java.util.ArrayList;

public class MyMap <Key, Val> {
    ArrayList<Key> key;
    ArrayList<Val> val;
    public MyMap(Key k, Val v) {

    }
    
    public void put (Key k, Val v) {
    	if (key.contains(k)) {
    		val.set(key.indexOf(k), v);
    	} else {
    		key.add(k);
    		val.add(v);
    	}
	}
    
    public int get(Key k) {
    	return key.indexOf(k) == -1 ?  val.get(key.indexOf(k)) : null;
	}
    
    public void remove(Key k) {
    	if (!key.contains(k)) {
    		return null;
    	}
    	int i = key.indexOf(k);
    	Val j = val.get(i);
    	key.remove(i);
    	val.remove(i);
    	return j;
	}
    

}
//        Map
//        Write a generic class called MyMap that accepts two generic objects --
//        one will act as a key and the other a value.
//        You are to store these objects separately in an ArrayList.
//        Do not use a HashMap or any Map or any built-in class that is more
//        complicated than an ArrayList since it defeats the purpose of this
//        activity.
//
//        The following are its methods:
//        - put(key, value)
//        This adds the key and the value to their corresponding array lists at the
//        last position. If the key already exists, simply change the value with the new value.
//        - get(key)
//        This returns the value corresponding to this key (i.e. the same index in the
//        value's ArrayList as to where this is was found in the key's ArrayList). This returns null when key does not exist.
//        - remove(key)
//        This removes the key and value from the array, and returns the said value.
//        This returns null when key does not exist.
//
//        Put the entire project in a GitHub repository and submit the link here in
//        this assignment area.