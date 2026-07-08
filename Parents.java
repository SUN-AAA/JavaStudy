public class Parents extends petDogs {
  private String name = new String();
  private String parents = new String();
  private String sex;
  
  Parents(int yr, String breed, double weight, String name, String parents, String sex){
    super(yr, breed, weight);
    this.name = name;
    this.parents = parents;
    this.sex = sex;
  }
  
  public void showParbr(){
    this.ShowPerbr();
    System.out.println("이름 :" + this.name);
    System.out.println("부모 :" + this.parents);
    System.out.println("성별 :" + this.sex);
  }
  
  public static void main(String[] args){
    Parents pd = new Parents(4, "퍼그", 2.0, "나비", "엄마 + 아빠", "수");
    pd.showParbr();
  }
}

class Dogs{
  private String breed = new String();
  private int year;
  
  Dogs(int yr, String breed){
    this.year = year;
    this.breed = breed;
  }
  
  public void Showbr(){
    System.out.println("나이 :" + this.year + "살\n품종 :" + this.breed);
  }
}

class petDogs extends Dogs{
  private double weight;
  
  petDogs(int yr, String breed, double weight){
    super(yr, breed);
    this.weight = weight;
  }
  
  public void ShowPerbr(){
    this.Showbr();
    System.out.println("몸무게 : " + this.weight + "kg");
  }
}


