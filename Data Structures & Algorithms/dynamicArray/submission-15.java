class DynamicArray {
    int currentIndex;
    int capacity;
    int[] arrayDynamic;

    public DynamicArray(int capacity) {
        currentIndex = 0;
        this.capacity = capacity;
        arrayDynamic = new int[this.capacity];
    }

    public int get(int i) {
        return arrayDynamic[i];
    }

    public void set(int i, int n) {
        arrayDynamic[i] = n;
    }

    public void pushback(int n) {
        if(currentIndex==capacity){
            resize();
        }
        arrayDynamic[currentIndex] = n;
        currentIndex++;

    }

    public int popback() {
        if(currentIndex>0){
            currentIndex--;
        }
        return arrayDynamic[currentIndex];
    }

    private void resize() {
            capacity = 2 * capacity;
        int[] newArray = new int[capacity];
        for (int i = 0; i < currentIndex; i++) {
        newArray[i] = arrayDynamic[i];
    }
    arrayDynamic = newArray;
    }

    public int getSize() {
        return currentIndex;
    }

    public int getCapacity() {
        return capacity;
    }
}
