
import java.util.Scanner;
public class Test1 {
  public static void main(String[] args) {
     int order = 0, price = 0;
     int discount = 0, net = 0;
     int customer = 0;
     
     Scanner oj = new Scanner(System.in);
     System.out.print("ลูกค้าคนที่  = ");
     customer = oj.nextInt();
     System.out.print("จำนวนของที่ซื้อ = ");
     order = oj.nextInt();
     System.out.print("ราคา = ");
     price = oj.nextInt();
     //   ***ลูกค้าคนที่ 1** //  
     
    if(customer==1){
     if (order < 10)
        {
        price = price * order;
        net = price;
        }
     else if (order  < 100)
        {
        price = price * order;
        discount = price * 5 / 100;
        net = price-discount;
        }
     else
        {
        price = price * order;
        discount = price * 10 / 100;
        net = price-discount;
        }
        System.out.println("ภาษีลด : " + discount+ "บาท");
        System.out.println("ลูกค้าA จ่ายเงิน= " + net + "บาท");
     
        
   //   ***ลูกค้าคนที่ 2** //  
        
  }else if (customer==2){
	  if (order < 10)
      {
      price = price * order;
      discount = price * 5/ 100;
      net = price-discount;
      }
   else if (order  < 100)
      {
      price = price * order;
      discount = price *15 / 100;
      net = price-discount;
      }
   else
      {
      price = price * order;
      discount = price * 25 / 100;
      net = price-discount;
      }
	  System.out.println("ภาษีลด : " + discount+ "บาท");
      System.out.println("ลูกค้าB จ่ายเงิน= " + net + "บาท");
	
      
      //   ***ลูกค้าคนที่ 3** //  
      
  }else if (customer==3){
	  if (order < 10)
      {
      price = price * order;
      net = price;
      }
   else if (order  < 100)
      {
      price = price * order;
      discount = price *20 / 100;
      net = price-discount;
      }
   else
      {
      price = price * order;
      discount = price * 25 / 100;
      net = price-discount;
      }
	  System.out.println("ภาษีลด : " + discount+ "บาท");
      System.out.println("ลูกค้าC จ่ายเงิน= " + net + "บาท");
	  
	  
	  
	 
	  
  }
  }
}
