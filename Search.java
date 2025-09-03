public class Search {

    public static int linearSearch(String menu[],String item){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==item){
                return i;
            }
        }
        return -1;
    }





    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10,12,14,16};
        String menu[]={"coffee","tea","samosa","pasta","burger"};
        String item="pasta";
        
        int index=linearSearch(menu,item);
        if(index==-1){
            System.out.println("Not found");
        }
        else{
            System.out.println("item found at index: "+index);
        }
         
    
  }
}