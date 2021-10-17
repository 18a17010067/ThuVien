
public class Sach extends TaiLieu {
	private String tacGia;
	private int soTrang;
	public Sach(String maTaiLieu, String nhaXuatBan, int soBanPhathanh, String tacGia, int soTrang) {
		super(maTaiLieu, nhaXuatBan, soBanPhathanh);
		this.tacGia = tacGia;
		this.soTrang = soTrang;
	
	}
	public String getTacGia() {
		return tacGia;
	}
	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}
	public int getSoTrang() {
		return soTrang;
	}
	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
		
	}
	public String toString() {
		return "Sach [" +
	           "Tac Gia = '" + tacGia + '\'' +
	           ", So Trang - '" + soTrang +
	           ", Ma Tai Lieu ='" + maTaiLieu + '\'' +
	           ", Nha Xuat Ban = '" + nhaXuatBan +'\'' +
	           ", So Ban Phat Hanh ='" + soBanPhathanh + '\'' +
	           ']';
	}

}
