package judge;

public class First11 {
	String reduceString(String s)
	{
		if(s == null) return null;
		
		StringBuilder str = new StringBuilder(s);
		
		boolean toggle = true;
        while (toggle) 
        {
            toggle = false;
            while (str.indexOf("AB")!= -1) {
                str.replace(str.indexOf("AB"), str.indexOf("AB") + 2, "AA");
                toggle = true;
            }
            while (str.indexOf("BA")!= -1) {
                str = str.replace(str.indexOf("BA"), str.indexOf("BA") + 2, "AA");
                toggle = true;
            }
            while (str.indexOf("BC")!= -1) {
                str = str.replace(str.indexOf("BC"), str.indexOf("BC") + 2, "CC");
                toggle = true;
            }
            while (str.indexOf("CB")!= -1) {
                str = str.replace(str.indexOf("CB"), str.indexOf("CB") + 2, "CC");
                toggle = true;
            }
            while (str.indexOf("AA")!= -1) {
                str = str.replace(str.indexOf("AA"), str.indexOf("AA") + 2, "A");
                toggle = true;
            }
            while (str.indexOf("CC")!= -1) {
                str = str.replace(str.indexOf("CC"), str.indexOf("CC") + 2, "C");
                toggle = true;
            }
        }
        return str.toString();
	}
	
    public static void main (String[] args) 
    {
        String str = "ABABABABABCCA";
        First11 obj= new First11();
        System.out.println(obj.reduceString(str));
    }
}