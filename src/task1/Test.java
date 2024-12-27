package task1;

public class Test {

    int size;
    int[] elements;

    public Test(int size, int[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[] getElements() {
        return elements;
    }

    public void setElements(int[] elements) {
        this.elements = elements;
    }

    public boolean isValid(){
        for(int i = 0; i < size-1; i++){
            if(elements[i] > elements[i+1]){
                return false;
            }
        }
        return true;
    }
}