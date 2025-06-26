class pyramid{
    public static void main(String[] args) {
        int [] pattern=(1,2,3,4);
        for(int row: pattern){
            for (int j = 1; j<row; j++){
                System.out.print("* ");
            }
            System.out.println();
         }
       
            
    } 
}


