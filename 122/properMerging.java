
public class properMerging {

	public static void main(String[] args) {
		int [] p = {0, 5, 3, 4, 2, 1}; 
		int [] q = {0, 3, 5 ,2, 4, 1}; 
		// int [] p = {0, 1, 2, 3}; 
		// int [] q = {0, 3, 2, 1}; 

		int [] qHelper = new int[p.length];  
		int [] pHelper = new int[q.length]; 
		
		int i = 1; 
		
		for (i = 1; i < q.length; i++) {
			qHelper[q[i]] = i; 
			pHelper[p[i]] = i; 
		}
		
		for (i = 1; i < p.length; i++){
			
			if (i >= qHelper[p[i]] && pHelper[p[i]] != 0 && qHelper[p[i]] != 0) {
				
				System.out.print(p[i] + " " + p[i] + "' "); 
				
				qHelper[p[i]] = 0; 
				pHelper[q[i]] = 0; 
			} else if (pHelper[p[i]] != 0) {
				System.out.print(p[i] + " "); 
				pHelper[p[i]] = 0;
			}
			
			if ((pHelper[q[i]] > i || pHelper[q[i]] == 0 )&& qHelper[q[i]] != 0) {
				System.out.print(q[i] + "' "); 
				qHelper[q[i]] = 0;
			} 
		
		}
	
			
	}

}
