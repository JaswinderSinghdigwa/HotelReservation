package com.bl.reserevation;

import java.util.List;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;

import com.bl.reserevation.MyHotelReservationService;
import com.bl.reserevation.MyHotels;




/**
	create Class for Testing the Hotel Reservation Service
 *
 */
public class MyHotelReservation {

	/**
	 * @description create Method for Testing the Hotel Reservation Service by
	 *              Adding the Hotel to The ArrayList
	 *
	 */

	public void givenHotelNamesAddedToList() {
		MyHotels hotel1 = new MyHotels("LakeWood", 110);
		MyHotels hotel2 = new MyHotels("BridgeWood", 135);
		MyHotels hotel3 = new MyHotels("Montero", 185);
		MyHotelReservationService hotelReservationService = new MyHotelReservationService();
		hotelReservationService.add(hotel1); // Adding First Hotel to list
		hotelReservationService.add(hotel2);// Adding Second Hotel to list
		hotelReservationService.add(hotel3);// Adding Third Hotel to list
		List<MyHotels> list = hotelReservationService.getHotels();
		Assert.assertTrue(list.contains(hotel1));
	}

	/**
	 * @description create Main Method for Passing Welcome Message For Hotel
	 *              Reservation System
	 *
	 */
	public static void main(String[] args) {
		System.out.println("Welcome Message To Hotel Reservation Service");
	}
}
