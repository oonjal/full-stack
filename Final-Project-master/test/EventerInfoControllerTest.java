
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.any;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.cognizant.controller.EventerInfoController;
import com.cognizant.entity.EventDetail;
import com.cognizant.entity.EventInfo;
import com.cognizant.service.EventerInfoService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(MockitoJUnitRunner.class)
public class EventerInfoControllerTest {

	@Mock
	EventerInfoService eventerInfoServiceMock;

	@InjectMocks
	EventerInfoController eventerInfoController = new EventerInfoController();

	@Before  
	public void initialize() {

	}

	@Test
	public void saveEventDetailTestSuccesfull() throws JsonProcessingException, ParseException {

		when(eventerInfoServiceMock.saveEventDetail(any(EventInfo.class), any(EventDetail.class))).thenReturn(1000L);
		String status = this.eventerInfoController.saveEventDetail("eventName", "eventLocation", "eventType",
				"2017-07-29", "100");
		// ObjectMapper mapper = new ObjectMapper();
		// String json = mapper.writeValueAsString(status);
		Assert.assertEquals("\"Successful\"", status);

	}

	@Test
	public void saveEventDetailTestUnsuccesfull() throws JsonProcessingException, ParseException {

		EventInfo eventInfo = new EventInfo();
		EventDetail eventDetail = new EventDetail();
		when(eventerInfoServiceMock.saveEventDetail(eventInfo, eventDetail)).thenReturn(100L);
		String status = this.eventerInfoController.saveEventDetail("eventName", "eventLocation", "eventType",
				"2017-07-29", "100");
		Assert.assertEquals("\"Unsuccessful\"", status);

	}

}
