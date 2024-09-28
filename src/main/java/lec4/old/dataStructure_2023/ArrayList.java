package lec4.old.dataStructure_2023;

public class ArrayList implements List{
    private Node[] nodes;
    private int index = 0; //приймемо ідею, що index - останній вільний елемент

    public ArrayList() {
        this(10);
    }

    public ArrayList(int length) {
        nodes = new Node[length];
    }

    @Override
    public void add(int value) {
        Node node = new Node(value);

        nodes[index] = node;
        ++index;
    }

    @Override
    public int get(int index) {
        if(index > nodes.length - 1) {
            //FIXME: use exception instead of this -2
            return -2;
        }

        if(nodes[index] == null){
            //FIXME: use exception instead of this -1
            return -1;
        }
        return nodes[index].getValue();
    }

    @Override
    public void print() {
        for(Node node : nodes){
            if(node == null){
                return;
            }
            System.out.println(node.getValue());
        }
    }

    @Override
    public int size() {
        return index;
    }
}
