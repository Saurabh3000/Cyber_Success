class IMS
{
	int studId;
	String name;
	static String collageName="Cyber Success";
	
	void setInfo(int studId, String name)
	{
		this.studId = studId;
		this.name = name;
	}
	void getInfo()
	{
		System.out.println("StudentId = " + studId + " Student_Name = " + name + " Collage Name = " + collageName);
	}
}
class Example11
{
	public static void main(String[] args)
	{
		IMS stud1 = new IMS();
		stud1.setInfo(1, "Kalyani");
		stud1.getInfo();
	}
}