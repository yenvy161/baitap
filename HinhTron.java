package nguyenngocyenvy_23682161;

public class HinhTron {
	private double banKinh;
	public static final double PI=3.1416;
	private Tam t;
	public Tam getT() {
		return t;
	}
	public void setT(Tam t) throws Exception {
		if (t!=null) {
			this.t = t;
		} else {
			throw new Exception ("Loi"); 
		}

	}
	//Hang thuc
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double bk) throws Exception {
		if (bk>0) {
			this.banKinh=bk;
		} else {
			throw new Exception ("Loi");
		}
	}
	//Tao ham (constructor)
	public HinhTron () {}
	public HinhTron(double banKinh, Tam t) {
		super();
		this.banKinh = banKinh;
		this.t = t;
	}
	//Tinh dtich va cvi
	public double getDienTich() {
		return getBanKinh()*getBanKinh()*PI;
	}
	public double getChuVi() {
		return getBanKinh()*2*PI;
	}
	//Mau in
	@Override
	public String toString() {
		String m = "";
		m +=String.format(", %-3S, %10s, %10s", getBanKinh(), getDienTich(), getChuVi());
		return m;
	}
	public static void main(String[] args) throws Exception {
		HinhTron h1 = new HinhTron(10,new Tam("O", 6, 6));
		System.out.println(h1);
	}
}
