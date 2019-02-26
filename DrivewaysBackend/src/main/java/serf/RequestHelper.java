package serf;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webservice.ListingWebService;
import webservice.ReservationWebService;
import webservice.UserWebService;

public class RequestHelper {
	
	public static void Process(HttpServletRequest request, HttpServletResponse response) {
		
		String uri = request.getRequestURI();
		
		switch(uri) {
		
		case "/DrivewaysBackend/getListing.do":{ListingWebService.getListing(request, response);}
		break;
		
		case "/DrivewaysBackend/addListing.do":{ListingWebService.addListing(request, response);}
		break;
		
		case "/DrivewaysBackend/updateListing.do":{ListingWebService.updateListing(request, response);}
		break;

		case "/DrivewaysBackend/deleteListing.do":{ListingWebService.deleteListing(request, response);}
		break;
		
		case "/DrivewaysBackend/allListings.do":{ListingWebService.allListings(request, response);}
		break;
		
		
		
		
		case "/DrivewaysBackend/getReservation.do":{ReservationWebService.getReservation(request, response);}
		break;
		
		case "/DrivewaysBackend/addReservation.do":{ReservationWebService.addReservation(request, response);}
		break;
		
		case "/DrivewaysBackend/updateReservation.do":{ReservationWebService.updateReservation(request, response);}
		break;		
		
		case "/DrivewaysBackend/deleteReservation.do":{ReservationWebService.deleteReservation(request, response);}
		break;	
		
		case "/DrivewaysBackend/allReservations.do":{ReservationWebService.allReservations(request, response);}
		break;
		
		
		
		
		case "/DrivewaysBackend/getUser.do":{UserWebService.getUser(request, response);}
		break;
		
		case "/DrivewaysBackend/addUser.do":{UserWebService.addUser(request, response);}
		break;
		
		case "/DrivewaysBackend/updateUser.do":{UserWebService.updateUser(request, response);}
		break;		
		
		case "/DrivewaysBackend/deleteUser.do":{UserWebService.deleteUser(request, response);}
		break;	
		
		case "/DrivewaysBackend/allUsers.do":{UserWebService.allUsers(request, response);}
		break;
		
		}
		
	}

}
