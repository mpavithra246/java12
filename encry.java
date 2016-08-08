package assign;
import java.util.Scanner;

public class Encryp {

    public static void main(String []arg)
    {
        Scanner qq=new Scanner(System.in);
        System.out.println("Enter the String");
        String input=qq.nextLine();     
        qq.close();
        String dup[]=input.split(" ");
        String []newdup=new String[dup.length];
        int keydup=0;
        int n=0;
        char key=' ';
        for(int i=0;i<dup.length;i++)
        {
            char  duparr[]=dup[i].toCharArray();
            int kk=duparr.length-1;
            while(n==0)
            {
                if(((duparr[kk]>64) && (duparr[kk]<91))||((duparr[kk]>96)&&(duparr[kk]<123)))
                {
                    key=(char)duparr[kk];
                    n=1;
                }
                else
                    kk=kk-1;
            }
            if(key<91 && key>64)
            {
            keydup=(int)(key-64);
            }
            else if(key<123 && key>96)
            {
                keydup=(int)(key-96);
            }
            for(int j=0;j<kk;j++)
            {
                if(duparr[j]<91 && duparr[j]>64)
                {
                duparr[j]=(char)((int)duparr[j]-keydup);
                if((int)duparr[j]<65)
                {
                    duparr[j]=(char)((int)duparr[j]+26);
                }                   
                }
                if(duparr[j]<123 && duparr[j]>96)
                {
                duparr[j]=(char)((int)duparr[j]-keydup);
                if((int)duparr[j]<97)
                {
                    duparr[j]=(char)((int)duparr[j]+26);
                }           
                }
            }
            newdup[i]=new String(duparr);
        }
        System.out.println("Encrypted String :");
        for(int i=0;i<newdup.length;i++)
        System.out.print(newdup[i]+" ");
    }
}


