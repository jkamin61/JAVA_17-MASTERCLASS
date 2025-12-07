package org.example.exercise47;

public class MyLinkedList implements NodeList {
    ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (root == null) {
            this.root = item;
            return true;
        }

        ListItem current = this.root;
        while (current != null) {
            int compare = current.compareTo(item);

            if (compare < 0) {
                if (current.next() != null) {
                    current = current.next();
                } else {
                    current.setNext(item).setPrevious(current);
                    return true;
                }
            } else if (compare > 0) {
                if (current.previous() != null) {
                    current = current.previous();
                } else {
                    current.setPrevious(item).setNext(current);
                    return true;
                }
            } else {
                return false;
            }
        }

        root = item;
        return true;
    }

    @Override
    public boolean removeItem(ListItem item) {

        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                return false;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem root) {

        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
