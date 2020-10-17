package pl.backlog.green;

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
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (! (o instanceof SimpleClass01)) {
            return false;
        }
        SimpleClass01 s = (SimpleClass01) o;
        return this.a == s.a;
    }
}
