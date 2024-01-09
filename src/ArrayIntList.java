import java.util.Arrays;
import java.util.Iterator;

public class ArrayIntList implements IntList{


   private int size;
   private int[] buffer;

   public ArrayIntList(){
       size = 0;
       buffer = new int[10];
   }


    /**
     * Prepends (inserts) the specified value at the front of the list (at index 0).
     * Shifts the value currently at the front of the list (if any) and any
     * subsequent values to the right.
     *
     * @param value value to be inserted
     */
    @Override
    public void addFront(int value) {
        // loops do same thing just different ways to do it
//       // going from back of array to not erase data.
//     for (int i = size; i >= 1; i--) {
//
//         buffer[i] = buffer[i - 1];
//       }

       for (int i = size - 1; i >= 0; i--) {
            buffer[i+1] = buffer[i];
        }

//         buffer[4] = buffer[3];
//         buffer[3] = buffer[2];
//         buffer[2] = buffer[1];
//         buffer[1] = buffer[0];

         buffer[0] = value;
         size++;
    }

    /**
     * Appends (inserts) the specified value at the back of the list (at index size()-1).
     *
     * @param value value to be inserted
     */
    @Override
    public void addBack(int value) {
        // put 88(value) at index 0

        buffer[size + 1] = value;
        size++;
        // when filled then create new arraylist with bigger capacity and copy over data
    }

    /**
     * Inserts the specified value at the specified position in this list.
     * Shifts the value currently at that position (if any) and any subsequent
     * values to the right.
     *
     * @param index index at which the specified value is to be inserted
     * @param value value to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    @Override
    public void add(int index, int value) {

        for (int i = size; i >= 0; i--) {
            buffer[index] = value;
        }
    }

    /**
     * Removes the value located at the front of the list
     * (at index 0), if it is present.
     * Shifts any subsequent values to the left.
     */
    @Override
    public void removeFront() {
        // starts from back of array then replace the index +1
       // basically shift everything one opposite of addfront
    }

    /**
     * Removes the value located at the back of the list
     * (at index size()-1), if it is present.
     */
    @Override
    public void removeBack() {
     // reduce size or zero it out
        for (int i = size; i >= 1; i--) {
            buffer[i] = buffer[i + 1];
        }
    }

    /**
     * Removes the value at the specified position in this list.
     * Shifts any subsequent values to the left. Returns the value
     * that was removed from the list.
     *
     * @param index the index of the value to be removed
     * @return the value previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    @Override
    public int remove(int index) {

        for (int i = size; i >= 1; i--) {
            remove(buffer[index]);
            buffer[i] = buffer[i + 1];
        }
        return buffer[index];
    }

    /**
     * Returns the value at the specified position in the list.
     *
     * @param index index of the value to return
     * @return the value at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    @Override
    public int get(int index) {
        return buffer[index];
    }

    /**
     * Returns true if this list contains the specified value.
     *
     * @param value value whose presence in this list is to be searched for
     * @return true if this list contains the specified value
     */
    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
             if(contains(value)){
                 return true;
             }
        }
           return false;
    }

    /**
     * Returns the index of the first occurrence of the specified value
     * in this list, or -1 if this list does not contain the value.
     *
     * @param value value to search for
     * @return the index of the first occurrence of the specified value in this list
     * or -1 if this list does not contain the value
     */
    @Override
    public int indexOf(int value) {
        for (int i = 0; i < size; i++) {
            if(contains(value)){
                return i;
            }
            }
        return -1;
    }
    /**
     * Returns true if this list contains no values.
     *
     * @return true if this list contains no values
     */
    @Override
    public boolean isEmpty() {
       if(size == 0){
           return true;
       }

        return false;
    }

    /**
     * Returns the number of values in this list.
     *
     * @return the number of values in this list
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Removes all the values from this list.
     * The list will be empty after this call returns.
     */
    @Override
    public void clear() {
        for (int i = size; i >= 0; i--) {
            buffer[i] = buffer[i - 1];
        }
    }

    /**
     * Returns an iterator over elements of type {@code T}.
     *
     * @return an Iterator.
     */
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "ArrayIntList{" +
                "size=" + size +
                ", " + Arrays.toString(buffer) +
                '}';
    }
}