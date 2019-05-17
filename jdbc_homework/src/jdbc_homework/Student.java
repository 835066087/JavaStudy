package jdbc_homework;

public class Student {

	private int FlowID;
	private int Type;
	private long IDCard;
	private long ExamCard;
	private String StudentName;
	private String Location;
	private int Grade;

	public Student() {
		super();
	}

	public Student(int flowID, int type, long iDCard, long examCard, String studentName, String location, int grade) {
		super();
		FlowID = flowID;
		Type = type;
		IDCard = iDCard;
		ExamCard = examCard;
		StudentName = studentName;
		Location = location;
		Grade = grade;
	}

	public int getFlowID() {
		return FlowID;
	}

	public void setFlowID(int flowID) {
		FlowID = flowID;
	}

	public int getType() {
		return Type;
	}

	public void setType(int type) {
		Type = type;
	}

	public long getIDCard() {
		return IDCard;
	}

	public void setIDCard(long iDCard) {
		IDCard = iDCard;
	}

	public long getExamCard() {
		return ExamCard;
	}

	public void setExamCard(long examCard) {
		ExamCard = examCard;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public int getGrade() {
		return Grade;
	}

	public void setGrade(int grade) {
		Grade = grade;
	}

	@Override
	public String toString() {
		return "Student [FlowID=" + FlowID + ", Type=" + Type + ", IDCard=" + IDCard + ", ExamCard=" + ExamCard
				+ ", StudentName=" + StudentName + ", Location=" + Location + ", Grade=" + Grade + "]";
	}

}
