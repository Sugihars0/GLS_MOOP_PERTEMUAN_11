
public abstract class BaseCharacter {

	protected String name;
	protected String desc;
	
	
	public BaseCharacter() {
		// TODO Auto-generated constructor stub
	}

	public BaseCharacter(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}

	public void getInfo(){
		System.out.println( name + " " + desc );
	}

}
