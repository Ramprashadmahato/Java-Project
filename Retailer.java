// child class of the store parent class
public class Retailer extends store{
    //Attributes
    
    private int VATinclusiveprice;
    
    private int LoyaltyPoint;
    
    private boolean IsPaymentOnline;
    
    private String PurchasedYear;
    
    /* constructor
     * accepts nine parameters which are storeName,location, openinghour, storeID,totalsales,totaldiscounts, VATinclusivePrice, IsPaymentOnline, 
     * and PurchasedYear.
     */
    public Retailer(String storeName, String location, String openinghour, int storeID, double totalsales, double totaldiscount, int VATinclusivePrice,
     boolean IsPaymentOnline, String PurchasedYear){
         
         super(storeName, location, openinghour, storeID);
         
         this.settotalsales (totalsales);
         
         this.settotaldiscount (totaldiscount);
         
         this.VATinclusiveprice = VATinclusiveprice;
         
         this.IsPaymentOnline = IsPaymentOnline;
         
         this.PurchasedYear = PurchasedYear;
         
         this . LoyaltyPoint = 0; 
         
     }
     //Accessor method
     public int getVATinclusivePrice(){
         return this.VATinclusiveprice;
     }
     public int getLoyaltyPoint(){
         return this.LoyaltyPoint;
     }
     public boolean getIsPaymentOnline(){
         return this.IsPaymentOnline;
     }
     public String getPurchasedYear(){
         return this. PurchasedYear;
         
     }
     //mutator method
     public void setIsPaymentOnline(boolean IsPaymentOnline){
         this.IsPaymentOnline = IsPaymentOnline;
         
     }
     
     //calculate loyalty point method
     public void setLoyaltyPoint(boolean IsPaymentOnline, int VATinclusiveprice){
         if(IsPaymentOnline){
             this.LoyaltyPoint = (int) (VATinclusiveprice * 0.01);
         }
         
         
     }
     //Remove product
     public void removeProduct(){
         if (LoyaltyPoint ==0 && (PurchasedYear.equals("2020") || PurchasedYear.equals("2021") || PurchasedYear.equals("2022"))){
                
                 System.out.println("The Product has been removed.");
                 this.VATinclusiveprice=0;
                 this.LoyaltyPoint=0;
                 this.IsPaymentOnline=false;
                 
                 
                 
                 
                 
                 
             }
         }
     
     
     public void display(){
         super.display();
         if (LoyaltyPoint !=0 && !(PurchasedYear.equals("2020") || PurchasedYear.equals("2021") || PurchasedYear.equals("2022"))){
             
                System.out.println("VATinclusiveprice:" + getVATinclusivePrice());
                System.out.println("LoyaltyPoint:"+ getLoyaltyPoint());
                System.out.println("PurchasedYear:" + getPurchasedYear());
         }else{
             System.out.println("The product has been removed");
         }
    
                 
        }
            
     }
     
         
     


