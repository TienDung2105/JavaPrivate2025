public class Utils {

    public static int tinhtong(int a[], int n){
        int tong =0;
        for(int i=0;i<n;i++){
            tong+=a[i];
        }
        return tong ;
    }

    public static int timMin(int a[], int n){
        int min =a[0];
        for(int i=1;i<n;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }

    public static int timMax(int a[], int n){
        int max=a[0];
        for(int i=1;i<n;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }

    public static int sapxep (int a[], int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(a[j]>a[j+1]){
                    int temp= a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        return 0;
    }

    public static boolean laSoNT(int n){
        if(n<2){
            return false;
        }
        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static int inSoNTMax(int a[], int n){
        int maxNT=-1;
        for(int i=0;i<n;i++) {
            if (laSoNT(a[i]) && maxNT<a[i]) {
                maxNT = a[i];
            }
        }
        return maxNT;
    }

    public static void inmang(int a[], int n){
        for(int i=0;i<n;i++){
            System.out.println(a[i]+" ");
        }
        System.out.println();
    }

}

