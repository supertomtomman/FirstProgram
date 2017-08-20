package Day2_OO;

public class Article {

    private int id;
    private String name;
    private int price;
    private String descripton;

    public Article(int id, String name, int price, String desc) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.descripton = desc;

    }

    public void printInfo() {

        System.out.println(id);
        System.out.println(name);
        System.out.println(price);
        System.out.println(descripton);
    }

}
