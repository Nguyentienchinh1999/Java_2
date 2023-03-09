package Java_day6.Example;

public class Storage<K,V> {
    private K k;
    private V v;

    public Storage(K k, V v) {
        this.k = k;
        this.v = v;
    }

    public K getK() {
        return k;
    }

    public void setK(K k) {
        this.k = k;
    }

    public V getV() {
        return v;
    }

    public void setV(V v) {
        this.v = v;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "k=" + k +
                ", v=" + v +
                '}';
    }
}
