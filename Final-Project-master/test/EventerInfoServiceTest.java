import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;

import com.cognizant.controller.EventerInfoController;
import com.cognizant.dao.EventerInfoDaoImpl;
import com.cognizant.entity.EventDetail;
import com.cognizant.entity.EventInfo;
import com.cognizant.service.EventerInfoService;

@RunWith(MockitoJUnitRunner.class)
public class EventerInfoServiceTest {

	@Mock
	EventerInfoDaoImpl eventerInfoDaoImplMock;

	@InjectMocks
	EventerInfoService eventerInfoService = new EventerInfoService();

	@Before
	public void initialize() {

	}
	
	@Test
	public void saveEventDetailTest() {

		EventInfo eventInfo = new EventInfo();
		EventDetail eventDetail = new EventDetail();
		
		when(eventerInfoDaoImplMock.saveEventDetail(eventInfo,eventDetail)).thenReturn(1000L);
		long id = this.eventerInfoService.saveEventDetail(eventInfo, eventDetail);
		
		Assert.assertEquals(id,1000L);
		 
	}
	
}
