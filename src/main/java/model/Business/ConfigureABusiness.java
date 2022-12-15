/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.util.Scanner;
import java.util.*;

import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.MarketModel.Channel;
import model.MarketModel.ChannelCatalog;
import model.MarketModel.Market;
import model.MarketModel.MarketCatalog;
import model.MarketModel.MarketChannelAssignment;
import model.MarketModel.MarketChannelComboCatalog;
import model.MarketModel.SolutionOffer;
import model.MarketModel.SolutionOfferCatalog;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;


//import java.util.function.Supplier;

import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.ProductManagement.ProductSummary;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;
import model.Personnel.PersonDirectory;
import model.Personnel.Person;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.SolutionOrders.MasterSolutionOrderList;
import model.SolutionOrders.SolutionOrder;
import model.Supplier.SupplierDirectory;
import model.Supplier.Supplier;





/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize(String n) {
    Business business = new Business(n);

    PersonDirectory persondirectory = business.getPersonDirectory();

    Person costcosalesperson01 = persondirectory.newPerson("Costco Sales");
    Person costcomarketingperson01 = persondirectory.newPerson("Costco Marketing");

    Person person005 = persondirectory.newPerson("Company 1");
    Person person006 = persondirectory.newPerson("Company 2");
    Person person007 = persondirectory.newPerson("Company 3");
    Person person008 = persondirectory.newPerson("Company 4");

    Person customer01 = persondirectory.newPerson("Customer 01");

    CustomerDirectory customerdirectory = business.getCustomerDirectory();
    // CustomerProfile customerprofile01 =
    // customerdirectory.newCustomerProfile(customer01);
    CustomerProfile customerprofile1 = customerdirectory.newCustomerProfile(person005);
    CustomerProfile customerprofile2 = customerdirectory.newCustomerProfile(person006);
    CustomerProfile customerprofile3 = customerdirectory.newCustomerProfile(person007);
    CustomerProfile customerprofile4 = customerdirectory.newCustomerProfile(person008);

    SalesPersonDirectory salespersondirectory = business.getSalesPersonDirectory();
    SalesPersonProfile salespersonprofile = salespersondirectory.newSalesPersonProfile(costcosalesperson01);

    // MarketingPersonDirectory marketingpersondirectory =
    // business.getMarketingPersonDirectory();
    // MarketingPersonProfile marketingpersonprofile =
    // marketingpersondirectory.newMarketingPersonProfile(costcomarketingperson01);

    SupplierDirectory sd = business.getSupplierDirectory();
    Supplier supplier1 = sd.newSupplier("Apple");

   ProductCatalog s1ProductCatalog = supplier1.getProductCatalog();
   Product s1p1 = s1ProductCatalog.newProduct("iPhone14", 1000, 2000, 1500);
   Product s1p2 = s1ProductCatalog.newProduct("iPhone14 Pro", 800, 1500, 1200);
   Product s1p3 = s1ProductCatalog.newProduct("iPhone13 Pro", 600, 1200, 900);
   Product s1p4 = s1ProductCatalog.newProduct("iPhone13", 500, 1000, 800);
   Product s1p5 = s1ProductCatalog.newProduct("Airpods Pro", 550, 950, 850);
   Product s1p6 = s1ProductCatalog.newProduct("Airpods Max", 450, 900, 800);
   Product s1p7 = s1ProductCatalog.newProduct("Watch-Series 8", 400, 850, 750);
   Product s1p8 = s1ProductCatalog.newProduct("Watch-Series SE", 350, 800, 700);
   Product s1p9= s1ProductCatalog.newProduct("EcoBee Thermostat", 300, 750, 650);
   Product s1p10 = s1ProductCatalog.newProduct("AppleTV-4k", 290, 700, 450);
    // -----------

    Supplier supplier2 = sd.newSupplier("Microsoft");

    ProductCatalog s2ProductCatalog = supplier2.getProductCatalog();
    Product s2p1 = s2ProductCatalog.newProduct("X box X", 1400, 1600, 1500);
    Product s2p2 = s2ProductCatalog.newProduct("X box S", 900, 1200, 1100);
    Product s2p3 = s2ProductCatalog.newProduct("X box One", 400, 600, 500);
    Product s2p4 = s2ProductCatalog.newProduct( "SurfaceBook 5", 1400, 1600, 1500);
    Product s2p5 = s2ProductCatalog.newProduct("Surface studio laptop", 600, 800, 700);
    Product s2p6 = s2ProductCatalog.newProduct("Surface 9 pro", 400, 600, 500);
    Product s2p7 = s2ProductCatalog.newProduct("Surface 7 pro", 500, 700, 600);
    Product s2p8 = s2ProductCatalog.newProduct("Surface pro X", 1400, 1600, 1500);
    Product s2p9 = s2ProductCatalog.newProduct("X box Controller", 100, 200, 150);
    Product s2p10 = s2ProductCatalog.newProduct("Surface Go 3", 800, 1000, 900);

Supplier supplier3 = sd.newSupplier("Nestle");

ProductCatalog s3ProductCatalog = supplier3.getProductCatalog();
Product s3p1 = s3ProductCatalog.newProduct("Nescafe", 40, 60, 50);
Product s3p2 = s3ProductCatalog.newProduct("Mezeast", 10, 25, 15);
Product s3p3 = s3ProductCatalog.newProduct("Milo", 10, 35, 25);
Product s3p4 = s3ProductCatalog.newProduct("KitKat", 5, 15, 10);
Product s3p5 = s3ProductCatalog.newProduct("Cheerios", 15, 35, 25);
Product s3p6 = s3ProductCatalog.newProduct("Maggi", 20, 45, 30);
Product s3p7 = s3ProductCatalog.newProduct("Gourmet", 50, 70, 60);
    // ----------------

    UserAccountDirectory uadirectory = business.getUserAccountDirectory();
    UserAccount ua1 = uadirectory.newUserAccount(salespersonprofile, "Sales", "XXXX");

   // Process Orders on behalf of sales person and customer
MasterOrderList masterorderlist = business.getMasterOrderList();   
Order order1 = masterorderlist.newOrder(customerprofile1, salespersonprofile);
OrderItem oi1 = order1.newOrderItem(s3p7, 70, 2);
OrderItem oi2 = order1.newOrderItem(s2p10, 800, 1);
OrderItem oi3 = order1.newOrderItem(s3p4, 10, 1);
OrderItem oi4 = order1.newOrderItem(s1p7, 400, 1);
OrderItem oi5 = order1.newOrderItem(s3p3, 35, 2);
OrderItem oi6 = order1.newOrderItem(s2p1, 1400, 1);
OrderItem oi7 = order1.newOrderItem(s3p5, 25, 2);
OrderItem oi8 = order1.newOrderItem(s3p6, 45, 5);
OrderItem oi9 = order1.newOrderItem(s1p8, 700, 1);
OrderItem oi10 = order1.newOrderItem(s1p5, 750, 2);

Order order11 = masterorderlist.newOrder(customerprofile4, salespersonprofile);
OrderItem oi11 = order11.newOrderItem(s1p7, 650, 1);
OrderItem oi12 = order11.newOrderItem(s1p10, 700, 1);
OrderItem oi13 = order11.newOrderItem(s2p5, 600, 1);
OrderItem oi14 = order11.newOrderItem(s3p7, 50, 3);
OrderItem oi15 = order11.newOrderItem(s2p6, 550, 2);
OrderItem oi16 = order11.newOrderItem(s2p10, 900, 1);
OrderItem oi17 = order11.newOrderItem(s1p5, 850, 2);
OrderItem oi18 = order11.newOrderItem(s3p7, 60, 5);
OrderItem oi19 = order11.newOrderItem(s3p6, 45, 9);
OrderItem oi20 = order11.newOrderItem(s1p6, 500, 2);

Order order111 = masterorderlist.newOrder(customerprofile2, salespersonprofile);
OrderItem oi111 = order111.newOrderItem(s2p7, 600, 1);
OrderItem oi112 = order111.newOrderItem(s1p9, 450, 2);
OrderItem oi113 = order111.newOrderItem(s2p4, 1600, 1);
OrderItem oi114 = order111.newOrderItem(s1p8, 600, 2);
OrderItem oi115 = order111.newOrderItem(s2p4, 1400, 1);
OrderItem oi116 = order111.newOrderItem(s2p1, 1500, 1);
OrderItem oi117 = order111.newOrderItem(s3p5, 25, 9);
OrderItem oi118 = order111.newOrderItem(s3p6, 30, 5);
OrderItem oi119 = order111.newOrderItem(s3p2, 15, 4);
OrderItem oi120 = order111.newOrderItem(s2p5, 700, 1);


MarketCatalog mc = business.getMarketCatalog();
    ChannelCatalog channelcatalog = business.getChannelCatalog();
    MarketChannelComboCatalog mccc = business.getMarketChannelComboCatalog();

    Market teenmarket = mc.newMarket("Teenagers");
    Market collegegrads = mc.newMarket("College Grads");
    Market millenial = mc.newMarket("Millenial");
    Market seniors =mc.newMarket("Seniors");

    Channel tvchannel = channelcatalog.newChannel("Tv");
    Channel webchannel = channelcatalog.newChannel("Web");
    Channel radiochannel = channelcatalog.newChannel("Radio");
    Channel socialmediachannel = channelcatalog.newChannel("Social Media");

    teenmarket.addValidChannel(webchannel);
    teenmarket.addValidChannel(tvchannel);
    teenmarket.addValidChannel(radiochannel);
    teenmarket.addValidChannel(socialmediachannel);
    collegegrads.addValidChannel(webchannel);
    collegegrads.addValidChannel(tvchannel);
    collegegrads.addValidChannel(radiochannel);
    collegegrads.addValidChannel(socialmediachannel);
    millenial.addValidChannel(webchannel);
    millenial.addValidChannel(tvchannel);
    millenial.addValidChannel(radiochannel);
    millenial.addValidChannel(socialmediachannel);
    seniors.addValidChannel(webchannel);
    seniors.addValidChannel(tvchannel);
    seniors.addValidChannel(radiochannel);
    seniors.addValidChannel(socialmediachannel);

    MarketChannelAssignment tvchannelteenmarket = mccc.newMarketChannelCombo(teenmarket, tvchannel);
    MarketChannelAssignment webchannelteenmarket = mccc.newMarketChannelCombo(teenmarket, webchannel);
    MarketChannelAssignment radiochannelteenmarket = mccc.newMarketChannelCombo(teenmarket, radiochannel);
    MarketChannelAssignment socialmediachannelteenmarket = mccc.newMarketChannelCombo(teenmarket, socialmediachannel);

    MarketChannelAssignment tvchannelcollegegradsmarket = mccc.newMarketChannelCombo(collegegrads, tvchannel);
    MarketChannelAssignment webchannelcollegegradsmarket = mccc.newMarketChannelCombo(collegegrads, webchannel);
    MarketChannelAssignment radiochannelcollegegradsmarket = mccc.newMarketChannelCombo(collegegrads, radiochannel);
    MarketChannelAssignment socialmediachannelcollegegradsmarket = mccc.newMarketChannelCombo(collegegrads, socialmediachannel);

    MarketChannelAssignment tvchannelmillenialmarket = mccc.newMarketChannelCombo(millenial, tvchannel);
    MarketChannelAssignment webchannelmillenialmarket = mccc.newMarketChannelCombo(millenial, webchannel);
    MarketChannelAssignment radiochannelmillenialmarket = mccc.newMarketChannelCombo(millenial, radiochannel);
    MarketChannelAssignment socialmediachannelmillenialmarket = mccc.newMarketChannelCombo(millenial, socialmediachannel);

    MarketChannelAssignment tvchannelseniorsmarket = mccc.newMarketChannelCombo(seniors, tvchannel);
    MarketChannelAssignment webchannelseniorsmarket = mccc.newMarketChannelCombo(seniors, webchannel);
    MarketChannelAssignment radiochannelseniorsmarket = mccc.newMarketChannelCombo(seniors, radiochannel);
    MarketChannelAssignment socialmediachannelseniorsmarket = mccc.newMarketChannelCombo(seniors, socialmediachannel);





    SolutionOfferCatalog solutionoffercatalog = business.getSolutionOfferCatalog();

    //teen

    SolutionOffer solutiontvteen = solutionoffercatalog.newSolutionOffer(tvchannelteenmarket);
    solutiontvteen.addProduct(s1p10);
    solutiontvteen.addProduct(s2p10);
    solutiontvteen.addProduct(s3p7);         
    solutiontvteen.setTotalPrice(1099); 

    SolutionOffer solutionwebteen = solutionoffercatalog.newSolutionOffer(webchannelteenmarket);
    solutionwebteen.addProduct(s1p10);
    solutionwebteen.addProduct(s2p10);
    solutionwebteen.addProduct(s3p7);
    solutionwebteen.setTotalPrice(949); 

    SolutionOffer solutionradioteen = solutionoffercatalog.newSolutionOffer(radiochannelteenmarket);
    solutionradioteen.addProduct(s1p10);
    solutionradioteen.addProduct(s2p10);
    solutionradioteen.addProduct(s3p7);
    solutionradioteen.setTotalPrice(999);

    SolutionOffer solutionsocialmediateen = solutionoffercatalog.newSolutionOffer(socialmediachannelteenmarket);
    solutionsocialmediateen.addProduct(s1p10);
    solutionsocialmediateen.addProduct(s2p10);
    solutionsocialmediateen.addProduct(s3p7);
    solutionradioteen.setTotalPrice(899);

    //collegegrads

    SolutionOffer solutiontvcollegegrads = solutionoffercatalog.newSolutionOffer(tvchannelcollegegradsmarket);
    solutiontvcollegegrads.addProduct(s1p9);
    solutiontvcollegegrads.addProduct(s2p9);
    solutiontvcollegegrads.addProduct(s3p6);
    solutiontvcollegegrads.setTotalPrice(1500);

    SolutionOffer solutionwebcollegegrads = solutionoffercatalog.newSolutionOffer(webchannelcollegegradsmarket);
    solutionwebcollegegrads.addProduct(s1p9);
    solutionwebcollegegrads.addProduct(s2p9);
    solutionwebcollegegrads.addProduct(s3p6);
    solutionwebcollegegrads.setTotalPrice(1300);

    SolutionOffer solutionradiocollegegrads = solutionoffercatalog.newSolutionOffer(radiochannelcollegegradsmarket);
    solutionradiocollegegrads.addProduct(s1p9);
    solutionradiocollegegrads.addProduct(s2p9);
    solutionradiocollegegrads.addProduct(s3p6);
    solutionwebcollegegrads.setTotalPrice(1150);

    SolutionOffer solutionsocialmediacollegegrads = solutionoffercatalog.newSolutionOffer(socialmediachannelcollegegradsmarket);
    solutionsocialmediacollegegrads.addProduct(s1p9);
    solutionsocialmediacollegegrads.addProduct(s2p9);
    solutionsocialmediacollegegrads.addProduct(s3p6);
    solutionsocialmediacollegegrads.setTotalPrice(900);

    //millenials
    SolutionOffer solutiontvmillenial = solutionoffercatalog.newSolutionOffer(tvchannelmillenialmarket);
    solutiontvmillenial.addProduct(s1p9);
    solutiontvmillenial.addProduct(s2p9);
    solutiontvmillenial.addProduct(s3p6);
    solutiontvmillenial.setTotalPrice(950);

    SolutionOffer solutionradiomillenial = solutionoffercatalog.newSolutionOffer(radiochannelmillenialmarket);
    solutionradiomillenial.addProduct(s1p9);
    solutionradiomillenial.addProduct(s2p9);
    solutionradiomillenial.addProduct(s3p6);
    solutionradiomillenial.setTotalPrice(900);

    SolutionOffer solutionwebmillenial = solutionoffercatalog.newSolutionOffer(webchannelmillenialmarket);
    solutionwebmillenial.addProduct(s1p9);
    solutionwebmillenial.addProduct(s2p9);
    solutionwebmillenial.addProduct(s3p6);
    solutionwebmillenial.setTotalPrice(850);

    SolutionOffer solutionsocialmediamillenial = solutionoffercatalog.newSolutionOffer(socialmediachannelmillenialmarket);
    solutionsocialmediamillenial.addProduct(s1p9);
    solutionsocialmediamillenial.addProduct(s2p9);
    solutionsocialmediamillenial.addProduct(s3p6);
    solutionsocialmediamillenial.setTotalPrice(600);

    //seniors
    SolutionOffer solutiontvseniors = solutionoffercatalog.newSolutionOffer(tvchannelseniorsmarket);
    solutiontvseniors.addProduct(s1p9);
    solutiontvseniors.addProduct(s2p9);
    solutiontvseniors.addProduct(s3p6);
    solutiontvseniors.setTotalPrice(1600);

    SolutionOffer solutionradioseniors = solutionoffercatalog.newSolutionOffer(radiochannelseniorsmarket);
    solutionradioseniors.addProduct(s1p9);
    solutionradioseniors.addProduct(s2p9);
    solutionradioseniors.addProduct(s3p6);
    solutionradioseniors.setTotalPrice(1450);

    SolutionOffer solutionwebseniors = solutionoffercatalog.newSolutionOffer(webchannelseniorsmarket);
    solutionwebseniors.addProduct(s1p9);
    solutionwebseniors.addProduct(s2p9);
    solutionwebseniors.addProduct(s3p6);
    solutionwebseniors.setTotalPrice(1200);

    SolutionOffer solutionsocialmediaseniors = solutionoffercatalog.newSolutionOffer(socialmediachannelseniorsmarket);
    solutionsocialmediaseniors.addProduct(s1p9);
    solutionsocialmediaseniors.addProduct(s2p9);
    solutionsocialmediaseniors.addProduct(s3p6);
    solutionsocialmediaseniors.setTotalPrice(1400);

//creating orders for solution orders
    MasterSolutionOrderList msol = business.getMasterSolutionOrderList();

    SolutionOrder so = msol.newSolutionOrder(solutiontvteen, tvchannelteenmarket);
    so.getSolutionPrice();
    SolutionOrder so1 = msol.newSolutionOrder(solutiontvteen, tvchannelteenmarket);
    so1.getSolutionPrice();
    SolutionOrder so2 = msol.newSolutionOrder(solutiontvteen, tvchannelteenmarket);
    so2.getSolutionPrice();


    SolutionOrder so3 = msol.newSolutionOrder(solutionradioteen, radiochannelteenmarket);
    so3.getSolutionPrice();
    SolutionOrder so4 = msol.newSolutionOrder(solutionradioteen, radiochannelteenmarket);
    so4.getSolutionPrice();

    SolutionOrder so26 = msol.newSolutionOrder(solutionwebteen, webchannelteenmarket);
    so26.getSolutionPrice();
    SolutionOrder so27 = msol.newSolutionOrder(solutionwebteen, webchannelteenmarket);
    so27.getSolutionPrice();


    SolutionOrder so5 = msol.newSolutionOrder(solutionsocialmediateen, socialmediachannelteenmarket);
    so5.getSolutionPrice();

    SolutionOrder so6 = msol.newSolutionOrder(solutiontvcollegegrads, tvchannelcollegegradsmarket);
    so6.getSolutionPrice();
    SolutionOrder so7 = msol.newSolutionOrder(solutiontvcollegegrads, tvchannelcollegegradsmarket);
    so7.getSolutionPrice();
    SolutionOrder so8 = msol.newSolutionOrder(solutiontvcollegegrads, tvchannelcollegegradsmarket);
    so8.getSolutionPrice();
    SolutionOrder so9 = msol.newSolutionOrder(solutiontvcollegegrads, tvchannelcollegegradsmarket);
    so9.getSolutionPrice();
    


    SolutionOrder so11 = msol.newSolutionOrder(solutionwebcollegegrads, webchannelcollegegradsmarket);
    so11.getSolutionPrice();
    SolutionOrder so12 = msol.newSolutionOrder(solutionwebcollegegrads, webchannelcollegegradsmarket);
    so12.getSolutionPrice();
    SolutionOrder so13 = msol.newSolutionOrder(solutionwebcollegegrads, webchannelcollegegradsmarket);
    so13.getSolutionPrice();

    SolutionOrder so28 = msol.newSolutionOrder(solutiontvmillenial, tvchannelmillenialmarket);
    so28.getSolutionPrice();
    SolutionOrder so30 = msol.newSolutionOrder(solutionradiomillenial, radiochannelmillenialmarket);
    so30.getSolutionPrice();
    SolutionOrder so32 = msol.newSolutionOrder(solutionwebmillenial, radiochannelmillenialmarket);
    so32.getSolutionPrice();
    SolutionOrder so34 = msol.newSolutionOrder(solutionsocialmediamillenial, socialmediachannelmillenialmarket);
    so34.getSolutionPrice();



    SolutionOrder so14 = msol.newSolutionOrder(solutionradiocollegegrads, radiochannelcollegegradsmarket);
    so14.getSolutionPrice();
    SolutionOrder so15 = msol.newSolutionOrder(solutionradiocollegegrads, radiochannelcollegegradsmarket);
    so15.getSolutionPrice();


    SolutionOrder so16 = msol.newSolutionOrder(solutionsocialmediacollegegrads, socialmediachannelcollegegradsmarket);
    so16.getSolutionPrice();
    SolutionOrder so17 = msol.newSolutionOrder(solutionsocialmediacollegegrads, socialmediachannelcollegegradsmarket);
    so17.getSolutionPrice();



    SolutionOrder so18 = msol.newSolutionOrder(solutiontvseniors, tvchannelseniorsmarket);
    so18.getSolutionPrice();
    SolutionOrder so19 = msol.newSolutionOrder(solutiontvseniors, tvchannelseniorsmarket);
    so19.getSolutionPrice();

    SolutionOrder so20 = msol.newSolutionOrder(solutionradioseniors, radiochannelseniorsmarket);
    so20.getSolutionPrice();
    SolutionOrder so21 = msol.newSolutionOrder(solutionwebseniors, webchannelseniorsmarket);
    so21.getSolutionPrice();

    SolutionOrder so22 = msol.newSolutionOrder(solutiontvseniors, tvchannelseniorsmarket);
    so22.getSolutionPrice();
    SolutionOrder so23 = msol.newSolutionOrder(solutiontvseniors, tvchannelseniorsmarket);
    so23.getSolutionPrice();
    SolutionOrder so24 = msol.newSolutionOrder(solutiontvseniors, tvchannelseniorsmarket);
    so24.getSolutionPrice();
    SolutionOrder so25 = msol.newSolutionOrder(solutiontvseniors, tvchannelseniorsmarket);
    so25.getSolutionPrice();



System.out.println("Hello! Welcome to COSTCO");
    System.out.println("Enter a number to login");
    System.out.println("1.Cusomter");    
    System.out.println("2.Employer");
   
    Scanner sc = new Scanner(System.in);
    String key = sc.nextLine();
    if (key.equals("1")) {
      System.out.println("Please select what category of target audience are you ? ");
      System.out.println("1. Teen     2. College grad   3. Millenial   4. Seniors");
          Scanner sc1 = new Scanner(System.in);
          //teen
          String key1 =sc1.nextLine();
             if (key1.equals("1")) { 
             System.out.println("how did you hear about us ?");
             System.out.println("1. TV      2. Radio       3.Web         4.Social media");
            Scanner sc2 = new Scanner(System.in);
              String key2 = sc2.nextLine();
                if (key2.equals("1")) {
                    System.out.println("You have selected teen tv so we have this price for you ");
                   System.out.println(solutiontvteen.getSolutionPrice());
              
                }else if (key2.equals("2")) { 
                    System.out.println("You have selected teen radio we have this price for you ");
                    System.out.println("show teen radio solution ");
                    System.out.println(solutionradioteen.getSolutionPrice());

                } else if (key2.equals("3")) { 
                    System.out.println("You have selected teen web we have this price for you ");
                    System.out.println("show teen web solution ");
                    System.out.println(solutionwebteen.getSolutionPrice());

                }else if (key2.equals("4")) { 
                    System.out.println("You have selected teen social media we have this price for you ");
                    System.out.println("show teen social media solution");
                    System.out.println(solutionsocialmediateen.getSolutionPrice());
                }
              } 
                //college grads
                else if (key1.equals("2")) { 
                  System.out.println("how did you hear about us ?");
                  System.out.println("1. TV      2. Radio       3.Web         4.Social media");
                  Scanner sc3 = new Scanner(System.in);
                   String key3 = sc3.nextLine();
                     if (key3.equals("1")) {
                         System.out.println("You have selected college grad tv so we have this price for you ");
                         System.out.println("show college grad TV solution ");
                         System.out.println(solutiontvcollegegrads.getSolutionPrice());

                     }else if (key3.equals("2")) { 
                         System.out.println("You have selected college grad radio we have this price for you ");
                         System.out.println("show college grad radio solution ");
                         System.out.println(solutionradiocollegegrads.getSolutionPrice());

                     } else if (key3.equals("3")) { 
                         System.out.println("You have selected college grad web we have this price for you ");
                         System.out.println("show college grad web solution ");
                         System.out.println(solutionwebcollegegrads.getSolutionPrice());

                     }else if (key3.equals("4")) { 
                         System.out.println("You have selected college grad social media we have this price for you ");
                         System.out.println("show college grad social media solution");
                         System.out.println(solutionsocialmediacollegegrads.getSolutionPrice());
                    }
                  }
                  //millenials
                  else if (key1.equals("3")) { 
                    System.out.println("how did you hear about us ?");
                    System.out.println("1. TV      2. Radio       3.Web         4.Social media");
                    Scanner sc4 = new Scanner(System.in);
                     String key4 = sc4.nextLine();
                       if (key4.equals("1")) {
                           System.out.println("You have selected millenials tv so we have this price for you ");
                           System.out.println("show millenials TV solution ");
                           System.out.println(solutiontvmillenial.getSolutionPrice());

                       }else if (key4.equals("2")) { 
                           System.out.println("You have selected millenials radio we have this price for you ");
                           System.out.println("show millenials radio solution ");
                           System.out.println(solutionradiomillenial.getSolutionPrice());

                       } else if (key4.equals("3")) { 
                           System.out.println("You have selected millenials web we have this price for you ");
                           System.out.println("show millenials web solution ");
                           System.out.println(solutionwebmillenial.getSolutionPrice());

                       }else if (key4.equals("4")) { 
                           System.out.println("You have selected millenials social media we have this price for you ");
                           System.out.println("show millenials social media solution");
                           System.out.println(solutionsocialmediamillenial.getSolutionPrice());
                      }
                    }
                    //seniors
                    else if (key1.equals("4")) { 
                      System.out.println("how did you hear about us ?");
                      System.out.println("1. TV      2. Radio       3.Web         4.Social media");
                      Scanner sc5 = new Scanner(System.in);
                       String key5 = sc5.nextLine();
                         if (key5.equals("1")) {
                             System.out.println("You have selected seniors tv so we have this price for you ");
                             System.out.println("show seniors TV solution ");
                             System.out.println(solutiontvseniors.getSolutionPrice());

                         }else if (key5.equals("2")) { 
                             System.out.println("You have selected seniors radio we have this price for you ");
                             System.out.println("show seniors radio solution ");
                             System.out.println(solutionradioseniors.getSolutionPrice());

                         } else if (key5.equals("3")) { 
                             System.out.println("You have selected seniors web we have this price for you ");
                             System.out.println("show seniors web solution ");
                             System.out.println(solutionwebseniors.getSolutionPrice());

                         }else if (key5.equals("4")) { 
                             System.out.println("You have selected seniors social media we have this price for you ");
                             System.out.println("show seniors social media solution  ");
                             System.out.println(solutionsocialmediaseniors.getSolutionPrice());
                          
                        }
                      }


    } else if (key.equals("2")) {
      System.out.println("What do you want to know");
      System.out.println("1 .Revenue by market channel combo      2.Revenue by channel     3.product catalog                     4.Product summary");
      System.out.println();
      ProductSummary ps = new ProductSummary(s2p5);
      Scanner sc6 = new Scanner(System.in);
      String key6 = sc6.nextLine();
       if (key6.equals("1")){ 
        System.out.println("Markets          in $");
        System.out.println("=============================");
        System.out.println("Teen Market ");
        System.out.println("TV Channel      "+msol.getRevenueByMarketChannelCombo(tvchannelteenmarket));
        System.out.println("Radio Channel   "+msol.getRevenueByMarketChannelCombo(radiochannelteenmarket));
        System.out.println("Web Channel     "+msol.getRevenueByMarketChannelCombo(webchannelteenmarket));
        System.out.println("SocialMedia     "+msol.getRevenueByMarketChannelCombo(socialmediachannelteenmarket));
        System.out.println("=============================");

        System.out.println("college grads");
        System.out.println("TV Channel      "+msol.getRevenueByMarketChannelCombo(tvchannelcollegegradsmarket));
        System.out.println("Radio Channel   "+msol.getRevenueByMarketChannelCombo(radiochannelcollegegradsmarket));
        System.out.println("Web Channel     "+msol.getRevenueByMarketChannelCombo(webchannelcollegegradsmarket));
        System.out.println("SocialMedia     "+msol.getRevenueByMarketChannelCombo(socialmediachannelcollegegradsmarket));
        System.out.println("=============================");



        System.out.println("Millenials");
        System.out.println("TV Channel      "+msol.getRevenueByMarketChannelCombo(tvchannelmillenialmarket));
        System.out.println("Radio Channel   "+msol.getRevenueByMarketChannelCombo(radiochannelmillenialmarket));
        System.out.println("Web Channel     "+msol.getRevenueByMarketChannelCombo(webchannelmillenialmarket));
        System.out.println("SocialMedia     "+msol.getRevenueByMarketChannelCombo(socialmediachannelmillenialmarket));
        System.out.println("=============================");


        System.out.println("seniors");
        System.out.println("TV Channel      "+msol.getRevenueByMarketChannelCombo(tvchannelseniorsmarket));
        System.out.println("Radio Channel   "+msol.getRevenueByMarketChannelCombo(radiochannelseniorsmarket));
        System.out.println("Web Channel     "+msol.getRevenueByMarketChannelCombo(webchannelseniorsmarket));
        System.out.println("SocialMedia     "+msol.getRevenueByMarketChannelCombo(socialmediachannelseniorsmarket));
        System.out.println("=============================");


      }else if (key6.equals("2")){ 
        System.out.println("Revenue generated market wise  ");
        System.out.println("=============================");
        System.out.println("TV channel       "+msol.getRevenueByChannel(tvchannel));
        System.out.println("Radio channel    "+msol.getRevenueByChannel(radiochannel));
        System.out.println("Web channel      "+msol.getRevenueByChannel(webchannel));
        System.out.println("Social media     "+msol.getRevenueByChannel(socialmediachannel));
        System.out.println("=============================");

        

      }else if (key6.equals("3")){
        System.out.println(" ");
      System.out.println("================= Statistics ======================");
      System.out.println("Product Summary for Product: " + s2p5 );
      System.out.println("Sales Revenue: $ " + ps.getSalesRevenues());
      System.out.println("Profit Margin:  " + ps.getProductPricePerformance());
      System.out.println("Frequency above target:  " + ps.getNumberAboveTarget());
      System.out.println("Frequency Below:  " + ps.getNumberBelowTarget());
      System.out.println(" ");

      }


    }
        
    return business;
  }
}