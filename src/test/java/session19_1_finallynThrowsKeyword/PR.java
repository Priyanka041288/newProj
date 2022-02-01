package session19_1_finallynThrowsKeyword;

public class PR {
	public static void main(String[]args) {
		PR met =new PR();
		met.launchbrowse();
	}
		public static void launchbrowse() {
			System.out.println("launch the browser.........");
			launchurl();
		}
		public static void launchurl() {
			System.out.println("launch url.....");
			launchlogin();
		}
		public static void launchlogin() {
			System.out.println("launvh login..............");
			try {
			int a =10/0;
			}
			catch (Exception e){
			
				System.out.println("somethng went wrong..........");
				
			}
			System.out.println("sgrjjykiukujukjlk");
		}
	
	
	
	}

