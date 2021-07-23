import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Matrix {

    private List<List<Integer>> values;

    Matrix(List<List<Integer>> values) {
        this.values = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        Set<MatrixCoordinate> saddlePoints = new HashSet<>();

        if (values.isEmpty())
            return saddlePoints;

        int rows = values.size();
        int cols = values.get(0).size();
        boolean rowCheck;
        boolean colCheck;

        // Check every element
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int e = values.get(i).get(j);

                // Check column
                colCheck = true;
                for (int k = 0;
                     k < rows && colCheck;
                     colCheck = e <= values.get(k++).get(j));

                if (colCheck) {
                    // Check row
                    rowCheck = values.get(i)
                                     .stream()
                                     .filter(k -> k > e)
                                     .count() == 0;

                    if (rowCheck)
                        saddlePoints.add(
                            new MatrixCoordinate(i + 1,
                                                 j + 1)
                        );
                }
            }
        }

        return saddlePoints;
    }

}
