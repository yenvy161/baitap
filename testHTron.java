package nguyenngocyenvy_23682161;

public class testHTron {
	public static void main(String[] args) throws Exception {
		Tam t = new Tam("B", 10, 15);
		HinhTron h1 = new HinhTron(10, t);
		System.out.println("Hinh Tron Tam: " + t.toString()+ h1.toString());
	}
}
