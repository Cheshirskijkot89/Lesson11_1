package chizhenko;

import java.util.ArrayList;
import java.util.Collections;

public class Group {

	private Student[] arr = new Student[10];
	private int tos;

	public Group() {
		super();
		tos = -1;
	}

	public Student getSt(int ind) throws MyException {
		
		if (ind > arr.length) {
			throw new MyException(ind);
		}
		
		return arr[ind];
	}

	public Student findSt(String stSurname) {
		Student result = null;
		for (Student i : arr) {
			if (stSurname.equals(i.getSurname())) {
				result = i;
				break;
			}
		}
		return result;
	}

	public void addSt(Student st) throws MyException {
		
		if (tos == arr.length -1) {
			throw new MyException(tos + 1);
		}
		
		arr[++tos] = st;
	}

	public void removeSt(Student st) {
		arr[tos--] = st;
	}

	public void removeSt(String stSurname) {
		Student findedSt = findSt(stSurname);
		if (findedSt == null) {
			System.out.println("fail remove");
		} else {
			removeSt(findedSt);
			System.out.println("remove complete");
		}
	}

	public void ViewSortGroup() {

		ArrayList<String> list = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				list.add(arr[i].getSurname());
			}

		}

		Collections.sort(list);

		for (String i : list) {

			System.out.println(findSt(i).toString());
		}

	}

}
