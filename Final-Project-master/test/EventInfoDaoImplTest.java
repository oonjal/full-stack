import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doNothing;

import com.cognizant.dao.EventerInfoDaoImpl;
import com.cognizant.entity.EventDetail;
import com.cognizant.entity.EventInfo;

@RunWith(MockitoJUnitRunner.class)
public class EventInfoDaoImplTest {

	@Mock
	private SessionFactory sessionfactory;
	@Mock
	private Session session;
	@Mock
	private Query query;
	@InjectMocks
	EventerInfoDaoImpl travellingScheduleDAOImpl = new EventerInfoDaoImpl();

	@Before
	public void setup() {

		// MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testsaveEventDetail() {
		when(sessionfactory.getCurrentSession()).thenReturn(session);
		when(session.createQuery("from EventInfo where eventName =:eventName and location =:location"))
				.thenReturn(query);

		EventInfo productList = new EventInfo();
		when(query.uniqueResult()).thenReturn(productList);

		when(session.createQuery(
				"from EventDetail where eventInfo.eventId =:eventId and eventDate =:eventDate and eventType =:eventType"))
						.thenReturn(query);
		when(session.save(any(EventInfo.class))).thenReturn(1000);
		when(session.save(any(EventDetail.class))).thenReturn(1000);
		// doNothing().when(session.save(any(EventInfo.class)));
		EventDetail eventDet = new EventDetail();
		Long status = this.travellingScheduleDAOImpl.saveEventDetail(productList, eventDet);
		Assert.assertNotNull("success", status);

	}
}
