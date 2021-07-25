import java.util.Scanner;
class Series
{
    public static void main(String[] args)
    {   Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,cub=0;
        System.out.println("number\t\tcubes\n");
        for(int i=1;i<=n; i++)
        {cub=i*i*i;
            System.out.println(i+"\t\t"+cub);
            sum+=cub;
        }
        System.out.println("\n\nSum of the series  :" + sum);
    }
}