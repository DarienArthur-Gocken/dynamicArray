public class DynamicStringList implements StringList {

    private String[] array = new String[5];
    private int currentSize = 0;
    private int currentMaxSize = 5;

    @Override
    public String get(int index) {
        if (index > array.length - 1) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public void set(int index, String value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'set'");
    }

    @Override
    public void add(String value) {
        if (currentSize >= currentMaxSize) {
            currentMaxSize = currentMaxSize * 2;
            String[] newArray = new String[currentMaxSize];
            for (int i = 0; i < currentSize; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[currentSize++] = value;
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
