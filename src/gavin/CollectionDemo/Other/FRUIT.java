package gavin.CollectionDemo.Other;

public enum FRUIT {

  FRUIT1("苹果"),
  FRUIT2("橘子"),
  FRUIT3("香蕉"),
  FRUIT4("李子"),
  FRUIT5("西瓜"),
  FRUIT6("桃子"),
  FRUIT7("丑梨"),
  FRUIT8("枣子"),
  FRUIT9("荔枝"),
  FRUIT10("龙眼");
  String name;
    FRUIT(String name) {
this.name=name;
    }

  @Override
  public String toString() {
    return "FRUIT{" +
            "name='" + name + '\'' +
            '}';
  }
}
