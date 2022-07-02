package com.Maven_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.pomclass.Book_A_Hotel;
import com.pomclass.Booked_Itinerary;
import com.pomclass.Booking_Confirmation;
import com.pomclass.Login_Page;
import com.pomclass.Search_Hotel;
import com.pomclass.Select_Hotel;
import com.properties.File_Reader_Manager;
import com.sdp.POManager_Select_Hotel;
import com.sdp.POManager_Book_Hotel;
import com.sdp.POManager_Confirmation;
import com.sdp.POManager_Itinerary;
import com.sdp.POManager_Login_Page;
import com.sdp.POManager_Search_Hotel;

public class Runner extends Baseclass {

	public static WebDriver driver = launchbrowser("chrome");

	public static POManager_Login_Page pom = new POManager_Login_Page(driver);
	public static POManager_Search_Hotel pom2 = new POManager_Search_Hotel(driver);
	public static POManager_Select_Hotel pom3 = new POManager_Select_Hotel(driver);
	public static POManager_Book_Hotel pom4 = new POManager_Book_Hotel(driver);
	public static POManager_Confirmation pom5 = new POManager_Confirmation(driver);
	public static POManager_Itinerary pom6 = new POManager_Itinerary(driver);

	public static void main(String[] args) throws InterruptedException, IOException {

		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUrl();
		urlLaunch(url);

		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		passInput(pom.getInstanceLogin().getUsername(), username);

		String password = File_Reader_Manager.getInstanceFRM().getInstanceCR().getPassword();
		passInput(pom.getInstanceLogin().getPassword(), password);

		clickElement(pom.getInstanceLogin().getLogin());

		String location = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLocation();
		dropdownbyValue(pom2.getInstanceSearchHotel().getLocation(), location);

		String hotels = File_Reader_Manager.getInstanceFRM().getInstanceCR().getHotels();
		dropdownbyValue(pom2.getInstanceSearchHotel().getHotel(), hotels);

		String room_type = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoom_type();
		dropdownbyValue(pom2.getInstanceSearchHotel().getRoomtype(), room_type);

		String room_nos = File_Reader_Manager.getInstanceFRM().getInstanceCR().getRoom_nos();
		dropdownbyValue(pom2.getInstanceSearchHotel().getRoomnum(), room_nos);

		clear(pom2.getInstanceSearchHotel().getCheckin());

		String datepick_in = File_Reader_Manager.getInstanceFRM().getInstanceCR().getDatepick_in();
		passInput(pom2.getInstanceSearchHotel().getCheckin(), datepick_in);

		clear(pom2.getInstanceSearchHotel().getCheckout());

		String datepick_out = File_Reader_Manager.getInstanceFRM().getInstanceCR().getDatepick_out();
		passInput(pom2.getInstanceSearchHotel().getCheckout(), datepick_out);

		String adult_room = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAdult_room();
		dropdownbyValue(pom2.getInstanceSearchHotel().getAdultsroom(), adult_room);

		String child_room = File_Reader_Manager.getInstanceFRM().getInstanceCR().getChild_room();
		dropdownbyValue(pom2.getInstanceSearchHotel().getChildsroom(), child_room);

		clickElement(pom2.getInstanceSearchHotel().getSearch());

		radioButton(pom3.getInstanceSelectHotel().getRadio());

		clickElement(pom3.getInstanceSelectHotel().getContinu());

		String first_name = File_Reader_Manager.getInstanceFRM().getInstanceCR().getFirst_name();
		passInput(pom4.getInstanceBookHotel().getFrstname(), first_name);

		String last_name = File_Reader_Manager.getInstanceFRM().getInstanceCR().getLast_name();
		passInput(pom4.getInstanceBookHotel().getLstname(), last_name);

		String address = File_Reader_Manager.getInstanceFRM().getInstanceCR().getAddress();
		passInput(pom4.getInstanceBookHotel().getBilladdrs(), address);

		String getcc_num = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcc_num();
		passInput(pom4.getInstanceBookHotel().getCreditcard(), getcc_num);

		String getcc_type = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcc_type();
		dropdownbyVisibleText(pom4.getInstanceBookHotel().getCardtype(), getcc_type);

		String getcc_exp_month = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcc_exp_month();
		dropdownbyVisibleText(pom4.getInstanceBookHotel().getExpmonth(), getcc_exp_month);

		String getcc_exp_year = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcc_exp_year();
		dropdownbyVisibleText(pom4.getInstanceBookHotel().getExpyear(), getcc_exp_year);

		String getcc_cvv = File_Reader_Manager.getInstanceFRM().getInstanceCR().getcc_cvv();
		passInput(pom4.getInstanceBookHotel().getCvvnum(), getcc_cvv);

		clickElement(pom4.getInstanceBookHotel().getBooknow());

		waits();

		clickElement(pom5.getInstanceBooking().getItinerary());

		clickElement(pom6.getInstanceItinerary().getBookeditinerary());

		clickElement(pom6.getInstanceItinerary().getCheckbox());

		clickElement(pom6.getInstanceItinerary().getCancel());

		alertAccept();

		String screenshot = File_Reader_Manager.getInstanceFRM().getInstanceCR().getScreenshot();
		takeScreeenshot(screenshot);

		clickElement(pom6.getInstanceItinerary().getLogout());

	}

}
