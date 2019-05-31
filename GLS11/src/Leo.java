
public class Leo extends BaseCharacter implements IChef,IWorker,IDriver,IArtist{

	public Leo() {
		// TODO Auto-generated constructor stub
		name = "Leo";
		desc = "4 Pekerjaan";
	}

	public void Paint() {
		// TODO Auto-generated method stub
		System.out.println(name + "melukis");
	}

	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println(name + "menyetir");
	}

	public void Work() {
		// TODO Auto-generated method stub
		System.out.println(name + "bekerja");
	}

	public void Cook() {
		// TODO Auto-generated method stub
		System.out.println(name + "memasak");
	}

}
