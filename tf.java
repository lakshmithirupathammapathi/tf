import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{

static final int MAX = 10000; 
  
 
static int prefix[] = new int[MAX + 1]; 
  
static void buildPrefix() { 
      
  
    boolean prime[] = new boolean[MAX + 1]; 
    Arrays.fill(prime, true); 
  
    for (int p = 2; p * p <= MAX; p++) { 
  
  
    if (prime[p] == true) { 
  
        // Update all multiples of p 
        for (int i = p * 2; i <= MAX; i += p) 
        prime[i] = false; 
    } 
    } 
  
   
    prefix[0] = prefix[1] = 0; 
    for (int p = 2; p <= MAX; p++) { 
    prefix[p] = prefix[p - 1]; 
    if (prime[p]) 
        prefix[p]++; 
    } 
} 
  
 
static int query(int L, int R) 
{ 
    return prefix[R] - prefix[L - 1];  
} 
  

public static void main(String[] args) { 
      
    buildPrefix(); 
    int L, R;
Scanner s=new Scanner(System.in);
L=s.nextInt();
R=s.nextInt(); 
    System.out.println(query(L, R)); 
  
	}
}
