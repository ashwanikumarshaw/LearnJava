package _Collection_Framework.list.linked_list.Mylinklist;

public class MainClass {

	public static void main(String[] args) {
		Dummy_linkedlist<Integer> list=new Dummy_linkedlist<>();
		list.print();
		//list.add(45);
		for(int i=1;i<11;i++)
			list.add(i);
		list.print();

	}

}
