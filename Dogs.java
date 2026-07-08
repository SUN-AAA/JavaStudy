class Dogs
{
  private int year;
  private String breed = new String();
  
  Dogs(int yr, String br){
    this.year = yr;
    this.breed = br;
  }
  
  public void setDogs(int yr, String br){
    this.year = yr;
    this.breed = br;
  }
  
  public void Showbr(){
    System.out.println("나이 :" + this.year + "살\n품종 :" + this.breed);
  }
  
  public static void main(String[] args){
    Dogs dog = new Dogs(4, "퍼그");
    dog.Showbr();
  }
}
