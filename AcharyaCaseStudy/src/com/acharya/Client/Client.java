package com.acharya.Client;


	import com.acharya.application.*;
    import com.acharya.framwork.*;

	

	public class Client {

		public static void main(String[] args) {
			ShopFactory sf =new GSShopFactory();

			PrimeAcc pa = new GSPrimeAcc(1567, "Sanjay", 57000, true);
			NormalAcc na = new GSNormalAcc(1067, "Dinga", 34000, 1780);
			pa.bookProduct(pa.getCharges());
			pa.toString();
			na.bookProduct(na.getDeliveryCharge());
			na.toString();
			
		}

	}

