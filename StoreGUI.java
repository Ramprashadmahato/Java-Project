    //import all the java package of the GUI swing and awt.javax package import javax.swing.JFrame; 
    import javax.swing.JLabel;
    /*
    //import java swing package
    import javax.swing.*;
    // import java awt package 
    import java.awt.*;
    import java.util.ArrayList;
    import java.awt.event.ActionListener;
    import java.awt.event.ActionEvent;
    private ArrayList<store> Guilist = new ArrayList <store>();
    private JComBox <String> Purchaseyear 
    */
    import javax.swing.JTextField;
    import javax.swing.JComboBox; 
    import javax.swing.JCheckBox; 
    import javax.swing.JButton; 
    import java.awt.Font; 
    import java.awt.Color;
    import javax.swing.JPanel; 
    import java.awt.event.ActionListener; 
    import javax.swing.JRadioButton; 
    import javax.swing.ButtonGroup;
    import java.util.ArrayList;
    import javax.swing.JOptionPane;
    import java.awt.event.ActionListener;
    import javax.swing.JFrame;
    import java.awt.event.ActionEvent;
    
    public class StoreGUI implements ActionListener { 
        private JFrame MainJF,DeptJF,RetJF;
        //MainJF JLable
        private JLabel Title,Contain, 
        //Department JLable
        DeptTitle,ID,Name,Location,Time,Sales,Discount,Product,Marked,Selling,
        //Retailer JLabel 
        RetTitle,RID,RName,RLocation,RTime,RSales,RDiscount,Loyalty,VAT,box;
        //Depatment JText field
        private JTextField storeid,Storename,location,openinghour,totalsales,totaldiscount,productname,markedprice,sellingprice,
        //Retailer JText Field 
        Rstoreid,Rstorename,Rlocation,Ropeninghour,Rtotalsales,Rtotaldiscount,loyaltypoint,vatinclusive; 
        // Main Jframe JButton
        private JButton DepartmentBut,ReatilerBut,
        //Department JButton 
        DeptBackBtn,DepartBut,Caldiscount,Display,Clear, 
        //Retailer JButton
        RetBackBtn,RetrBut,RDisplay,RClear,Setloyalty,RemoveProductBut;
        // Retailer JCombox  
        private JComboBox<String> PurchasedYear; 
        // Retailer JCheckbox
        private JCheckBox IsPaymentOnline,isinsales; 
        // Only one Array list of this GUI 
        private ArrayList<store> Guilist = new ArrayList<store>();
    public StoreGUI(){
        // Main JFrame of the gui
        MainJF = new JFrame("Java Assignement");
        // set the background color of the Main JF
        MainJF.getContentPane().setBackground(new Color( 192 , 192 , 192));
        // title of the store GUi
        Title = new JLabel ("Store management system !");
        // Title font size 
        Title.setFont(new Font("Times New Roman",Font.BOLD,30));
        // set the  title  front color
        Title.setForeground(  new Color(87, 85, 85)); 
        // set bounds
        Title.setBounds(250,20,500,30);
        // Button of the gui
        DepartmentBut = new JButton("Department");
        ReatilerBut = new JButton("Reatiler");
        //  JLabel of the contaion
        Contain = new JLabel ("**I am grateful to Islington College for giving me this opportunity.**");
        // Title font size 
        Contain.setFont(new Font("Times New Roman",Font.BOLD,27));
    
        // Title font color
        Contain.setForeground(new Color(0,0,0));
        
        //set bounds of the contain
        Contain.setBounds(30,325,900,200);
    
        // Department JFrame 
    
        DeptJF = new JFrame("Department");
    
        // set the background color of the Department JF
        DeptJF.getContentPane().setBackground(new Color(240, 235, 235));
    
        // Reatiler JFrame 
        RetJF = new JFrame("Retailer");
    
        // set the background color of the Retailer JF
        RetJF.getContentPane().setBackground(new Color(240, 235, 235));
    
        
        //set bounds of add button of retailer class
        ReatilerBut.setBounds(570,225,130,40);
    
        //set Color in button AddReatiler
        ReatilerBut.setBackground(new Color(242, 213, 216));
    
        //set bounds of add button of department class
        DepartmentBut.setBounds(150,225,136,40);
    
        //set Color in button AddDepartment
        DepartmentBut.setBackground( new Color(242, 213, 216));
    
        /*
         * All components in Department JFrame
         * and its necessary Text field and button
         */
    
        //Department title
        DeptTitle = new JLabel("Welcome to the Department Class");
    
        //set bounds of Department title
        DeptTitle.setBounds(250,20,500,30);
    
        // Title font size 
        DeptTitle.setFont(new Font("Times New Roman",Font.BOLD,30));
    
        // Title font color
        DeptTitle.setForeground(new Color(87, 85, 85));
    
        // Add title Department JFrame
        DeptJF.add(DeptTitle);
    
        //JLabel of store id
        ID = new JLabel("Store ID:");
    
        //Set bounds of store id JLabel
        ID.setBounds(60,100,100,30);
    
        // Add title Department JFrame
        DeptJF.add(ID);
    
        //storeid JTextfield
        storeid = new JTextField();
    
        //set bounds of store id JTextfield
        storeid.setBounds(150,100,170,30);
    
        // Add title Department JFrame
        DeptJF.add(storeid);
    
        // JLabel of storename
        Name = new JLabel("Store Name:");
    
        // set bounds of storename JLabel
        Name.setBounds(450,100,100,30);
    
        // Add title Department JFrame
        DeptJF.add(Name);
    
        // JTextfield of storename
        Storename = new JTextField();
    
        // set bounds of storename  JText field
        Storename.setBounds(570,100,160,30);
    
        // Add title Department JFrame
        DeptJF.add(Storename);
    
        // JLabel of location
        Location = new JLabel("Location:");
    
        //set bounds  of location JLabel
        Location.setBounds(60,150,200,30);
    
        // Add title Department JFrame
        DeptJF.add(Location);
    
        // JTextfiled of the location
        location = new JTextField();
    
        // set bounds of location JTextField
        location.setBounds(150,150,170,30);
    
        // Add title Department JFrame
        DeptJF.add(location);
    
        // JLabel of opening hour
        Time = new JLabel("Openinghour:");
    
        //set bounds of opening hour JLabel
        Time.setBounds(450,150,200,30);
    
        // Add title Department JFrame
        DeptJF.add(Time);
    
        // JTextField of the openinghour
        openinghour = new JTextField();
    
        //set bounds of openinghour Text field
        openinghour.setBounds(570,150,160,30);
    
        // Add title Department JFrame
        DeptJF.add(openinghour);
    
        //JLabel of  selling price
        Sales = new JLabel("Total Sales:");
    
        // set bounds of total sales JLabel
        Sales.setBounds(60,200,200,30);
    
        // Add title Department JFrame
        DeptJF.add(Sales);
    
        // JTextField of the totalsales
        totalsales = new JTextField();
    
        // set bounds of totalsales JTextField
        totalsales.setBounds(150,200,170,30);
    
        // Add title Department JFrame
        DeptJF.add(totalsales);
    
        //JButton  to add Depatment
        DepartBut = new JButton("Add Department");
    
        //set bounds of add button of department class
        DepartBut.setBounds(340,250,136,40);
    
        //set Color in button AddDepartment
        DepartBut.setBackground(new Color(242, 213, 216));
    
        // Add title Department JFrame
        DeptJF.add(DepartBut);
    
        //JLabel of discount price
        Discount = new JLabel("Total Discount:");
    
        // set bounds of JLabel totaldiscount
        Discount.setBounds(450,200,200,30);
    
        // Add title Department JFrame
        DeptJF.add(Discount);
    
        //JTextField of totaldiscount
        totaldiscount = new JTextField();
    
        // set bounds of JTextField of totaldiscount
        totaldiscount.setBounds(570,200,160,30);
    
        // Add title Department JFrame
        DeptJF.add(totaldiscount);
    
        // JLabel of the product
        Product = new JLabel("Product Name:");
    
        //set bounds of product JLabel
        Product.setBounds(60,300,200,30);
    
        // Add title Department JFrame
        DeptJF.add(Product);
    
        // JTextField of the product name
        productname = new JTextField();
    
        //set bounds of product JTextField
        productname.setBounds(150,300,170,30);
    
        // Add  Department JFrame
        DeptJF.add(productname);
    
        //Marked price of the JLabel
        Marked = new JLabel("Marked Price:");
    
        // set bounds of the JLabel
        Marked.setBounds(450,300,200,30);
    
        // Add  Department JFrame
        DeptJF.add(Marked);
    
        // marked price of the JTextField
        markedprice = new JTextField();
    
        // set bounds of the marked price
        markedprice.setBounds(570,300,160,30);
    
        // Add  Department JFrame
        DeptJF.add(markedprice);
    
        //JCheckBox
        isinsales= new JCheckBox("IsInsales");
    
        // Add in Retailer JFrame
        DeptJF.add(isinsales);
    
        //checkbox
        isinsales.setBounds(570,350,80,30);
    
        // calculate the JButton
        Caldiscount = new JButton ("Calculate Discount Price");
    
        //set bounds of buttot to calculate discountprice
        Caldiscount.setBounds(100,425,175,40);
    
        //set Color in button Caldiscount
        Caldiscount.setBackground(new Color(242, 213, 216));
    
        // Add  Department JFrame
        DeptJF.add(Caldiscount);
    
        // Display button
        Display = new JButton ("Display");
    
        // set bounds of Button to Display all the data
        Display.setBounds(300,425,175,40);
    
        //set Color in button Display
        Display.setBackground(new Color(242, 213, 216));
    
        // Add  Department JFrame
        DeptJF.add(Display);
    
        // Clear JButton
        Clear = new JButton ("Clear");
        // set bounds of Button to Clear all the data
        Clear.setBounds(500,425,175,40);
    
        //set Color in button Clear
        Clear.setBackground(new Color(242, 213, 216));
    
        // Add  Department JFrame
        DeptJF.add(Clear);
    
    
        /*
         * All components in Reatiler JPanel
         * and its necessary Text field and button
         */
    
        //Retailer title
        RetTitle = new JLabel("Welcome to the Retailer Class");
    
        // set bounds of retailer title
        RetTitle.setBounds(250,20,500,30);
    
        //set font size of the retailer title
        RetTitle.setFont(new Font("Times New Roman",Font.BOLD,30));
    
        // set font color
        RetTitle.setForeground(new Color(87, 85, 85)); 
    
        // Add in Retailer JFrame
        RetJF.add(RetTitle);
    
        //JLabel of store id
        RID = new JLabel("Store ID:");
    
        // set bounds of retailer id JLabel
        RID.setBounds(60,100,100,30);
    
        // Add in Retailer JFrame
        RetJF.add(RID);
    
        //storeid JTextfield
        Rstoreid = new JTextField();
    
        // set bounds of Retailer id JTextField
        Rstoreid.setBounds(150,100,170,30);
    
        // Add in Retailer JFrame
        RetJF.add(Rstoreid);
    
        // JLabel of storename
        RName = new JLabel("Store Name:");
    
        // set bounds of storename JLabel
        RName.setBounds(450,100,100,30);
    
        // Add in Retailer JFrame
        RetJF.add(RName);
    
        // JTextfield of storename
        Rstorename = new JTextField();
    
        // set bounds of storename JTextfield
        Rstorename.setBounds(570,100,160,30);
    
        // Add in Retailer JFrame
        RetJF.add(Rstorename);
    
        // JLabel of location
        RLocation = new JLabel("Location:");
    
        // set bounds of location Jlabel
        RLocation.setBounds(60,150,200,30);
    
        // Add in Retailer JFrame
        RetJF.add(RLocation);
    
        // JTextfiled of the location
        Rlocation = new JTextField();
    
        // set bounds of location JTextField
        Rlocation.setBounds(150,150,170,30);
    
        // Add in Retailer JFrame
        RetJF.add(Rlocation);
    
        // JLabel of opening hour
        RTime = new JLabel("Openinghour:");
    
        // set bounds of opening hour JLabel
        RTime.setBounds(450,150,200,30);
    
        // Add in Retailer JFrame
        RetJF.add(RTime);
    
        // JTextField of the openinghour
        Ropeninghour = new JTextField();
    
        // set bounds of the openinghour JTextField
        Ropeninghour.setBounds(570,150,160,30);
    
        // Add in Retailer JFrame
        RetJF.add(Ropeninghour);
    
        //JLabel of  selling price
        RSales = new JLabel("Total Sales:");
    
        // set bounds of total sales JLabel
        RSales.setBounds(60,200,200,30);
    
        // Add in Retailer JFrame
        RetJF.add(RSales);
    
        // JTextField of the totalsales
        Rtotalsales = new JTextField();
    
        // set bounds of totalsales JTextField
        Rtotalsales.setBounds(150,200,170,30);
    
        // Add in Retailer JFrame
        RetJF.add(Rtotalsales);
    
        //JButton  to add Retailer
        RetrBut = new JButton("Add Retailer");
    
        //set bounds of add button of Retailer class
        RetrBut.setBounds(350,250,136,40);
    
        //set Color in button AddRetailer
        RetrBut.setBackground(new Color(242, 213, 216));
    
        // Add in Retailer JFrame
        RetJF.add(RetrBut);
    
        //JLabel of discount price
        RDiscount = new JLabel("Total Discount:");
    
        //set bounds of total discount JLabel
        RDiscount.setBounds(450,200,200,30);
    
        // Add in Retailer JFrame
        RetJF.add(RDiscount);
    
        //JTextField of totaldiscount
        Rtotaldiscount = new JTextField();
    
        // set bounds of the total discount JText Field
        Rtotaldiscount.setBounds(570,200,160,30);
    
        // Add in Retailer JFrame
        RetJF.add(Rtotaldiscount);
    
        //vat inclusive JLabel
        VAT = new JLabel("VAT Inclusive Price:");
    
        // set bounds of the JLabel 450,300,200,30
        VAT.setBounds(450,300,200,30);
    
        // Add in Retailer JFrame
        RetJF.add(VAT);
        
        // JText Field 
        vatinclusive = new JTextField();
    
        // set bounds 570,300,160,30
        vatinclusive.setBounds(570,300,160,30);
    
        // Add in Retailer JFrame
        RetJF.add(vatinclusive);
    
        //Purchased Years 
        box= new JLabel("Purchased Year:");
        String[]year={" ","2020","2021","2022"};
        PurchasedYear= new JComboBox<>(year);
    
        // set bounds
        box.setBounds(450,360,100,30);
    
        // Add in Retailer JFrame
        RetJF.add(box);
        // set bounds 
        PurchasedYear.setBounds(570,360,100,30);
    
        //Add in Retailer JFrame
        RetJF.add(PurchasedYear);
    
        //JCheckBox
        IsPaymentOnline= new JCheckBox("Is Payment Online");
    
        // Add in Retailer JFrame
        RetJF.add(IsPaymentOnline);
    
        //checkbox
        IsPaymentOnline.setBounds(150,350,170,30);
    
        // calculate the JButton
        Setloyalty = new JButton ("Set the Loyalty Point");
    
        //set bounds of buttot to calculate discountprice
        Setloyalty.setBounds(100,425,175,40);
    
        //set Color in button Caldiscount
        Setloyalty.setBackground(new Color(242, 213, 216));
    
        // Add  Department JFrame
        RetJF.add(Setloyalty);
        // JButton of the remove product
        RemoveProductBut = new JButton("Remove the product");
    
        //set bounds
        RemoveProductBut.setBounds(100,475,175,40); 
    
        //set Color in button Caldiscount
        RemoveProductBut.setBackground(new Color(242, 213, 216));
    
        // Add the remove button in Retailer JFrame
        RetJF.add(RemoveProductBut);
    
        // Display button
        RDisplay = new JButton ("Display");
    
        // set bounds of Button to Display all the data
        RDisplay.setBounds(300,425,175,40);
    
        //set Color in button Display
        RDisplay.setBackground(new Color(242, 213, 216));
    
        // Add  Department JFrame
        RetJF.add(RDisplay);
    
        // Clear JButton
        RClear = new JButton ("Clear");
        // set bounds of Button to Clear all the data
        RClear.setBounds(500,425,175,40);
    
        //set Color in button Clear
        RClear.setBackground(new Color(242, 213, 216));
    
        // Add  Department JFrame
        RetJF.add(RClear);
    
        // Department JFrame Back  to Main JFrame
        DeptBackBtn = new JButton("Back");
    
        // set bounds to the back button
        DeptBackBtn.setBounds(50,50,150,40);
    
        //set Color in button Department Back button
        DeptBackBtn.setBackground(new Color(242, 213, 216));
    
        // Add to the Department JFrame
        DeptJF.add(DeptBackBtn);
    
        // Department back button add to the action listener
        DeptBackBtn.addActionListener(this);
    
        // Retailer JFrame Back  to Main JFrame
        RetBackBtn = new JButton("Back");
    
        // set bounds to the back button
        RetBackBtn.setBounds(50,50,150,40);
    
        //set Color in button RetBackBtn
        RetBackBtn.setBackground(new Color(242, 213, 216));
    
        // Add to the Retailer JFrame
        RetJF.add(RetBackBtn);
    
        // Retailer back button add to the action listener
        RetBackBtn.addActionListener(this);
    
        /*
         * Add all the components in the JFrame
         */ 
        MainJF.add(Title);
        MainJF.add(Contain);
        MainJF.add(DepartmentBut);
        MainJF.add(ReatilerBut);
    
        //add actionListener
        DepartmentBut.addActionListener(this);
        ReatilerBut.addActionListener(this);
        DepartBut.addActionListener(this);
        Caldiscount.addActionListener(this);
        Display.addActionListener(this);
        Clear.addActionListener(this);
        DeptBackBtn.addActionListener(this);
        RetrBut.addActionListener(this);
        Setloyalty.addActionListener(this);
        RemoveProductBut.addActionListener(this);
        RDisplay.addActionListener(this);
        RClear.addActionListener(this);
        RetBackBtn.addActionListener(this);
        /*
         * set Layout of the JFrame
         * set Size of the JFrame
         * set Visible(true) of the JFrame
         */
        // Configure the main JFrame (MainJF)
        MainJF.setLayout(null); // Set the layout manager to null for absolute positioning of components
        MainJF.setSize(860,650);// Set the size of the main window to 860x650 px
        MainJF.setVisible(true); // Make the main window visible
    
        // Configure the Department JFrame (DeptJF)
        DeptJF.setLayout(null);// Set the layout manager to null for absolute positioning of components
        DeptJF.setSize(860,650);// Set the size of the department window to 860x650 px
        DeptJF.setVisible(false);// Initially hide the department window
    
        // Configure the Retailer JFrame (RetJF)
    
        RetJF.setLayout(null);// Set the layout manager to null for absolute positioning of components
        RetJF.setSize(860,650);// Set the size of the retailer window to 860x650 px
        RetJF.setVisible(false);// Initially hide the retailer window
    }
    //Here, override the method for event handling
    @Override 
    public void actionPerformed(ActionEvent e){
        // check if the event source is the departmentbutton JFrame
        if(e.getSource() == DepartmentBut){
            JOptionPane.showMessageDialog(MainJF,"You want to enter into the  Department class?","Department Class",
            JOptionPane.INFORMATION_MESSAGE);
            MainJF.setVisible(false); 
            DeptJF.setVisible(true); 
            RetJF.setVisible(false);
        }
        // check if the event source is the Retailerbutton JFrame
        if(e.getSource() == ReatilerBut){
            JOptionPane.showMessageDialog(MainJF,"You want to enter into the  Retailer class?","Retailer Class",
            JOptionPane.INFORMATION_MESSAGE);
            MainJF.setVisible(false); 
            DeptJF.setVisible(false); 
            RetJF.setVisible(true);
    
        }
        // check if the event source is the departrment JFrame back to the Main Frame
        if(e.getSource() == DeptBackBtn){
            MainJF.setVisible(true); 
            DeptJF.setVisible(false); 
            RetJF.setVisible(false);
    
        }
        // check if the event source is the retailer JFrame back to the Main Frame 
        if(e.getSource() == RetBackBtn){
            MainJF.setVisible(true); 
            DeptJF.setVisible(false); 
            RetJF.setVisible(false);
        }
        /*
         * Methode to add the department button
         */
        if (e.getSource() == DepartBut) {
        try {
            // Check if any of the required fields are empty
            if (storeid.getText().isEmpty() || Storename.getText().isEmpty() || location.getText().isEmpty() ||
                openinghour.getText().isEmpty() || totalsales.getText().isEmpty() || totaldiscount.getText().isEmpty() ||
                productname.getText().isEmpty() || markedprice.getText().isEmpty()) {
                // Display an error message if any required field is empty
                JOptionPane.showMessageDialog(DeptJF, "Empty Field Found!!! Please fill all the fields", "Error Message", JOptionPane.ERROR_MESSAGE);
                return;
            }
            // Parse data from the input fields
            String storeName = Storename.getText();
            String Location = location.getText();
            String openingHour = openinghour.getText();
            int storeId = Integer.parseInt(storeid.getText());
            double totalSales = Double.parseDouble(totalsales.getText());
            double totalDiscount = Double.parseDouble(totaldiscount.getText());
            String productName = productname.getText();
            double markedPrice = Double.parseDouble(markedprice.getText());
    
            // Input Validation for store ID
            if (storeId <= 0) {
                JOptionPane.showMessageDialog(DeptJF, "Store ID should be greater than zero", "Error Message", JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            // Checking if the store ID already exists in any store object
            for (store DT : Guilist) { // DT is automatically upcasted to store.
            
                if (DT.getstoreID() == storeId ) {
                    // Display an error message if the store ID already exists
                    JOptionPane.showMessageDialog(DeptJF, "Store ID already exists! Please enter a unique store ID.", "Error Message", 
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
    
            // Create a new Department object
            Department department = new Department(storeName, Location, openingHour, storeId, totalSales, totalDiscount,productName, markedPrice);
    
            // Add the department object to the Guilist ArrayList
            Guilist.add(department);
            // Prepare a message to display the details of the added department
            String message = "\nStore Name: " + storeName + "\nLocation: " + Location + "\nOpening Hour: " + openingHour + "\nStore ID: " + storeId + 
            "\nTotal Sales: " + totalSales + "\nTotal Discount: " + totalDiscount + "\nProduct Name: " + productName + "\nMarked Price: " + markedPrice;
    
            // Display a success message indicating that the Department has been added
            JOptionPane.showMessageDialog(DeptJF, "Your Department AddButton is Successful!!" + message, "Add Department Button", 
                    JOptionPane.INFORMATION_MESSAGE);
    
        } catch (NumberFormatException e1) {
            // Handle exception if input is not a valid number
            JOptionPane.showMessageDialog(DeptJF, "Please enter valid numbers for ID, Sales, Discount, and Marked Price.", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e1) {
            // Handle any other exceptions that may occur
            JOptionPane.showMessageDialog(DeptJF, e1.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*
     * Method to calculate discount price
     */ 
      if (e.getSource() == Caldiscount) {
        try {
            // To check the if requireds field are empty
            if (storeid.getText().isEmpty() || markedprice.getText().isEmpty() || !isinsales.isSelected()) {
                //Display an error message if any require field is empty
             JOptionPane.showMessageDialog(DeptJF, "All fields must be filled.", "Input Error", JOptionPane.ERROR_MESSAGE);
             return;
        }   
            //Parse and convert values from text fields.
            int storeId = Integer.parseInt(storeid.getText());
            double markedPrice = Double.parseDouble(markedprice.getText());
            boolean IsInsales = isinsales.isSelected();
            
             // Input Validation for store ID
            if (storeId <= 0) {
                //Display an error message if store id is not valid
                JOptionPane.showMessageDialog(DeptJF, "Store ID should be greater than zero", "Error Message", JOptionPane.ERROR_MESSAGE);
                return;
            }
            boolean DepartmentFound = false;
            // Here, to check the exist of the department
            for(store DT : Guilist) {// DT is automatically upcasted to store.
                 // Check if the current item is an instance of Department
                if(DT instanceof Department){
                     // Downcasting from `store` to Department
                    Department department = (Department) DT;
                    // Check if the store ID matches
                    if(department.getstoreID() == storeId){
                         // Calculate discount price for the department
                        department.calculateDiscountPrice(IsInsales, markedPrice);
                        DepartmentFound = true;
                        break;
                       
                    }
                }
            }
            if(DepartmentFound){
                // Display a success message if the discount price was calculated successfully
                JOptionPane.showMessageDialog(DeptJF, "Discount Price calculated successfully.", "Discount Calculation",JOptionPane.INFORMATION_MESSAGE);
            }else{
                 // Display an error message if no department with the given ID was found
                JOptionPane.showMessageDialog(DeptJF, "Sorry no Department found with ID " + storeId + "\nCannot Calculate Discount Price", "Error Message",JOptionPane.ERROR_MESSAGE);
            }
    
        } catch (NumberFormatException e1) {
            // Handle exception if the input is not a valid number
            JOptionPane.showMessageDialog(DeptJF, "Please enter valid numbers for fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e1) {
            // Handle any other exceptions that may occur
            JOptionPane.showMessageDialog(DeptJF, e1.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }   /*
       * To clear text field of the department frame
       * Check if the event source is the clearButton for  Department
       */
        if (e.getSource() == Clear) {
        // Check if all text fields are already empty
        if (storeid.getText().isEmpty() && Storename.getText().isEmpty() && location.getText().isEmpty() &&
            openinghour.getText().isEmpty() && totalsales.getText().isEmpty() && totaldiscount.getText().isEmpty() &&
            productname.getText().isEmpty() && markedprice.getText().isEmpty()) {
            // Display an error message if all fields are already clear
            JOptionPane.showMessageDialog(DeptJF, "All Fields are already cleared!", "Error Message",JOptionPane.ERROR_MESSAGE);
            return;
        } else {
            // Display a confirmation dialog box to confirm clearing text fields
            int option = JOptionPane.showConfirmDialog(DeptJF, "Are you sure to clear all the fields?", "Clear",JOptionPane.YES_NO_OPTION);
            // Check the user's choice
            if (option == JOptionPane.YES_OPTION) {
                // Clear all text fields if the user chooses to do so
                storeid.setText("");
                Storename.setText("");
                location.setText("");
                openinghour.setText("");
                totalsales.setText("");
                totaldiscount.setText("");
                productname.setText("");
                markedprice.setText("");
                isinsales.setSelected(false);
            }
        }
    }
         /*
         * Methode to add the Retailer button
         */
        if(e.getSource() == RetrBut){   
        try{
            //To check if any of the necessary text fields are Empty.
            if (Rstoreid.getText().isEmpty() || Rstorename.getText().isEmpty() || Rlocation.getText().isEmpty() ||
                Ropeninghour.getText().isEmpty() || Rtotalsales.getText().isEmpty() || Rtotaldiscount.getText().isEmpty() ||
                vatinclusive.getText().isEmpty()) {
                //Display the error message if any of the necessary text fields are Empty.
                JOptionPane.showMessageDialog(RetJF, "Empty Field Found!!! Please fill all the fields", "Error Message", JOptionPane.ERROR_MESSAGE);
                return;
            }
    
            // prase and convert data types from text fields
            String storeName = Rstorename.getText();
            String location = Rlocation.getText();
            String openingHour = Ropeninghour.getText();
            int storeId = Integer.parseInt(Rstoreid.getText());
            double totalsales = Double.parseDouble(Rtotalsales.getText());
            double totaldiscount = Double.parseDouble(Rtotaldiscount.getText());
            int VATinclusivePrice = Integer.parseInt(vatinclusive.getText());
            boolean isPaymentOnline = IsPaymentOnline.isSelected();
            String purchasedYear = (String) PurchasedYear.getSelectedItem(); 
    
            // Input Validation for store ID
            if (storeId <= 0) {
                JOptionPane.showMessageDialog(RetJF, "Store ID should be greater than zero", "Error Message", JOptionPane.ERROR_MESSAGE);
                return;  
            }
    
            // Check if the store ID already exists in any store object
            for (store Rt : Guilist) {// Rt is automatically upcasted to store.
                if (Rt.getstoreID() == storeId ) {
                    //Display the error message if the store id is not unique.
                    JOptionPane.showMessageDialog(RetJF, "Store ID already exists! Please enter a unique store ID.", "Error Message", 
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
    
            // Create a new Retailer object
            Retailer retailer = new Retailer(storeName, location, openingHour, storeId, totalsales, totaldiscount, VATinclusivePrice,
                    isPaymentOnline, purchasedYear);
    
            // Adding the retailer object to the Guilist ArrayList
            Guilist.add(retailer);
    
            // Prepare a message to display the details of the added retailer
            String message = "\nStore Name: " + storeName + "\nLocation: " + location + "\nOpening Hour: " + openingHour + "\nStore ID: " + storeId + 
             "\nTotal Sales: " + totalsales + "\nTotal Discount: " + totaldiscount + "\nVAT inclusive Price: " + VATinclusivePrice +
             "\nIs Payment Online: " + isPaymentOnline + "\nPurchase Year: " + purchasedYear;
    
            // Display a success message indicating that the retailer has been added
            JOptionPane.showMessageDialog(RetJF, "Your Retailer AddButton is Successful!!" + message, "Add Retailer Button", 
                    JOptionPane.INFORMATION_MESSAGE);
    
        } catch (NumberFormatException e1) {
            // Handle any exceptions that occur due to invalid number input
            JOptionPane.showMessageDialog(RetJF, "Please enter valid numbers for ID, Sales, Discount, and VAT Inclusive Price.", 
                    "Input Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e1) {
              // Handle any other exceptions and display the relevant error message
            JOptionPane.showMessageDialog(RetJF, e1.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /*
     * The method to set the loyalty point
     * accoreding to the vatinclusive price+
     */
       if (e.getSource() == Setloyalty) {
    try {
        //check if any of the required fields are empty
        if (Rstoreid.getText().isEmpty() || vatinclusive.getText().isEmpty()) {
            //Display an error message if any requaired filed is empty
            JOptionPane.showMessageDialog(RetJF, "Empty Field Found!!! Please fill all the Fields", "Error Message", JOptionPane.ERROR_MESSAGE);
            return; 
        }
        int storeId = Integer.parseInt(Rstoreid.getText());
        int VATinclusivePrice = Integer.parseInt(vatinclusive.getText());
        boolean isPaymentOnline = IsPaymentOnline.isSelected();
    
        // Input Validation for store id
        if (storeId <= 0 || VATinclusivePrice <= 0) {
            JOptionPane.showMessageDialog(RetJF, "Please enter a valid store ID and VAT inclusive price. Both must be greater than zero.", "Error Message", JOptionPane.ERROR_MESSAGE);
            return;
        }     
        boolean RetailerFound = false;
        for(store Rt : Guilist) {// Rtis automatically upcasted to store.
            if(Rt instanceof Retailer){
                // Downcasting from store to Retailer.
                Retailer retailer = (Retailer) Rt;
                if(retailer.getstoreID() == storeId){
                    retailer.setLoyaltyPoint(isPaymentOnline, VATinclusivePrice);
                    int LoyaltyPoint = retailer.getLoyaltyPoint();
                    RetailerFound = true;
                    // Display the set loyalty point in a dialog box
                    JOptionPane.showMessageDialog(RetJF, "Loyalty Point set successfully for Retailer with ID " + storeId + ". \nThe loyalty point is " + LoyaltyPoint, "Set Loyalty Point", JOptionPane.INFORMATION_MESSAGE);
                    break;
                }
            }
        }
        if(!RetailerFound){
            //Display an error message if no Retailer instance is found 
            JOptionPane.showMessageDialog(RetJF, "Sorry no Retailer found with ID " + storeId + "\nCannot Set Loyalty Point", "Error Message",
            JOptionPane.ERROR_MESSAGE);
        }
    } catch (NumberFormatException e1) {
        JOptionPane.showMessageDialog(RetJF, "Please enter valid numbers for fields.", "Input Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e1) {
        JOptionPane.showMessageDialog(RetJF, e1.getMessage(), "Input Error", JOptionPane.ERROR_MESSAGE);
    }
}
       /*
        * The method to remove the product
        */ 
    if (e.getSource() == RemoveProductBut) {
    try {
        // Parse the store ID from the input field
        int storeId = Integer.parseInt(Rstoreid.getText());
        // Input Validation for store id
        if (storeId <= 0) {
            // Display an error message if the store ID is not greater than zero
            JOptionPane.showMessageDialog(RetJF, "Store id must be greater than zero.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        // Check if the Guilist contains a product with the given store ID
        for (store store : Guilist) {
            if (store.getstoreID() == storeId) {
                Guilist.remove(store);
                // Display a success message if the product was removed
                JOptionPane.showMessageDialog(RetJF, "Product removed successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
                return;
            }
        }
        // Display an error message if the product not found
        JOptionPane.showMessageDialog(RetJF, "Product not found.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e1) {
        // Handle with incorrect store ID input (non-integer value).
        JOptionPane.showMessageDialog(RetJF, "Invalid store ID", "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    /*
     * The method to display the both Retrial and Department detials
     * that is retailer diplay is RDisplay
     * That is Department display is Display
    */
     if (e.getSource() == RDisplay || e.getSource() == Display) {
         //Insilize the empty String to collect information about the retailer
        String retailDetails = "";
        //Insilize the empty  String to collect information about the department
        String departmentDetails = "";
        // here, checking the Retailer is found
        boolean RetailerFound = false;
        // here, checking the Department is found
        boolean DepartmentFound = false;
        //Loop through the stores list to locate instances of Retailer and Department.
        for (store S : Guilist) {  // S is automatically upcasted to store.
            if (S instanceof Retailer) {
               // Downcasting from store to Retailer
                Retailer retailer = (Retailer) S;
                //Collect information about the Retailer.
                retailDetails += "Retailer Name: " + retailer.getstoreName() + "\n";
                retailDetails += "Location: " + retailer.getlocation() + "\n";
                retailDetails += "Opening Hour: " + retailer.getopeninghour() + "\n";
                retailDetails += "Store ID: " + retailer.getstoreID() + "\n";
                retailDetails += "Total Sales: $ " + retailer.gettotalsales() + "\n";
                retailDetails += "Total Discount: $ " + retailer.gettotaldiscount() + "\n";
                retailDetails += "VAT Inclusive Price: " + retailer.getVATinclusivePrice() + "\n";
                retailDetails += "Loyalty Point: " + retailer.getLoyaltyPoint() + "\n";
                retailDetails += "Is Payment Online: " + retailer.getIsPaymentOnline() + "\n";
                retailDetails += "Purchased Year: " + retailer.getPurchasedYear() + "\n";
                // Add a newline to separate each retailer's details
                retailDetails += "\n";
                // here, checking the Retailer true is found 
                RetailerFound = true;
            } 
            
            if (S instanceof Department) {
                // Downcasting from store to Department
                Department department = (Department) S;
                //Collect information about the Department.
                departmentDetails += "Store Name: " + department.getstoreName() + "\n";
                departmentDetails += "Location: " + department.getlocation() + "\n";
                departmentDetails += "Opening Hour: " + department.getopeninghour() + "\n";
                departmentDetails += "Store ID: " + department.getstoreID() + "\n";
                departmentDetails += "Total Sales: $ " + department.gettotalsales() + "\n";
                departmentDetails += "Total Discount: $ " + department.gettotaldiscount() + "\n";
                departmentDetails += "Product Name: " + department.getproductName() + "\n";
                // To check the department is discounted and add the corresponding price.
                if(department.getisinsales()){
                    departmentDetails += "Marked Price: $ " + department.getmarkedPrice() + "\n";
                }else{
                    departmentDetails += "Selling Price: $ " + department.getsellingPrice() + "\n";
                }
                // Add a newline to separate each department's details
    
                departmentDetails += "\n";
                // here, checking the Department true is found
    
                DepartmentFound = true;
            }
        }
        //If a retailer or department is found, show their information in a message dialog.
    
        if (RetailerFound || DepartmentFound) {
            JOptionPane.showMessageDialog(null, retailDetails + departmentDetails, "Store Details",JOptionPane.INFORMATION_MESSAGE);
        } else {
            //If a retailer or department is not found, show their Error message in a message dialog.
            JOptionPane.showMessageDialog(null, "No Retailer or Department found \nCannot Display Details", "Error Message",JOptionPane.ERROR_MESSAGE);
        }
    }
        /*
     * The method to clear the retailer details
     */
    if (e.getSource() == RClear) {
        // Check if all text fields are already empty and if the checkbox is not selected
        if (Rstoreid.getText().isEmpty() && Rstorename.getText().isEmpty() && Rlocation.getText().isEmpty() &&
            Ropeninghour.getText().isEmpty() && Rtotalsales.getText().isEmpty() && Rtotaldiscount.getText().isEmpty() &&
            vatinclusive.getText().isEmpty() && !IsPaymentOnline.isSelected()) {
            
            // Display an error message if all fields are already cleared
            JOptionPane.showMessageDialog(RetJF, "All Fields are already cleared!", "Error Message",JOptionPane.ERROR_MESSAGE);
        } else {
            // Display a confirmation dialog box to confirm clearing text fields
            int option = JOptionPane.showConfirmDialog(RetJF, "Clear all the fields?", "Clear",JOptionPane.YES_NO_OPTION);
            // Check the user's choice
            if (option == JOptionPane.YES_OPTION) {
                // Clear all text fields if the user chooses to do so
                Rstoreid.setText("");
                Rstorename.setText("");
                Rlocation.setText("");
                Ropeninghour.setText("");
                Rtotalsales.setText("");
                Rtotaldiscount.setText("");
                vatinclusive.setText("");
                PurchasedYear.setSelectedIndex(0);
                IsPaymentOnline.setSelected(false);
            }
        }
    }
    }
    /*
     * This is the main method of the StoreGUI
     */
        public static void main(String[] args) {
        new StoreGUI();
        }
       }