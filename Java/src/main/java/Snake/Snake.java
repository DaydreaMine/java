package Snake;

import java.util.LinkedList;

public class Snake {

    //蛇的身子
    private final LinkedList<Node> body = new LinkedList<Node>();

//    public Node eat(Node food) {
//        //蛇吃食物
//        if (isNeighbor(food, body.getFirst())) {
////            body.addFirst(food);
//            return food;
//        } else {
//            return null;
//        }
//    }

    /**
     * 往某个方向移动，蛇的身体可能会重叠，重叠判断由<code>Grid</code>处理。
     *
     * @param direction
     * @return <code>Snake</code>原来的尾部，即最后一个<code>SquareArea</code>
     */
    public Node move(Direction direction) {
        //控制蛇往哪个方向移动 原理:蛇的最后一个节点到蛇最前面
        Node node = body.getFirst();

        switch (direction) {
            case UP:
                Node node1 = new Node(node.getX(), node.getY() - 1);
                body.addFirst(node1);
                break;
            case RIGHT:
                Node node2 = new Node(node.getX() + 1, node.getY());
                body.addFirst(node2);
                break;
            case DOWN:
                Node node3 = new Node(node.getX(), node.getY() + 1);
                body.addFirst(node3);
                break;
            case LEFT:
                Node node4 = new Node(node.getX() - 1, node.getY());
                body.addFirst(node4);
                break;
        }

        return body.removeLast();

    }

    public Node getHead() {
        return body.getFirst();
    }

    public Node addTail(Node area) {
        this.body.addLast(area);
        return area;
    }

    public LinkedList<Node> getBody() {
        return body;
    }

    private boolean isNeighbor(Node a, Node b) {
        //判断是否是相邻的两个节点
        return Math.abs(a.getX() - b.getX()) + Math.abs(a.getY() - b.getY()) == 1;
    }


}
