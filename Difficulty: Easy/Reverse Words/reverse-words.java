class Solution {
    public String reverseWords(String s) {
        // Code here
   
  String rev="";
  String a[]=s.split("\\.");
  for(int i=a.length-1;i>=0;i--){
      if(!a[i].equals("")){
          if(rev.length()==0){
      
      rev=a[i];
      }else{
          rev=rev+"."+a[i];
      }
  }
  
  }
  return rev;
      
      
      
  
    }
}
