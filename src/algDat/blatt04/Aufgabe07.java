package algDat.blatt04;

import java.util.Arrays;

public class Aufgabe07<E> {
	private E[] content;
	private int firstIndex, size;

	public Aufgabe07(int length) {
		content = (E[]) new Object[length];
		this.size = 0;
	}
	

	public void insert(E newEntry) {
		if (size == content.length)
			throw new RuntimeException("insert: list is full");
		content[(firstIndex + size++) % content.length] = newEntry;
	}

	public void remove() {
		if (size == 0)
			throw new RuntimeException("remove: list is empty");
		content[firstIndex++] = null;
		firstIndex = firstIndex == content.length ? 0 : firstIndex;
		size--;
	}

	@Override
	public String toString() {
		return Arrays.toString(content);
	}

	public String toString2() {
		int index = firstIndex;
		String s = "(";
		for (int i = 1; i < size; i++) {
			
			s+=content[index]+", ";
			index++;
			index = index == content.length ? 0 : index;
		}
		return s + content[index]+")";
	}

	public static void main(String[] args) {
		Aufgabe07<Integer> list = new Aufgabe07<>(5);

		list.insert(4);
		list.insert(10);
		list.insert(3);
		list.remove();
		list.insert(7);
		list.insert(1);
		list.insert(4);
		list.remove();
		list.remove();

		list.insert(20);

		System.out.println(list.toString());
		System.out.println("firstIndex:\t" + list.firstIndex + "\nsize:\t\t" + list.size);
		System.out.println(list.toString2());
	}
}
