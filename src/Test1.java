
import java.util.Scanner;
public class Test1 {
  public static void main(String[] args) {
     int order = 0, price = 0;
     int discount = 0, net = 0;
     int customer = 0;
     
     Scanner oj = new Scanner(System.in);
     System.out.print("�١��Ҥ����  = ");
     customer = oj.nextInt();
     System.out.print("�ӹǹ�ͧ������ = ");
     order = oj.nextInt();
     System.out.print("�Ҥ� = ");
     price = oj.nextInt();
     //   ***�١��Ҥ���� 1** //  
     
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
        System.out.println("����Ŵ : " + discount+ "�ҷ");
        System.out.println("�١���A �����Թ= " + net + "�ҷ");
     
        
   //   ***�١��Ҥ���� 2** //  
        
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
	  System.out.println("����Ŵ : " + discount+ "�ҷ");
      System.out.println("�١���B �����Թ= " + net + "�ҷ");
	
      
      //   ***�١��Ҥ���� 3** //  
      
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
	  System.out.println("����Ŵ : " + discount+ "�ҷ");
      System.out.println("�١���C �����Թ= " + net + "�ҷ");
	  
	  
	  
	 
	  
  }
  }
}
