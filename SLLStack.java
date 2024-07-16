import java.util.*;
import com.bwinparty.compliance.monitor.cron.Node;

public class SLLStack {

	private Node list;

	/*
	 * basic operations on stack 
	 * 1) insert a node 
	 * 2) delete a node 
	 * 3) diplay the stack 
	 * 4) Count no of elements in stack
	 */

	/* insert a node into list at end as it follow Stack Data Structure */
	public Node insert(Node list, int value) {
		Node head = list;

		Node val = new Node(value);
		val.next = null;

		if (list == null) {
			head = list;
		} else {
			while (list.next != null) {
				list = list.next;
			}
			list.next = val;
		}
		return head;
	}

	/*removes the last element of list*/
	public Node pop(Node list) {
		if (list == null) {
			throw new IllegalStateException("List is Empty");
		}

		if (list.next == null) {
			return null;
		}

		Node head = list;
		Node prev = null;

		while (list.next != null) {
			prev = list;
			list = list.next;
		}
		prev.next = null;

		return head;
	}

	/* display the elements in list */
	public void display(Node list) {
		if (list == null) {
			throw new IllegalStateException("List is Empty");
		} else {
			while (list.next != null) {
				System.out.println(list.data + "->");
			}
		}
	}

	/* counts no of nodes in list */
	public int countList(Node list) {
		int count = 0;
		while (list != null) {
			count++;
		}
		return count;
	}
}
