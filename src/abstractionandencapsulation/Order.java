package abstractionandencapsulation;

public class Order {
    /*
     * TODO 1: Provide a id attribute of type int. Make it private.
     */
    private int id;


    /*
     * TODO 2: Provide a name attribute of type String. Make it private.
     */
    private String name;


    /*
     * TODO 3: Provide a public constructor which takes two arguments, first one of
     * type int and second one to type String. Use these two arguments to initialize
     * id and name attributes of the class.
     */
    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*
     * TODO 4: Provide getters and setters for the id and name attributes.
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
