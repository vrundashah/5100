import java.io.*;
public class Calculator
{
public static void main(String[] args) throws FileNotFoundException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int sum = 0;
System.out.println("Enter whole numbers to add, one per line.");
System.out.println("Enter 'exit' to terminate, 'clear' to set sum=0.");
System.out.println("Provide file name as command line parameter to read disk.");
if (args.length > 0)
br = new BufferedReader(new FileReader(args[0])); 
while (true)
{
try {
String s = br.readLine(); 
if (s == null)
break; 
System.out.print("Input was " + s);
s = s.trim();
if (s.equalsIgnoreCase("exit"))
break; 
if (s.equalsIgnoreCase("clear"))
{
sum = 0;
System.out.println(" Sum = " + sum);
continue; 
}
int inputValue = Integer.parseInt(s);
sum += inputValue;
System.out.println(" Sum = " + sum);
}
catch(IOException ioe)
{
System.out.println(ioe); 
System.exit(0);
}
catch(NumberFormatException nfe)
{
System.out.println(nfe);
}
}
}
} 