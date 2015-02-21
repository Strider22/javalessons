/**
<H1>Overview</h1>
Basic calculation math.
*/
public class ex02calculation{
	public static void main(String[] args){
    int length = 25;
    int width = 10;
    double height = 1.5;

    //Calculate the Area
	System.out.print("Area = length times width = " );
	System.out.print(length + " times " + width + " = ");
	System.out.println(length * width );

    //Calculate the Perimeter
	System.out.print("Perimeter = (2 * length)  +  (2 * width) = " );
	System.out.println((2*length) + (2 * width));
	System.out.print("That the same as length + length + width + width = " );
	System.out.println(length + length + width + width);

	//Calculate the Volume
    System.out.print("Volume = length * width * height = " );
    System.out.println(length * width * height);
	}
}
