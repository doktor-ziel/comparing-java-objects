package pl.backlog.green;

import java.util.Objects;

public class SimpleClass02 extends SimpleClass01 {
    private int b;

    public SimpleClass02() {
        super(0);
        this.b = 1;
    }

    public SimpleClass02(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SimpleClass02 that = (SimpleClass02) o;
        return b == that.b;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), b);
    }
}
