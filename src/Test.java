import java.util.Scanner;

public class Test {
public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Quan_Li_Thu_Vien quanLiThuVien = new Quan_Li_Thu_Vien();
	
		
		while(true) {		
			System.out.println("	=======Quản Lí Thư Viện======== ");
			System.out.println("Nhập 1:Để chèn tài liệu");
			System.out.println("Nhập 2: Để tìm kiếm tài liệu theo danh mục:");
			System.out.println("Nhập 3: Để hiển thị thông tin tài liệu ");
			System.out.println("Nhập 4: Để xóa tài liệu theo Mã Tài Liệu");
			System.out.println("Nhập 5: Thoát");
			 String line = sc.nextLine();
	            switch (line) {
	            case "1": {
                    System.out.println("Nhập a : Để chèn Sách.");
                    System.out.println("Nhập b : Để chèn Báo");
                    System.out.println("Nhập c : Để chèn Tạp Chí");
                    String type = sc.nextLine();
                    switch (type) {
                    case "a": {
                        System.out.print("Nhập MÃ TÀI LIỆU: ");
                        String maTaiLieu = sc.nextLine();
                        System.out.print("Nhập NHÀ XUẤT BẢN: ");
                        String nhaXuatBan = sc.nextLine();
                        System.out.print("Nhập SỐ BẢN PHÁT HÀNH:");
                        int soBanPhathanh = sc.nextInt();
                        System.out.print("Nhập TÁC GIẢ : ");
                        sc.nextLine();
                        String tacGia = sc.nextLine();
                        System.out.print("Nhập SỐ TRANG: ");
                        int soTrang = sc.nextInt();
                        TaiLieu sach = new Sach(maTaiLieu, nhaXuatBan, soBanPhathanh, tacGia, soTrang);
                        quanLiThuVien.themTailieu(sach);
                        System.out.println(sach.toString());
                        sc.nextLine();
                        break;

                    }
                    case "b": {
                        System.out.print("Nhập MÃ TÀI LIỆU: ");
                        String maTaiLieu = sc.nextLine();
                        System.out.print("Nhập NHÀ XUẤT BẢN:");
                        String nhaXuatBan = sc.nextLine();
                        System.out.print(" Nhập SỐ BẢN PHÁT HÀNH:");
                        int soBanPhathanh = sc.nextInt();
                        System.out.print("Nhập NGÀY PHÁT HÀNH: ");
                        int ngayPhatHanh = sc.nextInt();
                        TaiLieu bao = new Bao(maTaiLieu, nhaXuatBan, soBanPhathanh, ngayPhatHanh);
                        quanLiThuVien.themTailieu(bao);
                        System.out.println(bao.toString());
                        sc.nextLine();
                        break;
                    }
                    case "c": {
                    	System.out.print("Nhập MÃ TÀI LIỆU: ");
                        String maTaiLieu = sc.nextLine();
                        System.out.print("Nhập NHÀ XUẤT BẢN:");
                        String nhaXuatBan = sc.nextLine();
                        System.out.print(" Nhập SỐ BẢN PHÁT HÀNH:");
                        int soBanPhathanh = sc.nextInt();
                        System.out.print("Nhập SỐ PHÁT HÀNH: ");
                        int soPhatHanh = sc.nextInt();
                        System.out.print("Nhập THÁNG PHÁT HÀNH : ");
                        int thangPhatHanh = sc.nextInt();
                        TaiLieu tapchi = new TapChi(maTaiLieu, nhaXuatBan, soBanPhathanh, soPhatHanh, thangPhatHanh);
                        quanLiThuVien.themTailieu(tapchi);
                        System.out.println(tapchi.toString());
                        sc.nextLine();
                        break;
                    }
                    default:
                        break;
                    }
                    break;

	            
	            }
	            case "2": {
                    System.out.println("Nhập sách muốn tìm kiếm ");
                    System.out.println("Nhập báo muốn tìm kiếm ");
                    System.out.println("Nhập tạp chí muốn tìm kiếm ");
                    String choise = sc.nextLine();
                    switch (choise) {
                    case "a": {
                        quanLiThuVien.traSach();
                        break;
                    }
                    case "b": {
                        quanLiThuVien.traBao();
                        break;
                    }
                    case "c":
                        quanLiThuVien.traTapChi();
                        break;
                    default:
                        System.out.println("Không Hợp Lệ !");
                        break;
                }
                break;
            }
            case "3": {
            	quanLiThuVien.hienThiThongTin();
                
                break;
            }
            case "4": {
                System.out.print("Nhập 	MÃ TÀI LIỆU để xóa: ");
                String maTaiLieu = sc.nextLine();
                System.out.println(quanLiThuVien.xoaTaiLieu(maTaiLieu) ? "Success" : "Fail");
            }
            break;
            case "5": {
                return;
            }
            default:
                System.out.println("Không Hợp Lệ");
                continue;
        }

    }
}




}
