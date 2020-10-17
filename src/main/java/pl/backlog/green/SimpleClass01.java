package pl.backlog.green;

import java.util.Objects;

public class SimpleClass01 {
    private int a;

    public SimpleClass01() {
        a = 0;
    }

    public SimpleClass01(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SimpleClass01 that = (SimpleClass01) o;
        return a == that.a;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
