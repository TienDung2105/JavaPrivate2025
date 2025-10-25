import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen n = ");
        int n= sc.nextInt();
        int[] a= new int[n];

        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]=");
            a[i]=sc.nextInt();
        }

        int choice;
        do{
            System.out.println("--- Menu ---");
            System.out.println("1. Tính tổng các phẩn tử trong mảng");
            System.out.println("2. In ra phần tử lớn nhất, nhỏ nhất trong mảng");
            System.out.println("3. Sắp xếp lại mảng theo chiều tăng dần");
            System.out.println("4. In ra số nguyên tố lớn nhất trong mảng (nếu không có in ra \"Không có\")");
            System.out.print("Nhập lựa chọn:");
            choice=sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("tong cac phan tu trong mang la "+ Utils.tinhtong(a,n));
                    break;
                case 2:
                    System.out.println("In ra phan tu lon nhat nho nhat lan luot la "+Utils.timMin(a,n)+" , "+Utils.timMax(a,n) );
                    break;
                case 3:
                    Utils.sapxep(a,n);
                    System.out.println("Mang theo chieu tang dan la : " );
                    Utils.inmang(a,n);
                    break;
                case 4:
                    int maxNT=Utils.inSoNTMax(a,n);
                    if(maxNT==-1){
                        System.out.println("khong co ");
                    }else {
                        System.out.println("So nguyen to lon nhat la : "+ maxNT);}
                    break;
                default:
                    System.out.println("Khong hop le ");
                    break;
            }

        }while (choice!=0);
        sc.close();


    }
}
