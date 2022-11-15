class Tree {
  private int height;
  Tree() {
    height = 1;
  }
  public void currentHeight(int n){
  int i=1;
  while(i<=n){
    if(i%2==0)
      height=height*3;
    else
      height=height+2;
    i=i+1;
    }
  }
  public int getHeight(){
    return height;
  }
}

public class Ques1 {
  public static void main(String[] args){
    Tree t1 = new Tree();
    t1.currentHeight(5);
    int currheight = t1.getHeight();
    System.out.println(currheight);
  }
}
