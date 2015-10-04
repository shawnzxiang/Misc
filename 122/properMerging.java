package homework;

public class properMerging {

	public static void main(String[] args) {
		int [] p = {0, 5, 2, 3, 4, 1}; 
		int [] q = {0, 5, 3, 4, 2, 1}; 

		int [] qHelper = {0, 0, 0, 0, 0, 0};  
		
		int i = 1; 
		
		for (i = 1; i < q.length; i++)
			qHelper[q[i]] = i; 
		
		for (i = 1; i < p.length; i++){
			
			if (i >= qHelper[p[i]]) {
				
				System.out.print(p[i] + " " + p[i] + " "); 
				qHelper[p[i]] = 0; 
			} else {
				System.out.print(p[i] + " "); 
			}
		}
	
		for (i = 1; i < qHelper.length; i++){
			if (qHelper[i] != 0){
				System.out.print(q[qHelper[i]] + " "); 
			}
		}
				
	}

}
