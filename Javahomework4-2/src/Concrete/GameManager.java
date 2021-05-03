package Concrete;
import Abstract.CampaignService;
import Entities.Campaign;

public class GameManager implements CampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Campaign is added" +  campaign.getDiscountRate());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("Campaign is updated" + campaign.getDiscountRate() );
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("Campaign is deleted" + campaign.getDiscountRate());
		
	}

	
}
