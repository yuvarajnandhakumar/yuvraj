
public class ChildClass extends ParentClass{

	public void childmethod() {
		System.out.println("child method");
	}

	@Override
	public void parentmethod() {
		System.out.println("override method");		
		super.parentmethod();
	}
}
