package com.acharya.application;

    import com.acharya.framwork.*;
	public  class GSShopFactory extends ShopFactory{

		
		public PrimeAcc getNewPrimeAccount(int AccNo, String accNm, float charges, boolean isPrime) {
			GSPrimeAcc gsprime = new GSPrimeAcc(AccNo, accNm, charges, isPrime);
			return gsprime;
		}

		
		public NormalAcc getNewNormalAccount(int AccNo, String accNm, float charges, float deliveryCharges) {
			GSNormalAcc gsnormal = new GSNormalAcc(AccNo, accNm, deliveryCharges, deliveryCharges);
			return gsnormal;
		}

	}

