
        Scanner sc=new Scanner(System.in);
        int no=sc.nextInt();
           int i=2;
       //for(int i=2;i<no/2;i++)
       while(no>i)
        {
            if(no%i==0)
            {
                  
                flag=false;
                break;
            }
           i++;
        }

        if(flag)
        {
            System.out.println("prime number");
        }