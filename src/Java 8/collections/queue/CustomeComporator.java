package collections.queue;

import java.util.Comparator;

public class CustomeComporator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2-o1;
	}
	
	
	//this is for cutome object like studentmarks
//	@Override
//	public int compare(StudentMarks o1, StudentMarks o2) {
//		// TODO Auto-generated method stub
//		return o2.getMmarks()-o1.getMmarks();
//	}

}
