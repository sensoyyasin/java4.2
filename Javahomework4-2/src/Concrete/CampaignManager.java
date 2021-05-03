package Concrete;
import Abstract.CampaignService;
import Entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign added and discount rate : %"+ campaign.getDiscountRate());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign update and  discount rate : %"+ campaign.getDiscountRate());
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Campaign delete and discount rate : %"+ campaign.getDiscountRate());
	}

}
