import java.util.Scanner;
public class TV2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of products");
        int n=sc.nextInt();
        int i;
        String item[] = new String[n];
        double price[] = new double[n];
        double dprice[] = new double[n];
        double gst[] = new double[n];
        double qnt[] = new double[n];
        for(i=0;i<n;i++){
            System.out.println("Enter product Name");
            item[i]=sc.next();
            System.out.println("Enter product Price");
            price[i]=sc.nextDouble();
            double disprice=price[i];
            if(disprice>=500){
                dprice[i]=disprice-(disprice*0.05);
            }
            else{
                dprice[i]=disprice;
            }
            System.out.println("Enter product GST");
            gst[i]=sc.nextDouble();
            System.out.println("Enter product Quantity");
            qnt[i]=sc.nextDouble();
        }
        String Maxgstitem="";
        double gtotal=0,total,gsttotal,maxgst=0;
        for(i=0;i<n;i++){
            total=price[i]*qnt[i];
            gsttotal=total*(gst[i]/100);
            gtotal+=total+gsttotal;
            if(maxgst<gsttotal){
                maxgst=gsttotal;
                Maxgstitem=item[i];
            }
        }
        System.out.println("Item \t Price \t DPrice \t GST \t Quantity");
        for(int j=0;j<n;j++){
            System.out.println(item[j]+"\t"+price[j]+"\t"+dprice[j]+"\t"+gst[j]+"\t"+qnt[j]);
        }
        System.out.println("Total price =" + gtotal);
        System.out.println("Max GST product =" +Maxgstitem);
    }
}