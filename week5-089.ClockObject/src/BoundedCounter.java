
public class BoundedCounter {
    private int value;
    private int limit;

    public BoundedCounter(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void next() {
        if (this.value < this.limit) {
            this.value++;
        } else {
            this.value = 0;

        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value < 0 || value > this.limit) {
            return;
        }
        this.value = value;
    }

    @Override
    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
        return "" + this.value;

    }

}
