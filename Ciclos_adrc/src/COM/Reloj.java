package COM;

public class Reloj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hr=00, mi=00, se=00;
		String hora="";
		
		while(hr<24) {
			
			if(hr<10) {
				hora=hora+"0"+hr+":";
			}else {
				hora=hora+hr+":";
			}
			
			if(mi<10) {
				hora=hora+"0"+mi+":";
			}else {
				hora=hora+mi+":";
			}
			
			if(se<10) {
				hora=hora+"0"+se;
			}else {
				hora=hora+se;
			}
			
			
			se++;
			
			if(se==60) {
				se=00;
				mi++;
			}
			if(mi==60) {
				mi=00;
				hr++;
			}
			
			System.out.println(hora);
			hora="";
		}
		
		
	}

}
