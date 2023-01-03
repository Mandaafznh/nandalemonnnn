package switchcase;
import java.util.Scanner;
public class ProgramSwitch {
    public static void main(String args [])
    {
        int nasgor,steak,mieayam,batagor,harga;
        nasgor = 12000;
        steak = 15000;
        mieayam = 7000;
        batagor = 8000;
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan Menu: ");
        harga = input.nextInt();
        switch(harga){
            case 1 : { System.out.println("Makanan yang anda pesan adalah nasi goreng dengan harga " + nasgor);
            break;}
            case 2 : { System.out.println("Makanan yang anda pesan adalah steak dengan harga " + steak);
            break;}
            case 3 : { System.out.println("Makanan yang anda pesan adalah mieayam dengan harga " + mieayam);
            break;}
            case 4 : { System.out.println("Makanan yang anda pesan adalah batagor dengan harga " + batagor);
            break;}
            default : {System.out.println("Tidak ada dalam menu");}
        }
        if (harga==1){
            System.out.println("Masukan Jumlah");
            int jumlah = input.nextInt();
            System.out.println("Total Harga = " + nasgor * jumlah);
        }
        if (harga==2){
            System.out.println("Masukan Jumlah");
            int jumlah = input.nextInt();
            System.out.println("Total Harga = " + steak * jumlah);
        }
        if (harga==3){
            System.out.println("Masukan Jumlah");
            int jumlah = input.nextInt();
            System.out.println("Total Harga = " + mieayam * jumlah);
        }
        if (harga==1){
            System.out.println("Masukan Jumlah");
            int jumlah = input.nextInt();
            System.out.println("Total Harga = " + batagor * jumlah);
        }
        }
            }
        
    

