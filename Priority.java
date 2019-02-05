public class Priority {

   
    public static void main(String[] args) {
        int[] pid={1,2,3,4};
        int[] ar={2,4,3,1};
        int[] bt={4,5,2,3};
        int[] pt={1,1,2,3};
        int ct[]=new int[4];
        int tat[]=new int[4];
        int wt[]=new int[4];
        int temp=0;
         
        for(int i=0;i<ar.length-1;i++)
        {
           for(int j=0;j<ar.length-1;j++)
           {
               if(ar[j]>ar[j+1])
               {  temp = ar[j];
	        ar[j] = ar[j+1];
	        ar[j+1] = temp;
	        temp = bt[j];
	        bt[j] = bt[j+1];
	        bt[j+1] = temp;
	        temp = pid[j];
                             pid[j] = pid[j+1];
	        pid[j+1] = temp;
                             pt[i]=pt[j+1];
                             pt[j+1]=temp;
                             temp=pt[j];
           }
        }}
        for(int i=0;i<ar.length;i++)
        {
         if(i==0)
         {
             if(ar[i]==0)
                 ct[i]=bt[i];
             else
                 ct[i]=bt[i]+ar[i];
         }
         else if(ar[i]<ct[i-1] )
            ct[i]=bt[i]+ct[i-1];
         tat[i]=ct[i]-ar[i];
         wt[i]=tat[i]-bt[i];
            System.out.println ("completion time for process id  "+"="+ct[i]);
           // System.out.println ("turn around time time for process id  "+"="+tat[i]);
           // System.out.println ("waiting time time for process id  "+"="+ct[i]);
           
        }
             
        
}
}