import java.util.*;

public class Main {

	
	Scanner scan = new Scanner(System.in);
	
	public void space(){
		for( int i=0 ; i<35 ; i++ ){
			System.out.println("");
		}
	}
	
	public void menu(){
		System.out.println("1. Info");
		System.out.println("2. Work");
		System.out.println("3. Cook");
		System.out.println("4. Drive");
		System.out.println("5. Paint");
	}
	
	public void joblist(){
		System.out.println("1. Worker");
		System.out.println("2. Chef");
		System.out.println("3. Driver");
		System.out.println("4. Artist");
	}
	
	public void karakter(){
		System.out.println("1. Sugi");
		System.out.println("2. Leo");
		System.out.println("3. Welldelin");
		System.out.println("4. Joselina");
		System.out.println("5. Vincent");
		System.out.println("6. Kevin");
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		int choose = 0;
		String input;
		
		do{
			space();
			menu();
			System.out.println("Input : ");
			input = scan.nextLine();
			
			}while(!input.equals("Info") && !input.equals("Work") && !input.equals("Cook") && !input.equals("Drive") && !input.equals("Paint"));
			
			if( input.equals("Info") ){
				do{
					joblist();
					System.out.println("Input : ");
					input = scan.nextLine();
				}while( !input.equals("Chef") && !input.equals("Worker") && !input.equals("Driver") && !input.equals("Artist") );
					
				if( input.equals("Chef") ){
					System.out.println("Chef, seorang koki restoran");
				}
				
				else if( input.equals("Worker") ){
					System.out.println("Worker, seorang pekerja kantoran");
				}
				
				else if( input.equals("Driver") ){
					System.out.println("Driver, seorang yang bisa menyetir");
				}
				
				else if( input.equals("Artist") ){
					System.out.println("Artist, seorang pelukis");
				}
			}

			else if( input.equals("Cook") ){
				do{
					karakter();
					System.out.println("Choose : ");
					choose = scan.nextInt(); scan.nextLine();
				}while( choose < 1 || choose > 6 );
				
				switch(choose){
					case 1:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 2:
						System.out.println("Leo memasak");
						break;
					case 3:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 4:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 5:
						System.out.println("Vincent memasak");
						break;
					case 6:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
				}
			}
			
			else if( input.equals("Work") ){
				do{
					karakter();
					System.out.println("Choose : ");
					choose = scan.nextInt(); scan.nextLine();
				}while( choose < 1 || choose > 6 );
				
				switch(choose){
					case 1:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 2:
						System.out.println("Leo bekerja");
						break;
					case 3:
						System.out.println("Welldelin bekerja");
						break;
					case 4:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 5:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 6:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
				}
			}
			
			else if( input.equals("Drive") ){
				do{
					karakter();
					System.out.println("Choose : ");
					choose = scan.nextInt(); scan.nextLine();
				}while( choose < 1 || choose > 6 );
				
				switch(choose){
					case 1:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 2:
						System.out.println("Leo menyetir");
						break;
					case 3:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 4:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 5:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 6:
						System.out.println("Kevin menyetir");
						break;
				}
			}
			
			else if( input.equals("Paint") ){
				do{
					karakter();
					System.out.println("Choose : ");
					choose = scan.nextInt(); scan.nextLine();
				}while( choose < 1 || choose > 6 );
				
				switch(choose){
					case 1:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 2:
						System.out.println("Leo melukis");
						break;
					case 3:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 4:
						System.out.println("Joselina melukis");
						break;
					case 5:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
					case 6:
						System.out.println("Karakter tidak bisa melakukan aksi ");
						break;
				}
			}
		
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
