
public class TapChi extends TaiLieu {
	private int soPhatHanh;// so phat hanh
	private int thangPhatHanh; // thang phat hanh
	public TapChi(String maTaiLieu, String nhaXuatBan, int soBanPhathanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBanPhathanh);
		this.soPhatHanh = soPhatHanh;
		if(thangPhatHanh >=1 && thangPhatHanh <=12) {
		this.thangPhatHanh = thangPhatHanh;
		}else {
			this.thangPhatHanh =1;
		}
	}
	
	public int getSoPhatHanh() {
		return soPhatHanh;
	}
	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}
	public int getThangPhatHanh() {
		return thangPhatHanh;
	}
	public void setThangPhatHanh(int thangPhatHanh){
		if(thangPhatHanh >=1 && thangPhatHanh <=12) {
		this.thangPhatHanh = thangPhatHanh;
		}
	}

	@Override
	public String toString() {
		 return "Tap Chi [" +
	                "So Phat Hanh =" + soPhatHanh +
	                ", Thang Phat Hanh =" + thangPhatHanh +
	                ", Ma Tai Lieu ='" + maTaiLieu + '\'' +
	                ", Nha Xuat Ban ='" + nhaXuatBan + '\'' +
	                ", So Ban Phat Hanh ='" + soBanPhathanh + '\'' +
	                ']';

	}


}
