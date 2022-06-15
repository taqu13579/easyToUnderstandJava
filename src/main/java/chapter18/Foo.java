package chapter18;

public class Foo<T> {
    private T obj;

    public Foo(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
