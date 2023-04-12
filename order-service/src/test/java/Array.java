public class Array {
    private int[] items;

    public Array(int length) {
        this.items = new int[length];
    }

    public void print() {
        for(int item : items) {
            System.out.println(item);
        }
    }
}
