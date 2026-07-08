public class petDogs extends Dogs{
  private int weight;
  
  petDogs(int year, String breed, int weight){
    super(year, breed);
    this.weight = weight;
  }
  
  public void ShowPerbr(){
    this.Showbr();
    System.out.println("몸무게 : " + this.weight + "kg");
  }
  
  public static void main(String[] args){
    petDogs pet = new petDogs(4, "퍼그", 2);
    pet.ShowPerbr();
  }
}
class Dogs{
  private int year;
  private String breed;
  
  Dogs(int year, String breed){
    this.year = year;
    this.breed = breed;
  }
  
  public void Showbr(){
    System.out.println("나이 :" + this.year + "살\n품종 :" + this.breed);
  }
}

    
    