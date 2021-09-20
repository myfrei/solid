package good;

import java.util.ArrayList;

public class BoardShape {
    int size;

    public BoardShape(int size) {
        this.size = size;
    }


    public ArrayList<ArrayList<Integer>> rowIndexes() {
        ArrayList<ArrayList<Integer>> rowIndexes = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < this.size; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>();
            for (int j = 0; j < this.size; j++) {
                row.add((i * size)+(j));
            }
            rowIndexes.add(row);
        }

        return rowIndexes;
    }
}