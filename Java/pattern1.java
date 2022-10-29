import java.util.*;
import java.io.*;

public class pattern1 {

	public static void main(String[] args)throws Exception {
int n = 5;
	for(int i=0;i<=n;i++)
	{
		for(int j=i;j>=0;j-- )
		{
			System.out.print(j%2);
		}
	System.out.println();
	}
	
	}}
  //output:
//	0
//	10
//	010
//	1010
//	01010
//	101010