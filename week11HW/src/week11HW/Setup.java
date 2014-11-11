package week11HW;

public class Setup {

	int user;
	int num;
	
	public Setup(int num){
		setUser(num);
	}
		
		public int getPlay()
		{
			return getUser();
		}
		
		public void PolymorphismEndGame()
		{
		System.out.println("...");
}
		public void EnterValue(int num)
		{
			 if (num == 1) 
				 num = 1; 
			    else if (num == 2) 
			    	num = 2; 
			    else if (num == 3) 
			    	num = 3; 
		}

		public int getUser() {
			return user;
		}

		public void setUser(int user) {
			this.user = user;
			}
		}