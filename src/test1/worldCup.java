package test1;
/**
 * 世界杯夺冠的类
 * @author Administrator
 *
 */
public class worldCup {
	private String count;  	//届数
	private String yeat;	//举办年份
	private String address;		//举办地点
	private String championship;  //冠军球队
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	public String getYeat() {
		return yeat;
	}
	public void setYeat(String yeat) {
		this.yeat = yeat;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getChampionship() {
		return championship;
	}
	public void setChampionship(String championship) {
		this.championship = championship;
	}
	public worldCup(String count, String yeat, String address, String championship) {
		super();
		this.count = count;
		this.yeat = yeat;
		this.address = address;
		this.championship = championship;
	}
	public worldCup() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((championship == null) ? 0 : championship.hashCode());
		result = prime * result + ((count == null) ? 0 : count.hashCode());
		result = prime * result + ((yeat == null) ? 0 : yeat.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		worldCup other = (worldCup) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (championship == null) {
			if (other.championship != null)
				return false;
		} else if (!championship.equals(other.championship))
			return false;
		if (count == null) {
			if (other.count != null)
				return false;
		} else if (!count.equals(other.count))
			return false;
		if (yeat == null) {
			if (other.yeat != null)
				return false;
		} else if (!yeat.equals(other.yeat))
			return false;
		return true;
	}
	
	
}
