class Generic<T, V> {
    T t;
    V v;

    public void setValues(T t, V v) {
        this.t = t;
        this.v = v;
    }

    public void getValues() {
        System.out.println(t);
        System.out.println(v);
    }
}