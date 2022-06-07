public class HuffmanCoding {

	class Node {
        public int frequency; // the frequency of this tree
        public char data;
        public Node left, right;
    }

    //HackerRanks solution for HuffmanCoding problem (advanced)
    public static void decode(String s, Node root) {
        String d = "";
        Node current = root;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '0') current= current.left;
            else current = current.right;
            if(current.left == null && current.right == null){
                d = d + current.data;
                current = root;
            }
        }
        System.out.println(d);
    }



}
