public class Main {
    public static void main(String[]args)
    {

        int rk[] =new int[1000];
        int i=0;
        while(i<1000)
        {
            int num1 = (int)(Math.random()*100);
            rk[i] = num1;
            i++;
        }
        int j=0;
        while(j<1000)
        {
            System.out.println(rk[j]);
            j++;
        }

    }
}
