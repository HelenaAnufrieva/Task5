package java15.entity;

public class Product {

   public Money price;
   public String nameOfProduct;

   public Product(Money m, String s)
   {
       price = m;
       nameOfProduct = s;
   }
}
