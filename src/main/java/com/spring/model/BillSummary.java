package com.spring.model;

public class BillSummary {

		private Double subTotal;

		private Double promoAmt;

		private Double vatAmt;

		private Double delChargeAmt;

		private Double pkgChargeAmt;

		public Double getSubTotal() {
			return subTotal;
		}

		public void setSubTotal(Double subTotal) {
			this.subTotal = subTotal;
		}

		public Double getPromoAmt() {
			return promoAmt;
		}

		public void setPromoAmt(Double promoAmt) {
			this.promoAmt = promoAmt;
		}

		public Double getVatAmt() {
			return vatAmt;
		}

		public void setVatAmt(Double vatAmt) {
			this.vatAmt = vatAmt;
		}

		public Double getDelChargeAmt() {
			return delChargeAmt;
		}

		public void setDelChargeAmt(Double delChargeAmt) {
			this.delChargeAmt = delChargeAmt;
		}

		public Double getPkgChargeAmt() {
			return pkgChargeAmt;
		}

		public void setPkgChargeAmt(Double pkgChargeAmt) {
			this.pkgChargeAmt = pkgChargeAmt;
		}
		public  String getGrandTotall() {
			BillSummary aa=new BillSummary();
			aa.setDelChargeAmt(delChargeAmt);
			aa.setPkgChargeAmt(pkgChargeAmt);
			aa.setPromoAmt(promoAmt);
			aa.setSubTotal(subTotal);
			aa.setVatAmt(vatAmt);
			Double aa1=(subTotal - (promoAmt) + (vatAmt + delChargeAmt + pkgChargeAmt));
			System.out.println(aa1);
			return "aa1";
			

	}
}



