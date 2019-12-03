package com.Bezuglyj;

public class UnfairWaitList <E> extends WaitList {
    public UnfairWaitList() {
    }

    public void remove(E element) {
        int count = 0;
        if (content.contains(element) == true) {
            Object[] transitionArray = new Object[content.size() - 1];
            iterator = content.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() != element) {
                    transitionArray[count] = content.poll();
                    count++;
                }
                else {
                    content.poll();
                }
            }
            for (int i = 0; i < count; i++) {
                content.add(transitionArray[i]);
            }
        }
        else {
            System.out.println("Данной персоны нет в очереди!");
        }
    }

    public void moveToBack(E element) {
        int counter = 0;
        if (content.contains(element) == true) {
            Object[] transitionArray = new Object[content.size()];
            Object transitionElement = null;
            iterator = content.iterator();
            while (iterator.hasNext()) {
                if (iterator.next() != element) {
                    transitionArray[counter] = content.poll();
                    counter++;
                }
                else {
                    transitionElement = content.poll();
                }
            }
            transitionArray[counter] = transitionElement;
            System.out.println("За неподобающее поведение персону " + element + " отправляют в конец очереди!");
            for (int i = 0; i < counter + 1; i++) {
                content.add(transitionArray[i]);
            }
        }
        else {
            System.out.println("Данной персоны нет в очереди!");
        }
    }
}
