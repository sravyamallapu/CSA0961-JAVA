class Overload  
{ 
 void add(int a, int b)  
 { 
      int sum1 = a+b;  
  System.out.println("Sum of two numbers: " + sum1); 
   } 
 
   void add(int a, int b, int c)  
 { 
      int sum1 = a+b+c;  
  System.out.println("Sum of three numbers: " + sum1); 
   } 
 public static void main(String[] args)  
 { 
      Overload obj = new Overload(); 
      obj.add(10, 20); 
      obj.add(10, 20, 30); 
   } 
 
} 