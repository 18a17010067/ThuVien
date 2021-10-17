
public class Bao extends TaiLieu {
	private int ngayPhatHanh;
	public Bao(String maTaiLieu, String nhaXuatBan, int soBanPhathanh, int ngayPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBanPhathanh);
		if(ngayPhatHanh>=1 && ngayPhatHanh<=31) {
			this.ngayPhatHanh = ngayPhatHanh;
		}
		else {
			this.ngayPhatHanh = 1;
		}
	}
	public int getNgayPhatHanh() {
		return ngayPhatHanh;
	}
	public void setNgayPhatHanh(int ngayPhatHanh) {
		if(ngayPhatHanh>=1 && ngayPhatHanh<=31) {
			this.ngayPhatHanh = ngayPhatHanh;
		}
	}
	public String toString() {
		return " Bao [" +
	           "Ngay Phat Hanh =" + ngayPhatHanh +
	           ", Ma Tai Lieu ='" + maTaiLieu + '\'' +
	           ", Nha Xuat Ban ='" + nhaXuatBan + '\'' +
	           ", So Ban Phat Hanh = '" + soBanPhathanh + '\'' +
	           ']';
	}

}
