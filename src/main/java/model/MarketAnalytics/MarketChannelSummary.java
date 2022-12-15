package model.MarketAnalytics;

import model.MarketModel.MarketChannelAssignment;

public class MarketChannelSummary {
    MarketChannelAssignment marketchannelassignment;
    int revenues;
    public MarketChannelSummary(MarketChannelAssignment mc){
        
        marketchannelassignment = mc;        
        revenues = mc.getRevenues();        
    }
    public int getRevenues(){
        return revenues;
    }
    
}
