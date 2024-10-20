public class common_uncom {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {3, 4, 5, 6, 7};
        int[] arr3 = {5, 6, 7};
        int[] com_Arr = new int[arr1.length];
        int l = 0;
        int flag=0;
        int [] uncom_Arr= new int[100];
        for (int i = 0; i < arr1.length; i++) {
            // for loop for arr1
            for (int j = 0; j < arr2.length; j++) {
                // for loop for arr2
                // comparing 1st & 2nd Array
                for (int k = 0; k < arr3.length; k++) {
                    // comparing 1st and 3rd array
                    if ((arr1[i] == arr2[j])&&(arr2[j] == arr3[k])) {
                        com_Arr[l] = arr1[i];
                        l++;
                    }
                }
            }
        }
        int m = 0;
        for (int i = 0; i < arr1.length; i++) {
            for(int j=0; j<l; j++)
            {
                if(arr1[i]==com_Arr[j]) {
                    flag=1;
                }
            }
            if(flag==0)
            {
                System.out.println(arr1[i]+" Stored into "+ uncom_Arr[m]);
                uncom_Arr[m] = arr1[i];
                m++;
            }
        }
        flag=0; // flag reset for comparison of new array
        for (int i = 0; i < arr2.length; i++) {
            for(int j=0;j<l;j++) {
                if(com_Arr[j] == arr2[i]) {
                    uncom_Arr[m] = arr2[i];
                    flag=1;
                }
            }
            if(flag==0)
            {
                uncom_Arr[m] = arr2[i];
                m++;
            }
        }
        flag=0; // flag reset for comparison of new array
        for(int i = 0; i < arr3.length; i++) {
            for(int j=0;j<l;j++) {
                if(com_Arr[j] == arr3[i]){
                    flag=1;
                }
            }
            if(flag==0)
            {
                uncom_Arr[m] = arr3[i];
                m++;
            }
        }
        System.out.println("Uncommon elements is");
      for(int i=0;i<m;i++)
      {
            System.out.println(uncom_Arr[i]);
      }

      System.out.println("Common array is");
      for (int i = 0; i < l; i++){
          System.out.println(com_Arr[i]);
      }
    }
}

