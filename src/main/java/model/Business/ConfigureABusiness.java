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
    Person customer02 = persondirectory.newPerson("Customer 02");
    Person customer03 = persondirectory.newPerson("Customer 03");
    Person customer04 = persondirectory.newPerson("Customer 04");

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
    Market collegegrads = mc.newMarket("College Graduate");
    Market genZ = mc.newMarket("Gen-Z");
    Market seniors =mc.newMarket("Seniors");

    Channel tvchannel = channelcatalog.newChannel("Television");
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
    genZ.addValidChannel(webchannel);
    genZ.addValidChannel(tvchannel);
    genZ.addValidChannel(radiochannel);
    genZ.addValidChannel(socialmediachannel);
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

    MarketChannelAssignment tvchannelgenZmarket = mccc.newMarketChannelCombo(genZ, tvchannel);
    MarketChannelAssignment webchannelgenZmarket = mccc.newMarketChannelCombo(genZ, webchannel);
    MarketChannelAssignment radiochannelgenZmarket = mccc.newMarketChannelCombo(genZ, radiochannel);
    MarketChannelAssignment socialmediachannelgenZmarket = mccc.newMarketChannelCombo(genZ, socialmediachannel);

    MarketChannelAssignment tvchannelseniorsmarket = mccc.newMarketChannelCombo(seniors, tvchannel);
    MarketChannelAssignment webchannelseniorsmarket = mccc.newMarketChannelCombo(seniors, webchannel);
    MarketChannelAssignment radiochannelseniorsmarket = mccc.newMarketChannelCombo(seniors, radiochannel);
    MarketChannelAssignment socialmediachannelseniorsmarket = mccc.newMarketChannelCombo(seniors, socialmediachannel);





    SolutionOfferCatalog solutionoffercatalog = business.getSolutionOfferCatalog();

    //teen

    SolutionOffer solutiontvteen = solutionoffercatalog.newSolutionOffer(tvchannelteenmarket);
    solutiontvteen.addProduct(s2p10);
    solutiontvteen.addProduct(s1p1);
    solutiontvteen.addProduct(s3p6);         
    solutiontvteen.setTotalPrice(1000); 

    SolutionOffer solutionwebteen = solutionoffercatalog.newSolutionOffer(webchannelteenmarket);
    solutionwebteen.addProduct(s2p10);
    solutionwebteen.addProduct(s1p1);
    solutionwebteen.addProduct(s3p6);
    solutionwebteen.setTotalPrice(900); 

    SolutionOffer solutionradioteen = solutionoffercatalog.newSolutionOffer(radiochannelteenmarket);
    solutionradioteen.addProduct(s2p10);
    solutionradioteen.addProduct(s1p1);
    solutionradioteen.addProduct(s3p6);
    solutionradioteen.setTotalPrice(950);

    SolutionOffer solutionsocialmediateen = solutionoffercatalog.newSolutionOffer(socialmediachannelteenmarket);
    solutionsocialmediateen.addProduct(s2p10);
    solutionsocialmediateen.addProduct(s1p1);
    solutionsocialmediateen.addProduct(s3p6);
    solutionradioteen.setTotalPrice(800);

    //collegegrads

    SolutionOffer solutiontvcollegegrads = solutionoffercatalog.newSolutionOffer(tvchannelcollegegradsmarket);
    solutiontvcollegegrads.addProduct(s1p8);
    solutiontvcollegegrads.addProduct(s2p9);
    solutiontvcollegegrads.addProduct(s3p7);
    solutiontvcollegegrads.setTotalPrice(1500);

    SolutionOffer solutionwebcollegegrads = solutionoffercatalog.newSolutionOffer(webchannelcollegegradsmarket);
    solutionwebcollegegrads.addProduct(s1p8);
    solutionwebcollegegrads.addProduct(s2p9);
    solutionwebcollegegrads.addProduct(s3p7);
    solutionwebcollegegrads.setTotalPrice(1300);

    SolutionOffer solutionradiocollegegrads = solutionoffercatalog.newSolutionOffer(radiochannelcollegegradsmarket);
    solutionradiocollegegrads.addProduct(s1p8);
    solutionradiocollegegrads.addProduct(s2p9);
    solutionradiocollegegrads.addProduct(s3p7);
    solutionwebcollegegrads.setTotalPrice(1150);

    SolutionOffer solutionsocialmediacollegegrads = solutionoffercatalog.newSolutionOffer(socialmediachannelcollegegradsmarket);
    solutionsocialmediacollegegrads.addProduct(s1p8);
    solutionsocialmediacollegegrads.addProduct(s2p9);
    solutionsocialmediacollegegrads.addProduct(s3p7);
    solutionsocialmediacollegegrads.setTotalPrice(900);

    //genZs
    SolutionOffer solutiontvgenZ = solutionoffercatalog.newSolutionOffer(tvchannelgenZmarket);
    solutiontvgenZ.addProduct(s1p8);
    solutiontvgenZ.addProduct(s2p9);
    solutiontvgenZ.addProduct(s3p7);
    solutiontvgenZ.setTotalPrice(950);

    SolutionOffer solutionradiogenZ = solutionoffercatalog.newSolutionOffer(radiochannelgenZmarket);
    solutionradiogenZ.addProduct(s1p8);
    solutionradiogenZ.addProduct(s2p9);
    solutionradiogenZ.addProduct(s3p7);
    solutionradiogenZ.setTotalPrice(900);

    SolutionOffer solutionwebgenZ = solutionoffercatalog.newSolutionOffer(webchannelgenZmarket);
    solutionwebgenZ.addProduct(s1p8);
    solutionwebgenZ.addProduct(s2p9);
    solutionwebgenZ.addProduct(s3p7);
    solutionwebgenZ.setTotalPrice(850);

    SolutionOffer solutionsocialmediagenZ = solutionoffercatalog.newSolutionOffer(socialmediachannelgenZmarket);
    solutionsocialmediagenZ.addProduct(s1p8);
    solutionsocialmediagenZ.addProduct(s2p9);
    solutionsocialmediagenZ.addProduct(s3p7);
    solutionsocialmediagenZ.setTotalPrice(600);

    //seniors
    SolutionOffer solutiontvseniors = solutionoffercatalog.newSolutionOffer(tvchannelseniorsmarket);
    solutiontvseniors.addProduct(s1p8);
    solutiontvseniors.addProduct(s2p9);
    solutiontvseniors.addProduct(s3p7);
    solutiontvseniors.setTotalPrice(1600);

    SolutionOffer solutionradioseniors = solutionoffercatalog.newSolutionOffer(radiochannelseniorsmarket);
    solutionradioseniors.addProduct(s1p8);
    solutionradioseniors.addProduct(s2p9);
    solutionradioseniors.addProduct(s3p7);
    solutionradioseniors.setTotalPrice(1450);

    SolutionOffer solutionwebseniors = solutionoffercatalog.newSolutionOffer(webchannelseniorsmarket);
    solutionwebseniors.addProduct(s1p8);
    solutionwebseniors.addProduct(s2p9);
    solutionwebseniors.addProduct(s3p7);
    solutionwebseniors.setTotalPrice(1200);

    SolutionOffer solutionsocialmediaseniors = solutionoffercatalog.newSolutionOffer(socialmediachannelseniorsmarket);
    solutionsocialmediaseniors.addProduct(s1p8);
    solutionsocialmediaseniors.addProduct(s2p9);
    solutionsocialmediaseniors.addProduct(s3p7);
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

    SolutionOrder so28 = msol.newSolutionOrder(solutiontvgenZ, tvchannelgenZmarket);
    so28.getSolutionPrice();
    SolutionOrder so31 = msol.newSolutionOrder(solutionradiogenZ, radiochannelgenZmarket);
    so31.getSolutionPrice();
    SolutionOrder so32 = msol.newSolutionOrder(solutionwebgenZ, radiochannelgenZmarket);
    so32.getSolutionPrice();
    SolutionOrder so34 = msol.newSolutionOrder(solutionsocialmediagenZ, socialmediachannelgenZmarket);
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
      System.out.println("Please select which age category of Customer you are : ");
      System.out.println("1. Teen     2. College Graduate   3. Gen-Z   4. Seniors");
          Scanner sc1 = new Scanner(System.in);
          //teen
          String key1 =sc1.nextLine();
             if (key1.equals("1")) { 
             System.out.println("How did you get to know about us ?");
             System.out.println("1. Television      2. Radio       3.Web         4.Social media");
            Scanner sc2 = new Scanner(System.in);
              String key2 = sc2.nextLine();
                if (key2.equals("1")) {
                    System.out.println("Based on your selection, we have this price for you ");
                    System.out.println("Showing teen television solution ");
                    System.out.println(solutiontvteen.getProduct());
                   System.out.println(solutiontvteen.getSolutionPrice());
              
                }else if (key2.equals("2")) { 
                    System.out.println("Based on your selection, we have this price for you  ");
                    System.out.println("Showing teen radio solution ");
                    System.out.println(solutionradioteen.getProduct());
                    System.out.println(solutionradioteen.getSolutionPrice());

                } else if (key2.equals("3")) { 
                    System.out.println("Based on your selection, we have this price for you  ");
                    System.out.println("Showing teen web solution ");
                    System.out.println(solutionwebteen.getProduct());
                    System.out.println(solutionwebteen.getSolutionPrice());

                }else if (key2.equals("4")) { 
                    System.out.println("Based on your selection, we have this price for you  ");
                    System.out.println("Showing teen social media solution");
                    System.out.println(solutionsocialmediateen.getProduct());
                    System.out.println(solutionsocialmediateen.getSolutionPrice());
                }
              } 
                //college grads
                else if (key1.equals("2")) { 
                  System.out.println("How did you get to know about us ?");
                  System.out.println("1. Television     2. Radio       3.Web         4.Social media");
                  Scanner sc3 = new Scanner(System.in);
                   String key3 = sc3.nextLine();
                     if (key3.equals("1")) {
                         System.out.println("Based on your selection, we have this price for you  ");
                         System.out.println("Showing college graduate Television solution ");
                         System.out.println(solutiontvcollegegrads.getProduct());
                         System.out.println(solutiontvcollegegrads.getSolutionPrice());

                     }else if (key3.equals("2")) { 
                         System.out.println("Based on your selection, we have this price for you  ");
                         System.out.println("Showing college graduate radio solution ");
                         System.out.println(solutionradiocollegegrads.getProduct());
                         System.out.println(solutionradiocollegegrads.getSolutionPrice());

                     } else if (key3.equals("3")) { 
                         System.out.println("Based on your selection, we have this price for you  ");
                         System.out.println("Showing college graduate web solution ");
                         System.out.println(solutionwebcollegegrads.getProduct());
                         System.out.println(solutionwebcollegegrads.getSolutionPrice());

                     }else if (key3.equals("4")) { 
                         System.out.println("Based on your selection, we have this price for you  ");
                         System.out.println("Showing college graduate social media solution");
                         System.out.println(solutionsocialmediacollegegrads.getProduct());
                         System.out.println(solutionsocialmediacollegegrads.getSolutionPrice());
                    }
                  }
                  //genZs
                  else if (key1.equals("3")) { 
                    System.out.println("How did you get to know about us ?");
                    System.out.println("1. Television      2. Radio       3.Web         4.Social media");
                    Scanner sc4 = new Scanner(System.in);
                     String key4 = sc4.nextLine();
                       if (key4.equals("1")) {
                           System.out.println("Based on your selection, we have this price for you  ");
                           System.out.println("Showing Gen-Z Television solution ");
                           System.out.println(solutiontvgenZ.getProduct());
                           System.out.println(solutiontvgenZ.getSolutionPrice());

                       }else if (key4.equals("2")) { 
                           System.out.println("Based on your selection, we have this price for you  ");
                           System.out.println("Showing Gen-Z radio solution ");
                           System.out.println(solutionradiogenZ.getProduct());
                           System.out.println(solutionradiogenZ.getSolutionPrice());

                       } else if (key4.equals("3")) { 
                           System.out.println("Based on your selection, we have this price for you  ");
                           System.out.println("Showing Gen-Z web solution ");
                           System.out.println(solutionwebgenZ.getProduct());
                           System.out.println(solutionwebgenZ.getSolutionPrice());

                       }else if (key4.equals("4")) { 
                           System.out.println("Based on your selection, we have this price for you  ");
                           System.out.println("Showing Gen-Z social media solution");
                           System.out.println(solutionsocialmediagenZ.getProduct());
                           System.out.println(solutionsocialmediagenZ.getSolutionPrice());
                      }
                    }
                    //seniors
                    else if (key1.equals("4")) { 
                      System.out.println("How did you get to know about us ?");
                      System.out.println("1. Television      2. Radio       3.Web         4.Social media");
                      Scanner sc5 = new Scanner(System.in);
                       String key5 = sc5.nextLine();
                         if (key5.equals("1")) {
                             System.out.println("Based on your selection, we have this price for you  ");
                             System.out.println("Showing seniors Television solution ");
                             System.out.println(solutiontvseniors.getProduct());
                             System.out.println(solutiontvseniors.getSolutionPrice());

                         }else if (key5.equals("2")) { 
                             System.out.println("Based on your selection, we have this price for you  ");
                             System.out.println("Showing seniors radio solution ");
                             System.out.println(solutionradioseniors.getProduct());
                             System.out.println(solutionradioseniors.getSolutionPrice());

                         } else if (key5.equals("3")) { 
                             System.out.println("Based on your selection, we have this price for you  ");
                             System.out.println("Showing seniors web solution ");
                             System.out.println(solutionwebseniors.getProduct());
                             System.out.println(solutionwebseniors.getSolutionPrice());

                         }else if (key5.equals("4")) { 
                             System.out.println("Based on your selection, we have this price for you  ");
                             System.out.println("Showing seniors social media solution  ");
                             System.out.println(solutionsocialmediaseniors.getProduct());
                             System.out.println(solutionsocialmediaseniors.getSolutionPrice());
                          
                        }
                      }


    } else if (key.equals("2")) {
      System.out.println("What do you want to know");
      System.out.println("1 .Revenue by market channel combo      2.Revenue by channel     3.Product summary  ");
      System.out.println();
      ProductSummary ps = new ProductSummary(s2p5);
      Scanner sc6 = new Scanner(System.in);
      String key6 = sc6.nextLine();
       if (key6.equals("1")){ 
        System.out.println("Markets          in $");
        System.out.println("=============================");
        System.out.println("Teen Market ");
        System.out.println("Television Channel      "+msol.getRevenueByMarketChannelCombo(tvchannelteenmarket));
        System.out.println("Radio Channel   "+msol.getRevenueByMarketChannelCombo(radiochannelteenmarket));
        System.out.println("Web Channel     "+msol.getRevenueByMarketChannelCombo(webchannelteenmarket));
        System.out.println("SocialMedia     "+msol.getRevenueByMarketChannelCombo(socialmediachannelteenmarket));
        System.out.println("=============================");

        System.out.println("college graduate");
        System.out.println("Television Channel      "+msol.getRevenueByMarketChannelCombo(tvchannelcollegegradsmarket));
        System.out.println("Radio Channel   "+msol.getRevenueByMarketChannelCombo(radiochannelcollegegradsmarket));
        System.out.println("Web Channel     "+msol.getRevenueByMarketChannelCombo(webchannelcollegegradsmarket));
        System.out.println("SocialMedia     "+msol.getRevenueByMarketChannelCombo(socialmediachannelcollegegradsmarket));
        System.out.println("=============================");



        System.out.println("Gen-z");
        System.out.println("Television Channel      "+msol.getRevenueByMarketChannelCombo(tvchannelgenZmarket));
        System.out.println("Radio Channel   "+msol.getRevenueByMarketChannelCombo(radiochannelgenZmarket));
        System.out.println("Web Channel     "+msol.getRevenueByMarketChannelCombo(webchannelgenZmarket));
        System.out.println("SocialMedia     "+msol.getRevenueByMarketChannelCombo(socialmediachannelgenZmarket));
        System.out.println("=============================");


        System.out.println("seniors");
        System.out.println("Television Channel      "+msol.getRevenueByMarketChannelCombo(tvchannelseniorsmarket));
        System.out.println("Radio Channel   "+msol.getRevenueByMarketChannelCombo(radiochannelseniorsmarket));
        System.out.println("Web Channel     "+msol.getRevenueByMarketChannelCombo(webchannelseniorsmarket));
        System.out.println("SocialMedia     "+msol.getRevenueByMarketChannelCombo(socialmediachannelseniorsmarket));
        System.out.println("=============================");


      }else if (key6.equals("2")){ 
        System.out.println("Revenue generated Channel wise  ");
        System.out.println("=============================");
        System.out.println("Television channel       "+msol.getRevenueByChannel(tvchannel));
        System.out.println("Radio channel    "+msol.getRevenueByChannel(radiochannel));
        System.out.println("Web channel      "+msol.getRevenueByChannel(webchannel));
        System.out.println("Social media     "+msol.getRevenueByChannel(socialmediachannel));
        System.out.println("=============================");

        

      }else if (key6.equals("3")){
        System.out.println(" ");
      ProductSummary ps1 = new ProductSummary(s2p4);
      System.out.println("================= Statistics ======================");
      System.out.println("Product Summary for Product: " + s2p4 );
      System.out.println("Sales Revenue: $ " + ps1.getSalesRevenues());
      System.out.println("Profit Margin:  " + ps1.getProductPricePerformance());
      System.out.println("Frequency above target:  " + ps1.getNumberAboveTarget());
      System.out.println("Frequency Below:  " + ps1.getNumberBelowTarget());
      System.out.println(" ");

      ProductSummary ps2 = new ProductSummary(s1p7);
      System.out.println("================= Statistics ======================");
      System.out.println("Product Summary for Product: " + s1p7 );
      System.out.println("Sales Revenue: $ " + ps2.getSalesRevenues());
      System.out.println("Profit Margin:  " + ps2.getProductPricePerformance());
      System.out.println("Frequency above target:  " + ps2.getNumberAboveTarget());
      System.out.println("Frequency Below:  " + ps2.getNumberBelowTarget());
      System.out.println(" ");

      ProductSummary ps3 = new ProductSummary(s3p2);
      System.out.println("================= Statistics ======================");
      System.out.println("Product Summary for Product: " + s3p2 );
      System.out.println("Sales Revenue: $ " + ps3.getSalesRevenues());
      System.out.println("Profit Margin:  " + ps3.getProductPricePerformance());
      System.out.println("Frequency above target:  " + ps3.getNumberAboveTarget());
      System.out.println("Frequency Below:  " + ps3.getNumberBelowTarget());

      }


    }
        
    return business;
  }
}