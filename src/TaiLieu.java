
public class TaiLieu {
	protected String maTaiLieu;
	protected String nhaXuatBan;
	protected int soBanPhathanh;
	
	public TaiLieu(String maTaiLieu, String nhaXuatBan, int soBanPhathanh) {
		this.maTaiLieu = maTaiLieu;
		this.nhaXuatBan = nhaXuatBan;
		this.soBanPhathanh = soBanPhathanh;
	}

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public int getSoBanPhathanh() {
		return soBanPhathanh;
	}

	public void setSoBanPhathanh(int soBanPhathanh) {
		this.soBanPhathanh = soBanPhathanh;
	}

}
