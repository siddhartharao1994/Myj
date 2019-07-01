package AcTyEnum;

public enum AcTy {
	SAVINGS,LOAN,CURRENT,FD;
	
	public String toString() {
		// TODO Auto-generated constructor stub
		return ordinal()+" "+name();
	}


	
}
