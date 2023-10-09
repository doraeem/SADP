// Task-2 (Inheritance,Variable declaration,Object creation,Access modifier,Method with parameters)

class Department {
  protected String name;
  public void setName(String name)
  {
     this.name = name;
  }
  public void displayInfo()
  {
    System.out.println("Department Name:" + name);
  }

}
class SWE extends Department{
    private int numOfStudent;
    public void setNumOfStudent(int numOfStudent)
    {
         this.numOfStudent =numOfStudent;
    }
    @Override
    public void displayInfo()
    {
     super.displayInfo();
     System.out.println("Number of student: " + numOfStudent);
    }
}
 class main{
    public static void main(String[] args){
      SWE s = new SWE();
        s.setName("Software Engineering");
        s.setNumOfStudent(50);
        s.displayInfo();
        
    }
}
