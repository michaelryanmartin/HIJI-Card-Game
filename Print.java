public class Print<T> {
    T t;

    public Print(T t) {
        this.t = t;
    }
    public void enterPrint() {
        System.out.println(t);
    }
    public void noEnterPrint() {
        System.out.print(t);
    }
}
