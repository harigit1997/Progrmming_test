//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Array {
    public static void main(String[] args) {
        int []arr_o={1,2,3,4,5,6,7,8,9};
        int size1,size2;
        int []arr_e=new int[arr_o.length];
        int []arr_od=new int[arr_o.length];
        int k=0;
        int l=0;
        for(int i=0;i< arr_o.length;i++)
        {
           if(arr_o[i]%2==0)
           {
               arr_e[k]=arr_o[i];
               k++;
           }
           else
           {
               arr_od[l]=arr_o[i];
               l++;
           }
        }
        System.out.println("Array with Even elements");
        for(int j=0;j<k;j++)
        {
            System.out.print(arr_e[j]+" ");
        }
        System.out.println(" ");
        System.out.println("Array with Odd elements");
        for(int j=0;j<l;j++)
        {
            System.out.print(arr_od[j]+" ");
        }
    }
}