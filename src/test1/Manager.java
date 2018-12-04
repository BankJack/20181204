package test1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Manager {
	Map<String, worldCup> map=new HashMap<>();
	
	 
	{
		map.put("1", new worldCup("第一届","1930","乌拉圭","乌拉圭"));
		map.put("2", new worldCup("第二届","1934","意大利","意大利"));
		map.put("3", new worldCup("第三届","1938","法国","意大利"));
		map.put("4", new worldCup("第四届","1950","巴西","乌拉圭"));
		map.put("5", new worldCup("第五届","1954","瑞士","西德"));
		map.put("6", new worldCup("第六届","1958","瑞典","巴西"));
		map.put("7", new worldCup("第七届","1962","智利","巴西"));
		map.put("8", new worldCup("第八届","1966","英格兰","英格兰"));
		map.put("9", new worldCup("第九届","1970","墨西哥","巴西"));
		map.put("10", new worldCup("第十届","1974","前西德","西德"));
		map.put("11", new worldCup("第十一届","1978","阿根廷","阿根廷"));
		map.put("12", new worldCup("第十二届","1982","西班牙","意大利"));
		map.put("13", new worldCup("第十三届","1986","墨西哥","阿根廷"));
		map.put("14", new worldCup("第十四届","1990","意大利","西德"));
		map.put("15", new worldCup("第十五届","1994","美国","巴西"));
		map.put("16", new worldCup("第十六届","1998","法国","法国"));
		map.put("17", new worldCup("第十七届","2002","韩国","巴西"));
		map.put("18", new worldCup("第十八届","2006","德国","意大利"));
		map.put("19", new worldCup("第十九届","2010","南非","西班牙"));
		map.put("20", new worldCup("第二十届","2014","巴西","德国"));
	}

	public worldCup Seek(String year) {
		Collection<worldCup> valuse=map.values();
		for (worldCup w : valuse) {
			if(w.getYeat().equals(year)) {
				return w;
			}
		}
		return null;
	}
	
	public String Seek2(String championship) {
		String str="";
		Collection<worldCup> valuse=map.values();
		for (worldCup w : valuse) {
			if(w.getChampionship().equals(championship)) {
				str+=w.getYeat()+"\n";
			}
		}
		return str;
	}
	
	
}
