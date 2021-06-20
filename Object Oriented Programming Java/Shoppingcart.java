

/*An online shopping cart is a collection of items that a shopper uses to collect things for purchase. A shopper can add items to the cart, remove them, empty the cart, view the items in the cart, and end shopping and proceed to checkout.
Using the Java ArrayList class, you will write a program to support these functions. Each item added to the cart will be represented with the CartItem class (se attached .java files).
When your program begins, you will display a menu of actions the shopper can perform:
SHOPPING CART OPTIONS
1 add an item to your cart
2 remove an item from your cart
3 view the items in your cart
4 end shopping and go to checkout
5 empty your cart
6 exit the program
Your program will allow the shopper to add and remove items to the shopping cart. The program should continue as long as the shopper want to keep going. The shopper can exit by choosing option 6, and in this case the shopper will exit without making a purchase. The shopper can also exit by selecting option 4, and go to checkout. I
*/

package ADS;
import java.util.ArrayList;
import java.util.Scanner;

class item{
    float price;
    String name;
    int id;
    int quantity=1;

    item(float price, String name,int id, int quantity){
        this.price=price;
        this.name=name;
        this.id=id;
        if(quantity>1) {
            this.quantity = quantity;
        }
    }


}

public class Shoppingcart {
    ArrayList<item> cartlist=new ArrayList<item>();
    void add(){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter name");
        String name=sc.nextLine();
        System.out.println("enter id");
        int id=sc.nextInt();
        System.out.println("enter price");
        float price=sc.nextFloat();
        System.out.println("enter quantity");
        int quantity=sc.nextInt();

        item i=new item(price, name, id,quantity);
        cartlist.add(i);

    }

    public   String remove(int id){
        for(int i=0;i<cartlist.size();i++){
            if(id==cartlist.get(i).id){
                cartlist.remove(cartlist.get(i));
                return "remove";
            }

        }
return "not found";

    }

  public  void display(){
        for(int i=0;i<cartlist.size();i++){
            System.out.println("Product Name:"+cartlist.get(i).name);
            System.out.println("Product ID:"+cartlist.get(i).id);
            System.out.println("Product Price:"+cartlist.get(i).price);
            System.out.println("Product Qty:"+cartlist.get(i).quantity);

        }
    }
    public void checkout(){
     display();
     float total=0;
     for(int i=0;i<cartlist.size();i++){
         total=cartlist.get(i).price*cartlist.get(i).quantity+total;
     }
     empty();
        System.out.println("Total Amount :"+total);
    }
    public void empty(){
        cartlist.removeAll(cartlist);
    }
    public void exit() {
    	System.out.println("Thanks for visit,visit again");
    }
  static void menu(){
        Scanner sc=new Scanner(System.in);
        Shoppingcart c1=new Shoppingcart();
        int choice;
        do {
            System.out.println(" 1.add an item in your cart \n 2.remove  an item in your cart \n 3.view the item in your cart\n 4.end shopping and go to checkout \n 5.empty your cart\n 6.exit the program");
             choice = sc.nextInt();
            switch (choice) {
                case 1:
                    c1.add();
                    break;
                case 2:
                    System.out.println("enter item you want to delete");
                    int b = sc.nextInt();
                    c1.remove(b);
                    break;
                case 3:
                    c1.display();
                    break;

                case 4:
                    c1.checkout();
                    break;

                case 5:
                    c1.empty();
                    break;

                case 6:
                    //System.exit(0);
                	c1.exit();
                    break;

                default:
                    System.out.println("invalid choice,please enter valid option \n");
            }

            // System.out.println();
        }while (choice >0) ;

  }


    public static void main(String[] args){
       menu();
    }

}