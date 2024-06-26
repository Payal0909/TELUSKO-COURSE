package introOfJava;

public class Arrays {
    public static void main(String[] args) {
//   one-d array
       int num[]= {2,3,4};
        System.out.println(num[1]);

        int num1[] = new int[4];
        System.out.println(num1[1]);

 //  multi-d array
         int num2[][] = new int[3][3];
         for(int i=0;i<3;i++)
         {
             for(int j=0;j<3;j++)
             {
                 num2[i][j] = (int) (Math.random()*10);
                 System.out.print(num2[i][j]);
             }
             System.out.println();
         }
        System.out.println();
//         enhanced for loop
        for(int n[]:num2)
        {
            for(int m :n)
            {
                m=(int) (Math.random()*10);
                System.out.print(m);
            }
            System.out.println();
        }

//         Jagged Array

        int num4[][]= new int[3][];
        num4[0]=new int[4];
        num4[1]=new int[2];
        num4[2]=new int[3];

        for(int n[]:num4)
        {
            for(int m :n)
            {
                m=(int) (Math.random()*10);
                System.out.print(m);
            }
            System.out.println();
        }

        for(int i=0;i< num4.length;i++)
        {
            for(int j=0;j<num4[i].length;j++)
            {
                num4[i][j] = (int) (Math.random()*10);
                System.out.print(num4[i][j]);
            }
            System.out.println();
        }
    }
}
