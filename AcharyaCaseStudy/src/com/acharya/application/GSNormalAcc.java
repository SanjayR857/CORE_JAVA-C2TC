package com.acharya.application;

	public class GSNormalAcc extends com.acharya.framwork.NormalAcc{

		public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
			super(accNo, accNm, charges, deliveryCharge);
		}

		public void bookProduct(float deliveryCharge) {
			System.out.println("Dear Normal User,Your Product Charges:" + getCharges() + 
					 " and delivery charge is:" + deliveryCharge);
		}

		@Override
		public String toString() {
			return "GSNormalAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
					+ hashCode() + "]";
		}

		
		
	}

