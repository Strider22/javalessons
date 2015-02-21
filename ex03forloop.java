/**
<H1>Overview</h1>
Shows how to write a basic for loop.
*/
public class ex03forloop{
	public static void main(String[] args){

    	//0 indexed loop: 5 times 
        for(int i=0;i <5;i++){
            System.out.println("Hello - " + (i + 1));
        }
        //1 indexed loop: 5 times 
        for(int i=1;i <=5;i++){
            System.out.println("Hello - " + i);
        }

	}
}
