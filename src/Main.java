import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main  {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

            // create variable of type then write a class that implements type then you can make a new object
            IntList array = new ArrayIntList();
            //resizing tests
            // 0 elements
            array.addFront(99);
            System.out.println(array);


            array.addBack(11);
            System.out.println(array);

            array.removeFront();
            System.out.println(array);

            array.removeBack();
            System.out.println(array);

            array.add(0,44);
            System.out.println(array);

            array.remove(0);
            System.out.println(array);

            System.out.println(array.isEmpty());

            System.out.println(array.contains(4));

            // throws exceptions because array is empty
            //System.out.println(array.get(0));
            //System.out.println(array.indexOf(0))

            System.out.println("Size of array " + array.size());

            array.clear();
            System.out.println();
            System.out.println();

            // one element
            array.add(0,23);
            System.out.println(array);

            array.addFront(99);
            System.out.println(array);

            array.addBack(11);
            System.out.println(array);

            array.removeFront();
            System.out.println(array);

            array.removeBack();
            System.out.println(array);

            array.add(0,44);
            System.out.println(array);

            array.remove(0);

            System.out.println(array.isEmpty());

            System.out.println(array.contains(4));

            System.out.println(array.get(0));

            System.out.println(array.indexOf(0));

            System.out.println(array);
            System.out.println("Size of array " + array.size());

            System.out.println();
            System.out.println();

            // multiple elements
            array.add(1,24);
            array.add(2,25);

            System.out.println(array);

            array.addFront(99);
            System.out.println(array);


            array.addBack(11);
            System.out.println(array);

            array.removeFront();
            System.out.println(array);

            array.removeBack();
            System.out.println(array);

            array.add(0,44);
            System.out.println(array);

            array.remove(0);

            System.out.println(array.isEmpty());

            System.out.println(array.contains(4));

            System.out.println(array.get(0));

            System.out.println(array.indexOf(0));

            System.out.println(array);
            System.out.println("Size of array " + array.size());


            System.out.println();
            System.out.println();
            array.add(3,26);
            array.add(4,27);
            array.add(5,28);
            array.add(6,29);
            array.add(7,30);
            array.add(8,31);
            array.add(9,32);
            array.add(10,33);
            array.add(11,34);
            //when array is "Full"
            System.out.println(array);

            array.addFront(99);
            System.out.println(array);


            array.addBack(11);
            System.out.println(array);

            array.removeFront();
            System.out.println(array);

            array.removeBack();
            System.out.println(array);

            array.add(0,44);
            System.out.println(array);

            array.remove(0);

            System.out.println(array);

            System.out.println(array.isEmpty());

            System.out.println(array.contains(4));

            System.out.println(array.get(0));

            System.out.println(array.indexOf(0));

            System.out.println(array);
            System.out.println("Size of array " + array.size());
            System.out.println(array);




            IntList linked = new LinkedIntList();
            // 0 elements
            linked.addFront(99);
            System.out.println(linked);


            array.addBack(11);
            System.out.println(linked);

            linked.removeFront();
            System.out.println(linked);

            linked.removeBack();
            System.out.println(linked);

            linked.add(0,44);
            System.out.println(linked);

            linked.remove(0);

            System.out.println(linked.isEmpty());

            System.out.println(linked.contains(4));

            // throws exceptions because array is empty
            //System.out.println(linked.get(0));
            //System.out.println(linked.indexOf(0))

            System.out.println("Size of linklist " + linked.size());

            linked.clear();
            System.out.println();
            System.out.println();


            linked.add(0,23);
            // one element
            System.out.println(linked);
            linked.addFront(99);
            System.out.println(linked);


            linked.addBack(11);
            System.out.println(linked);

            linked.removeFront();
            System.out.println(linked);

            linked.removeBack();
            System.out.println(linked);

            linked.add(0,44);
            System.out.println(linked);

            linked.remove(0);

            System.out.println(linked.isEmpty());

           System.out.println(linked.contains(4));

            System.out.println(linked.get(0));

            System.out.println(linked.indexOf(0));

            System.out.println(linked);
            System.out.println("Size of array " + linked.size());

            System.out.println();
            System.out.println();

            // multiple elements
            linked.add(1,24);
            linked.add(2,25);

            System.out.println(linked);

            linked.addFront(99);
            System.out.println(linked);


            linked.addBack(11);
            System.out.println(linked);

            linked.removeFront();
            System.out.println(linked);

            linked.removeBack();
            System.out.println(linked);

            linked.add(0,44);
            System.out.println(linked);

            linked.remove(0);

            System.out.println(linked.isEmpty());

           System.out.println(linked.contains(4));

            System.out.println(linked.get(0));

            System.out.println(linked.indexOf(0));

            System.out.println(linked);
            System.out.println("Size of linklist " + linked.size());
            System.out.println(linked);

            System.out.println();
            System.out.println();
            linked.add(3,26);
            linked.add(4,27);
            linked.add(5,28);
            linked.add(6,29);
            linked.add(7,30);
            linked.add(8,31);
            linked.add(9,32);
            linked.add(10,33);
            linked.add(11,34);
            //when link has a lot of elements
            System.out.println(linked);

            linked.addFront(99);
            System.out.println(linked);


            linked.addBack(11);
            System.out.println(linked);

            linked.removeFront();
            System.out.println(linked);

            linked.removeBack();
            System.out.println(linked);

            linked.add(0,44);
            System.out.println(linked);

            linked.remove(0);

            System.out.println(linked);

            System.out.println(linked.isEmpty());

            System.out.println(linked.contains(4));

            System.out.println(linked.get(0));

            System.out.println(linked.indexOf(0));

            System.out.println(linked);
            System.out.println("Size of array " + linked.size());
            System.out.println(linked);


            // testing iterator
            linked.addBack(10);
            linked.addBack(11);
            linked.addBack(12);
            Iterator<Integer> iteratingListNodes = linked.iterator();
            while (iteratingListNodes.hasNext()) {
                    System.out.println(iteratingListNodes.next());
            }
        }

    }
