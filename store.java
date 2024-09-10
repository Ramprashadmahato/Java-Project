 // store is the parentclass of Department *& Retailer
public class store{
    //Attribute
   
    private String storeName;
 
    private String location;
    
    private String openinghour;
    
    private int storeID;
  
    private double totalsales;
    
    private double totaldiscount;
     /*constructor
     accepts four parameters which are storeName,location, openinghour, storeID */
    public store(String storeName, String location, String openinghour, int storeID){
        this.storeName = storeName;
        this.location = location;
        this.openinghour = openinghour;
        this.storeID = storeID;
        this.totalsales = 0.0;
        this.totaldiscount = 0.0;
    }
        // Accessor method
        
    
        public String getstoreName(){
            return this.storeName;

        }
        
        public String getlocation(){
            return this.location;
        }
        
        public String getopeninghour(){
            return this.openinghour;
        }
        
        public int getstoreID(){
            return this.storeID;
        }
        
        public double gettotalsales(){
            return this.totalsales;
        }
        public double gettotaldiscount(){
            return this. totaldiscount;
        }
        //mutator method
        
        
        public void settotalsales( double totalsales){
            this.totalsales += totalsales;
        }
        public void settotaldiscount(double totaldiscount){
            this.totaldiscount += totaldiscount;
        }
        //display method
        /*
         * Dispaly the store class as a parent class
         */
        public void display(){
            if(totalsales == 0.0 && totaldiscount == 0.0){
                System.out.println("storeName:" + storeName);
                System.out.println("Location:" + location);
                System.out.println("openinghour:" + openinghour);
                System.out.println("storeID:" + storeID);
                System.out.println("totalsales:N/A");
                System.out.println("totaldiscount: N/A" );

            }else{
                System.out.println("StoreName:" + storeName);
                System.out.println("Location:" + location);
                System.out.println("openinghour:" + openinghour);
                System.out.println("storeID:" + storeID);
                System.out.println("totalsales: $" + totalsales);
                System.out.println("totaldiscount: $" + totaldiscount);
            }
        }

        
    }

    


