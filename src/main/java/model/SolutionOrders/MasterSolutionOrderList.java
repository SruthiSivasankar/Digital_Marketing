package model.SolutionOrders;

import java.nio.channels.Channel;
import java.util.ArrayList;

import model.MarketModel.Market;
import model.MarketModel.MarketChannelAssignment;
import model.MarketModel.SolutionOffer;

public class MasterSolutionOrderList {
    ArrayList<SolutionOrder> solutionorderlist;

public MasterSolutionOrderList() {
    solutionorderlist = new ArrayList();
}

public SolutionOrder newSolutionOrder(SolutionOffer soloffer,  MarketChannelAssignment mca) {

    SolutionOrder so = new SolutionOrder(soloffer,   mca);
    solutionorderlist.add(so);
    soloffer.addSolutionOrder(so);
    return so;

}

public int getRevenueByMarket(Market m) {
    int sum = 0;
    for(SolutionOrder so: solutionorderlist){
     
     MarketChannelAssignment mcc =   so.getMarketChannelCombo();
     if(mcc.getMarket()==m) sum = sum +so.getSolutionPrice();
       
    }

    return sum;

}
public int getRevenueByChannel(model.MarketModel.Channel tvchannel) {
    int sum = 0;
    for(SolutionOrder so: solutionorderlist){
     
     MarketChannelAssignment mcc =   so.getMarketChannelCombo();
     if(mcc.getChannel()==tvchannel) sum = sum +so.getSolutionPrice();
       
    }

    return sum;

}
public int getRevenueByMarketChannelCombo(MarketChannelAssignment mca) {
    int sum = 0;
    for(SolutionOrder so: solutionorderlist){
     
     MarketChannelAssignment mcc =   so.getMarketChannelCombo();
     if(mcc==mca) sum = sum +so.getSolutionPrice(); 
       
    }
    return sum;

}

}
