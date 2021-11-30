
public class ColorStack<E>{

    public static final int CAPACITY = 1000;
    private E[] data;
    private int lRed = -1, lBlue;

    public ColorStack() {
        this(CAPACITY);
    }

    public ColorStack(int capacity) {
        data = (E[]) new Object[capacity];
        lBlue = (capacity / 2) - 1;
    }

    public int sizeRed() {
        return lRed + 1;
    }

    public int sizeBlue() {
        return (lBlue - (data.length / 2)) + 1;
    }

    public boolean isEmptyRed() {
        return (lRed == -1);
    }

    public boolean isEmptyBlue() {
        return (lBlue == (data.length / 2) - 1);
    }

    public void pushRed(E e) throws IllegalStateException {
        if (sizeRed() == data.length / 2) throw new IllegalStateException("Red stack is full");
        data[++lRed] = e;
    }

    public void pushBlue(E e) throws IllegalStateException {
        if (sizeBlue() == data.length / 2) throw new IllegalStateException("Blue stack is full");
        data[++lBlue] = e;
    }

    public E topRed() {
        if (isEmptyRed()) return null;
        return data[lRed];
    }

    public E topBlue() {
        if (isEmptyBlue()) return null;
        return data[lBlue];
    }

    public E popRed() {
        if (isEmptyRed()) return null;
        E answer = data[lRed];
        data[lRed] = null;
        lRed--;
        return answer;
    }

    public E popBlue() {
        if (isEmptyBlue()) return null;
        E answer = data[lBlue];
        data[lBlue] = null;
        lBlue--;
        return answer;
    }
}