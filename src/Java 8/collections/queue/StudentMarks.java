package collections.queue;

public class StudentMarks implements Comparable<StudentMarks>{
	
	private int pmarks;
	private int mmarks;
	public int getPmarks() {
		return pmarks;
	}
	public void setPmarks(int pmarks) {
		this.pmarks = pmarks;
	}
	public int getMmarks() {
		return mmarks;
	}
	public void setMmarks(int mmarks) {
		this.mmarks = mmarks;
	}
	@Override
	public String toString() {
		return "StudentMarks [pmarks=" + pmarks + ", mmarks=" + mmarks + "]";
	}
	public StudentMarks(int pmarks, int mmarks) {
		super();
		this.pmarks = pmarks;
		this.mmarks = mmarks;
	}
	@Override
	public int compareTo(StudentMarks o) {
		System.out.println("compare to method");
		return o.mmarks-this.mmarks;
	}
	
	

}
