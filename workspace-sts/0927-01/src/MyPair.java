
public class MyPair<K, V> { // generic 2개(알파벳 대문자로 1글자 아무거나!)
	private K key;
	private V value;
	
	public MyPair(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}

	public K getKey() {
		return key;
	}

	public void setKey(K key) {
		this.key = key;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
	
}
