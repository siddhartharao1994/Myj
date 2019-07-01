package bankacct;

import AcTyEnum.AcTy;

@SuppressWarnings("rawtypes")
public class bankacct implements Comparable {
	private int accntId;
	private String custName,ifsc;
	private AcTy Type;
	private double balance;

	public bankacct() {
		// TODO Auto-generated constructor stub
	}


	public bankacct(int accntId, String custName, String ifsc, AcTy type, double balance) {
		super();
		this.accntId = accntId;
		this.custName = custName;
		this.ifsc = ifsc;
		Type = type;
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "bankacct [accntId=" + accntId + ", custName=" + custName + ", ifsc=" + ifsc + ", Type=" + Type
				+ ", balance=" + balance + "]";
	}


	public int getAccntId() {
		return accntId;
	}


	public void setAccntId(int accntId) {
		this.accntId = accntId;
	}


	public String getCustName() {
		return custName;
	}


	public void setCustName(String custName) {
		this.custName = custName;
	}


	public String getIfsc() {
		return ifsc;
	}


	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}


	public AcTy getType() {
		return Type;
	}


	public void setType(AcTy type) {
		Type = type;
	}


	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public bankacct(String custName, String ifsc, AcTy type, double balance) {
		super();
		this.custName = custName;
		this.ifsc = ifsc;
		Type = type;
		this.balance = balance;
	}


	public bankacct(int accntId) {
		super();
		this.accntId = accntId;
	}
	
	public boolean equals(Object obj)
	{
		if (obj instanceof bankacct)
		{
			return accntId == ((bankacct)obj).accntId;
		}
		return false;
	}
	
	public boolean equals1(Object obj1)
	{
		if(obj1 instanceof bankacct)
		{
			return custName == ((bankacct)obj1).custName;
		}
		return false;
	}


	@Override
	public int compareTo(Object b) {
		// TODO Auto-generated method stub
		int compid = ((bankacct)b).getAccntId();
		return this.accntId-compid;
	}

}
