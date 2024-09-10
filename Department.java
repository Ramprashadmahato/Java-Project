// child class of the store class
public class Department extends store{
    //Attributes
    private String productName;

    private double markedPrice;
  
    private double sellingPrice;

    private boolean isinsales;
    // constructor 
    /*  constructor accepts eight parameters which are storeName,location, openinghour, storeID,totalsales
     * totaldiscount
     * markedPrice
     * productName
     */
    public Department( String storeName, String location, String openinghour, int storeID, double totalsales, double totaldiscount,String productName, 
    double markedPrice){
        super(storeName, location, openinghour, storeID);
        this.settotalsales (totalsales);
        this.settotaldiscount (totaldiscount);
        this.productName =  productName;
        this.markedPrice =  markedPrice;
        this.sellingPrice = 0.0;
        this.isinsales = true;
       
    }
    //Accessor method
    
    public String getproductName(){
        return this.productName;
    }
    
    public double getmarkedPrice(){
        return this.markedPrice;
    }
    
    public double getsellingPrice(){
        return this.sellingPrice;
        
    }
    
    public boolean getisinsales(){
        return this. isinsales;
    }
    //mutator method
    
    public void setmarkedPrice(double markedPrice){
        this. markedPrice += markedPrice;
    }
  // Method to calculate discount price
public void calculateDiscountPrice(boolean isInSales, double markedPrice) {
    double discountPercent = 0.0;

    if (isInSales) {
        if (markedPrice >= 5000) {
            discountPercent = 0.2; 
        } else if (markedPrice >= 3000 && markedPrice < 5000) {
            discountPercent = 0.1;
        } else if (markedPrice >= 1000 && markedPrice < 3000) {
            discountPercent = 0.05; 
        }

        double discountAmount = markedPrice * discountPercent;
        this.sellingPrice = markedPrice - discountAmount;
        super.settotaldiscount(discountAmount);
        this.isinsales = false;  // Assuming you want to reset this after applying the discount
    } else {
        this.sellingPrice = markedPrice;  // No discount applied if not in sales
    }

    this.markedPrice = markedPrice;
}


        //Dispaly method 
        /*
         * display the Department class as a subclass of store
         */
        
        
        public void display(){
            super.display();
            if(isinsales){
                System.out.println("productName:" + productName);
                System.out.println(" markedPrice: $ " + markedPrice);
            }else{
              System.out.println("productName:" + productName);
              System.out.println(" sellingPrice: $ " + sellingPrice);  
            }
            
        }
    }
    
    
    
