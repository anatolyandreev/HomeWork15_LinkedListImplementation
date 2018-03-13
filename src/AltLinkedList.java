
public class AltLinkedList<E> {

	int size = 0;
	Node<E> first;
	Node<E> last;

	public AltLinkedList() {
		first = null;
		last = null;
	}

	public void add(E element) {
		if (size == 0) {
			last = first = new Node<>(null, element, null);
		} else {
			Node<E> node = new Node<>(last, element, null);
			node.prev.next = last = node;
		}
		size++;
	}

	public void removeFirstElement(Node<E> element) {
		first = element.next;
		first.prev = null;
	}

	public void removeLastElement(Node<E> element) {
		last = element.prev;
		last.next = null;
	}

	public void removeSingleElement() {
		first = last = null;
		size--;
	}

	public void removeElementInTheMiddle(Node<E> element) {
		element.prev.next = element.next;
		element.next.prev = element.prev;
	}

	public void delete(E element) {
		Node<E> tempNode = first;
		if (size == 0 && first == null) {
			System.out.println("nothing to delete, list is empty");
		} else {
			while (tempNode != null) {
				if (size == 1) {
					removeSingleElement();
				} else if (element.equals(tempNode.item)) {
					if (tempNode == first) {
						removeFirstElement(tempNode);
					} else if (tempNode == last) {
						removeLastElement(tempNode);
					} else {
						removeElementInTheMiddle(tempNode);
					}
					size--;
				}
				tempNode = tempNode.getNext();
			}
		}
	}
	
	public void findElement(E element) {
		Node<E> tempNode = first;
		int counter = 0;
		boolean isFound = false;
		while (tempNode != null) {
		if (element.equals(tempNode.item)) {
			System.out.println("element found at " + counter + " position");
			isFound = true;
		}
		counter++;
		tempNode = tempNode.getNext();
		}
		if (isFound == false) {
			System.out.println("no such element in the list");
		}
	}

	public int getSize() {
		return size;
	}

}
