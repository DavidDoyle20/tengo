package whoLivesAndWhoDies;

public class person{
  
  private String first;
  private String last;
  private int bMonth;
  private int bDay;
  private int bYear;
  private String title;
  
  public person(){
    
  }
  
  public String getOrder(String s){
  for(int i = 0; i < s.length(); i++)
    if(s.indexOf(",") < s.indexOf(" ") && s.indexOf(",") < s.indexOf(".")){
      last = s.substring(0, s.indexOf(","));
      s = s.substring(s.indexOf(",") + 1);
    }
return s;
}
}