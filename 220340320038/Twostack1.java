class Twostack1{
int size;
int top1,top2;
int arr[];


Twostack1(int n)
{
   arr=new int[n];
   size=n;
   top1=-1;
   top2=size;
 }

void push1(int x)
{
  if(top1 < top2-1){
   top1++;
   arr[top1]=x;
}
  else{
    System.out.println("Stack overflow");
  }
  }
	
	void push2(int x)
	{ 
	
      if(top1 < top2-1){
	  top2--;
	  arr[top2]=x;
	  
	 }
     else{
         System.out.println("Stack overflow");
      }
        }

       int pop1()
       {
         if (top1>=0){
             int x=arr[top1];
             top1--;
             return x;
       }

        else{
          System.out.println("Stack underflow");
         }
          return 0;
         }

        int pop2()
    {
       if(top2 < size){
          int x=arr [top2];
          top2++;
          return x;
      }
       else{
   System.out.println("stack underflow");
      }
      return 0;
     }

         public static void main(String[] args)
        {
		  Twostack1 Dk=new Twostack1(6);
		  Dk.push1(5);
		  Dk.push2(10);
		  Dk.push2(15);
		  Dk.push1(11);
		  Dk.push2(7);
		  Dk.push2(40);
		  
		  System.out.println("popped element from" +"stack1 is " +Dk.pop1());
		  Dk.push2(40);
		  System.out.println("popped element from" +"stack2 is " +Dk.pop2());
		  
 		 }
	}	 