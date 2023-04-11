package data.excel.Dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class ExclDto
{
	@Id
	@GeneratedValue(generator="excl_sq" , strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "excl_sq" , initialValue = 1 , allocationSize = 1)
	private int id;
	private double OrdrId;
	private Date OrdrDt;
	private double OrdrQntty;
	private double Sls;
	private String ShpMd;
	private double Prft;
	private double UntPrc;
	private String CstmNm;
	private String CstmSg;
	private String PrdctCtgry;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getOrdrId() {
		return OrdrId;
	}
	public void setOrdrId(double ordrId) {
		OrdrId = ordrId;
	}
	public Date getOrdrDt() {
		return OrdrDt;
	}
	public void setOrdrDt(Date ordrDt) {
		OrdrDt = ordrDt;
	}
	public double getOrdrQntty() {
		return OrdrQntty;
	}
	public void setOrdrQntty(double ordrQntty) {
		OrdrQntty = ordrQntty;
	}
	public double getSls() {
		return Sls;
	}
	public void setSls(double sls) {
		Sls = sls;
	}
	public String getShpMd() {
		return ShpMd;
	}
	public void setShpMd(String shpMd) {
		ShpMd = shpMd;
	}
	public double getPrft() {
		return Prft;
	}
	public void setPrft(double prft) {
		Prft = prft;
	}
	public double getUntPrc() {
		return UntPrc;
	}
	public void setUntPrc(double untPrc) {
		UntPrc = untPrc;
	}
	public String getCstmNm() {
		return CstmNm;
	}
	public void setCstmNm(String cstmNm) {
		CstmNm = cstmNm;
	}
	public String getCstmSg() {
		return CstmSg;
	}
	public void setCstmSg(String cstmSg) {
		CstmSg = cstmSg;
	}
	public String getPrdctCtgry() {
		return PrdctCtgry;
	}
	public void setPrdctCtgry(String prdctCtgry) {
		PrdctCtgry = prdctCtgry;
	}
	
}
