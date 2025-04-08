public class cuadrados{
public static void main(String[] args){
System.out.println("this calculates the number of squares up to the number: " + args[0]);
int number = Integer.parseInt(args[0]);

//whatever u find:
for(int i=1;i <= number;i++){
System.out.println("the square of: "+i+" is -> "+(i*i));
}

}
}

