public class DynamicStringList implements StringList {

    private String[] array = new String[5];
    private int currentSize = 0;
    private int currentMaxSize = 5;

    @Override
    public String get(int index) {
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public void set(int index, String value) {
        if (index < 0 || index > this.size()) {
            throw new IndexOutOfBoundsException();
        }
        array[index] = value;
    }

    @Override
    public void add(String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public String remove(int index) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public int size() {
        return currentSize;
    }

    @Override
    public int capacity() {
        return currentMaxSize;
    }

    
    
}
