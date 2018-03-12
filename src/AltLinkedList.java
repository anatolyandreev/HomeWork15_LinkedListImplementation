
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

	public void delete(E element) {
		Node<E> tempNode = first;
		if (size == 0 && first == null) {
			System.out.println("nothing to delete, list is empty");
		} else {
			while (tempNode != null) {
				if (size == 1) {
					first = last = null;
					size--;
				} else if (element.equals(tempNode.item)) {
					if (tempNode == first) {
						first = tempNode.next;
						first.prev = null;
					} else if (tempNode == last) {
						last = tempNode.prev;
						last.next = null;
					} else {
						tempNode.prev.next = tempNode.next;
						tempNode.next.prev = tempNode.prev;
					}
					size--;
				}
				tempNode = tempNode.getNext();
			}

		}
	}

	public int getSize() {
		return size;
	}

}
