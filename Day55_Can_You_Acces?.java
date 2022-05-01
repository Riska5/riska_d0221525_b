import java.io.*;
import java.lang.reflect.*;
import java.util.*;
import java.util.regex.*;
import java.security.*;


public class Solution {

	public static void main(String[] args) throws Exception {
		DoNotTerminate.forbidExit();	

		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine().trim());
			Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
System.out.println(num + " is " + ((Solution.Inner.Private)(o = (Object) new Solution.Inner().new Private())).powerof2(num));
		System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
