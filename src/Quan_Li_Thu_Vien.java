import java.util.ArrayList;
import java.util.List;


public class Quan_Li_Thu_Vien {
List<TaiLieu> TaiLieus;
	
	public Quan_Li_Thu_Vien() {
		this.TaiLieus = new ArrayList<>();
	}
	public void themTailieu(TaiLieu tailieu) {
		this.TaiLieus.add(tailieu);
	}
	
	public boolean xoaTaiLieu(String maTaiLieu) {
		TaiLieu doc = this.TaiLieus.stream().filter(TaiLieu -> TaiLieu.getMaTaiLieu().equals(maTaiLieu)).findFirst().orElse(null);
		if (doc == null)
		{
			return false;
		}
		this.TaiLieus.remove(doc);
		return true;
		
	}
	public void hienThiThongTin() {
		this.TaiLieus.forEach(Tailieus -> System.out.println(Tailieus.toString()));
	}
	public void traSach() {
		this.TaiLieus.stream().filter(doc -> doc instanceof Sach).forEach(doc -> System.out.println(doc.toString()));
	}
	public void traBao() {
		this.TaiLieus.stream().filter(doc -> doc instanceof Bao).forEach(doc -> System.out.println(doc.toString()));
	}
	public void traTapChi() {
		this.TaiLieus.stream().filter(doc -> doc instanceof TapChi).forEach(doc -> System.out.println(doc.toString()));
	}
	


}
