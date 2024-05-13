package kattis_bluetooth;

public class MouthSpecifications {
	
	public int Specifications(String tooth, String state) {
		return Jaw(tooth, state);
	}
	
	private int Jaw(String tooth, String state) {
		char side = tooth.charAt(0);
	   if(side == '+' || side == '-') {
		   //Vänster
		   if("b".equals(state) || "m".equals(state)) {
			   return 1;
		    }
		} else {
			//Höger
			if ("b".equals(state) || "m".equals(state)) {
		        return 2;
		    }
		}
	    return 0;
	}

}
