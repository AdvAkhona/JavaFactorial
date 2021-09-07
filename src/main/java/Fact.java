import java.util.Scanner;
public class Fact {
         static Scanner scan = new Scanner(System.in);
	 public static int factIter(int n1){ 
                 int r = 0;
		  if (n1> 0){
                      r=1;
                   for (int i = 0; i<= n1; i++){
                       r = r*i;
                   }
                  }        
		    return r;    
         }
	 
	  public static int factRec(int n1)
	  {
	    if ((n1==0)|| (n1==1)){
                return 1;
            }
            else{
                return (n1 * factRec(n1-1));
           }
          }

	public static void main(String[] args) {		
		while(true){
                    String mess = "\nPositive Integer please ";
                    System.out.println(mess);
                    String s = scan.next();
                    int n = Integer.parseInt(s);
                    if(((s.isEmpty()== false) && (n>=0))== true){
                        n = Integer.parseInt(s);
                        int i = factIter(n);
                        int r = factRec(n);
                        String ms = "factorial of"+" "+n+" " + "iterative is" + r;
                        System.out.println(ms);
                        
                    }
                }
		    
        }
		    
	

}
    

